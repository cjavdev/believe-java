// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.stream.StreamTestConnectionParams
import dev.cjav.believe.models.stream.StreamTestConnectionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Server-Sent Events (SSE) streaming endpoints */
interface StreamServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamServiceAsync

    /** A simple SSE test endpoint that streams numbers 1-5. */
    fun testConnection(): CompletableFuture<StreamTestConnectionResponse> =
        testConnection(StreamTestConnectionParams.none())

    /** @see testConnection */
    fun testConnection(
        params: StreamTestConnectionParams = StreamTestConnectionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StreamTestConnectionResponse>

    /** @see testConnection */
    fun testConnection(
        params: StreamTestConnectionParams = StreamTestConnectionParams.none()
    ): CompletableFuture<StreamTestConnectionResponse> =
        testConnection(params, RequestOptions.none())

    /** @see testConnection */
    fun testConnection(
        requestOptions: RequestOptions
    ): CompletableFuture<StreamTestConnectionResponse> =
        testConnection(StreamTestConnectionParams.none(), requestOptions)

    /**
     * A view of [StreamServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /stream/test`, but is otherwise the same as
         * [StreamServiceAsync.testConnection].
         */
        fun testConnection(): CompletableFuture<HttpResponseFor<StreamTestConnectionResponse>> =
            testConnection(StreamTestConnectionParams.none())

        /** @see testConnection */
        fun testConnection(
            params: StreamTestConnectionParams = StreamTestConnectionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamTestConnectionResponse>>

        /** @see testConnection */
        fun testConnection(
            params: StreamTestConnectionParams = StreamTestConnectionParams.none()
        ): CompletableFuture<HttpResponseFor<StreamTestConnectionResponse>> =
            testConnection(params, RequestOptions.none())

        /** @see testConnection */
        fun testConnection(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StreamTestConnectionResponse>> =
            testConnection(StreamTestConnectionParams.none(), requestOptions)
    }
}
