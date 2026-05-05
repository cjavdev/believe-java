// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.handlers.errorBodyHandler
import dev.cjav.believe.core.handlers.errorHandler
import dev.cjav.believe.core.handlers.jsonHandler
import dev.cjav.believe.core.http.HttpMethod
import dev.cjav.believe.core.http.HttpRequest
import dev.cjav.believe.core.http.HttpResponse
import dev.cjav.believe.core.http.HttpResponse.Handler
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.core.http.parseable
import dev.cjav.believe.core.prepareAsync
import dev.cjav.believe.models.stream.StreamTestConnectionParams
import dev.cjav.believe.models.stream.StreamTestConnectionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Server-Sent Events (SSE) streaming endpoints */
class StreamServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamServiceAsync {

    private val withRawResponse: StreamServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamServiceAsync =
        StreamServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun testConnection(
        params: StreamTestConnectionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StreamTestConnectionResponse> =
        // get /stream/test
        withRawResponse().testConnection(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StreamServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamServiceAsync.WithRawResponse =
            StreamServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val testConnectionHandler: Handler<StreamTestConnectionResponse> =
            jsonHandler<StreamTestConnectionResponse>(clientOptions.jsonMapper)

        override fun testConnection(
            params: StreamTestConnectionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamTestConnectionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("stream", "test")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { testConnectionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
