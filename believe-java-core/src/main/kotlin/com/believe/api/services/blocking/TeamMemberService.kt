// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.teammembers.TeamMemberCreateParams
import com.believe.api.models.teammembers.TeamMemberCreateResponse
import com.believe.api.models.teammembers.TeamMemberDeleteParams
import com.believe.api.models.teammembers.TeamMemberListCoachesPage
import com.believe.api.models.teammembers.TeamMemberListCoachesParams
import com.believe.api.models.teammembers.TeamMemberListPage
import com.believe.api.models.teammembers.TeamMemberListParams
import com.believe.api.models.teammembers.TeamMemberListPlayersPage
import com.believe.api.models.teammembers.TeamMemberListPlayersParams
import com.believe.api.models.teammembers.TeamMemberListStaffPage
import com.believe.api.models.teammembers.TeamMemberListStaffParams
import com.believe.api.models.teammembers.TeamMemberRetrieveParams
import com.believe.api.models.teammembers.TeamMemberRetrieveResponse
import com.believe.api.models.teammembers.TeamMemberUpdateParams
import com.believe.api.models.teammembers.TeamMemberUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface TeamMemberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamMemberService

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
    fun create(params: TeamMemberCreateParams): TeamMemberCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TeamMemberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamMemberCreateResponse

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
    fun retrieve(memberId: String): TeamMemberRetrieveResponse =
        retrieve(memberId, TeamMemberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        params: TeamMemberRetrieveParams = TeamMemberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamMemberRetrieveResponse =
        retrieve(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        params: TeamMemberRetrieveParams = TeamMemberRetrieveParams.none(),
    ): TeamMemberRetrieveResponse = retrieve(memberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TeamMemberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamMemberRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TeamMemberRetrieveParams): TeamMemberRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(memberId: String, requestOptions: RequestOptions): TeamMemberRetrieveResponse =
        retrieve(memberId, TeamMemberRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing team member. Fields vary by member type. */
    fun update(memberId: String, params: TeamMemberUpdateParams): TeamMemberUpdateResponse =
        update(memberId, params, RequestOptions.none())

    /** @see update */
    fun update(
        memberId: String,
        params: TeamMemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamMemberUpdateResponse =
        update(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see update */
    fun update(params: TeamMemberUpdateParams): TeamMemberUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TeamMemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamMemberUpdateResponse

    /**
     * Get a paginated list of all team members.
     *
     * This endpoint demonstrates **union types (oneOf)** in the response. Each team member can be
     * one of: Player, Coach, MedicalStaff, or EquipmentManager. The `member_type` field acts as a
     * discriminator to determine the shape of each object.
     */
    fun list(): TeamMemberListPage = list(TeamMemberListParams.none())

    /** @see list */
    fun list(
        params: TeamMemberListParams = TeamMemberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamMemberListPage

    /** @see list */
    fun list(params: TeamMemberListParams = TeamMemberListParams.none()): TeamMemberListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TeamMemberListPage =
        list(TeamMemberListParams.none(), requestOptions)

    /** Remove a team member from the roster. */
    fun delete(memberId: String) = delete(memberId, TeamMemberDeleteParams.none())

    /** @see delete */
    fun delete(
        memberId: String,
        params: TeamMemberDeleteParams = TeamMemberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see delete */
    fun delete(memberId: String, params: TeamMemberDeleteParams = TeamMemberDeleteParams.none()) =
        delete(memberId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TeamMemberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: TeamMemberDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(memberId: String, requestOptions: RequestOptions) =
        delete(memberId, TeamMemberDeleteParams.none(), requestOptions)

    /** Get only coaches (filtered subset of team members). */
    fun listCoaches(): TeamMemberListCoachesPage = listCoaches(TeamMemberListCoachesParams.none())

    /** @see listCoaches */
    fun listCoaches(
        params: TeamMemberListCoachesParams = TeamMemberListCoachesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamMemberListCoachesPage

    /** @see listCoaches */
    fun listCoaches(
        params: TeamMemberListCoachesParams = TeamMemberListCoachesParams.none()
    ): TeamMemberListCoachesPage = listCoaches(params, RequestOptions.none())

    /** @see listCoaches */
    fun listCoaches(requestOptions: RequestOptions): TeamMemberListCoachesPage =
        listCoaches(TeamMemberListCoachesParams.none(), requestOptions)

    /** Get only players (filtered subset of team members). */
    fun listPlayers(): TeamMemberListPlayersPage = listPlayers(TeamMemberListPlayersParams.none())

    /** @see listPlayers */
    fun listPlayers(
        params: TeamMemberListPlayersParams = TeamMemberListPlayersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamMemberListPlayersPage

    /** @see listPlayers */
    fun listPlayers(
        params: TeamMemberListPlayersParams = TeamMemberListPlayersParams.none()
    ): TeamMemberListPlayersPage = listPlayers(params, RequestOptions.none())

    /** @see listPlayers */
    fun listPlayers(requestOptions: RequestOptions): TeamMemberListPlayersPage =
        listPlayers(TeamMemberListPlayersParams.none(), requestOptions)

    /**
     * Get all staff members (medical staff and equipment managers).
     *
     * This demonstrates a **narrower union type** - the response is oneOf MedicalStaff or
     * EquipmentManager.
     */
    fun listStaff(): TeamMemberListStaffPage = listStaff(TeamMemberListStaffParams.none())

    /** @see listStaff */
    fun listStaff(
        params: TeamMemberListStaffParams = TeamMemberListStaffParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamMemberListStaffPage

    /** @see listStaff */
    fun listStaff(
        params: TeamMemberListStaffParams = TeamMemberListStaffParams.none()
    ): TeamMemberListStaffPage = listStaff(params, RequestOptions.none())

    /** @see listStaff */
    fun listStaff(requestOptions: RequestOptions): TeamMemberListStaffPage =
        listStaff(TeamMemberListStaffParams.none(), requestOptions)

    /** A view of [TeamMemberService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamMemberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /team-members`, but is otherwise the same as
         * [TeamMemberService.create].
         */
        @MustBeClosed
        fun create(params: TeamMemberCreateParams): HttpResponseFor<TeamMemberCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TeamMemberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamMemberCreateResponse>

        /**
         * Returns a raw HTTP response for `get /team-members/{member_id}`, but is otherwise the
         * same as [TeamMemberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(memberId: String): HttpResponseFor<TeamMemberRetrieveResponse> =
            retrieve(memberId, TeamMemberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            memberId: String,
            params: TeamMemberRetrieveParams = TeamMemberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamMemberRetrieveResponse> =
            retrieve(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            memberId: String,
            params: TeamMemberRetrieveParams = TeamMemberRetrieveParams.none(),
        ): HttpResponseFor<TeamMemberRetrieveResponse> =
            retrieve(memberId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TeamMemberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamMemberRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TeamMemberRetrieveParams
        ): HttpResponseFor<TeamMemberRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            memberId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamMemberRetrieveResponse> =
            retrieve(memberId, TeamMemberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /team-members/{member_id}`, but is otherwise the
         * same as [TeamMemberService.update].
         */
        @MustBeClosed
        fun update(
            memberId: String,
            params: TeamMemberUpdateParams,
        ): HttpResponseFor<TeamMemberUpdateResponse> =
            update(memberId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            memberId: String,
            params: TeamMemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamMemberUpdateResponse> =
            update(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TeamMemberUpdateParams): HttpResponseFor<TeamMemberUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TeamMemberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamMemberUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /team-members`, but is otherwise the same as
         * [TeamMemberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TeamMemberListPage> = list(TeamMemberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TeamMemberListParams = TeamMemberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamMemberListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TeamMemberListParams = TeamMemberListParams.none()
        ): HttpResponseFor<TeamMemberListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TeamMemberListPage> =
            list(TeamMemberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /team-members/{member_id}`, but is otherwise the
         * same as [TeamMemberService.delete].
         */
        @MustBeClosed
        fun delete(memberId: String): HttpResponse = delete(memberId, TeamMemberDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            memberId: String,
            params: TeamMemberDeleteParams = TeamMemberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            memberId: String,
            params: TeamMemberDeleteParams = TeamMemberDeleteParams.none(),
        ): HttpResponse = delete(memberId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TeamMemberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TeamMemberDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(memberId: String, requestOptions: RequestOptions): HttpResponse =
            delete(memberId, TeamMemberDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /team-members/coaches/`, but is otherwise the same
         * as [TeamMemberService.listCoaches].
         */
        @MustBeClosed
        fun listCoaches(): HttpResponseFor<TeamMemberListCoachesPage> =
            listCoaches(TeamMemberListCoachesParams.none())

        /** @see listCoaches */
        @MustBeClosed
        fun listCoaches(
            params: TeamMemberListCoachesParams = TeamMemberListCoachesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamMemberListCoachesPage>

        /** @see listCoaches */
        @MustBeClosed
        fun listCoaches(
            params: TeamMemberListCoachesParams = TeamMemberListCoachesParams.none()
        ): HttpResponseFor<TeamMemberListCoachesPage> = listCoaches(params, RequestOptions.none())

        /** @see listCoaches */
        @MustBeClosed
        fun listCoaches(
            requestOptions: RequestOptions
        ): HttpResponseFor<TeamMemberListCoachesPage> =
            listCoaches(TeamMemberListCoachesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /team-members/players/`, but is otherwise the same
         * as [TeamMemberService.listPlayers].
         */
        @MustBeClosed
        fun listPlayers(): HttpResponseFor<TeamMemberListPlayersPage> =
            listPlayers(TeamMemberListPlayersParams.none())

        /** @see listPlayers */
        @MustBeClosed
        fun listPlayers(
            params: TeamMemberListPlayersParams = TeamMemberListPlayersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamMemberListPlayersPage>

        /** @see listPlayers */
        @MustBeClosed
        fun listPlayers(
            params: TeamMemberListPlayersParams = TeamMemberListPlayersParams.none()
        ): HttpResponseFor<TeamMemberListPlayersPage> = listPlayers(params, RequestOptions.none())

        /** @see listPlayers */
        @MustBeClosed
        fun listPlayers(
            requestOptions: RequestOptions
        ): HttpResponseFor<TeamMemberListPlayersPage> =
            listPlayers(TeamMemberListPlayersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /team-members/staff/`, but is otherwise the same as
         * [TeamMemberService.listStaff].
         */
        @MustBeClosed
        fun listStaff(): HttpResponseFor<TeamMemberListStaffPage> =
            listStaff(TeamMemberListStaffParams.none())

        /** @see listStaff */
        @MustBeClosed
        fun listStaff(
            params: TeamMemberListStaffParams = TeamMemberListStaffParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamMemberListStaffPage>

        /** @see listStaff */
        @MustBeClosed
        fun listStaff(
            params: TeamMemberListStaffParams = TeamMemberListStaffParams.none()
        ): HttpResponseFor<TeamMemberListStaffPage> = listStaff(params, RequestOptions.none())

        /** @see listStaff */
        @MustBeClosed
        fun listStaff(requestOptions: RequestOptions): HttpResponseFor<TeamMemberListStaffPage> =
            listStaff(TeamMemberListStaffParams.none(), requestOptions)
    }
}
