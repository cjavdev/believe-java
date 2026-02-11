// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.stream.StreamTestConnectionParams
import com.believe.api.models.stream.StreamTestConnectionResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface StreamService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService

    /** A simple SSE test endpoint that streams numbers 1-5. */
    fun testConnection(): StreamTestConnectionResponse =
        testConnection(StreamTestConnectionParams.none())

    /** @see testConnection */
    fun testConnection(
        params: StreamTestConnectionParams = StreamTestConnectionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamTestConnectionResponse

    /** @see testConnection */
    fun testConnection(
        params: StreamTestConnectionParams = StreamTestConnectionParams.none()
    ): StreamTestConnectionResponse = testConnection(params, RequestOptions.none())

    /** @see testConnection */
    fun testConnection(requestOptions: RequestOptions): StreamTestConnectionResponse =
        testConnection(StreamTestConnectionParams.none(), requestOptions)

    /** A view of [StreamService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /stream/test`, but is otherwise the same as
         * [StreamService.testConnection].
         */
        @MustBeClosed
        fun testConnection(): HttpResponseFor<StreamTestConnectionResponse> =
            testConnection(StreamTestConnectionParams.none())

        /** @see testConnection */
        @MustBeClosed
        fun testConnection(
            params: StreamTestConnectionParams = StreamTestConnectionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamTestConnectionResponse>

        /** @see testConnection */
        @MustBeClosed
        fun testConnection(
            params: StreamTestConnectionParams = StreamTestConnectionParams.none()
        ): HttpResponseFor<StreamTestConnectionResponse> =
            testConnection(params, RequestOptions.none())

        /** @see testConnection */
        @MustBeClosed
        fun testConnection(
            requestOptions: RequestOptions
        ): HttpResponseFor<StreamTestConnectionResponse> =
            testConnection(StreamTestConnectionParams.none(), requestOptions)
    }
}
