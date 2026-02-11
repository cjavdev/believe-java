// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.client

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.models.client.ws.WTestParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface WService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WService

    /**
     * Simple WebSocket test endpoint for connectivity testing.
     *
     * Connect to test WebSocket functionality. The server will:
     * 1. Send a welcome message on connection
     * 2. Echo back any message you send
     *
     * ## Example
     *
     * ```javascript
     * const ws = new WebSocket('ws://localhost:8000/ws/test');
     * ws.onmessage = (event) => console.log(event.data);
     * ws.send('Hello!');  // Server responds with echo
     * ```
     */
    fun test() = test(WTestParams.none())

    /** @see test */
    fun test(
        params: WTestParams = WTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see test */
    fun test(params: WTestParams = WTestParams.none()) = test(params, RequestOptions.none())

    /** @see test */
    fun test(requestOptions: RequestOptions) = test(WTestParams.none(), requestOptions)

    /** A view of [WService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ws/test`, but is otherwise the same as
         * [WService.test].
         */
        @MustBeClosed fun test(): HttpResponse = test(WTestParams.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: WTestParams = WTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see test */
        @MustBeClosed
        fun test(params: WTestParams = WTestParams.none()): HttpResponse =
            test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(requestOptions: RequestOptions): HttpResponse =
            test(WTestParams.none(), requestOptions)
    }
}
