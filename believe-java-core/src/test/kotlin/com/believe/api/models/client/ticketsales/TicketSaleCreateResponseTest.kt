// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.client.ticketsales

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketSaleCreateResponseTest {

    @Test
    fun create() {
        val ticketSaleCreateResponse =
            TicketSaleCreateResponse.builder()
                .id("ts-001")
                .buyerName("Mae Green")
                .currency("GBP")
                .discount("9.00")
                .matchId("match-001")
                .purchaseMethod(TicketSaleCreateResponse.PurchaseMethod.ONLINE)
                .quantity(2L)
                .subtotal("90.00")
                .tax("16.20")
                .total("97.20")
                .unitPrice("45.00")
                .buyerEmail("mae.green@example.com")
                .couponCode("BELIEVE10")
                .build()

        assertThat(ticketSaleCreateResponse.id()).isEqualTo("ts-001")
        assertThat(ticketSaleCreateResponse.buyerName()).isEqualTo("Mae Green")
        assertThat(ticketSaleCreateResponse.currency()).isEqualTo("GBP")
        assertThat(ticketSaleCreateResponse.discount()).isEqualTo("9.00")
        assertThat(ticketSaleCreateResponse.matchId()).isEqualTo("match-001")
        assertThat(ticketSaleCreateResponse.purchaseMethod())
            .isEqualTo(TicketSaleCreateResponse.PurchaseMethod.ONLINE)
        assertThat(ticketSaleCreateResponse.quantity()).isEqualTo(2L)
        assertThat(ticketSaleCreateResponse.subtotal()).isEqualTo("90.00")
        assertThat(ticketSaleCreateResponse.tax()).isEqualTo("16.20")
        assertThat(ticketSaleCreateResponse.total()).isEqualTo("97.20")
        assertThat(ticketSaleCreateResponse.unitPrice()).isEqualTo("45.00")
        assertThat(ticketSaleCreateResponse.buyerEmail()).contains("mae.green@example.com")
        assertThat(ticketSaleCreateResponse.couponCode()).contains("BELIEVE10")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ticketSaleCreateResponse =
            TicketSaleCreateResponse.builder()
                .id("ts-001")
                .buyerName("Mae Green")
                .currency("GBP")
                .discount("9.00")
                .matchId("match-001")
                .purchaseMethod(TicketSaleCreateResponse.PurchaseMethod.ONLINE)
                .quantity(2L)
                .subtotal("90.00")
                .tax("16.20")
                .total("97.20")
                .unitPrice("45.00")
                .buyerEmail("mae.green@example.com")
                .couponCode("BELIEVE10")
                .build()

        val roundtrippedTicketSaleCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ticketSaleCreateResponse),
                jacksonTypeRef<TicketSaleCreateResponse>(),
            )

        assertThat(roundtrippedTicketSaleCreateResponse).isEqualTo(ticketSaleCreateResponse)
    }
}
