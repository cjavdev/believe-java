// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.client.ticketsales

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketSaleListResponseTest {

    @Test
    fun create() {
        val ticketSaleListResponse =
            TicketSaleListResponse.builder()
                .id("ts-001")
                .buyerName("Mae Green")
                .currency("GBP")
                .discount("9.00")
                .matchId("match-001")
                .purchaseMethod(TicketSaleListResponse.PurchaseMethod.ONLINE)
                .quantity(2L)
                .subtotal("90.00")
                .tax("16.20")
                .total("97.20")
                .unitPrice("45.00")
                .buyerEmail("mae.green@example.com")
                .couponCode("BELIEVE10")
                .build()

        assertThat(ticketSaleListResponse.id()).isEqualTo("ts-001")
        assertThat(ticketSaleListResponse.buyerName()).isEqualTo("Mae Green")
        assertThat(ticketSaleListResponse.currency()).isEqualTo("GBP")
        assertThat(ticketSaleListResponse.discount()).isEqualTo("9.00")
        assertThat(ticketSaleListResponse.matchId()).isEqualTo("match-001")
        assertThat(ticketSaleListResponse.purchaseMethod())
            .isEqualTo(TicketSaleListResponse.PurchaseMethod.ONLINE)
        assertThat(ticketSaleListResponse.quantity()).isEqualTo(2L)
        assertThat(ticketSaleListResponse.subtotal()).isEqualTo("90.00")
        assertThat(ticketSaleListResponse.tax()).isEqualTo("16.20")
        assertThat(ticketSaleListResponse.total()).isEqualTo("97.20")
        assertThat(ticketSaleListResponse.unitPrice()).isEqualTo("45.00")
        assertThat(ticketSaleListResponse.buyerEmail()).contains("mae.green@example.com")
        assertThat(ticketSaleListResponse.couponCode()).contains("BELIEVE10")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ticketSaleListResponse =
            TicketSaleListResponse.builder()
                .id("ts-001")
                .buyerName("Mae Green")
                .currency("GBP")
                .discount("9.00")
                .matchId("match-001")
                .purchaseMethod(TicketSaleListResponse.PurchaseMethod.ONLINE)
                .quantity(2L)
                .subtotal("90.00")
                .tax("16.20")
                .total("97.20")
                .unitPrice("45.00")
                .buyerEmail("mae.green@example.com")
                .couponCode("BELIEVE10")
                .build()

        val roundtrippedTicketSaleListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ticketSaleListResponse),
                jacksonTypeRef<TicketSaleListResponse>(),
            )

        assertThat(roundtrippedTicketSaleListResponse).isEqualTo(ticketSaleListResponse)
    }
}
