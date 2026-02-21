// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.client

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.handlers.emptyHandler
import com.believe.api.core.handlers.errorBodyHandler
import com.believe.api.core.handlers.errorHandler
import com.believe.api.core.http.HttpMethod
import com.believe.api.core.http.HttpRequest
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponse.Handler
import com.believe.api.core.http.parseable
import com.believe.api.core.prepare
import com.believe.api.models.client.ws.WTestParams
import java.util.function.Consumer

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
