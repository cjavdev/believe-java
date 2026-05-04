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
import dev.cjav.believe.core.http.json
import dev.cjav.believe.core.http.parseable
import dev.cjav.believe.core.prepareAsync
import dev.cjav.believe.models.reframe.ReframeTransformNegativeThoughtsParams
import dev.cjav.believe.models.reframe.ReframeTransformNegativeThoughtsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Interactive endpoints for motivation and guidance */
class ReframeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReframeServiceAsync {

    private val withRawResponse: ReframeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReframeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReframeServiceAsync =
        ReframeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun transformNegativeThoughts(
        params: ReframeTransformNegativeThoughtsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReframeTransformNegativeThoughtsResponse> =
        // post /reframe
        withRawResponse().transformNegativeThoughts(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReframeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReframeServiceAsync.WithRawResponse =
            ReframeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val transformNegativeThoughtsHandler:
            Handler<ReframeTransformNegativeThoughtsResponse> =
            jsonHandler<ReframeTransformNegativeThoughtsResponse>(clientOptions.jsonMapper)

        override fun transformNegativeThoughts(
            params: ReframeTransformNegativeThoughtsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReframeTransformNegativeThoughtsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reframe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { transformNegativeThoughtsHandler.handle(it) }
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
