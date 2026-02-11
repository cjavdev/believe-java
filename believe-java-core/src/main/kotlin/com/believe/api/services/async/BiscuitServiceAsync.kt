// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.biscuits.Biscuit
import com.believe.api.models.biscuits.BiscuitGetFreshParams
import com.believe.api.models.biscuits.BiscuitListPageAsync
import com.believe.api.models.biscuits.BiscuitListParams
import com.believe.api.models.biscuits.BiscuitRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BiscuitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BiscuitServiceAsync

    /** Get a specific type of biscuit by ID. */
    fun retrieve(biscuitId: String): CompletableFuture<Biscuit> =
        retrieve(biscuitId, BiscuitRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        biscuitId: String,
        params: BiscuitRetrieveParams = BiscuitRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Biscuit> =
        retrieve(params.toBuilder().biscuitId(biscuitId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        biscuitId: String,
        params: BiscuitRetrieveParams = BiscuitRetrieveParams.none(),
    ): CompletableFuture<Biscuit> = retrieve(biscuitId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BiscuitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Biscuit>

    /** @see retrieve */
    fun retrieve(params: BiscuitRetrieveParams): CompletableFuture<Biscuit> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(biscuitId: String, requestOptions: RequestOptions): CompletableFuture<Biscuit> =
        retrieve(biscuitId, BiscuitRetrieveParams.none(), requestOptions)

    /**
     * Get a paginated list of Ted's famous homemade biscuits! Each comes with a heartwarming
     * message.
     */
    fun list(): CompletableFuture<BiscuitListPageAsync> = list(BiscuitListParams.none())

    /** @see list */
    fun list(
        params: BiscuitListParams = BiscuitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BiscuitListPageAsync>

    /** @see list */
    fun list(
        params: BiscuitListParams = BiscuitListParams.none()
    ): CompletableFuture<BiscuitListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BiscuitListPageAsync> =
        list(BiscuitListParams.none(), requestOptions)

    /** Get a single fresh biscuit with a personalized message from Ted. */
    fun getFresh(): CompletableFuture<Biscuit> = getFresh(BiscuitGetFreshParams.none())

    /** @see getFresh */
    fun getFresh(
        params: BiscuitGetFreshParams = BiscuitGetFreshParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Biscuit>

    /** @see getFresh */
    fun getFresh(
        params: BiscuitGetFreshParams = BiscuitGetFreshParams.none()
    ): CompletableFuture<Biscuit> = getFresh(params, RequestOptions.none())

    /** @see getFresh */
    fun getFresh(requestOptions: RequestOptions): CompletableFuture<Biscuit> =
        getFresh(BiscuitGetFreshParams.none(), requestOptions)

    /**
     * A view of [BiscuitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BiscuitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /biscuits/{biscuit_id}`, but is otherwise the same
         * as [BiscuitServiceAsync.retrieve].
         */
        fun retrieve(biscuitId: String): CompletableFuture<HttpResponseFor<Biscuit>> =
            retrieve(biscuitId, BiscuitRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            biscuitId: String,
            params: BiscuitRetrieveParams = BiscuitRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Biscuit>> =
            retrieve(params.toBuilder().biscuitId(biscuitId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            biscuitId: String,
            params: BiscuitRetrieveParams = BiscuitRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Biscuit>> =
            retrieve(biscuitId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BiscuitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Biscuit>>

        /** @see retrieve */
        fun retrieve(params: BiscuitRetrieveParams): CompletableFuture<HttpResponseFor<Biscuit>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            biscuitId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Biscuit>> =
            retrieve(biscuitId, BiscuitRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /biscuits`, but is otherwise the same as
         * [BiscuitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BiscuitListPageAsync>> =
            list(BiscuitListParams.none())

        /** @see list */
        fun list(
            params: BiscuitListParams = BiscuitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BiscuitListPageAsync>>

        /** @see list */
        fun list(
            params: BiscuitListParams = BiscuitListParams.none()
        ): CompletableFuture<HttpResponseFor<BiscuitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BiscuitListPageAsync>> =
            list(BiscuitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /biscuits/fresh`, but is otherwise the same as
         * [BiscuitServiceAsync.getFresh].
         */
        fun getFresh(): CompletableFuture<HttpResponseFor<Biscuit>> =
            getFresh(BiscuitGetFreshParams.none())

        /** @see getFresh */
        fun getFresh(
            params: BiscuitGetFreshParams = BiscuitGetFreshParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Biscuit>>

        /** @see getFresh */
        fun getFresh(
            params: BiscuitGetFreshParams = BiscuitGetFreshParams.none()
        ): CompletableFuture<HttpResponseFor<Biscuit>> = getFresh(params, RequestOptions.none())

        /** @see getFresh */
        fun getFresh(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Biscuit>> =
            getFresh(BiscuitGetFreshParams.none(), requestOptions)
    }
}
