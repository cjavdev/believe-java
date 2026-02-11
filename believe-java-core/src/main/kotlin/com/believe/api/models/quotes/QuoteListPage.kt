// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.AutoPager
import com.believe.api.core.Page
import com.believe.api.core.checkRequired
import com.believe.api.services.blocking.QuoteService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see QuoteService.list */
class QuoteListPage
private constructor(
    private val service: QuoteService,
    private val params: QuoteListParams,
    private val response: PaginatedResponseQuote,
) : Page<Quote> {

    /**
     * Delegates to [PaginatedResponseQuote], but gracefully handles missing data.
     *
     * @see PaginatedResponseQuote.data
     */
    fun data(): List<Quote> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PaginatedResponseQuote], but gracefully handles missing data.
     *
     * @see PaginatedResponseQuote.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [PaginatedResponseQuote], but gracefully handles missing data.
     *
     * @see PaginatedResponseQuote.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<Quote> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): QuoteListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): QuoteListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Quote> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): QuoteListParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedResponseQuote = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QuoteListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuoteListPage]. */
    class Builder internal constructor() {

        private var service: QuoteService? = null
        private var params: QuoteListParams? = null
        private var response: PaginatedResponseQuote? = null

        @JvmSynthetic
        internal fun from(quoteListPage: QuoteListPage) = apply {
            service = quoteListPage.service
            params = quoteListPage.params
            response = quoteListPage.response
        }

        fun service(service: QuoteService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: QuoteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedResponseQuote) = apply { this.response = response }

        /**
         * Returns an immutable instance of [QuoteListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuoteListPage =
            QuoteListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "QuoteListPage{service=$service, params=$params, response=$response}"
}
