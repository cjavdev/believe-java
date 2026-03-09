// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.client

import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.client.ticketsales.TicketSaleCreateParams
import com.believe.api.models.client.ticketsales.TicketSaleUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TicketSaleServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val ticketSaleService = client.client().ticketSales()

        val ticketSale =
            ticketSaleService.create(
                TicketSaleCreateParams.builder()
                    .buyerName("Mae Green")
                    .currency("GBP")
                    .discount("9.00")
                    .matchId("match-001")
                    .purchaseMethod(TicketSaleCreateParams.PurchaseMethod.ONLINE)
                    .quantity(2L)
                    .subtotal("90.00")
                    .tax("16.20")
                    .total("97.20")
                    .unitPrice("45.00")
                    .buyerEmail("mae.green@example.com")
                    .couponCode("BELIEVE10")
                    .build()
            )

        ticketSale.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val ticketSaleService = client.client().ticketSales()

        val ticketSale = ticketSaleService.retrieve("ticket_sale_id")

        ticketSale.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val ticketSaleService = client.client().ticketSales()

        val ticketSale =
            ticketSaleService.update(
                TicketSaleUpdateParams.builder()
                    .ticketSaleId("ticket_sale_id")
                    .buyerEmail("dev@stainless.com")
                    .buyerName("buyer_name")
                    .couponCode("coupon_code")
                    .currency("currency")
                    .discount("discount")
                    .matchId("match_id")
                    .purchaseMethod(TicketSaleUpdateParams.PurchaseMethod.ONLINE)
                    .quantity(1L)
                    .subtotal("subtotal")
                    .tax("tax")
                    .total("total")
                    .unitPrice("unit_price")
                    .build()
            )

        ticketSale.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val ticketSaleService = client.client().ticketSales()

        val page = ticketSaleService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val ticketSaleService = client.client().ticketSales()

        ticketSaleService.delete("ticket_sale_id")
    }
}
