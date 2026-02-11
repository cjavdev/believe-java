// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.checkRequired
import com.believe.api.core.handlers.emptyHandler
import com.believe.api.core.handlers.errorBodyHandler
import com.believe.api.core.handlers.errorHandler
import com.believe.api.core.handlers.jsonHandler
import com.believe.api.core.http.HttpMethod
import com.believe.api.core.http.HttpRequest
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponse.Handler
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.core.http.json
import com.believe.api.core.http.parseable
import com.believe.api.core.prepareAsync
import com.believe.api.models.episodes.Episode
import com.believe.api.models.episodes.EpisodeCreateParams
import com.believe.api.models.episodes.EpisodeDeleteParams
import com.believe.api.models.episodes.EpisodeGetWisdomParams
import com.believe.api.models.episodes.EpisodeGetWisdomResponse
import com.believe.api.models.episodes.EpisodeListBySeasonPageAsync
import com.believe.api.models.episodes.EpisodeListBySeasonParams
import com.believe.api.models.episodes.EpisodeListPageAsync
import com.believe.api.models.episodes.EpisodeListParams
import com.believe.api.models.episodes.EpisodeRetrieveParams
import com.believe.api.models.episodes.EpisodeUpdateParams
import com.believe.api.models.episodes.PaginatedResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EpisodeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EpisodeServiceAsync {

    private val withRawResponse: EpisodeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EpisodeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EpisodeServiceAsync =
        EpisodeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EpisodeCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Episode> =
        // post /episodes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EpisodeRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Episode> =
        // get /episodes/{episode_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EpisodeUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Episode> =
        // patch /episodes/{episode_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EpisodeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EpisodeListPageAsync> =
        // get /episodes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EpisodeDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /episodes/{episode_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun getWisdom(
        params: EpisodeGetWisdomParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EpisodeGetWisdomResponse> =
        // get /episodes/{episode_id}/wisdom
        withRawResponse().getWisdom(params, requestOptions).thenApply { it.parse() }

    override fun listBySeason(
        params: EpisodeListBySeasonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EpisodeListBySeasonPageAsync> =
        // get /episodes/seasons/{season_number}
        withRawResponse().listBySeason(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EpisodeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EpisodeServiceAsync.WithRawResponse =
            EpisodeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Episode> = jsonHandler<Episode>(clientOptions.jsonMapper)

        override fun create(
            params: EpisodeCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Episode>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Episode> =
            jsonHandler<Episode>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EpisodeRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Episode>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("episodeId", params.episodeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes", params._pathParam(0))
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

        private val updateHandler: Handler<Episode> = jsonHandler<Episode>(clientOptions.jsonMapper)

        override fun update(
            params: EpisodeUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Episode>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("episodeId", params.episodeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<PaginatedResponse> =
            jsonHandler<PaginatedResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EpisodeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes")
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
                                EpisodeListPageAsync.builder()
                                    .service(EpisodeServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EpisodeDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("episodeId", params.episodeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getWisdomHandler: Handler<EpisodeGetWisdomResponse> =
            jsonHandler<EpisodeGetWisdomResponse>(clientOptions.jsonMapper)

        override fun getWisdom(
            params: EpisodeGetWisdomParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EpisodeGetWisdomResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("episodeId", params.episodeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes", params._pathParam(0), "wisdom")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getWisdomHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listBySeasonHandler: Handler<PaginatedResponse> =
            jsonHandler<PaginatedResponse>(clientOptions.jsonMapper)

        override fun listBySeason(
            params: EpisodeListBySeasonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EpisodeListBySeasonPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("seasonNumber", params.seasonNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes", "seasons", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listBySeasonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EpisodeListBySeasonPageAsync.builder()
                                    .service(EpisodeServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
