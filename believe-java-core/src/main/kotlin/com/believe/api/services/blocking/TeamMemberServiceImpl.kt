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
import com.believe.api.models.teammembers.TeamMemberCreateParams
import com.believe.api.models.teammembers.TeamMemberCreateResponse
import com.believe.api.models.teammembers.TeamMemberDeleteParams
import com.believe.api.models.teammembers.TeamMemberListCoachesPage
import com.believe.api.models.teammembers.TeamMemberListCoachesPageResponse
import com.believe.api.models.teammembers.TeamMemberListCoachesParams
import com.believe.api.models.teammembers.TeamMemberListPage
import com.believe.api.models.teammembers.TeamMemberListPageResponse
import com.believe.api.models.teammembers.TeamMemberListParams
import com.believe.api.models.teammembers.TeamMemberListPlayersPage
import com.believe.api.models.teammembers.TeamMemberListPlayersPageResponse
import com.believe.api.models.teammembers.TeamMemberListPlayersParams
import com.believe.api.models.teammembers.TeamMemberListStaffPage
import com.believe.api.models.teammembers.TeamMemberListStaffPageResponse
import com.believe.api.models.teammembers.TeamMemberListStaffParams
import com.believe.api.models.teammembers.TeamMemberRetrieveParams
import com.believe.api.models.teammembers.TeamMemberRetrieveResponse
import com.believe.api.models.teammembers.TeamMemberUpdateParams
import com.believe.api.models.teammembers.TeamMemberUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TeamMemberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TeamMemberService {

    private val withRawResponse: TeamMemberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TeamMemberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamMemberService =
        TeamMemberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TeamMemberCreateParams,
        requestOptions: RequestOptions,
    ): TeamMemberCreateResponse =
        // post /team-members
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TeamMemberRetrieveParams,
        requestOptions: RequestOptions,
    ): TeamMemberRetrieveResponse =
        // get /team-members/{member_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: TeamMemberUpdateParams,
        requestOptions: RequestOptions,
    ): TeamMemberUpdateResponse =
        // patch /team-members/{member_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: TeamMemberListParams,
        requestOptions: RequestOptions,
    ): TeamMemberListPage =
        // get /team-members
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TeamMemberDeleteParams, requestOptions: RequestOptions) {
        // delete /team-members/{member_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listCoaches(
        params: TeamMemberListCoachesParams,
        requestOptions: RequestOptions,
    ): TeamMemberListCoachesPage =
        // get /team-members/coaches/
        withRawResponse().listCoaches(params, requestOptions).parse()

    override fun listPlayers(
        params: TeamMemberListPlayersParams,
        requestOptions: RequestOptions,
    ): TeamMemberListPlayersPage =
        // get /team-members/players/
        withRawResponse().listPlayers(params, requestOptions).parse()

    override fun listStaff(
        params: TeamMemberListStaffParams,
        requestOptions: RequestOptions,
    ): TeamMemberListStaffPage =
        // get /team-members/staff/
        withRawResponse().listStaff(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamMemberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamMemberService.WithRawResponse =
            TeamMemberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TeamMemberCreateResponse> =
            jsonHandler<TeamMemberCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TeamMemberCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamMemberCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members")
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

        private val retrieveHandler: Handler<TeamMemberRetrieveResponse> =
            jsonHandler<TeamMemberRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TeamMemberRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamMemberRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("memberId", params.memberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", params._pathParam(0))
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

        private val updateHandler: Handler<TeamMemberUpdateResponse> =
            jsonHandler<TeamMemberUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TeamMemberUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamMemberUpdateResponse> {
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

        private val listHandler: Handler<TeamMemberListPageResponse> =
            jsonHandler<TeamMemberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TeamMemberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamMemberListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members")
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
                        TeamMemberListPage.builder()
                            .service(TeamMemberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TeamMemberDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listCoachesHandler: Handler<TeamMemberListCoachesPageResponse> =
            jsonHandler<TeamMemberListCoachesPageResponse>(clientOptions.jsonMapper)

        override fun listCoaches(
            params: TeamMemberListCoachesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamMemberListCoachesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", "coaches", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listCoachesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TeamMemberListCoachesPage.builder()
                            .service(TeamMemberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listPlayersHandler: Handler<TeamMemberListPlayersPageResponse> =
            jsonHandler<TeamMemberListPlayersPageResponse>(clientOptions.jsonMapper)

        override fun listPlayers(
            params: TeamMemberListPlayersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamMemberListPlayersPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", "players", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPlayersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TeamMemberListPlayersPage.builder()
                            .service(TeamMemberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listStaffHandler: Handler<TeamMemberListStaffPageResponse> =
            jsonHandler<TeamMemberListStaffPageResponse>(clientOptions.jsonMapper)

        override fun listStaff(
            params: TeamMemberListStaffParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamMemberListStaffPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team-members", "staff", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listStaffHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TeamMemberListStaffPage.builder()
                            .service(TeamMemberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
