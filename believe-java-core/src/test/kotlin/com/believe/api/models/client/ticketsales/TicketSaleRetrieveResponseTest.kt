// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.client.ticketsales

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketSaleRetrieveResponseTest {

    @Test
    fun create() {
        val ticketSaleRetrieveResponse =
            TicketSaleRetrieveResponse.builder()
                .id("ts-001")
                .buyerName("Mae Green")
                .currency("GBP")
                .discount("9.00")
                .matchId("match-001")
                .purchaseMethod(TicketSaleRetrieveResponse.PurchaseMethod.ONLINE)
                .quantity(2L)
                .subtotal("90.00")
                .tax("16.20")
                .total("97.20")
                .unitPrice("45.00")
                .buyerEmail("mae.green@example.com")
                .couponCode("BELIEVE10")
                .build()

        assertThat(ticketSaleRetrieveResponse.id()).isEqualTo("ts-001")
        assertThat(ticketSaleRetrieveResponse.buyerName()).isEqualTo("Mae Green")
        assertThat(ticketSaleRetrieveResponse.currency()).isEqualTo("GBP")
        assertThat(ticketSaleRetrieveResponse.discount()).isEqualTo("9.00")
        assertThat(ticketSaleRetrieveResponse.matchId()).isEqualTo("match-001")
        assertThat(ticketSaleRetrieveResponse.purchaseMethod())
            .isEqualTo(TicketSaleRetrieveResponse.PurchaseMethod.ONLINE)
        assertThat(ticketSaleRetrieveResponse.quantity()).isEqualTo(2L)
        assertThat(ticketSaleRetrieveResponse.subtotal()).isEqualTo("90.00")
        assertThat(ticketSaleRetrieveResponse.tax()).isEqualTo("16.20")
        assertThat(ticketSaleRetrieveResponse.total()).isEqualTo("97.20")
        assertThat(ticketSaleRetrieveResponse.unitPrice()).isEqualTo("45.00")
        assertThat(ticketSaleRetrieveResponse.buyerEmail()).contains("mae.green@example.com")
        assertThat(ticketSaleRetrieveResponse.couponCode()).contains("BELIEVE10")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ticketSaleRetrieveResponse =
            TicketSaleRetrieveResponse.builder()
                .id("ts-001")
                .buyerName("Mae Green")
                .currency("GBP")
                .discount("9.00")
                .matchId("match-001")
                .purchaseMethod(TicketSaleRetrieveResponse.PurchaseMethod.ONLINE)
                .quantity(2L)
                .subtotal("90.00")
                .tax("16.20")
                .total("97.20")
                .unitPrice("45.00")
                .buyerEmail("mae.green@example.com")
                .couponCode("BELIEVE10")
                .build()

        val roundtrippedTicketSaleRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ticketSaleRetrieveResponse),
                jacksonTypeRef<TicketSaleRetrieveResponse>(),
            )

        assertThat(roundtrippedTicketSaleRetrieveResponse).isEqualTo(ticketSaleRetrieveResponse)
    }
}
