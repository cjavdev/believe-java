// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

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
import dev.cjav.believe.core.prepareAsync
import dev.cjav.believe.models.teammembers.TeamMemberCreateParams
import dev.cjav.believe.models.teammembers.TeamMemberCreateResponse
import dev.cjav.believe.models.teammembers.TeamMemberDeleteParams
import dev.cjav.believe.models.teammembers.TeamMemberListCoachesPageAsync
import dev.cjav.believe.models.teammembers.TeamMemberListCoachesPageResponse
import dev.cjav.believe.models.teammembers.TeamMemberListCoachesParams
import dev.cjav.believe.models.teammembers.TeamMemberListPageAsync
import dev.cjav.believe.models.teammembers.TeamMemberListPageResponse
import dev.cjav.believe.models.teammembers.TeamMemberListParams
import dev.cjav.believe.models.teammembers.TeamMemberListPlayersPageAsync
import dev.cjav.believe.models.teammembers.TeamMemberListPlayersPageResponse
import dev.cjav.believe.models.teammembers.TeamMemberListPlayersParams
import dev.cjav.believe.models.teammembers.TeamMemberListStaffPageAsync
import dev.cjav.believe.models.teammembers.TeamMemberListStaffPageResponse
import dev.cjav.believe.models.teammembers.TeamMemberListStaffParams
import dev.cjav.believe.models.teammembers.TeamMemberRetrieveParams
import dev.cjav.believe.models.teammembers.TeamMemberRetrieveResponse
import dev.cjav.believe.models.teammembers.TeamMemberUpdateParams
import dev.cjav.believe.models.teammembers.TeamMemberUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Team members with union types (oneOf) - Players, Coaches, Medical Staff, Equipment Managers */
class TeamMemberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TeamMemberServiceAsync {

    private val withRawResponse: TeamMemberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TeamMemberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamMemberServiceAsync =
        TeamMemberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TeamMemberCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamMemberCreateResponse> =
        // post /team-members
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TeamMemberRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamMemberRetrieveResponse> =
        // get /team-members/{member_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TeamMemberUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamMemberUpdateResponse> =
        // patch /team-members/{member_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TeamMemberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamMemberListPageAsync> =
        // get /team-members
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TeamMemberDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /team-members/{member_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun listCoaches(
        params: TeamMemberListCoachesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamMemberListCoachesPageAsync> =
        // get /team-members/coaches/
        withRawResponse().listCoaches(params, requestOptions).thenApply { it.parse() }

    override fun listPlayers(
        params: TeamMemberListPlayersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamMemberListPlayersPageAsync> =
        // get /team-members/players/
        withRawResponse().listPlayers(params, requestOptions).thenApply { it.parse() }

    override fun listStaff(
        params: TeamMemberListStaffParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamMemberListStaffPageAsync> =
        // get /team-members/staff/
        withRawResponse().listStaff(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamMemberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamMemberServiceAsync.WithRawResponse =
            TeamMemberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TeamMemberCreateResponse> =
            jsonHandler<TeamMemberCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TeamMemberCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamMemberCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members")
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

        private val retrieveHandler: Handler<TeamMemberRetrieveResponse> =
            jsonHandler<TeamMemberRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TeamMemberRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamMemberRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("memberId", params.memberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", params._pathParam(0))
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

        private val updateHandler: Handler<TeamMemberUpdateResponse> =
            jsonHandler<TeamMemberUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TeamMemberUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamMemberUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("memberId", params.memberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", params._pathParam(0))
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

        private val listHandler: Handler<TeamMemberListPageResponse> =
            jsonHandler<TeamMemberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TeamMemberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamMemberListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members")
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
                                TeamMemberListPageAsync.builder()
                                    .service(TeamMemberServiceAsyncImpl(clientOptions))
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
            params: TeamMemberDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("memberId", params.memberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", params._pathParam(0))
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

        private val listCoachesHandler: Handler<TeamMemberListCoachesPageResponse> =
            jsonHandler<TeamMemberListCoachesPageResponse>(clientOptions.jsonMapper)

        override fun listCoaches(
            params: TeamMemberListCoachesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamMemberListCoachesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", "coaches", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listCoachesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TeamMemberListCoachesPageAsync.builder()
                                    .service(TeamMemberServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listPlayersHandler: Handler<TeamMemberListPlayersPageResponse> =
            jsonHandler<TeamMemberListPlayersPageResponse>(clientOptions.jsonMapper)

        override fun listPlayers(
            params: TeamMemberListPlayersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamMemberListPlayersPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", "players", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listPlayersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TeamMemberListPlayersPageAsync.builder()
                                    .service(TeamMemberServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listStaffHandler: Handler<TeamMemberListStaffPageResponse> =
            jsonHandler<TeamMemberListStaffPageResponse>(clientOptions.jsonMapper)

        override fun listStaff(
            params: TeamMemberListStaffParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamMemberListStaffPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", "staff", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listStaffHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TeamMemberListStaffPageAsync.builder()
                                    .service(TeamMemberServiceAsyncImpl(clientOptions))
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
