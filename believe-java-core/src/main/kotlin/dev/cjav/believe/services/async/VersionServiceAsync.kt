// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.version.VersionRetrieveParams
import dev.cjav.believe.models.version.VersionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionServiceAsync

    /** Get detailed information about API versioning. */
    fun retrieve(): CompletableFuture<VersionRetrieveResponse> =
        retrieve(VersionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams = VersionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams = VersionRetrieveParams.none()
    ): CompletableFuture<VersionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<VersionRetrieveResponse> =
        retrieve(VersionRetrieveParams.none(), requestOptions)

    /**
     * A view of [VersionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /version`, but is otherwise the same as
         * [VersionServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> =
            retrieve(VersionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: VersionRetrieveParams = VersionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VersionRetrieveParams = VersionRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> =
            retrieve(VersionRetrieveParams.none(), requestOptions)
    }
}
