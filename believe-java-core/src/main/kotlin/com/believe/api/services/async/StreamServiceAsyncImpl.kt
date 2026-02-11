// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.handlers.errorBodyHandler
import com.believe.api.core.handlers.errorHandler
import com.believe.api.core.handlers.jsonHandler
import com.believe.api.core.http.HttpMethod
import com.believe.api.core.http.HttpRequest
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponse.Handler
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.core.http.parseable
import com.believe.api.core.prepareAsync
import com.believe.api.models.stream.StreamTestConnectionParams
import com.believe.api.models.stream.StreamTestConnectionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
