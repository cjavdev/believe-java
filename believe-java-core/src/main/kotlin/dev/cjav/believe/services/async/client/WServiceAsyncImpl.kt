// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async.client

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
import dev.cjav.believe.core.prepareAsync
import dev.cjav.believe.models.client.ws.WTestParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** WebSocket endpoints for real-time bidirectional communication - Live match simulation */
class WServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WServiceAsync {

    private val withRawResponse: WServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WServiceAsync =
        WServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun test(
        params: WTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /ws/test
        withRawResponse().test(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WServiceAsync.WithRawResponse =
            WServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val testHandler: Handler<Void?> = emptyHandler()

        override fun test(
            params: WTestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ws", "test")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { testHandler.handle(it) }
                    }
                }
        }
    }
}
