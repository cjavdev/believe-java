// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.press.PressSimulateParams
import dev.cjav.believe.models.press.PressSimulateResponse
import java.util.function.Consumer

/** Interactive endpoints for motivation and guidance */
interface PressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PressService

    /** Get Ted's response to press conference questions. */
    fun simulate(params: PressSimulateParams): PressSimulateResponse =
        simulate(params, RequestOptions.none())

    /** @see simulate */
    fun simulate(
        params: PressSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PressSimulateResponse

    /** A view of [PressService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PressService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /press`, but is otherwise the same as
         * [PressService.simulate].
         */
        @MustBeClosed
        fun simulate(params: PressSimulateParams): HttpResponseFor<PressSimulateResponse> =
            simulate(params, RequestOptions.none())

        /** @see simulate */
        @MustBeClosed
        fun simulate(
            params: PressSimulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PressSimulateResponse>
    }
}
