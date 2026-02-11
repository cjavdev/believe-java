// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.teams.Team
import com.believe.api.models.teams.TeamCreateParams
import com.believe.api.models.teams.TeamDeleteParams
import com.believe.api.models.teams.TeamGetCultureParams
import com.believe.api.models.teams.TeamGetCultureResponse
import com.believe.api.models.teams.TeamGetRivalsParams
import com.believe.api.models.teams.TeamListLogosParams
import com.believe.api.models.teams.TeamListPageAsync
import com.believe.api.models.teams.TeamListParams
import com.believe.api.models.teams.TeamRetrieveParams
import com.believe.api.models.teams.TeamUpdateParams
import com.believe.api.models.teams.logo.FileUpload
import com.believe.api.services.async.teams.LogoServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TeamServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync

    fun logo(): LogoServiceAsync

    /** Add a new team to the league. */
    fun create(params: TeamCreateParams): CompletableFuture<Team> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TeamCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Team>

    /** Retrieve detailed information about a specific team. */
    fun retrieve(teamId: String): CompletableFuture<Team> =
        retrieve(teamId, TeamRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        teamId: String,
        params: TeamRetrieveParams = TeamRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Team> = retrieve(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        teamId: String,
        params: TeamRetrieveParams = TeamRetrieveParams.none(),
    ): CompletableFuture<Team> = retrieve(teamId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TeamRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Team>

    /** @see retrieve */
    fun retrieve(params: TeamRetrieveParams): CompletableFuture<Team> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(teamId: String, requestOptions: RequestOptions): CompletableFuture<Team> =
        retrieve(teamId, TeamRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing team. */
    fun update(teamId: String): CompletableFuture<Team> = update(teamId, TeamUpdateParams.none())

    /** @see update */
    fun update(
        teamId: String,
        params: TeamUpdateParams = TeamUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Team> = update(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see update */
    fun update(
        teamId: String,
        params: TeamUpdateParams = TeamUpdateParams.none(),
    ): CompletableFuture<Team> = update(teamId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Team>

    /** @see update */
    fun update(params: TeamUpdateParams): CompletableFuture<Team> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(teamId: String, requestOptions: RequestOptions): CompletableFuture<Team> =
        update(teamId, TeamUpdateParams.none(), requestOptions)

    /** Get a paginated list of all teams with optional filtering by league or culture score. */
    fun list(): CompletableFuture<TeamListPageAsync> = list(TeamListParams.none())

    /** @see list */
    fun list(
        params: TeamListParams = TeamListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamListPageAsync>

    /** @see list */
    fun list(params: TeamListParams = TeamListParams.none()): CompletableFuture<TeamListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TeamListPageAsync> =
        list(TeamListParams.none(), requestOptions)

    /** Remove a team from the database (relegation to oblivion). */
    fun delete(teamId: String): CompletableFuture<Void?> = delete(teamId, TeamDeleteParams.none())

    /** @see delete */
    fun delete(
        teamId: String,
        params: TeamDeleteParams = TeamDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see delete */
    fun delete(
        teamId: String,
        params: TeamDeleteParams = TeamDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(teamId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TeamDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TeamDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(teamId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(teamId, TeamDeleteParams.none(), requestOptions)

    /** Get detailed culture and values information for a team. */
    fun getCulture(teamId: String): CompletableFuture<TeamGetCultureResponse> =
        getCulture(teamId, TeamGetCultureParams.none())

    /** @see getCulture */
    fun getCulture(
        teamId: String,
        params: TeamGetCultureParams = TeamGetCultureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamGetCultureResponse> =
        getCulture(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see getCulture */
    fun getCulture(
        teamId: String,
        params: TeamGetCultureParams = TeamGetCultureParams.none(),
    ): CompletableFuture<TeamGetCultureResponse> = getCulture(teamId, params, RequestOptions.none())

    /** @see getCulture */
    fun getCulture(
        params: TeamGetCultureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamGetCultureResponse>

    /** @see getCulture */
    fun getCulture(params: TeamGetCultureParams): CompletableFuture<TeamGetCultureResponse> =
        getCulture(params, RequestOptions.none())

    /** @see getCulture */
    fun getCulture(
        teamId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamGetCultureResponse> =
        getCulture(teamId, TeamGetCultureParams.none(), requestOptions)

    /** Get all rival teams for a specific team. */
    fun getRivals(teamId: String): CompletableFuture<List<Team>> =
        getRivals(teamId, TeamGetRivalsParams.none())

    /** @see getRivals */
    fun getRivals(
        teamId: String,
        params: TeamGetRivalsParams = TeamGetRivalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Team>> =
        getRivals(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see getRivals */
    fun getRivals(
        teamId: String,
        params: TeamGetRivalsParams = TeamGetRivalsParams.none(),
    ): CompletableFuture<List<Team>> = getRivals(teamId, params, RequestOptions.none())

    /** @see getRivals */
    fun getRivals(
        params: TeamGetRivalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Team>>

    /** @see getRivals */
    fun getRivals(params: TeamGetRivalsParams): CompletableFuture<List<Team>> =
        getRivals(params, RequestOptions.none())

    /** @see getRivals */
    fun getRivals(teamId: String, requestOptions: RequestOptions): CompletableFuture<List<Team>> =
        getRivals(teamId, TeamGetRivalsParams.none(), requestOptions)

    /** List all uploaded logos for a team. */
    fun listLogos(teamId: String): CompletableFuture<List<FileUpload>> =
        listLogos(teamId, TeamListLogosParams.none())

    /** @see listLogos */
    fun listLogos(
        teamId: String,
        params: TeamListLogosParams = TeamListLogosParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FileUpload>> =
        listLogos(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see listLogos */
    fun listLogos(
        teamId: String,
        params: TeamListLogosParams = TeamListLogosParams.none(),
    ): CompletableFuture<List<FileUpload>> = listLogos(teamId, params, RequestOptions.none())

    /** @see listLogos */
    fun listLogos(
        params: TeamListLogosParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FileUpload>>

    /** @see listLogos */
    fun listLogos(params: TeamListLogosParams): CompletableFuture<List<FileUpload>> =
        listLogos(params, RequestOptions.none())

    /** @see listLogos */
    fun listLogos(
        teamId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FileUpload>> =
        listLogos(teamId, TeamListLogosParams.none(), requestOptions)

    /** A view of [TeamServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync.WithRawResponse

        fun logo(): LogoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /teams`, but is otherwise the same as
         * [TeamServiceAsync.create].
         */
        fun create(params: TeamCreateParams): CompletableFuture<HttpResponseFor<Team>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TeamCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Team>>

        /**
         * Returns a raw HTTP response for `get /teams/{team_id}`, but is otherwise the same as
         * [TeamServiceAsync.retrieve].
         */
        fun retrieve(teamId: String): CompletableFuture<HttpResponseFor<Team>> =
            retrieve(teamId, TeamRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            teamId: String,
            params: TeamRetrieveParams = TeamRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Team>> =
            retrieve(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            teamId: String,
            params: TeamRetrieveParams = TeamRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Team>> =
            retrieve(teamId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TeamRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Team>>

        /** @see retrieve */
        fun retrieve(params: TeamRetrieveParams): CompletableFuture<HttpResponseFor<Team>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            teamId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Team>> =
            retrieve(teamId, TeamRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /teams/{team_id}`, but is otherwise the same as
         * [TeamServiceAsync.update].
         */
        fun update(teamId: String): CompletableFuture<HttpResponseFor<Team>> =
            update(teamId, TeamUpdateParams.none())

        /** @see update */
        fun update(
            teamId: String,
            params: TeamUpdateParams = TeamUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Team>> =
            update(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see update */
        fun update(
            teamId: String,
            params: TeamUpdateParams = TeamUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Team>> = update(teamId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Team>>

        /** @see update */
        fun update(params: TeamUpdateParams): CompletableFuture<HttpResponseFor<Team>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            teamId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Team>> =
            update(teamId, TeamUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /teams`, but is otherwise the same as
         * [TeamServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TeamListPageAsync>> =
            list(TeamListParams.none())

        /** @see list */
        fun list(
            params: TeamListParams = TeamListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamListPageAsync>>

        /** @see list */
        fun list(
            params: TeamListParams = TeamListParams.none()
        ): CompletableFuture<HttpResponseFor<TeamListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamListPageAsync>> =
            list(TeamListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /teams/{team_id}`, but is otherwise the same as
         * [TeamServiceAsync.delete].
         */
        fun delete(teamId: String): CompletableFuture<HttpResponse> =
            delete(teamId, TeamDeleteParams.none())

        /** @see delete */
        fun delete(
            teamId: String,
            params: TeamDeleteParams = TeamDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see delete */
        fun delete(
            teamId: String,
            params: TeamDeleteParams = TeamDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(teamId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TeamDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TeamDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            teamId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(teamId, TeamDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /teams/{team_id}/culture`, but is otherwise the same
         * as [TeamServiceAsync.getCulture].
         */
        fun getCulture(teamId: String): CompletableFuture<HttpResponseFor<TeamGetCultureResponse>> =
            getCulture(teamId, TeamGetCultureParams.none())

        /** @see getCulture */
        fun getCulture(
            teamId: String,
            params: TeamGetCultureParams = TeamGetCultureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamGetCultureResponse>> =
            getCulture(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see getCulture */
        fun getCulture(
            teamId: String,
            params: TeamGetCultureParams = TeamGetCultureParams.none(),
        ): CompletableFuture<HttpResponseFor<TeamGetCultureResponse>> =
            getCulture(teamId, params, RequestOptions.none())

        /** @see getCulture */
        fun getCulture(
            params: TeamGetCultureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamGetCultureResponse>>

        /** @see getCulture */
        fun getCulture(
            params: TeamGetCultureParams
        ): CompletableFuture<HttpResponseFor<TeamGetCultureResponse>> =
            getCulture(params, RequestOptions.none())

        /** @see getCulture */
        fun getCulture(
            teamId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamGetCultureResponse>> =
            getCulture(teamId, TeamGetCultureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /teams/{team_id}/rivals`, but is otherwise the same
         * as [TeamServiceAsync.getRivals].
         */
        fun getRivals(teamId: String): CompletableFuture<HttpResponseFor<List<Team>>> =
            getRivals(teamId, TeamGetRivalsParams.none())

        /** @see getRivals */
        fun getRivals(
            teamId: String,
            params: TeamGetRivalsParams = TeamGetRivalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Team>>> =
            getRivals(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see getRivals */
        fun getRivals(
            teamId: String,
            params: TeamGetRivalsParams = TeamGetRivalsParams.none(),
        ): CompletableFuture<HttpResponseFor<List<Team>>> =
            getRivals(teamId, params, RequestOptions.none())

        /** @see getRivals */
        fun getRivals(
            params: TeamGetRivalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Team>>>

        /** @see getRivals */
        fun getRivals(params: TeamGetRivalsParams): CompletableFuture<HttpResponseFor<List<Team>>> =
            getRivals(params, RequestOptions.none())

        /** @see getRivals */
        fun getRivals(
            teamId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Team>>> =
            getRivals(teamId, TeamGetRivalsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /teams/{team_id}/logos`, but is otherwise the same
         * as [TeamServiceAsync.listLogos].
         */
        fun listLogos(teamId: String): CompletableFuture<HttpResponseFor<List<FileUpload>>> =
            listLogos(teamId, TeamListLogosParams.none())

        /** @see listLogos */
        fun listLogos(
            teamId: String,
            params: TeamListLogosParams = TeamListLogosParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FileUpload>>> =
            listLogos(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see listLogos */
        fun listLogos(
            teamId: String,
            params: TeamListLogosParams = TeamListLogosParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FileUpload>>> =
            listLogos(teamId, params, RequestOptions.none())

        /** @see listLogos */
        fun listLogos(
            params: TeamListLogosParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FileUpload>>>

        /** @see listLogos */
        fun listLogos(
            params: TeamListLogosParams
        ): CompletableFuture<HttpResponseFor<List<FileUpload>>> =
            listLogos(params, RequestOptions.none())

        /** @see listLogos */
        fun listLogos(
            teamId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FileUpload>>> =
            listLogos(teamId, TeamListLogosParams.none(), requestOptions)
    }
}
