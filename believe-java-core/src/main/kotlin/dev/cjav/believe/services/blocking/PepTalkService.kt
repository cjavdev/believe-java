// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.peptalk.PepTalkRetrieveParams
import dev.cjav.believe.models.peptalk.PepTalkRetrieveResponse
import java.util.function.Consumer

/** Server-Sent Events (SSE) streaming endpoints */
interface PepTalkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PepTalkService

    /**
     * Get a motivational pep talk from Ted Lasso himself. By default returns the complete pep talk.
     * Add `?stream=true` to get Server-Sent Events (SSE) streaming the pep talk chunk by chunk.
     */
    fun retrieve(): PepTalkRetrieveResponse = retrieve(PepTalkRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: PepTalkRetrieveParams = PepTalkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PepTalkRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: PepTalkRetrieveParams = PepTalkRetrieveParams.none()
    ): PepTalkRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): PepTalkRetrieveResponse =
        retrieve(PepTalkRetrieveParams.none(), requestOptions)

    /** A view of [PepTalkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PepTalkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /pep-talk`, but is otherwise the same as
         * [PepTalkService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<PepTalkRetrieveResponse> =
            retrieve(PepTalkRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PepTalkRetrieveParams = PepTalkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PepTalkRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PepTalkRetrieveParams = PepTalkRetrieveParams.none()
        ): HttpResponseFor<PepTalkRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<PepTalkRetrieveResponse> =
            retrieve(PepTalkRetrieveParams.none(), requestOptions)
    }
}
