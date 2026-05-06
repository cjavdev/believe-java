// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.conflicts.ConflictResolveParams
import dev.cjav.believe.models.conflicts.ConflictResolveResponse
import java.util.function.Consumer

/** Interactive endpoints for motivation and guidance */
interface ConflictService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConflictService

    /** Get Ted Lasso-style advice for resolving conflicts. */
    fun resolve(params: ConflictResolveParams): ConflictResolveResponse =
        resolve(params, RequestOptions.none())

    /** @see resolve */
    fun resolve(
        params: ConflictResolveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConflictResolveResponse

    /** A view of [ConflictService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConflictService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conflicts/resolve`, but is otherwise the same as
         * [ConflictService.resolve].
         */
        @MustBeClosed
        fun resolve(params: ConflictResolveParams): HttpResponseFor<ConflictResolveResponse> =
            resolve(params, RequestOptions.none())

        /** @see resolve */
        @MustBeClosed
        fun resolve(
            params: ConflictResolveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConflictResolveResponse>
    }
}
