// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.reframe.ReframeTransformNegativeThoughtsParams
import com.believe.api.models.reframe.ReframeTransformNegativeThoughtsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ReframeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReframeService

    /** Transform negative thoughts into positive perspectives with Ted's help. */
    fun transformNegativeThoughts(
        params: ReframeTransformNegativeThoughtsParams
    ): ReframeTransformNegativeThoughtsResponse =
        transformNegativeThoughts(params, RequestOptions.none())

    /** @see transformNegativeThoughts */
    fun transformNegativeThoughts(
        params: ReframeTransformNegativeThoughtsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReframeTransformNegativeThoughtsResponse

    /** A view of [ReframeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReframeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /reframe`, but is otherwise the same as
         * [ReframeService.transformNegativeThoughts].
         */
        @MustBeClosed
        fun transformNegativeThoughts(
            params: ReframeTransformNegativeThoughtsParams
        ): HttpResponseFor<ReframeTransformNegativeThoughtsResponse> =
            transformNegativeThoughts(params, RequestOptions.none())

        /** @see transformNegativeThoughts */
        @MustBeClosed
        fun transformNegativeThoughts(
            params: ReframeTransformNegativeThoughtsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReframeTransformNegativeThoughtsResponse>
    }
}
