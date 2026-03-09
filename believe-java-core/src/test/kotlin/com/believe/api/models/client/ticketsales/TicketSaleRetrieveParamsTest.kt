// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.client.ticketsales

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketSaleRetrieveParamsTest {

    @Test
    fun create() {
        TicketSaleRetrieveParams.builder().ticketSaleId("ticket_sale_id").build()
    }

    @Test
    fun pathParams() {
        val params = TicketSaleRetrieveParams.builder().ticketSaleId("ticket_sale_id").build()

        assertThat(params._pathParam(0)).isEqualTo("ticket_sale_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
