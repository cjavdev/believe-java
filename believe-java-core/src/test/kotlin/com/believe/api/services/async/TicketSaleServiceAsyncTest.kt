// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.ticketsales.PurchaseMethod
import com.believe.api.models.ticketsales.TicketSaleCreateParams
import com.believe.api.models.ticketsales.TicketSaleDeleteParams
import com.believe.api.models.ticketsales.TicketSaleListParams
import com.believe.api.models.ticketsales.TicketSaleRetrieveParams
import com.believe.api.models.ticketsales.TicketSaleUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TicketSaleServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
      val client = BelieveOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val ticketSaleServiceAsync = client.ticketSales()

      val ticketSaleFuture = ticketSaleServiceAsync.create(TicketSaleCreateParams.builder()
          .buyerName("Mae Green")
          .currency("GBP")
          .discount("9.00")
          .matchId("match-001")
          .purchaseMethod(PurchaseMethod.ONLINE)
          .quantity(2L)
          .subtotal("90.00")
          .tax("16.20")
          .total("97.20")
          .unitPrice("45.00")
          .buyerEmail("mae.green@example.com")
          .couponCode("BELIEVE10")
          .build())

      val ticketSale = ticketSaleFuture.get()
      ticketSale.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
      val client = BelieveOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val ticketSaleServiceAsync = client.ticketSales()

      val ticketSaleFuture = ticketSaleServiceAsync.retrieve("ticket_sale_id")

      val ticketSale = ticketSaleFuture.get()
      ticketSale.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
      val client = BelieveOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val ticketSaleServiceAsync = client.ticketSales()

      val ticketSaleFuture = ticketSaleServiceAsync.update(TicketSaleUpdateParams.builder()
          .ticketSaleId("ticket_sale_id")
          .buyerEmail("dev@stainless.com")
          .buyerName("buyer_name")
          .couponCode("coupon_code")
          .currency("currency")
          .discount("discount")
          .matchId("match_id")
          .purchaseMethod(PurchaseMethod.ONLINE)
          .quantity(1L)
          .subtotal("subtotal")
          .tax("tax")
          .total("total")
          .unitPrice("unit_price")
          .build())

      val ticketSale = ticketSaleFuture.get()
      ticketSale.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
      val client = BelieveOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val ticketSaleServiceAsync = client.ticketSales()

      val pageFuture = ticketSaleServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
      val client = BelieveOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val ticketSaleServiceAsync = client.ticketSales()

      val future = ticketSaleServiceAsync.delete("ticket_sale_id")

      val response = future.get()
    }
}
