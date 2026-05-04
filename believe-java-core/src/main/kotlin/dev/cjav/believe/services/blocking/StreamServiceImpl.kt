// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

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
import dev.cjav.believe.core.prepare
import dev.cjav.believe.models.stream.StreamTestConnectionParams
import dev.cjav.believe.models.stream.StreamTestConnectionResponse
import java.util.function.Consumer

/** Server-Sent Events (SSE) streaming endpoints */
class StreamServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamService {

    private val withRawResponse: StreamService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService =
        StreamServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun testConnection(
        params: StreamTestConnectionParams,
        requestOptions: RequestOptions,
    ): StreamTestConnectionResponse =
        // get /stream/test
        withRawResponse().testConnection(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StreamService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamService.WithRawResponse =
            StreamServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val testConnectionHandler: Handler<StreamTestConnectionResponse> =
            jsonHandler<StreamTestConnectionResponse>(clientOptions.jsonMapper)

        override fun testConnection(
            params: StreamTestConnectionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamTestConnectionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("stream", "test")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
