// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.services.async.coaching.PrincipleServiceAsync
import java.util.function.Consumer

interface CoachingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CoachingServiceAsync

    /** Interactive endpoints for motivation and guidance */
    fun principles(): PrincipleServiceAsync

    /**
     * A view of [CoachingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CoachingServiceAsync.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun principles(): PrincipleServiceAsync.WithRawResponse
    }
}
