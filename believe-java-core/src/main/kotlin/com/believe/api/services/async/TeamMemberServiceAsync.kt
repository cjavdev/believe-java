// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.teammembers.TeamMemberCreateParams
import com.believe.api.models.teammembers.TeamMemberCreateResponse
import com.believe.api.models.teammembers.TeamMemberDeleteParams
import com.believe.api.models.teammembers.TeamMemberListCoachesPageAsync
import com.believe.api.models.teammembers.TeamMemberListCoachesParams
import com.believe.api.models.teammembers.TeamMemberListPageAsync
import com.believe.api.models.teammembers.TeamMemberListParams
import com.believe.api.models.teammembers.TeamMemberListPlayersPageAsync
import com.believe.api.models.teammembers.TeamMemberListPlayersParams
import com.believe.api.models.teammembers.TeamMemberListStaffPageAsync
import com.believe.api.models.teammembers.TeamMemberListStaffParams
import com.believe.api.models.teammembers.TeamMemberRetrieveParams
import com.believe.api.models.teammembers.TeamMemberRetrieveResponse
import com.believe.api.models.teammembers.TeamMemberUpdateParams
import com.believe.api.models.teammembers.TeamMemberUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TeamMemberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamMemberServiceAsync

    /**
     * Add a new team member to a team.
     *
     * The request body is a **union type (oneOf)** - you must include the `member_type`
     * discriminator field:
     * - `"member_type": "player"` - Creates a player (requires position, jersey_number, etc.)
     * - `"member_type": "coach"` - Creates a coach (requires specialty, etc.)
     * - `"member_type": "medical_staff"` - Creates medical staff (requires medical specialty, etc.)
     * - `"member_type": "equipment_manager"` - Creates equipment manager (requires
     *   responsibilities, etc.)
     *
     * The `character_id` field references an existing character from `/characters/{id}`.
     *
     * **Example for creating a player:**
     *
     * ```json
     * {
     *   "member_type": "player",
     *   "character_id": "sam-obisanya",
     *   "team_id": "afc-richmond",
     *   "years_with_team": 2,
     *   "position": "midfielder",
     *   "jersey_number": 24,
     *   "goals_scored": 12,
     *   "assists": 15
     * }
     * ```
     */
    fun create(params: TeamMemberCreateParams): CompletableFuture<TeamMemberCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TeamMemberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamMemberCreateResponse>

    /**
     * Retrieve detailed information about a specific team member.
     *
     * The response is a **union type (oneOf)** - the actual shape depends on the member's type:
     * - **player**: Includes position, jersey_number, goals_scored, assists, is_captain
     * - **coach**: Includes specialty, certifications, win_rate
     * - **medical_staff**: Includes specialty, qualifications, license_number
     * - **equipment_manager**: Includes responsibilities, is_head_kitman
     *
     * Use `character_id` to fetch full character details from `/characters/{character_id}`.
     */
    fun retrieve(memberId: String): CompletableFuture<TeamMemberRetrieveResponse> =
        retrieve(memberId, TeamMemberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        params: TeamMemberRetrieveParams = TeamMemberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamMemberRetrieveResponse> =
        retrieve(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        params: TeamMemberRetrieveParams = TeamMemberRetrieveParams.none(),
    ): CompletableFuture<TeamMemberRetrieveResponse> =
        retrieve(memberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TeamMemberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamMemberRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: TeamMemberRetrieveParams): CompletableFuture<TeamMemberRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamMemberRetrieveResponse> =
        retrieve(memberId, TeamMemberRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing team member. Fields vary by member type. */
    fun update(
        memberId: String,
        params: TeamMemberUpdateParams,
    ): CompletableFuture<TeamMemberUpdateResponse> = update(memberId, params, RequestOptions.none())

    /** @see update */
    fun update(
        memberId: String,
        params: TeamMemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamMemberUpdateResponse> =
        update(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see update */
    fun update(params: TeamMemberUpdateParams): CompletableFuture<TeamMemberUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TeamMemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamMemberUpdateResponse>

    /**
     * Get a paginated list of all team members.
     *
     * This endpoint demonstrates **union types (oneOf)** in the response. Each team member can be
     * one of: Player, Coach, MedicalStaff, or EquipmentManager. The `member_type` field acts as a
     * discriminator to determine the shape of each object.
     */
    fun list(): CompletableFuture<TeamMemberListPageAsync> = list(TeamMemberListParams.none())

    /** @see list */
    fun list(
        params: TeamMemberListParams = TeamMemberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamMemberListPageAsync>

    /** @see list */
    fun list(
        params: TeamMemberListParams = TeamMemberListParams.none()
    ): CompletableFuture<TeamMemberListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TeamMemberListPageAsync> =
        list(TeamMemberListParams.none(), requestOptions)

    /** Remove a team member from the roster. */
    fun delete(memberId: String): CompletableFuture<Void?> =
        delete(memberId, TeamMemberDeleteParams.none())

    /** @see delete */
    fun delete(
        memberId: String,
        params: TeamMemberDeleteParams = TeamMemberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see delete */
    fun delete(
        memberId: String,
        params: TeamMemberDeleteParams = TeamMemberDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(memberId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TeamMemberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TeamMemberDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(memberId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(memberId, TeamMemberDeleteParams.none(), requestOptions)

    /** Get only coaches (filtered subset of team members). */
    fun listCoaches(): CompletableFuture<TeamMemberListCoachesPageAsync> =
        listCoaches(TeamMemberListCoachesParams.none())

    /** @see listCoaches */
    fun listCoaches(
        params: TeamMemberListCoachesParams = TeamMemberListCoachesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamMemberListCoachesPageAsync>

    /** @see listCoaches */
    fun listCoaches(
        params: TeamMemberListCoachesParams = TeamMemberListCoachesParams.none()
    ): CompletableFuture<TeamMemberListCoachesPageAsync> =
        listCoaches(params, RequestOptions.none())

    /** @see listCoaches */
    fun listCoaches(
        requestOptions: RequestOptions
    ): CompletableFuture<TeamMemberListCoachesPageAsync> =
        listCoaches(TeamMemberListCoachesParams.none(), requestOptions)

    /** Get only players (filtered subset of team members). */
    fun listPlayers(): CompletableFuture<TeamMemberListPlayersPageAsync> =
        listPlayers(TeamMemberListPlayersParams.none())

    /** @see listPlayers */
    fun listPlayers(
        params: TeamMemberListPlayersParams = TeamMemberListPlayersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamMemberListPlayersPageAsync>

    /** @see listPlayers */
    fun listPlayers(
        params: TeamMemberListPlayersParams = TeamMemberListPlayersParams.none()
    ): CompletableFuture<TeamMemberListPlayersPageAsync> =
        listPlayers(params, RequestOptions.none())

    /** @see listPlayers */
    fun listPlayers(
        requestOptions: RequestOptions
    ): CompletableFuture<TeamMemberListPlayersPageAsync> =
        listPlayers(TeamMemberListPlayersParams.none(), requestOptions)

    /**
     * Get all staff members (medical staff and equipment managers).
     *
     * This demonstrates a **narrower union type** - the response is oneOf MedicalStaff or
     * EquipmentManager.
     */
    fun listStaff(): CompletableFuture<TeamMemberListStaffPageAsync> =
        listStaff(TeamMemberListStaffParams.none())

    /** @see listStaff */
    fun listStaff(
        params: TeamMemberListStaffParams = TeamMemberListStaffParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamMemberListStaffPageAsync>

    /** @see listStaff */
    fun listStaff(
        params: TeamMemberListStaffParams = TeamMemberListStaffParams.none()
    ): CompletableFuture<TeamMemberListStaffPageAsync> = listStaff(params, RequestOptions.none())

    /** @see listStaff */
    fun listStaff(requestOptions: RequestOptions): CompletableFuture<TeamMemberListStaffPageAsync> =
        listStaff(TeamMemberListStaffParams.none(), requestOptions)

    /**
     * A view of [TeamMemberServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamMemberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /team-members`, but is otherwise the same as
         * [TeamMemberServiceAsync.create].
         */
        fun create(
            params: TeamMemberCreateParams
        ): CompletableFuture<HttpResponseFor<TeamMemberCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TeamMemberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /team-members/{member_id}`, but is otherwise the
         * same as [TeamMemberServiceAsync.retrieve].
         */
        fun retrieve(
            memberId: String
        ): CompletableFuture<HttpResponseFor<TeamMemberRetrieveResponse>> =
            retrieve(memberId, TeamMemberRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            memberId: String,
            params: TeamMemberRetrieveParams = TeamMemberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberRetrieveResponse>> =
            retrieve(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            memberId: String,
            params: TeamMemberRetrieveParams = TeamMemberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberRetrieveResponse>> =
            retrieve(memberId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TeamMemberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TeamMemberRetrieveParams
        ): CompletableFuture<HttpResponseFor<TeamMemberRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            memberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamMemberRetrieveResponse>> =
            retrieve(memberId, TeamMemberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /team-members/{member_id}`, but is otherwise the
         * same as [TeamMemberServiceAsync.update].
         */
        fun update(
            memberId: String,
            params: TeamMemberUpdateParams,
        ): CompletableFuture<HttpResponseFor<TeamMemberUpdateResponse>> =
            update(memberId, params, RequestOptions.none())

        /** @see update */
        fun update(
            memberId: String,
            params: TeamMemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberUpdateResponse>> =
            update(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see update */
        fun update(
            params: TeamMemberUpdateParams
        ): CompletableFuture<HttpResponseFor<TeamMemberUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TeamMemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /team-members`, but is otherwise the same as
         * [TeamMemberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TeamMemberListPageAsync>> =
            list(TeamMemberListParams.none())

        /** @see list */
        fun list(
            params: TeamMemberListParams = TeamMemberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberListPageAsync>>

        /** @see list */
        fun list(
            params: TeamMemberListParams = TeamMemberListParams.none()
        ): CompletableFuture<HttpResponseFor<TeamMemberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamMemberListPageAsync>> =
            list(TeamMemberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /team-members/{member_id}`, but is otherwise the
         * same as [TeamMemberServiceAsync.delete].
         */
        fun delete(memberId: String): CompletableFuture<HttpResponse> =
            delete(memberId, TeamMemberDeleteParams.none())

        /** @see delete */
        fun delete(
            memberId: String,
            params: TeamMemberDeleteParams = TeamMemberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see delete */
        fun delete(
            memberId: String,
            params: TeamMemberDeleteParams = TeamMemberDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(memberId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TeamMemberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TeamMemberDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            memberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(memberId, TeamMemberDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /team-members/coaches/`, but is otherwise the same
         * as [TeamMemberServiceAsync.listCoaches].
         */
        fun listCoaches(): CompletableFuture<HttpResponseFor<TeamMemberListCoachesPageAsync>> =
            listCoaches(TeamMemberListCoachesParams.none())

        /** @see listCoaches */
        fun listCoaches(
            params: TeamMemberListCoachesParams = TeamMemberListCoachesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberListCoachesPageAsync>>

        /** @see listCoaches */
        fun listCoaches(
            params: TeamMemberListCoachesParams = TeamMemberListCoachesParams.none()
        ): CompletableFuture<HttpResponseFor<TeamMemberListCoachesPageAsync>> =
            listCoaches(params, RequestOptions.none())

        /** @see listCoaches */
        fun listCoaches(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamMemberListCoachesPageAsync>> =
            listCoaches(TeamMemberListCoachesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /team-members/players/`, but is otherwise the same
         * as [TeamMemberServiceAsync.listPlayers].
         */
        fun listPlayers(): CompletableFuture<HttpResponseFor<TeamMemberListPlayersPageAsync>> =
            listPlayers(TeamMemberListPlayersParams.none())

        /** @see listPlayers */
        fun listPlayers(
            params: TeamMemberListPlayersParams = TeamMemberListPlayersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberListPlayersPageAsync>>

        /** @see listPlayers */
        fun listPlayers(
            params: TeamMemberListPlayersParams = TeamMemberListPlayersParams.none()
        ): CompletableFuture<HttpResponseFor<TeamMemberListPlayersPageAsync>> =
            listPlayers(params, RequestOptions.none())

        /** @see listPlayers */
        fun listPlayers(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamMemberListPlayersPageAsync>> =
            listPlayers(TeamMemberListPlayersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /team-members/staff/`, but is otherwise the same as
         * [TeamMemberServiceAsync.listStaff].
         */
        fun listStaff(): CompletableFuture<HttpResponseFor<TeamMemberListStaffPageAsync>> =
            listStaff(TeamMemberListStaffParams.none())

        /** @see listStaff */
        fun listStaff(
            params: TeamMemberListStaffParams = TeamMemberListStaffParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamMemberListStaffPageAsync>>

        /** @see listStaff */
        fun listStaff(
            params: TeamMemberListStaffParams = TeamMemberListStaffParams.none()
        ): CompletableFuture<HttpResponseFor<TeamMemberListStaffPageAsync>> =
            listStaff(params, RequestOptions.none())

        /** @see listStaff */
        fun listStaff(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamMemberListStaffPageAsync>> =
            listStaff(TeamMemberListStaffParams.none(), requestOptions)
    }
}
