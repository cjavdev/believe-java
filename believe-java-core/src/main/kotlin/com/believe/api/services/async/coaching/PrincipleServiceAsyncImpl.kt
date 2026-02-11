// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async.coaching

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.checkRequired
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
import com.believe.api.models.coaching.principles.CoachingPrinciple
import com.believe.api.models.coaching.principles.PrincipleGetRandomParams
import com.believe.api.models.coaching.principles.PrincipleListPageAsync
import com.believe.api.models.coaching.principles.PrincipleListPageResponse
import com.believe.api.models.coaching.principles.PrincipleListParams
import com.believe.api.models.coaching.principles.PrincipleRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PrincipleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PrincipleServiceAsync {

    private val withRawResponse: PrincipleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PrincipleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrincipleServiceAsync =
        PrincipleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PrincipleRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CoachingPrinciple> =
        // get /coaching/principles/{principle_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PrincipleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrincipleListPageAsync> =
        // get /coaching/principles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getRandom(
        params: PrincipleGetRandomParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CoachingPrinciple> =
        // get /coaching/principles/random
        withRawResponse().getRandom(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrincipleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrincipleServiceAsync.WithRawResponse =
            PrincipleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CoachingPrinciple> =
            jsonHandler<CoachingPrinciple>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PrincipleRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("principleId", params.principleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coaching", "principles", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<PrincipleListPageResponse> =
            jsonHandler<PrincipleListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PrincipleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrincipleListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coaching", "principles")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PrincipleListPageAsync.builder()
                                    .service(PrincipleServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getRandomHandler: Handler<CoachingPrinciple> =
            jsonHandler<CoachingPrinciple>(clientOptions.jsonMapper)

        override fun getRandom(
            params: PrincipleGetRandomParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coaching", "principles", "random")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRandomHandler.handle(it) }
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
