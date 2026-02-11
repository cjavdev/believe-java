// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async.coaching

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.coaching.principles.CoachingPrinciple
import com.believe.api.models.coaching.principles.PrincipleGetRandomParams
import com.believe.api.models.coaching.principles.PrincipleListPageAsync
import com.believe.api.models.coaching.principles.PrincipleListParams
import com.believe.api.models.coaching.principles.PrincipleRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PrincipleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrincipleServiceAsync

    /** Get details about a specific coaching principle. */
    fun retrieve(principleId: String): CompletableFuture<CoachingPrinciple> =
        retrieve(principleId, PrincipleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        principleId: String,
        params: PrincipleRetrieveParams = PrincipleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CoachingPrinciple> =
        retrieve(params.toBuilder().principleId(principleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        principleId: String,
        params: PrincipleRetrieveParams = PrincipleRetrieveParams.none(),
    ): CompletableFuture<CoachingPrinciple> = retrieve(principleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PrincipleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CoachingPrinciple>

    /** @see retrieve */
    fun retrieve(params: PrincipleRetrieveParams): CompletableFuture<CoachingPrinciple> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        principleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CoachingPrinciple> =
        retrieve(principleId, PrincipleRetrieveParams.none(), requestOptions)

    /** Get a paginated list of Ted Lasso's core coaching principles and philosophy. */
    fun list(): CompletableFuture<PrincipleListPageAsync> = list(PrincipleListParams.none())

    /** @see list */
    fun list(
        params: PrincipleListParams = PrincipleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrincipleListPageAsync>

    /** @see list */
    fun list(
        params: PrincipleListParams = PrincipleListParams.none()
    ): CompletableFuture<PrincipleListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PrincipleListPageAsync> =
        list(PrincipleListParams.none(), requestOptions)

    /** Get a random coaching principle to inspire your day. */
    fun getRandom(): CompletableFuture<CoachingPrinciple> =
        getRandom(PrincipleGetRandomParams.none())

    /** @see getRandom */
    fun getRandom(
        params: PrincipleGetRandomParams = PrincipleGetRandomParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CoachingPrinciple>

    /** @see getRandom */
    fun getRandom(
        params: PrincipleGetRandomParams = PrincipleGetRandomParams.none()
    ): CompletableFuture<CoachingPrinciple> = getRandom(params, RequestOptions.none())

    /** @see getRandom */
    fun getRandom(requestOptions: RequestOptions): CompletableFuture<CoachingPrinciple> =
        getRandom(PrincipleGetRandomParams.none(), requestOptions)

    /**
     * A view of [PrincipleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrincipleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /coaching/principles/{principle_id}`, but is
         * otherwise the same as [PrincipleServiceAsync.retrieve].
         */
        fun retrieve(principleId: String): CompletableFuture<HttpResponseFor<CoachingPrinciple>> =
            retrieve(principleId, PrincipleRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            principleId: String,
            params: PrincipleRetrieveParams = PrincipleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>> =
            retrieve(params.toBuilder().principleId(principleId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            principleId: String,
            params: PrincipleRetrieveParams = PrincipleRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>> =
            retrieve(principleId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PrincipleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>>

        /** @see retrieve */
        fun retrieve(
            params: PrincipleRetrieveParams
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            principleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>> =
            retrieve(principleId, PrincipleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /coaching/principles`, but is otherwise the same as
         * [PrincipleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PrincipleListPageAsync>> =
            list(PrincipleListParams.none())

        /** @see list */
        fun list(
            params: PrincipleListParams = PrincipleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrincipleListPageAsync>>

        /** @see list */
        fun list(
            params: PrincipleListParams = PrincipleListParams.none()
        ): CompletableFuture<HttpResponseFor<PrincipleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PrincipleListPageAsync>> =
            list(PrincipleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /coaching/principles/random`, but is otherwise the
         * same as [PrincipleServiceAsync.getRandom].
         */
        fun getRandom(): CompletableFuture<HttpResponseFor<CoachingPrinciple>> =
            getRandom(PrincipleGetRandomParams.none())

        /** @see getRandom */
        fun getRandom(
            params: PrincipleGetRandomParams = PrincipleGetRandomParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>>

        /** @see getRandom */
        fun getRandom(
            params: PrincipleGetRandomParams = PrincipleGetRandomParams.none()
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>> =
            getRandom(params, RequestOptions.none())

        /** @see getRandom */
        fun getRandom(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CoachingPrinciple>> =
            getRandom(PrincipleGetRandomParams.none(), requestOptions)
    }
}
