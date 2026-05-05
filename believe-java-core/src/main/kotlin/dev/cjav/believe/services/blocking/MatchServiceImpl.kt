// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.checkRequired
import dev.cjav.believe.core.handlers.emptyHandler
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
import dev.cjav.believe.core.prepare
import dev.cjav.believe.models.matches.Match
import dev.cjav.believe.models.matches.MatchCreateParams
import dev.cjav.believe.models.matches.MatchDeleteParams
import dev.cjav.believe.models.matches.MatchGetLessonParams
import dev.cjav.believe.models.matches.MatchGetLessonResponse
import dev.cjav.believe.models.matches.MatchGetTurningPointsParams
import dev.cjav.believe.models.matches.MatchGetTurningPointsResponse
import dev.cjav.believe.models.matches.MatchListPage
import dev.cjav.believe.models.matches.MatchListPageResponse
import dev.cjav.believe.models.matches.MatchListParams
import dev.cjav.believe.models.matches.MatchRetrieveParams
import dev.cjav.believe.models.matches.MatchStreamLiveParams
import dev.cjav.believe.models.matches.MatchUpdateParams
import dev.cjav.believe.services.blocking.matches.CommentaryService
import dev.cjav.believe.services.blocking.matches.CommentaryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MatchService {

    private val withRawResponse: MatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val commentary: CommentaryService by lazy { CommentaryServiceImpl(clientOptions) }

    override fun withRawResponse(): MatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatchService =
        MatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Server-Sent Events (SSE) streaming endpoints */
    override fun commentary(): CommentaryService = commentary

    override fun create(params: MatchCreateParams, requestOptions: RequestOptions): Match =
        // post /matches
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: MatchRetrieveParams, requestOptions: RequestOptions): Match =
        // get /matches/{match_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: MatchUpdateParams, requestOptions: RequestOptions): Match =
        // patch /matches/{match_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: MatchListParams, requestOptions: RequestOptions): MatchListPage =
        // get /matches
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MatchDeleteParams, requestOptions: RequestOptions) {
        // delete /matches/{match_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun getLesson(
        params: MatchGetLessonParams,
        requestOptions: RequestOptions,
    ): MatchGetLessonResponse =
        // get /matches/{match_id}/lesson
        withRawResponse().getLesson(params, requestOptions).parse()

    override fun getTurningPoints(
        params: MatchGetTurningPointsParams,
        requestOptions: RequestOptions,
    ): List<MatchGetTurningPointsResponse> =
        // get /matches/{match_id}/turning-points
        withRawResponse().getTurningPoints(params, requestOptions).parse()

    override fun streamLive(params: MatchStreamLiveParams, requestOptions: RequestOptions) {
        // get /matches/live
        withRawResponse().streamLive(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MatchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val commentary: CommentaryService.WithRawResponse by lazy {
            CommentaryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MatchService.WithRawResponse =
            MatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Server-Sent Events (SSE) streaming endpoints */
        override fun commentary(): CommentaryService.WithRawResponse = commentary

        private val createHandler: Handler<Match> = jsonHandler<Match>(clientOptions.jsonMapper)

        override fun create(
            params: MatchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Match> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matches")
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

        private val retrieveHandler: Handler<Match> = jsonHandler<Match>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MatchRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Match> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("matchId", params.matchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matches", params._pathParam(0))
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

        private val updateHandler: Handler<Match> = jsonHandler<Match>(clientOptions.jsonMapper)

        override fun update(
            params: MatchUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Match> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("matchId", params.matchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matches", params._pathParam(0))
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

        private val listHandler: Handler<MatchListPageResponse> =
            jsonHandler<MatchListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MatchListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MatchListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matches")
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
                        MatchListPage.builder()
                            .service(MatchServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: MatchDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("matchId", params.matchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matches", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getLessonHandler: Handler<MatchGetLessonResponse> =
            jsonHandler<MatchGetLessonResponse>(clientOptions.jsonMapper)

        override fun getLesson(
            params: MatchGetLessonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MatchGetLessonResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("matchId", params.matchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matches", params._pathParam(0), "lesson")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLessonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getTurningPointsHandler: Handler<List<MatchGetTurningPointsResponse>> =
            jsonHandler<List<MatchGetTurningPointsResponse>>(clientOptions.jsonMapper)

        override fun getTurningPoints(
            params: MatchGetTurningPointsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<MatchGetTurningPointsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("matchId", params.matchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matches", params._pathParam(0), "turning-points")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getTurningPointsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val streamLiveHandler: Handler<Void?> = emptyHandler()

        override fun streamLive(
            params: MatchStreamLiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matches", "live")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { streamLiveHandler.handle(it) }
            }
        }
    }
}
