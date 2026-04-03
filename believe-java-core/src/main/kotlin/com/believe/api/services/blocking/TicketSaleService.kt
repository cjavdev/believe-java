// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.ticketsales.TicketSale
import com.believe.api.models.ticketsales.TicketSaleCreateParams
import com.believe.api.models.ticketsales.TicketSaleDeleteParams
import com.believe.api.models.ticketsales.TicketSaleListPage
import com.believe.api.models.ticketsales.TicketSaleListParams
import com.believe.api.models.ticketsales.TicketSaleRetrieveParams
import com.believe.api.models.ticketsales.TicketSaleUpdateParams
import com.believe.api.services.blocking.TicketSaleService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Ticket sales with 300 records for practicing pagination, filtering, and financial data */
interface TicketSaleService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TicketSaleService

    /** Record a new ticket sale. */
    fun create(params: TicketSaleCreateParams): TicketSale =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: TicketSaleCreateParams, requestOptions: RequestOptions = RequestOptions.none()): TicketSale

    /** Retrieve detailed information about a specific ticket sale. */
    fun retrieve(ticketSaleId: String): TicketSale =
        retrieve(
          ticketSaleId, TicketSaleRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(ticketSaleId: String, params: TicketSaleRetrieveParams = TicketSaleRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): TicketSale =
        retrieve(
          params.toBuilder()
              .ticketSaleId(ticketSaleId)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(ticketSaleId: String, params: TicketSaleRetrieveParams = TicketSaleRetrieveParams.none()): TicketSale =
        retrieve(
          ticketSaleId,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: TicketSaleRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): TicketSale

    /** @see retrieve */
    fun retrieve(params: TicketSaleRetrieveParams): TicketSale =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(ticketSaleId: String, requestOptions: RequestOptions): TicketSale =
        retrieve(
          ticketSaleId,
          TicketSaleRetrieveParams.none(),
          requestOptions,
        )

    /** Update specific fields of an existing ticket sale. */
    fun update(ticketSaleId: String): TicketSale =
        update(
          ticketSaleId, TicketSaleUpdateParams.none()
        )

    /** @see update */
    fun update(ticketSaleId: String, params: TicketSaleUpdateParams = TicketSaleUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): TicketSale =
        update(
          params.toBuilder()
              .ticketSaleId(ticketSaleId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(ticketSaleId: String, params: TicketSaleUpdateParams = TicketSaleUpdateParams.none()): TicketSale =
        update(
          ticketSaleId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(params: TicketSaleUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): TicketSale

    /** @see update */
    fun update(params: TicketSaleUpdateParams): TicketSale =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(ticketSaleId: String, requestOptions: RequestOptions): TicketSale =
        update(
          ticketSaleId,
          TicketSaleUpdateParams.none(),
          requestOptions,
        )

    /** Get a paginated list of all ticket sales with optional filtering. With 300 records, this endpoint is ideal for practicing pagination. */
    fun list(): TicketSaleListPage = list(TicketSaleListParams.none())

    /** @see list */
    fun list(params: TicketSaleListParams = TicketSaleListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): TicketSaleListPage

    /** @see list */
    fun list(params: TicketSaleListParams = TicketSaleListParams.none()): TicketSaleListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): TicketSaleListPage =
        list(
          TicketSaleListParams.none(), requestOptions
        )

    /** Remove a ticket sale from the database. */
    fun delete(ticketSaleId: String) =
        delete(
          ticketSaleId, TicketSaleDeleteParams.none()
        )

    /** @see delete */
    fun delete(ticketSaleId: String, params: TicketSaleDeleteParams = TicketSaleDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .ticketSaleId(ticketSaleId)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(ticketSaleId: String, params: TicketSaleDeleteParams = TicketSaleDeleteParams.none()) =
        delete(
          ticketSaleId,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: TicketSaleDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TicketSaleDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(ticketSaleId: String, requestOptions: RequestOptions) =
        delete(
          ticketSaleId,
          TicketSaleDeleteParams.none(),
          requestOptions,
        )

    /** A view of [TicketSaleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TicketSaleService.WithRawResponse

        /** Returns a raw HTTP response for `post /ticket-sales`, but is otherwise the             same as [TicketSaleService.create]. */
        @MustBeClosed
        fun create(params: TicketSaleCreateParams): HttpResponseFor<TicketSale> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: TicketSaleCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TicketSale>

        /** Returns a raw HTTP response for `get /ticket-sales/{ticket_sale_id}`, but is otherwise the             same as [TicketSaleService.retrieve]. */
        @MustBeClosed
        fun retrieve(ticketSaleId: String): HttpResponseFor<TicketSale> =
            retrieve(
              ticketSaleId, TicketSaleRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(ticketSaleId: String, params: TicketSaleRetrieveParams = TicketSaleRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TicketSale> =
            retrieve(
              params.toBuilder()
                  .ticketSaleId(ticketSaleId)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(ticketSaleId: String, params: TicketSaleRetrieveParams = TicketSaleRetrieveParams.none()): HttpResponseFor<TicketSale> =
            retrieve(
              ticketSaleId,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TicketSaleRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TicketSale>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TicketSaleRetrieveParams): HttpResponseFor<TicketSale> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(ticketSaleId: String, requestOptions: RequestOptions): HttpResponseFor<TicketSale> =
            retrieve(
              ticketSaleId,
              TicketSaleRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `patch /ticket-sales/{ticket_sale_id}`, but is otherwise the             same as [TicketSaleService.update]. */
        @MustBeClosed
        fun update(ticketSaleId: String): HttpResponseFor<TicketSale> =
            update(
              ticketSaleId, TicketSaleUpdateParams.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(ticketSaleId: String, params: TicketSaleUpdateParams = TicketSaleUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TicketSale> =
            update(
              params.toBuilder()
                  .ticketSaleId(ticketSaleId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(ticketSaleId: String, params: TicketSaleUpdateParams = TicketSaleUpdateParams.none()): HttpResponseFor<TicketSale> =
            update(
              ticketSaleId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(params: TicketSaleUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TicketSale>

        /** @see update */
        @MustBeClosed
        fun update(params: TicketSaleUpdateParams): HttpResponseFor<TicketSale> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(ticketSaleId: String, requestOptions: RequestOptions): HttpResponseFor<TicketSale> =
            update(
              ticketSaleId,
              TicketSaleUpdateParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /ticket-sales`, but is otherwise the             same as [TicketSaleService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<TicketSaleListPage> = list(TicketSaleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: TicketSaleListParams = TicketSaleListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TicketSaleListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: TicketSaleListParams = TicketSaleListParams.none()): HttpResponseFor<TicketSaleListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TicketSaleListPage> =
            list(
              TicketSaleListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /ticket-sales/{ticket_sale_id}`, but is otherwise the             same as [TicketSaleService.delete]. */
        @MustBeClosed
        fun delete(ticketSaleId: String): HttpResponse =
            delete(
              ticketSaleId, TicketSaleDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(ticketSaleId: String, params: TicketSaleDeleteParams = TicketSaleDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .ticketSaleId(ticketSaleId)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(ticketSaleId: String, params: TicketSaleDeleteParams = TicketSaleDeleteParams.none()): HttpResponse =
            delete(
              ticketSaleId,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: TicketSaleDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TicketSaleDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(ticketSaleId: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              ticketSaleId,
              TicketSaleDeleteParams.none(),
              requestOptions,
            )
    }
}
