// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.ticketsales

import com.believe.api.models.ticketsales.PurchaseMethod
import com.believe.api.models.ticketsales.TicketSaleCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketSaleCreateParamsTest {

    @Test
    fun create() {
      TicketSaleCreateParams.builder()
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
    }

    @Test
    fun body() {
      val params = TicketSaleCreateParams.builder()
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

      val body = params._body()

      assertThat(body.buyerName()).isEqualTo("Mae Green")
      assertThat(body.currency()).isEqualTo("GBP")
      assertThat(body.discount()).isEqualTo("9.00")
      assertThat(body.matchId()).isEqualTo("match-001")
      assertThat(body.purchaseMethod()).isEqualTo(PurchaseMethod.ONLINE)
      assertThat(body.quantity()).isEqualTo(2L)
      assertThat(body.subtotal()).isEqualTo("90.00")
      assertThat(body.tax()).isEqualTo("16.20")
      assertThat(body.total()).isEqualTo("97.20")
      assertThat(body.unitPrice()).isEqualTo("45.00")
      assertThat(body.buyerEmail()).contains("mae.green@example.com")
      assertThat(body.couponCode()).contains("BELIEVE10")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = TicketSaleCreateParams.builder()
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
          .build()

      val body = params._body()

      assertThat(body.buyerName()).isEqualTo("Mae Green")
      assertThat(body.currency()).isEqualTo("GBP")
      assertThat(body.discount()).isEqualTo("9.00")
      assertThat(body.matchId()).isEqualTo("match-001")
      assertThat(body.purchaseMethod()).isEqualTo(PurchaseMethod.ONLINE)
      assertThat(body.quantity()).isEqualTo(2L)
      assertThat(body.subtotal()).isEqualTo("90.00")
      assertThat(body.tax()).isEqualTo("16.20")
      assertThat(body.total()).isEqualTo("97.20")
      assertThat(body.unitPrice()).isEqualTo("45.00")
    }
}
