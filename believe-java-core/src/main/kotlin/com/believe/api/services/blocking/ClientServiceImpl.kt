// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.services.blocking.client.TicketSaleService
import com.believe.api.services.blocking.client.TicketSaleServiceImpl
import com.believe.api.services.blocking.client.WService
import com.believe.api.services.blocking.client.WServiceImpl
import java.util.function.Consumer

class ClientServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClientService {

    private val withRawResponse: ClientService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ws: WService by lazy { WServiceImpl(clientOptions) }

    private val ticketSales: TicketSaleService by lazy { TicketSaleServiceImpl(clientOptions) }

    override fun withRawResponse(): ClientService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientService =
        ClientServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** WebSocket endpoints for real-time bidirectional communication - Live match simulation */
    override fun ws(): WService = ws

    /** Ticket sales with 300 records for practicing pagination, filtering, and financial data */
    override fun ticketSales(): TicketSaleService = ticketSales

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClientService.WithRawResponse {

        private val ws: WService.WithRawResponse by lazy {
            WServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ticketSales: TicketSaleService.WithRawResponse by lazy {
            TicketSaleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClientService.WithRawResponse =
            ClientServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** WebSocket endpoints for real-time bidirectional communication - Live match simulation */
        override fun ws(): WService.WithRawResponse = ws

        /**
         * Ticket sales with 300 records for practicing pagination, filtering, and financial data
         */
        override fun ticketSales(): TicketSaleService.WithRawResponse = ticketSales
    }
}
