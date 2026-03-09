// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.services.async.client.TicketSaleServiceAsync
import com.believe.api.services.async.client.TicketSaleServiceAsyncImpl
import com.believe.api.services.async.client.WServiceAsync
import com.believe.api.services.async.client.WServiceAsyncImpl
import java.util.function.Consumer

class ClientServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ClientServiceAsync {

    private val withRawResponse: ClientServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ws: WServiceAsync by lazy { WServiceAsyncImpl(clientOptions) }

    private val ticketSales: TicketSaleServiceAsync by lazy {
        TicketSaleServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ClientServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientServiceAsync =
        ClientServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** WebSocket endpoints for real-time bidirectional communication - Live match simulation */
    override fun ws(): WServiceAsync = ws

    /** Ticket sales with 300 records for practicing pagination, filtering, and financial data */
    override fun ticketSales(): TicketSaleServiceAsync = ticketSales

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClientServiceAsync.WithRawResponse {

        private val ws: WServiceAsync.WithRawResponse by lazy {
            WServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ticketSales: TicketSaleServiceAsync.WithRawResponse by lazy {
            TicketSaleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClientServiceAsync.WithRawResponse =
            ClientServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** WebSocket endpoints for real-time bidirectional communication - Live match simulation */
        override fun ws(): WServiceAsync.WithRawResponse = ws

        /**
         * Ticket sales with 300 records for practicing pagination, filtering, and financial data
         */
        override fun ticketSales(): TicketSaleServiceAsync.WithRawResponse = ticketSales
    }
}
