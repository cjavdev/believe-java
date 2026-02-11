// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

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
import com.believe.api.core.prepare
import com.believe.api.models.episodes.Episode
import com.believe.api.models.episodes.EpisodeCreateParams
import com.believe.api.models.episodes.EpisodeDeleteParams
import com.believe.api.models.episodes.EpisodeGetWisdomParams
import com.believe.api.models.episodes.EpisodeGetWisdomResponse
import com.believe.api.models.episodes.EpisodeListBySeasonPage
import com.believe.api.models.episodes.EpisodeListBySeasonParams
import com.believe.api.models.episodes.EpisodeListPage
import com.believe.api.models.episodes.EpisodeListParams
import com.believe.api.models.episodes.EpisodeRetrieveParams
import com.believe.api.models.episodes.EpisodeUpdateParams
import com.believe.api.models.episodes.PaginatedResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EpisodeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EpisodeService {

    private val withRawResponse: EpisodeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EpisodeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EpisodeService =
        EpisodeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EpisodeCreateParams, requestOptions: RequestOptions): Episode =
        // post /episodes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: EpisodeRetrieveParams, requestOptions: RequestOptions): Episode =
        // get /episodes/{episode_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: EpisodeUpdateParams, requestOptions: RequestOptions): Episode =
        // patch /episodes/{episode_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: EpisodeListParams, requestOptions: RequestOptions): EpisodeListPage =
        // get /episodes
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EpisodeDeleteParams, requestOptions: RequestOptions) {
        // delete /episodes/{episode_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun getWisdom(
        params: EpisodeGetWisdomParams,
        requestOptions: RequestOptions,
    ): EpisodeGetWisdomResponse =
        // get /episodes/{episode_id}/wisdom
        withRawResponse().getWisdom(params, requestOptions).parse()

    override fun listBySeason(
        params: EpisodeListBySeasonParams,
        requestOptions: RequestOptions,
    ): EpisodeListBySeasonPage =
        // get /episodes/seasons/{season_number}
        withRawResponse().listBySeason(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EpisodeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EpisodeService.WithRawResponse =
            EpisodeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Episode> = jsonHandler<Episode>(clientOptions.jsonMapper)

        override fun create(
            params: EpisodeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Episode> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Episode> =
            jsonHandler<Episode>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EpisodeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Episode> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("episodeId", params.episodeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Episode> = jsonHandler<Episode>(clientOptions.jsonMapper)

        override fun update(
            params: EpisodeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Episode> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PaginatedResponse> =
            jsonHandler<PaginatedResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EpisodeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EpisodeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EpisodeListPage.builder()
                            .service(EpisodeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EpisodeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getWisdomHandler: Handler<EpisodeGetWisdomResponse> =
            jsonHandler<EpisodeGetWisdomResponse>(clientOptions.jsonMapper)

        override fun getWisdom(
            params: EpisodeGetWisdomParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EpisodeGetWisdomResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("episodeId", params.episodeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes", params._pathParam(0), "wisdom")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getWisdomHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listBySeasonHandler: Handler<PaginatedResponse> =
            jsonHandler<PaginatedResponse>(clientOptions.jsonMapper)

        override fun listBySeason(
            params: EpisodeListBySeasonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EpisodeListBySeasonPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("seasonNumber", params.seasonNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("episodes", "seasons", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBySeasonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EpisodeListBySeasonPage.builder()
                            .service(EpisodeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
