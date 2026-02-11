// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.press.PressSimulateParams
import com.believe.api.models.press.PressSimulateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PressServiceAsync

    /** Get Ted's response to press conference questions. */
    fun simulate(params: PressSimulateParams): CompletableFuture<PressSimulateResponse> =
        simulate(params, RequestOptions.none())

    /** @see simulate */
    fun simulate(
        params: PressSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PressSimulateResponse>

    /** A view of [PressServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PressServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /press`, but is otherwise the same as
         * [PressServiceAsync.simulate].
         */
        fun simulate(
            params: PressSimulateParams
        ): CompletableFuture<HttpResponseFor<PressSimulateResponse>> =
            simulate(params, RequestOptions.none())

        /** @see simulate */
        fun simulate(
            params: PressSimulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PressSimulateResponse>>
    }
}
