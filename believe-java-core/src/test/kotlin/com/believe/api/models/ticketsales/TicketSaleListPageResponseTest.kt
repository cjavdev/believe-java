// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.ticketsales

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketSaleListPageResponseTest {

    @Test
    fun create() {
        val ticketSaleListPageResponse =
            TicketSaleListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(ticketSaleListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(ticketSaleListPageResponse.hasMore()).isEqualTo(true)
        assertThat(ticketSaleListPageResponse.limit()).isEqualTo(0L)
        assertThat(ticketSaleListPageResponse.page()).isEqualTo(0L)
        assertThat(ticketSaleListPageResponse.pages()).isEqualTo(0L)
        assertThat(ticketSaleListPageResponse.skip()).isEqualTo(0L)
        assertThat(ticketSaleListPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ticketSaleListPageResponse =
            TicketSaleListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedTicketSaleListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ticketSaleListPageResponse),
                jacksonTypeRef<TicketSaleListPageResponse>(),
            )

        assertThat(roundtrippedTicketSaleListPageResponse).isEqualTo(ticketSaleListPageResponse)
    }
}
