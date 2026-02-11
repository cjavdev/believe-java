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
import com.believe.api.models.teams.Team
import com.believe.api.models.teams.TeamCreateParams
import com.believe.api.models.teams.TeamDeleteParams
import com.believe.api.models.teams.TeamGetCultureParams
import com.believe.api.models.teams.TeamGetCultureResponse
import com.believe.api.models.teams.TeamGetRivalsParams
import com.believe.api.models.teams.TeamListLogosParams
import com.believe.api.models.teams.TeamListPageAsync
import com.believe.api.models.teams.TeamListPageResponse
import com.believe.api.models.teams.TeamListParams
import com.believe.api.models.teams.TeamRetrieveParams
import com.believe.api.models.teams.TeamUpdateParams
import com.believe.api.models.teams.logo.FileUpload
import com.believe.api.services.async.teams.LogoServiceAsync
import com.believe.api.services.async.teams.LogoServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TeamServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TeamServiceAsync {

    private val withRawResponse: TeamServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val logo: LogoServiceAsync by lazy { LogoServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TeamServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync =
        TeamServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun logo(): LogoServiceAsync = logo

    override fun create(
        params: TeamCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Team> =
        // post /teams
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TeamRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Team> =
        // get /teams/{team_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Team> =
        // patch /teams/{team_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TeamListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamListPageAsync> =
        // get /teams
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TeamDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /teams/{team_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun getCulture(
        params: TeamGetCultureParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamGetCultureResponse> =
        // get /teams/{team_id}/culture
        withRawResponse().getCulture(params, requestOptions).thenApply { it.parse() }

    override fun getRivals(
        params: TeamGetRivalsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Team>> =
        // get /teams/{team_id}/rivals
        withRawResponse().getRivals(params, requestOptions).thenApply { it.parse() }

    override fun listLogos(
        params: TeamListLogosParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FileUpload>> =
        // get /teams/{team_id}/logos
        withRawResponse().listLogos(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val logo: LogoServiceAsync.WithRawResponse by lazy {
            LogoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamServiceAsync.WithRawResponse =
            TeamServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun logo(): LogoServiceAsync.WithRawResponse = logo

        private val createHandler: Handler<Team> = jsonHandler<Team>(clientOptions.jsonMapper)

        override fun create(
            params: TeamCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Team>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams")
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

        private val retrieveHandler: Handler<Team> = jsonHandler<Team>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TeamRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Team>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", params._pathParam(0))
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

        private val updateHandler: Handler<Team> = jsonHandler<Team>(clientOptions.jsonMapper)

        override fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Team>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", params._pathParam(0))
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

        private val listHandler: Handler<TeamListPageResponse> =
            jsonHandler<TeamListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TeamListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams")
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
                                TeamListPageAsync.builder()
                                    .service(TeamServiceAsyncImpl(clientOptions))
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
            params: TeamDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", params._pathParam(0))
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

        private val getCultureHandler: Handler<TeamGetCultureResponse> =
            jsonHandler<TeamGetCultureResponse>(clientOptions.jsonMapper)

        override fun getCulture(
            params: TeamGetCultureParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamGetCultureResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", params._pathParam(0), "culture")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getCultureHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getRivalsHandler: Handler<List<Team>> =
            jsonHandler<List<Team>>(clientOptions.jsonMapper)

        override fun getRivals(
            params: TeamGetRivalsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Team>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", params._pathParam(0), "rivals")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRivalsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val listLogosHandler: Handler<List<FileUpload>> =
            jsonHandler<List<FileUpload>>(clientOptions.jsonMapper)

        override fun listLogos(
            params: TeamListLogosParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FileUpload>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", params._pathParam(0), "logos")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listLogosHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
