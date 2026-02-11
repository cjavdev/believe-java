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

/** @see QuoteService.listByTheme */
class QuoteListByThemePage
private constructor(
    private val service: QuoteService,
    private val params: QuoteListByThemeParams,
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

    fun nextPageParams(): QuoteListByThemeParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): QuoteListByThemePage = service.listByTheme(nextPageParams())

    fun autoPager(): AutoPager<Quote> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): QuoteListByThemeParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedResponseQuote = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QuoteListByThemePage].
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

    /** A builder for [QuoteListByThemePage]. */
    class Builder internal constructor() {

        private var service: QuoteService? = null
        private var params: QuoteListByThemeParams? = null
        private var response: PaginatedResponseQuote? = null

        @JvmSynthetic
        internal fun from(quoteListByThemePage: QuoteListByThemePage) = apply {
            service = quoteListByThemePage.service
            params = quoteListByThemePage.params
            response = quoteListByThemePage.response
        }

        fun service(service: QuoteService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: QuoteListByThemeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedResponseQuote) = apply { this.response = response }

        /**
         * Returns an immutable instance of [QuoteListByThemePage].
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
        fun build(): QuoteListByThemePage =
            QuoteListByThemePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteListByThemePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "QuoteListByThemePage{service=$service, params=$params, response=$response}"
}
