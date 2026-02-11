// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.peptalk.PepTalkRetrieveParams
import com.believe.api.models.peptalk.PepTalkRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PepTalkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PepTalkServiceAsync

    /**
     * Get a motivational pep talk from Ted Lasso himself. By default returns the complete pep talk.
     * Add `?stream=true` to get Server-Sent Events (SSE) streaming the pep talk chunk by chunk.
     */
    fun retrieve(): CompletableFuture<PepTalkRetrieveResponse> =
        retrieve(PepTalkRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: PepTalkRetrieveParams = PepTalkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PepTalkRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PepTalkRetrieveParams = PepTalkRetrieveParams.none()
    ): CompletableFuture<PepTalkRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<PepTalkRetrieveResponse> =
        retrieve(PepTalkRetrieveParams.none(), requestOptions)

    /**
     * A view of [PepTalkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PepTalkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /pep-talk`, but is otherwise the same as
         * [PepTalkServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<PepTalkRetrieveResponse>> =
            retrieve(PepTalkRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: PepTalkRetrieveParams = PepTalkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PepTalkRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PepTalkRetrieveParams = PepTalkRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<PepTalkRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PepTalkRetrieveResponse>> =
            retrieve(PepTalkRetrieveParams.none(), requestOptions)
    }
}
