// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.matches.Match
import com.believe.api.models.matches.MatchCreateParams
import com.believe.api.models.matches.MatchDeleteParams
import com.believe.api.models.matches.MatchGetLessonParams
import com.believe.api.models.matches.MatchGetLessonResponse
import com.believe.api.models.matches.MatchGetTurningPointsParams
import com.believe.api.models.matches.MatchGetTurningPointsResponse
import com.believe.api.models.matches.MatchListPage
import com.believe.api.models.matches.MatchListParams
import com.believe.api.models.matches.MatchRetrieveParams
import com.believe.api.models.matches.MatchStreamLiveParams
import com.believe.api.models.matches.MatchUpdateParams
import com.believe.api.services.blocking.matches.CommentaryService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface MatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatchService

    fun commentary(): CommentaryService

    /** Schedule a new match. */
    fun create(params: MatchCreateParams): Match = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Match

    /** Retrieve detailed information about a specific match. */
    fun retrieve(matchId: String): Match = retrieve(matchId, MatchRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        matchId: String,
        params: MatchRetrieveParams = MatchRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Match = retrieve(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(matchId: String, params: MatchRetrieveParams = MatchRetrieveParams.none()): Match =
        retrieve(matchId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Match

    /** @see retrieve */
    fun retrieve(params: MatchRetrieveParams): Match = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(matchId: String, requestOptions: RequestOptions): Match =
        retrieve(matchId, MatchRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing match (e.g., update score). */
    fun update(matchId: String): Match = update(matchId, MatchUpdateParams.none())

    /** @see update */
    fun update(
        matchId: String,
        params: MatchUpdateParams = MatchUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Match = update(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see update */
    fun update(matchId: String, params: MatchUpdateParams = MatchUpdateParams.none()): Match =
        update(matchId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Match

    /** @see update */
    fun update(params: MatchUpdateParams): Match = update(params, RequestOptions.none())

    /** @see update */
    fun update(matchId: String, requestOptions: RequestOptions): Match =
        update(matchId, MatchUpdateParams.none(), requestOptions)

    /** Get a paginated list of all matches with optional filtering. */
    fun list(): MatchListPage = list(MatchListParams.none())

    /** @see list */
    fun list(
        params: MatchListParams = MatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MatchListPage

    /** @see list */
    fun list(params: MatchListParams = MatchListParams.none()): MatchListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MatchListPage =
        list(MatchListParams.none(), requestOptions)

    /** Remove a match from the database. */
    fun delete(matchId: String) = delete(matchId, MatchDeleteParams.none())

    /** @see delete */
    fun delete(
        matchId: String,
        params: MatchDeleteParams = MatchDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see delete */
    fun delete(matchId: String, params: MatchDeleteParams = MatchDeleteParams.none()) =
        delete(matchId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: MatchDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: MatchDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(matchId: String, requestOptions: RequestOptions) =
        delete(matchId, MatchDeleteParams.none(), requestOptions)

    /** Get the life lesson learned from a specific match. */
    fun getLesson(matchId: String): MatchGetLessonResponse =
        getLesson(matchId, MatchGetLessonParams.none())

    /** @see getLesson */
    fun getLesson(
        matchId: String,
        params: MatchGetLessonParams = MatchGetLessonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MatchGetLessonResponse =
        getLesson(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see getLesson */
    fun getLesson(
        matchId: String,
        params: MatchGetLessonParams = MatchGetLessonParams.none(),
    ): MatchGetLessonResponse = getLesson(matchId, params, RequestOptions.none())

    /** @see getLesson */
    fun getLesson(
        params: MatchGetLessonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MatchGetLessonResponse

    /** @see getLesson */
    fun getLesson(params: MatchGetLessonParams): MatchGetLessonResponse =
        getLesson(params, RequestOptions.none())

    /** @see getLesson */
    fun getLesson(matchId: String, requestOptions: RequestOptions): MatchGetLessonResponse =
        getLesson(matchId, MatchGetLessonParams.none(), requestOptions)

    /** Get all turning points from a specific match. */
    fun getTurningPoints(matchId: String): List<MatchGetTurningPointsResponse> =
        getTurningPoints(matchId, MatchGetTurningPointsParams.none())

    /** @see getTurningPoints */
    fun getTurningPoints(
        matchId: String,
        params: MatchGetTurningPointsParams = MatchGetTurningPointsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<MatchGetTurningPointsResponse> =
        getTurningPoints(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see getTurningPoints */
    fun getTurningPoints(
        matchId: String,
        params: MatchGetTurningPointsParams = MatchGetTurningPointsParams.none(),
    ): List<MatchGetTurningPointsResponse> =
        getTurningPoints(matchId, params, RequestOptions.none())

    /** @see getTurningPoints */
    fun getTurningPoints(
        params: MatchGetTurningPointsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<MatchGetTurningPointsResponse>

    /** @see getTurningPoints */
    fun getTurningPoints(params: MatchGetTurningPointsParams): List<MatchGetTurningPointsResponse> =
        getTurningPoints(params, RequestOptions.none())

    /** @see getTurningPoints */
    fun getTurningPoints(
        matchId: String,
        requestOptions: RequestOptions,
    ): List<MatchGetTurningPointsResponse> =
        getTurningPoints(matchId, MatchGetTurningPointsParams.none(), requestOptions)

    /**
     * WebSocket endpoint for real-time live match simulation.
     *
     * Connect to receive a stream of match events as they happen in a simulated football match.
     *
     * ## Connection
     *
     * Connect via WebSocket with optional query parameters to customize the simulation.
     *
     * ## Example WebSocket URL
     *
     * ```
     * ws://localhost:8000/matches/live?home_team=AFC%20Richmond&away_team=Manchester%20City&speed=2.0&excitement_level=7
     * ```
     *
     * ## Server Messages
     *
     * The server sends JSON messages with these types:
     * - `match_start` - When the match begins
     * - `match_event` - For each match event (goals, fouls, cards, etc.)
     * - `match_end` - When the match concludes
     * - `error` - If an error occurs
     * - `pong` - Response to client ping
     *
     * ## Client Messages
     *
     * Send JSON to control the simulation:
     * - `{"action": "ping"}` - Keep-alive, server responds with `{"type": "pong"}`
     * - `{"action": "pause"}` - Pause the simulation
     * - `{"action": "resume"}` - Resume a paused simulation
     * - `{"action": "set_speed", "speed": 2.0}` - Change playback speed (0.1-10.0)
     * - `{"action": "get_status"}` - Request current match status
     */
    fun streamLive() = streamLive(MatchStreamLiveParams.none())

    /** @see streamLive */
    fun streamLive(
        params: MatchStreamLiveParams = MatchStreamLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see streamLive */
    fun streamLive(params: MatchStreamLiveParams = MatchStreamLiveParams.none()) =
        streamLive(params, RequestOptions.none())

    /** @see streamLive */
    fun streamLive(requestOptions: RequestOptions) =
        streamLive(MatchStreamLiveParams.none(), requestOptions)

    /** A view of [MatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatchService.WithRawResponse

        fun commentary(): CommentaryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matches`, but is otherwise the same as
         * [MatchService.create].
         */
        @MustBeClosed
        fun create(params: MatchCreateParams): HttpResponseFor<Match> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Match>

        /**
         * Returns a raw HTTP response for `get /matches/{match_id}`, but is otherwise the same as
         * [MatchService.retrieve].
         */
        @MustBeClosed
        fun retrieve(matchId: String): HttpResponseFor<Match> =
            retrieve(matchId, MatchRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            matchId: String,
            params: MatchRetrieveParams = MatchRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Match> =
            retrieve(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            matchId: String,
            params: MatchRetrieveParams = MatchRetrieveParams.none(),
        ): HttpResponseFor<Match> = retrieve(matchId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Match>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MatchRetrieveParams): HttpResponseFor<Match> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(matchId: String, requestOptions: RequestOptions): HttpResponseFor<Match> =
            retrieve(matchId, MatchRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /matches/{match_id}`, but is otherwise the same as
         * [MatchService.update].
         */
        @MustBeClosed
        fun update(matchId: String): HttpResponseFor<Match> =
            update(matchId, MatchUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            matchId: String,
            params: MatchUpdateParams = MatchUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Match> =
            update(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            matchId: String,
            params: MatchUpdateParams = MatchUpdateParams.none(),
        ): HttpResponseFor<Match> = update(matchId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Match>

        /** @see update */
        @MustBeClosed
        fun update(params: MatchUpdateParams): HttpResponseFor<Match> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(matchId: String, requestOptions: RequestOptions): HttpResponseFor<Match> =
            update(matchId, MatchUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matches`, but is otherwise the same as
         * [MatchService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<MatchListPage> = list(MatchListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MatchListParams = MatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MatchListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: MatchListParams = MatchListParams.none()): HttpResponseFor<MatchListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MatchListPage> =
            list(MatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /matches/{match_id}`, but is otherwise the same
         * as [MatchService.delete].
         */
        @MustBeClosed
        fun delete(matchId: String): HttpResponse = delete(matchId, MatchDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            matchId: String,
            params: MatchDeleteParams = MatchDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            matchId: String,
            params: MatchDeleteParams = MatchDeleteParams.none(),
        ): HttpResponse = delete(matchId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MatchDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(matchId: String, requestOptions: RequestOptions): HttpResponse =
            delete(matchId, MatchDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matches/{match_id}/lesson`, but is otherwise the
         * same as [MatchService.getLesson].
         */
        @MustBeClosed
        fun getLesson(matchId: String): HttpResponseFor<MatchGetLessonResponse> =
            getLesson(matchId, MatchGetLessonParams.none())

        /** @see getLesson */
        @MustBeClosed
        fun getLesson(
            matchId: String,
            params: MatchGetLessonParams = MatchGetLessonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MatchGetLessonResponse> =
            getLesson(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see getLesson */
        @MustBeClosed
        fun getLesson(
            matchId: String,
            params: MatchGetLessonParams = MatchGetLessonParams.none(),
        ): HttpResponseFor<MatchGetLessonResponse> =
            getLesson(matchId, params, RequestOptions.none())

        /** @see getLesson */
        @MustBeClosed
        fun getLesson(
            params: MatchGetLessonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MatchGetLessonResponse>

        /** @see getLesson */
        @MustBeClosed
        fun getLesson(params: MatchGetLessonParams): HttpResponseFor<MatchGetLessonResponse> =
            getLesson(params, RequestOptions.none())

        /** @see getLesson */
        @MustBeClosed
        fun getLesson(
            matchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MatchGetLessonResponse> =
            getLesson(matchId, MatchGetLessonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matches/{match_id}/turning-points`, but is
         * otherwise the same as [MatchService.getTurningPoints].
         */
        @MustBeClosed
        fun getTurningPoints(
            matchId: String
        ): HttpResponseFor<List<MatchGetTurningPointsResponse>> =
            getTurningPoints(matchId, MatchGetTurningPointsParams.none())

        /** @see getTurningPoints */
        @MustBeClosed
        fun getTurningPoints(
            matchId: String,
            params: MatchGetTurningPointsParams = MatchGetTurningPointsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<MatchGetTurningPointsResponse>> =
            getTurningPoints(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see getTurningPoints */
        @MustBeClosed
        fun getTurningPoints(
            matchId: String,
            params: MatchGetTurningPointsParams = MatchGetTurningPointsParams.none(),
        ): HttpResponseFor<List<MatchGetTurningPointsResponse>> =
            getTurningPoints(matchId, params, RequestOptions.none())

        /** @see getTurningPoints */
        @MustBeClosed
        fun getTurningPoints(
            params: MatchGetTurningPointsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<MatchGetTurningPointsResponse>>

        /** @see getTurningPoints */
        @MustBeClosed
        fun getTurningPoints(
            params: MatchGetTurningPointsParams
        ): HttpResponseFor<List<MatchGetTurningPointsResponse>> =
            getTurningPoints(params, RequestOptions.none())

        /** @see getTurningPoints */
        @MustBeClosed
        fun getTurningPoints(
            matchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<MatchGetTurningPointsResponse>> =
            getTurningPoints(matchId, MatchGetTurningPointsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matches/live`, but is otherwise the same as
         * [MatchService.streamLive].
         */
        @MustBeClosed fun streamLive(): HttpResponse = streamLive(MatchStreamLiveParams.none())

        /** @see streamLive */
        @MustBeClosed
        fun streamLive(
            params: MatchStreamLiveParams = MatchStreamLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see streamLive */
        @MustBeClosed
        fun streamLive(params: MatchStreamLiveParams = MatchStreamLiveParams.none()): HttpResponse =
            streamLive(params, RequestOptions.none())

        /** @see streamLive */
        @MustBeClosed
        fun streamLive(requestOptions: RequestOptions): HttpResponse =
            streamLive(MatchStreamLiveParams.none(), requestOptions)
    }
}
