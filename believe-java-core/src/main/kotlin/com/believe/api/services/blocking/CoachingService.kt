// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.services.blocking.CoachingService
import com.believe.api.services.blocking.coaching.PrincipleService
import java.util.function.Consumer

interface CoachingService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CoachingService

    /** Interactive endpoints for motivation and guidance */
    fun principles(): PrincipleService

    /** A view of [CoachingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CoachingService.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun principles(): PrincipleService.WithRawResponse
    }
}
