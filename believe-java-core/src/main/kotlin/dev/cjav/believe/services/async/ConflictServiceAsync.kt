// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.conflicts.ConflictResolveParams
import dev.cjav.believe.models.conflicts.ConflictResolveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Interactive endpoints for motivation and guidance */
interface ConflictServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConflictServiceAsync

    /** Get Ted Lasso-style advice for resolving conflicts. */
    fun resolve(params: ConflictResolveParams): CompletableFuture<ConflictResolveResponse> =
        resolve(params, RequestOptions.none())

    /** @see resolve */
    fun resolve(
        params: ConflictResolveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConflictResolveResponse>

    /**
     * A view of [ConflictServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConflictServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conflicts/resolve`, but is otherwise the same as
         * [ConflictServiceAsync.resolve].
         */
        fun resolve(
            params: ConflictResolveParams
        ): CompletableFuture<HttpResponseFor<ConflictResolveResponse>> =
            resolve(params, RequestOptions.none())

        /** @see resolve */
        fun resolve(
            params: ConflictResolveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConflictResolveResponse>>
    }
}
