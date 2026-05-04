// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking.client

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.handlers.emptyHandler
import dev.cjav.believe.core.handlers.errorBodyHandler
import dev.cjav.believe.core.handlers.errorHandler
import dev.cjav.believe.core.http.HttpMethod
import dev.cjav.believe.core.http.HttpRequest
import dev.cjav.believe.core.http.HttpResponse
import dev.cjav.believe.core.http.HttpResponse.Handler
import dev.cjav.believe.core.http.parseable
import dev.cjav.believe.core.prepare
import dev.cjav.believe.models.client.ws.WTestParams
import java.util.function.Consumer

/** WebSocket endpoints for real-time bidirectional communication - Live match simulation */
class WServiceImpl internal constructor(private val clientOptions: ClientOptions) : WService {

    private val withRawResponse: WService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WService =
        WServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun test(params: WTestParams, requestOptions: RequestOptions) {
        // get /ws/test
        withRawResponse().test(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WService.WithRawResponse =
            WServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val testHandler: Handler<Void?> = emptyHandler()

        override fun test(params: WTestParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ws", "test")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { testHandler.handle(it) }
            }
        }
    }
}
