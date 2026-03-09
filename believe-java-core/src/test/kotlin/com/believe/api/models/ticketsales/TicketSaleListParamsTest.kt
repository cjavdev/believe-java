// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.ticketsales

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketSaleListParamsTest {

    @Test
    fun create() {
        TicketSaleListParams.builder()
            .couponCode("coupon_code")
            .currency("currency")
            .limit(10L)
            .matchId("match_id")
            .purchaseMethod(PurchaseMethod.ONLINE)
            .skip(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TicketSaleListParams.builder()
                .couponCode("coupon_code")
                .currency("currency")
                .limit(10L)
                .matchId("match_id")
                .purchaseMethod(PurchaseMethod.ONLINE)
                .skip(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("coupon_code", "coupon_code")
                    .put("currency", "currency")
                    .put("limit", "10")
                    .put("match_id", "match_id")
                    .put("purchase_method", "online")
                    .put("skip", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TicketSaleListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
