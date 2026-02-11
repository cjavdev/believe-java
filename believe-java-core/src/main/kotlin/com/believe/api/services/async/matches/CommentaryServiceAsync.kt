// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async.matches

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.matches.commentary.CommentaryStreamParams
import com.believe.api.models.matches.commentary.CommentaryStreamResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommentaryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentaryServiceAsync

    /**
     * Stream live match commentary for a specific match. Uses Server-Sent Events (SSE) to stream
     * commentary events in real-time.
     */
    fun stream(matchId: String): CompletableFuture<CommentaryStreamResponse> =
        stream(matchId, CommentaryStreamParams.none())

    /** @see stream */
    fun stream(
        matchId: String,
        params: CommentaryStreamParams = CommentaryStreamParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentaryStreamResponse> =
        stream(params.toBuilder().matchId(matchId).build(), requestOptions)

    /** @see stream */
    fun stream(
        matchId: String,
        params: CommentaryStreamParams = CommentaryStreamParams.none(),
    ): CompletableFuture<CommentaryStreamResponse> = stream(matchId, params, RequestOptions.none())

    /** @see stream */
    fun stream(
        params: CommentaryStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentaryStreamResponse>

    /** @see stream */
    fun stream(params: CommentaryStreamParams): CompletableFuture<CommentaryStreamResponse> =
        stream(params, RequestOptions.none())

    /** @see stream */
    fun stream(
        matchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentaryStreamResponse> =
        stream(matchId, CommentaryStreamParams.none(), requestOptions)

    /**
     * A view of [CommentaryServiceAsync] that provides access to raw HTTP responses for each
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
        ): CommentaryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matches/{match_id}/commentary/stream`, but is
         * otherwise the same as [CommentaryServiceAsync.stream].
         */
        fun stream(matchId: String): CompletableFuture<HttpResponseFor<CommentaryStreamResponse>> =
            stream(matchId, CommentaryStreamParams.none())

        /** @see stream */
        fun stream(
            matchId: String,
            params: CommentaryStreamParams = CommentaryStreamParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentaryStreamResponse>> =
            stream(params.toBuilder().matchId(matchId).build(), requestOptions)

        /** @see stream */
        fun stream(
            matchId: String,
            params: CommentaryStreamParams = CommentaryStreamParams.none(),
        ): CompletableFuture<HttpResponseFor<CommentaryStreamResponse>> =
            stream(matchId, params, RequestOptions.none())

        /** @see stream */
        fun stream(
            params: CommentaryStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentaryStreamResponse>>

        /** @see stream */
        fun stream(
            params: CommentaryStreamParams
        ): CompletableFuture<HttpResponseFor<CommentaryStreamResponse>> =
            stream(params, RequestOptions.none())

        /** @see stream */
        fun stream(
            matchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentaryStreamResponse>> =
            stream(matchId, CommentaryStreamParams.none(), requestOptions)
    }
}
