// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.stream.StreamTestConnectionParams
import dev.cjav.believe.models.stream.StreamTestConnectionResponse
import java.util.function.Consumer

/** Server-Sent Events (SSE) streaming endpoints */
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
