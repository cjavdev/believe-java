// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

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
import com.believe.api.models.matches.MatchListPageAsync
import com.believe.api.models.matches.MatchListParams
import com.believe.api.models.matches.MatchRetrieveParams
import com.believe.api.models.matches.MatchStreamLiveParams
import com.believe.api.models.matches.MatchUpdateParams
import com.believe.api.services.async.matches.CommentaryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatchServiceAsync

    fun commentary(): CommentaryServiceAsync

    /** Schedule a new match. */
    fun create(params: MatchCreateParams): CompletableFuture<Match> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Match>

    /** Retrieve detailed information about a specific match. */
    fun retrieve(matchId: String): CompletableFuture<Match> =
        retrieve(matchId, MatchRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        matchId: String,
        params: MatchRetrieveParams = MatchRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Match> =
        retrieve(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        matchId: String,
        params: MatchRetrieveParams = MatchRetrieveParams.none(),
    ): CompletableFuture<Match> = retrieve(matchId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Match>

    /** @see retrieve */
    fun retrieve(params: MatchRetrieveParams): CompletableFuture<Match> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(matchId: String, requestOptions: RequestOptions): CompletableFuture<Match> =
        retrieve(matchId, MatchRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing match (e.g., update score). */
    fun update(matchId: String): CompletableFuture<Match> =
        update(matchId, MatchUpdateParams.none())

    /** @see update */
    fun update(
        matchId: String,
        params: MatchUpdateParams = MatchUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Match> =
        update(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see update */
    fun update(
        matchId: String,
        params: MatchUpdateParams = MatchUpdateParams.none(),
    ): CompletableFuture<Match> = update(matchId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Match>

    /** @see update */
    fun update(params: MatchUpdateParams): CompletableFuture<Match> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(matchId: String, requestOptions: RequestOptions): CompletableFuture<Match> =
        update(matchId, MatchUpdateParams.none(), requestOptions)

    /** Get a paginated list of all matches with optional filtering. */
    fun list(): CompletableFuture<MatchListPageAsync> = list(MatchListParams.none())

    /** @see list */
    fun list(
        params: MatchListParams = MatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MatchListPageAsync>

    /** @see list */
    fun list(
        params: MatchListParams = MatchListParams.none()
    ): CompletableFuture<MatchListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MatchListPageAsync> =
        list(MatchListParams.none(), requestOptions)

    /** Remove a match from the database. */
    fun delete(matchId: String): CompletableFuture<Void?> =
        delete(matchId, MatchDeleteParams.none())

    /** @see delete */
    fun delete(
        matchId: String,
        params: MatchDeleteParams = MatchDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see delete */
    fun delete(
        matchId: String,
        params: MatchDeleteParams = MatchDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(matchId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MatchDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(matchId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(matchId, MatchDeleteParams.none(), requestOptions)

    /** Get the life lesson learned from a specific match. */
    fun getLesson(matchId: String): CompletableFuture<MatchGetLessonResponse> =
        getLesson(matchId, MatchGetLessonParams.none())

    /** @see getLesson */
    fun getLesson(
        matchId: String,
        params: MatchGetLessonParams = MatchGetLessonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MatchGetLessonResponse> =
        getLesson(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see getLesson */
    fun getLesson(
        matchId: String,
        params: MatchGetLessonParams = MatchGetLessonParams.none(),
    ): CompletableFuture<MatchGetLessonResponse> = getLesson(matchId, params, RequestOptions.none())

    /** @see getLesson */
    fun getLesson(
        params: MatchGetLessonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MatchGetLessonResponse>

    /** @see getLesson */
    fun getLesson(params: MatchGetLessonParams): CompletableFuture<MatchGetLessonResponse> =
        getLesson(params, RequestOptions.none())

    /** @see getLesson */
    fun getLesson(
        matchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MatchGetLessonResponse> =
        getLesson(matchId, MatchGetLessonParams.none(), requestOptions)

    /** Get all turning points from a specific match. */
    fun getTurningPoints(matchId: String): CompletableFuture<List<MatchGetTurningPointsResponse>> =
        getTurningPoints(matchId, MatchGetTurningPointsParams.none())

    /** @see getTurningPoints */
    fun getTurningPoints(
        matchId: String,
        params: MatchGetTurningPointsParams = MatchGetTurningPointsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<MatchGetTurningPointsResponse>> =
        getTurningPoints(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see getTurningPoints */
    fun getTurningPoints(
        matchId: String,
        params: MatchGetTurningPointsParams = MatchGetTurningPointsParams.none(),
    ): CompletableFuture<List<MatchGetTurningPointsResponse>> =
        getTurningPoints(matchId, params, RequestOptions.none())

    /** @see getTurningPoints */
    fun getTurningPoints(
        params: MatchGetTurningPointsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<MatchGetTurningPointsResponse>>

    /** @see getTurningPoints */
    fun getTurningPoints(
        params: MatchGetTurningPointsParams
    ): CompletableFuture<List<MatchGetTurningPointsResponse>> =
        getTurningPoints(params, RequestOptions.none())

    /** @see getTurningPoints */
    fun getTurningPoints(
        matchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<MatchGetTurningPointsResponse>> =
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
    fun streamLive(): CompletableFuture<Void?> = streamLive(MatchStreamLiveParams.none())

    /** @see streamLive */
    fun streamLive(
        params: MatchStreamLiveParams = MatchStreamLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see streamLive */
    fun streamLive(
        params: MatchStreamLiveParams = MatchStreamLiveParams.none()
    ): CompletableFuture<Void?> = streamLive(params, RequestOptions.none())

    /** @see streamLive */
    fun streamLive(requestOptions: RequestOptions): CompletableFuture<Void?> =
        streamLive(MatchStreamLiveParams.none(), requestOptions)

    /** A view of [MatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MatchServiceAsync.WithRawResponse

        fun commentary(): CommentaryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matches`, but is otherwise the same as
         * [MatchServiceAsync.create].
         */
        fun create(params: MatchCreateParams): CompletableFuture<HttpResponseFor<Match>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Match>>

        /**
         * Returns a raw HTTP response for `get /matches/{match_id}`, but is otherwise the same as
         * [MatchServiceAsync.retrieve].
         */
        fun retrieve(matchId: String): CompletableFuture<HttpResponseFor<Match>> =
            retrieve(matchId, MatchRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            matchId: String,
            params: MatchRetrieveParams = MatchRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Match>> =
            retrieve(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            matchId: String,
            params: MatchRetrieveParams = MatchRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Match>> =
            retrieve(matchId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Match>>

        /** @see retrieve */
        fun retrieve(params: MatchRetrieveParams): CompletableFuture<HttpResponseFor<Match>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            matchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Match>> =
            retrieve(matchId, MatchRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /matches/{match_id}`, but is otherwise the same as
         * [MatchServiceAsync.update].
         */
        fun update(matchId: String): CompletableFuture<HttpResponseFor<Match>> =
            update(matchId, MatchUpdateParams.none())

        /** @see update */
        fun update(
            matchId: String,
            params: MatchUpdateParams = MatchUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Match>> =
            update(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see update */
        fun update(
            matchId: String,
            params: MatchUpdateParams = MatchUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Match>> =
            update(matchId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Match>>

        /** @see update */
        fun update(params: MatchUpdateParams): CompletableFuture<HttpResponseFor<Match>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            matchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Match>> =
            update(matchId, MatchUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matches`, but is otherwise the same as
         * [MatchServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MatchListPageAsync>> =
            list(MatchListParams.none())

        /** @see list */
        fun list(
            params: MatchListParams = MatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MatchListPageAsync>>

        /** @see list */
        fun list(
            params: MatchListParams = MatchListParams.none()
        ): CompletableFuture<HttpResponseFor<MatchListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MatchListPageAsync>> =
            list(MatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /matches/{match_id}`, but is otherwise the same
         * as [MatchServiceAsync.delete].
         */
        fun delete(matchId: String): CompletableFuture<HttpResponse> =
            delete(matchId, MatchDeleteParams.none())

        /** @see delete */
        fun delete(
            matchId: String,
            params: MatchDeleteParams = MatchDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see delete */
        fun delete(
            matchId: String,
            params: MatchDeleteParams = MatchDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(matchId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MatchDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            matchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(matchId, MatchDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matches/{match_id}/lesson`, but is otherwise the
         * same as [MatchServiceAsync.getLesson].
         */
        fun getLesson(matchId: String): CompletableFuture<HttpResponseFor<MatchGetLessonResponse>> =
            getLesson(matchId, MatchGetLessonParams.none())

        /** @see getLesson */
        fun getLesson(
            matchId: String,
            params: MatchGetLessonParams = MatchGetLessonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MatchGetLessonResponse>> =
            getLesson(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see getLesson */
        fun getLesson(
            matchId: String,
            params: MatchGetLessonParams = MatchGetLessonParams.none(),
        ): CompletableFuture<HttpResponseFor<MatchGetLessonResponse>> =
            getLesson(matchId, params, RequestOptions.none())

        /** @see getLesson */
        fun getLesson(
            params: MatchGetLessonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MatchGetLessonResponse>>

        /** @see getLesson */
        fun getLesson(
            params: MatchGetLessonParams
        ): CompletableFuture<HttpResponseFor<MatchGetLessonResponse>> =
            getLesson(params, RequestOptions.none())

        /** @see getLesson */
        fun getLesson(
            matchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MatchGetLessonResponse>> =
            getLesson(matchId, MatchGetLessonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matches/{match_id}/turning-points`, but is
         * otherwise the same as [MatchServiceAsync.getTurningPoints].
         */
        fun getTurningPoints(
            matchId: String
        ): CompletableFuture<HttpResponseFor<List<MatchGetTurningPointsResponse>>> =
            getTurningPoints(matchId, MatchGetTurningPointsParams.none())

        /** @see getTurningPoints */
        fun getTurningPoints(
            matchId: String,
            params: MatchGetTurningPointsParams = MatchGetTurningPointsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<MatchGetTurningPointsResponse>>> =
            getTurningPoints(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see getTurningPoints */
        fun getTurningPoints(
            matchId: String,
            params: MatchGetTurningPointsParams = MatchGetTurningPointsParams.none(),
        ): CompletableFuture<HttpResponseFor<List<MatchGetTurningPointsResponse>>> =
            getTurningPoints(matchId, params, RequestOptions.none())

        /** @see getTurningPoints */
        fun getTurningPoints(
            params: MatchGetTurningPointsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<MatchGetTurningPointsResponse>>>

        /** @see getTurningPoints */
        fun getTurningPoints(
            params: MatchGetTurningPointsParams
        ): CompletableFuture<HttpResponseFor<List<MatchGetTurningPointsResponse>>> =
            getTurningPoints(params, RequestOptions.none())

        /** @see getTurningPoints */
        fun getTurningPoints(
            matchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<MatchGetTurningPointsResponse>>> =
            getTurningPoints(matchId, MatchGetTurningPointsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matches/live`, but is otherwise the same as
         * [MatchServiceAsync.streamLive].
         */
        fun streamLive(): CompletableFuture<HttpResponse> = streamLive(MatchStreamLiveParams.none())

        /** @see streamLive */
        fun streamLive(
            params: MatchStreamLiveParams = MatchStreamLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see streamLive */
        fun streamLive(
            params: MatchStreamLiveParams = MatchStreamLiveParams.none()
        ): CompletableFuture<HttpResponse> = streamLive(params, RequestOptions.none())

        /** @see streamLive */
        fun streamLive(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            streamLive(MatchStreamLiveParams.none(), requestOptions)
    }
}
