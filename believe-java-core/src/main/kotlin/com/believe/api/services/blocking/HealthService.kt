// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.health.HealthCheckParams
import com.believe.api.models.health.HealthCheckResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface HealthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthService

    /** Check if the API is running and healthy. */
    fun check(): HealthCheckResponse = check(HealthCheckParams.none())

    /** @see check */
    fun check(
        params: HealthCheckParams = HealthCheckParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckResponse

    /** @see check */
    fun check(params: HealthCheckParams = HealthCheckParams.none()): HealthCheckResponse =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(requestOptions: RequestOptions): HealthCheckResponse =
        check(HealthCheckParams.none(), requestOptions)

    /** A view of [HealthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /health`, but is otherwise the same as
         * [HealthService.check].
         */
        @MustBeClosed
        fun check(): HttpResponseFor<HealthCheckResponse> = check(HealthCheckParams.none())

        /** @see check */
        @MustBeClosed
        fun check(
            params: HealthCheckParams = HealthCheckParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckResponse>

        /** @see check */
        @MustBeClosed
        fun check(
            params: HealthCheckParams = HealthCheckParams.none()
        ): HttpResponseFor<HealthCheckResponse> = check(params, RequestOptions.none())

        /** @see check */
        @MustBeClosed
        fun check(requestOptions: RequestOptions): HttpResponseFor<HealthCheckResponse> =
            check(HealthCheckParams.none(), requestOptions)
    }
}
