// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.client.ticketsales

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketSaleUpdateResponseTest {

    @Test
    fun create() {
        val ticketSaleUpdateResponse =
            TicketSaleUpdateResponse.builder()
                .id("ts-001")
                .buyerName("Mae Green")
                .currency("GBP")
                .discount("9.00")
                .matchId("match-001")
                .purchaseMethod(TicketSaleUpdateResponse.PurchaseMethod.ONLINE)
                .quantity(2L)
                .subtotal("90.00")
                .tax("16.20")
                .total("97.20")
                .unitPrice("45.00")
                .buyerEmail("mae.green@example.com")
                .couponCode("BELIEVE10")
                .build()

        assertThat(ticketSaleUpdateResponse.id()).isEqualTo("ts-001")
        assertThat(ticketSaleUpdateResponse.buyerName()).isEqualTo("Mae Green")
        assertThat(ticketSaleUpdateResponse.currency()).isEqualTo("GBP")
        assertThat(ticketSaleUpdateResponse.discount()).isEqualTo("9.00")
        assertThat(ticketSaleUpdateResponse.matchId()).isEqualTo("match-001")
        assertThat(ticketSaleUpdateResponse.purchaseMethod())
            .isEqualTo(TicketSaleUpdateResponse.PurchaseMethod.ONLINE)
        assertThat(ticketSaleUpdateResponse.quantity()).isEqualTo(2L)
        assertThat(ticketSaleUpdateResponse.subtotal()).isEqualTo("90.00")
        assertThat(ticketSaleUpdateResponse.tax()).isEqualTo("16.20")
        assertThat(ticketSaleUpdateResponse.total()).isEqualTo("97.20")
        assertThat(ticketSaleUpdateResponse.unitPrice()).isEqualTo("45.00")
        assertThat(ticketSaleUpdateResponse.buyerEmail()).contains("mae.green@example.com")
        assertThat(ticketSaleUpdateResponse.couponCode()).contains("BELIEVE10")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ticketSaleUpdateResponse =
            TicketSaleUpdateResponse.builder()
                .id("ts-001")
                .buyerName("Mae Green")
                .currency("GBP")
                .discount("9.00")
                .matchId("match-001")
                .purchaseMethod(TicketSaleUpdateResponse.PurchaseMethod.ONLINE)
                .quantity(2L)
                .subtotal("90.00")
                .tax("16.20")
                .total("97.20")
                .unitPrice("45.00")
                .buyerEmail("mae.green@example.com")
                .couponCode("BELIEVE10")
                .build()

        val roundtrippedTicketSaleUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ticketSaleUpdateResponse),
                jacksonTypeRef<TicketSaleUpdateResponse>(),
            )

        assertThat(roundtrippedTicketSaleUpdateResponse).isEqualTo(ticketSaleUpdateResponse)
    }
}
