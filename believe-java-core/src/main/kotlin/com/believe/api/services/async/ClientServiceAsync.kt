// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.services.async.client.TicketSaleServiceAsync
import com.believe.api.services.async.client.WServiceAsync
import java.util.function.Consumer

interface ClientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientServiceAsync

    /** WebSocket endpoints for real-time bidirectional communication - Live match simulation */
    fun ws(): WServiceAsync

    /** Ticket sales with 300 records for practicing pagination, filtering, and financial data */
    fun ticketSales(): TicketSaleServiceAsync

    /**
     * A view of [ClientServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClientServiceAsync.WithRawResponse

        /** WebSocket endpoints for real-time bidirectional communication - Live match simulation */
        fun ws(): WServiceAsync.WithRawResponse

        /**
         * Ticket sales with 300 records for practicing pagination, filtering, and financial data
         */
        fun ticketSales(): TicketSaleServiceAsync.WithRawResponse
    }
}
