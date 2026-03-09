// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.client.ticketsales

import com.believe.api.core.AutoPagerAsync
import com.believe.api.core.PageAsync
import com.believe.api.core.checkRequired
import com.believe.api.services.async.client.TicketSaleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TicketSaleServiceAsync.list */
class TicketSaleListPageAsync
private constructor(
    private val service: TicketSaleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TicketSaleListParams,
    private val response: TicketSaleListPageResponse,
) : PageAsync<TicketSaleListResponse> {

    /**
     * Delegates to [TicketSaleListPageResponse], but gracefully handles missing data.
     *
     * @see TicketSaleListPageResponse.data
     */
    fun data(): List<TicketSaleListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

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

    override fun items(): List<TicketSaleListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): TicketSaleListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TicketSaleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TicketSaleListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TicketSaleListParams = params

    /** The response that this page was parsed from. */
    fun response(): TicketSaleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TicketSaleListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TicketSaleListPageAsync]. */
    class Builder internal constructor() {

        private var service: TicketSaleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TicketSaleListParams? = null
        private var response: TicketSaleListPageResponse? = null

        @JvmSynthetic
        internal fun from(ticketSaleListPageAsync: TicketSaleListPageAsync) = apply {
            service = ticketSaleListPageAsync.service
            streamHandlerExecutor = ticketSaleListPageAsync.streamHandlerExecutor
            params = ticketSaleListPageAsync.params
            response = ticketSaleListPageAsync.response
        }

        fun service(service: TicketSaleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TicketSaleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TicketSaleListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TicketSaleListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TicketSaleListPageAsync =
            TicketSaleListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TicketSaleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TicketSaleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
