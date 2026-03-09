// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.ticketsales.TicketSale
import com.believe.api.models.ticketsales.TicketSaleCreateParams
import com.believe.api.models.ticketsales.TicketSaleDeleteParams
import com.believe.api.models.ticketsales.TicketSaleListPageAsync
import com.believe.api.models.ticketsales.TicketSaleListParams
import com.believe.api.models.ticketsales.TicketSaleRetrieveParams
import com.believe.api.models.ticketsales.TicketSaleUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Ticket sales with 300 records for practicing pagination, filtering, and financial data */
interface TicketSaleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TicketSaleServiceAsync

    /** Record a new ticket sale. */
    fun create(params: TicketSaleCreateParams): CompletableFuture<TicketSale> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TicketSaleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TicketSale>

    /** Retrieve detailed information about a specific ticket sale. */
    fun retrieve(ticketSaleId: String): CompletableFuture<TicketSale> =
        retrieve(ticketSaleId, TicketSaleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        ticketSaleId: String,
        params: TicketSaleRetrieveParams = TicketSaleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TicketSale> =
        retrieve(params.toBuilder().ticketSaleId(ticketSaleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        ticketSaleId: String,
        params: TicketSaleRetrieveParams = TicketSaleRetrieveParams.none(),
    ): CompletableFuture<TicketSale> = retrieve(ticketSaleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TicketSaleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TicketSale>

    /** @see retrieve */
    fun retrieve(params: TicketSaleRetrieveParams): CompletableFuture<TicketSale> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        ticketSaleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TicketSale> =
        retrieve(ticketSaleId, TicketSaleRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing ticket sale. */
    fun update(ticketSaleId: String): CompletableFuture<TicketSale> =
        update(ticketSaleId, TicketSaleUpdateParams.none())

    /** @see update */
    fun update(
        ticketSaleId: String,
        params: TicketSaleUpdateParams = TicketSaleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TicketSale> =
        update(params.toBuilder().ticketSaleId(ticketSaleId).build(), requestOptions)

    /** @see update */
    fun update(
        ticketSaleId: String,
        params: TicketSaleUpdateParams = TicketSaleUpdateParams.none(),
    ): CompletableFuture<TicketSale> = update(ticketSaleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TicketSaleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TicketSale>

    /** @see update */
    fun update(params: TicketSaleUpdateParams): CompletableFuture<TicketSale> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        ticketSaleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TicketSale> =
        update(ticketSaleId, TicketSaleUpdateParams.none(), requestOptions)

    /**
     * Get a paginated list of all ticket sales with optional filtering. With 300 records, this
     * endpoint is ideal for practicing pagination.
     */
    fun list(): CompletableFuture<TicketSaleListPageAsync> = list(TicketSaleListParams.none())

    /** @see list */
    fun list(
        params: TicketSaleListParams = TicketSaleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TicketSaleListPageAsync>

    /** @see list */
    fun list(
        params: TicketSaleListParams = TicketSaleListParams.none()
    ): CompletableFuture<TicketSaleListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TicketSaleListPageAsync> =
        list(TicketSaleListParams.none(), requestOptions)

    /** Remove a ticket sale from the database. */
    fun delete(ticketSaleId: String): CompletableFuture<Void?> =
        delete(ticketSaleId, TicketSaleDeleteParams.none())

    /** @see delete */
    fun delete(
        ticketSaleId: String,
        params: TicketSaleDeleteParams = TicketSaleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().ticketSaleId(ticketSaleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        ticketSaleId: String,
        params: TicketSaleDeleteParams = TicketSaleDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(ticketSaleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TicketSaleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TicketSaleDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(ticketSaleId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(ticketSaleId, TicketSaleDeleteParams.none(), requestOptions)

    /**
     * A view of [TicketSaleServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TicketSaleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ticket-sales`, but is otherwise the same as
         * [TicketSaleServiceAsync.create].
         */
        fun create(params: TicketSaleCreateParams): CompletableFuture<HttpResponseFor<TicketSale>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TicketSaleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TicketSale>>

        /**
         * Returns a raw HTTP response for `get /ticket-sales/{ticket_sale_id}`, but is otherwise
         * the same as [TicketSaleServiceAsync.retrieve].
         */
        fun retrieve(ticketSaleId: String): CompletableFuture<HttpResponseFor<TicketSale>> =
            retrieve(ticketSaleId, TicketSaleRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            ticketSaleId: String,
            params: TicketSaleRetrieveParams = TicketSaleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TicketSale>> =
            retrieve(params.toBuilder().ticketSaleId(ticketSaleId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            ticketSaleId: String,
            params: TicketSaleRetrieveParams = TicketSaleRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TicketSale>> =
            retrieve(ticketSaleId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TicketSaleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TicketSale>>

        /** @see retrieve */
        fun retrieve(
            params: TicketSaleRetrieveParams
        ): CompletableFuture<HttpResponseFor<TicketSale>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            ticketSaleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TicketSale>> =
            retrieve(ticketSaleId, TicketSaleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ticket-sales/{ticket_sale_id}`, but is otherwise
         * the same as [TicketSaleServiceAsync.update].
         */
        fun update(ticketSaleId: String): CompletableFuture<HttpResponseFor<TicketSale>> =
            update(ticketSaleId, TicketSaleUpdateParams.none())

        /** @see update */
        fun update(
            ticketSaleId: String,
            params: TicketSaleUpdateParams = TicketSaleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TicketSale>> =
            update(params.toBuilder().ticketSaleId(ticketSaleId).build(), requestOptions)

        /** @see update */
        fun update(
            ticketSaleId: String,
            params: TicketSaleUpdateParams = TicketSaleUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TicketSale>> =
            update(ticketSaleId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TicketSaleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TicketSale>>

        /** @see update */
        fun update(params: TicketSaleUpdateParams): CompletableFuture<HttpResponseFor<TicketSale>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            ticketSaleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TicketSale>> =
            update(ticketSaleId, TicketSaleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ticket-sales`, but is otherwise the same as
         * [TicketSaleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TicketSaleListPageAsync>> =
            list(TicketSaleListParams.none())

        /** @see list */
        fun list(
            params: TicketSaleListParams = TicketSaleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TicketSaleListPageAsync>>

        /** @see list */
        fun list(
            params: TicketSaleListParams = TicketSaleListParams.none()
        ): CompletableFuture<HttpResponseFor<TicketSaleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TicketSaleListPageAsync>> =
            list(TicketSaleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ticket-sales/{ticket_sale_id}`, but is otherwise
         * the same as [TicketSaleServiceAsync.delete].
         */
        fun delete(ticketSaleId: String): CompletableFuture<HttpResponse> =
            delete(ticketSaleId, TicketSaleDeleteParams.none())

        /** @see delete */
        fun delete(
            ticketSaleId: String,
            params: TicketSaleDeleteParams = TicketSaleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().ticketSaleId(ticketSaleId).build(), requestOptions)

        /** @see delete */
        fun delete(
            ticketSaleId: String,
            params: TicketSaleDeleteParams = TicketSaleDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(ticketSaleId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TicketSaleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TicketSaleDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            ticketSaleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(ticketSaleId, TicketSaleDeleteParams.none(), requestOptions)
    }
}
