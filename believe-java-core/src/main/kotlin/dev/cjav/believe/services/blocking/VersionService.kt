// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.version.VersionRetrieveParams
import dev.cjav.believe.models.version.VersionRetrieveResponse
import java.util.function.Consumer

interface VersionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService

    /** Get detailed information about API versioning. */
    fun retrieve(): VersionRetrieveResponse = retrieve(VersionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams = VersionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams = VersionRetrieveParams.none()
    ): VersionRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): VersionRetrieveResponse =
        retrieve(VersionRetrieveParams.none(), requestOptions)

    /** A view of [VersionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /version`, but is otherwise the same as
         * [VersionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<VersionRetrieveResponse> =
            retrieve(VersionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VersionRetrieveParams = VersionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VersionRetrieveParams = VersionRetrieveParams.none()
        ): HttpResponseFor<VersionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<VersionRetrieveResponse> =
            retrieve(VersionRetrieveParams.none(), requestOptions)
    }
}
