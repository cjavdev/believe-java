// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.ticketsales

import com.believe.api.core.AutoPager
import com.believe.api.core.Page
import com.believe.api.core.checkRequired
import com.believe.api.models.ticketsales.TicketSale
import com.believe.api.models.ticketsales.TicketSaleListPageResponse
import com.believe.api.models.ticketsales.TicketSaleListParams
import com.believe.api.services.blocking.TicketSaleService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TicketSaleService.list */
class TicketSaleListPage private constructor(
    private val service: TicketSaleService,
    private val params: TicketSaleListParams,
    private val response: TicketSaleListPageResponse,

) : Page<TicketSale> {

    /**
     * Delegates to [TicketSaleListPageResponse], but gracefully handles missing data.
     *
     * @see TicketSaleListPageResponse.data
     */
    fun data(): List<TicketSale> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TicketSaleListPageResponse], but gracefully handles missing data.
     *
     * @see TicketSaleListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [TicketSaleListPageResponse], but gracefully handles missing data.
     *
     * @see TicketSaleListPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<TicketSale> = data()

    override fun hasNextPage(): Boolean {
      if (items().isEmpty()) {
          return false
      }

      val offset = skip().getOrDefault(0)
      val totalCount = total().getOrNull()
      return totalCount == null || offset + items().size < totalCount;
    }

    fun nextPageParams(): TicketSaleListParams {
      val offset = skip().getOrDefault(0)
      return params.toBuilder()
          .skip(offset + items().size)
          .build()
    }

    override fun nextPage(): TicketSaleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TicketSale> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TicketSaleListParams = params

    /** The response that this page was parsed from. */
    fun response(): TicketSaleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TicketSaleListPage].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [TicketSaleListPage]. */
    class Builder internal constructor() {

        private var service: TicketSaleService? = null
        private var params: TicketSaleListParams? = null
        private var response: TicketSaleListPageResponse? = null

        @JvmSynthetic
        internal fun from(ticketSaleListPage: TicketSaleListPage) =
            apply {
                service = ticketSaleListPage.service
                params = ticketSaleListPage.params
                response = ticketSaleListPage.response
            }

        fun service(service: TicketSaleService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: TicketSaleListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun response(response: TicketSaleListPageResponse) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [TicketSaleListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TicketSaleListPage =
            TicketSaleListPage(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "params", params
              ),
              checkRequired(
                "response", response
              ),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is TicketSaleListPage && service == other.service && params == other.params && response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "TicketSaleListPage{service=$service, params=$params, response=$response}"
}
