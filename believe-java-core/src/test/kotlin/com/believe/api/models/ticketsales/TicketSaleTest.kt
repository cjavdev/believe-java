// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.ticketsales

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketSaleTest {

    @Test
    fun create() {
        val ticketSale =
            TicketSale.builder()
                .id("ts-001")
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
                .build()

        assertThat(ticketSale.id()).isEqualTo("ts-001")
        assertThat(ticketSale.buyerName()).isEqualTo("Mae Green")
        assertThat(ticketSale.currency()).isEqualTo("GBP")
        assertThat(ticketSale.discount()).isEqualTo("9.00")
        assertThat(ticketSale.matchId()).isEqualTo("match-001")
        assertThat(ticketSale.purchaseMethod()).isEqualTo(PurchaseMethod.ONLINE)
        assertThat(ticketSale.quantity()).isEqualTo(2L)
        assertThat(ticketSale.subtotal()).isEqualTo("90.00")
        assertThat(ticketSale.tax()).isEqualTo("16.20")
        assertThat(ticketSale.total()).isEqualTo("97.20")
        assertThat(ticketSale.unitPrice()).isEqualTo("45.00")
        assertThat(ticketSale.buyerEmail()).contains("mae.green@example.com")
        assertThat(ticketSale.couponCode()).contains("BELIEVE10")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ticketSale =
            TicketSale.builder()
                .id("ts-001")
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
                .build()

        val roundtrippedTicketSale =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ticketSale),
                jacksonTypeRef<TicketSale>(),
            )

        assertThat(roundtrippedTicketSale).isEqualTo(ticketSale)
    }
}
