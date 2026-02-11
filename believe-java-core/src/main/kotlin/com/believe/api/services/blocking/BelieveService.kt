// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.believe.BelieveSubmitParams
import com.believe.api.models.believe.BelieveSubmitResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BelieveService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BelieveService

    /** Submit your situation and receive Ted Lasso-style motivational guidance. */
    fun submit(params: BelieveSubmitParams): BelieveSubmitResponse =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: BelieveSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BelieveSubmitResponse

    /** A view of [BelieveService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BelieveService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /believe`, but is otherwise the same as
         * [BelieveService.submit].
         */
        @MustBeClosed
        fun submit(params: BelieveSubmitParams): HttpResponseFor<BelieveSubmitResponse> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: BelieveSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BelieveSubmitResponse>
    }
}
