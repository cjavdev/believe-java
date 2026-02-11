// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.biscuits.Biscuit
import com.believe.api.models.biscuits.BiscuitGetFreshParams
import com.believe.api.models.biscuits.BiscuitListPage
import com.believe.api.models.biscuits.BiscuitListParams
import com.believe.api.models.biscuits.BiscuitRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BiscuitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BiscuitService

    /** Get a specific type of biscuit by ID. */
    fun retrieve(biscuitId: String): Biscuit = retrieve(biscuitId, BiscuitRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        biscuitId: String,
        params: BiscuitRetrieveParams = BiscuitRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Biscuit = retrieve(params.toBuilder().biscuitId(biscuitId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        biscuitId: String,
        params: BiscuitRetrieveParams = BiscuitRetrieveParams.none(),
    ): Biscuit = retrieve(biscuitId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BiscuitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Biscuit

    /** @see retrieve */
    fun retrieve(params: BiscuitRetrieveParams): Biscuit = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(biscuitId: String, requestOptions: RequestOptions): Biscuit =
        retrieve(biscuitId, BiscuitRetrieveParams.none(), requestOptions)

    /**
     * Get a paginated list of Ted's famous homemade biscuits! Each comes with a heartwarming
     * message.
     */
    fun list(): BiscuitListPage = list(BiscuitListParams.none())

    /** @see list */
    fun list(
        params: BiscuitListParams = BiscuitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BiscuitListPage

    /** @see list */
    fun list(params: BiscuitListParams = BiscuitListParams.none()): BiscuitListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BiscuitListPage =
        list(BiscuitListParams.none(), requestOptions)

    /** Get a single fresh biscuit with a personalized message from Ted. */
    fun getFresh(): Biscuit = getFresh(BiscuitGetFreshParams.none())

    /** @see getFresh */
    fun getFresh(
        params: BiscuitGetFreshParams = BiscuitGetFreshParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Biscuit

    /** @see getFresh */
    fun getFresh(params: BiscuitGetFreshParams = BiscuitGetFreshParams.none()): Biscuit =
        getFresh(params, RequestOptions.none())

    /** @see getFresh */
    fun getFresh(requestOptions: RequestOptions): Biscuit =
        getFresh(BiscuitGetFreshParams.none(), requestOptions)

    /** A view of [BiscuitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BiscuitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /biscuits/{biscuit_id}`, but is otherwise the same
         * as [BiscuitService.retrieve].
         */
        @MustBeClosed
        fun retrieve(biscuitId: String): HttpResponseFor<Biscuit> =
            retrieve(biscuitId, BiscuitRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            biscuitId: String,
            params: BiscuitRetrieveParams = BiscuitRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Biscuit> =
            retrieve(params.toBuilder().biscuitId(biscuitId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            biscuitId: String,
            params: BiscuitRetrieveParams = BiscuitRetrieveParams.none(),
        ): HttpResponseFor<Biscuit> = retrieve(biscuitId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BiscuitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Biscuit>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BiscuitRetrieveParams): HttpResponseFor<Biscuit> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(biscuitId: String, requestOptions: RequestOptions): HttpResponseFor<Biscuit> =
            retrieve(biscuitId, BiscuitRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /biscuits`, but is otherwise the same as
         * [BiscuitService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BiscuitListPage> = list(BiscuitListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BiscuitListParams = BiscuitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BiscuitListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BiscuitListParams = BiscuitListParams.none()
        ): HttpResponseFor<BiscuitListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BiscuitListPage> =
            list(BiscuitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /biscuits/fresh`, but is otherwise the same as
         * [BiscuitService.getFresh].
         */
        @MustBeClosed
        fun getFresh(): HttpResponseFor<Biscuit> = getFresh(BiscuitGetFreshParams.none())

        /** @see getFresh */
        @MustBeClosed
        fun getFresh(
            params: BiscuitGetFreshParams = BiscuitGetFreshParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Biscuit>

        /** @see getFresh */
        @MustBeClosed
        fun getFresh(
            params: BiscuitGetFreshParams = BiscuitGetFreshParams.none()
        ): HttpResponseFor<Biscuit> = getFresh(params, RequestOptions.none())

        /** @see getFresh */
        @MustBeClosed
        fun getFresh(requestOptions: RequestOptions): HttpResponseFor<Biscuit> =
            getFresh(BiscuitGetFreshParams.none(), requestOptions)
    }
}
