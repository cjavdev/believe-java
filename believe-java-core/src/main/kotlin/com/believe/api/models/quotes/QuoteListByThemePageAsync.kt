// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.AutoPagerAsync
import com.believe.api.core.PageAsync
import com.believe.api.core.checkRequired
import com.believe.api.services.async.QuoteServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see QuoteServiceAsync.listByTheme */
class QuoteListByThemePageAsync
private constructor(
    private val service: QuoteServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: QuoteListByThemeParams,
    private val response: PaginatedResponseQuote,
) : PageAsync<Quote> {

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

    override fun nextPage(): CompletableFuture<QuoteListByThemePageAsync> =
        service.listByTheme(nextPageParams())

    fun autoPager(): AutoPagerAsync<Quote> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): QuoteListByThemeParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedResponseQuote = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QuoteListByThemePageAsync].
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

    /** A builder for [QuoteListByThemePageAsync]. */
    class Builder internal constructor() {

        private var service: QuoteServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: QuoteListByThemeParams? = null
        private var response: PaginatedResponseQuote? = null

        @JvmSynthetic
        internal fun from(quoteListByThemePageAsync: QuoteListByThemePageAsync) = apply {
            service = quoteListByThemePageAsync.service
            streamHandlerExecutor = quoteListByThemePageAsync.streamHandlerExecutor
            params = quoteListByThemePageAsync.params
            response = quoteListByThemePageAsync.response
        }

        fun service(service: QuoteServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: QuoteListByThemeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedResponseQuote) = apply { this.response = response }

        /**
         * Returns an immutable instance of [QuoteListByThemePageAsync].
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
        fun build(): QuoteListByThemePageAsync =
            QuoteListByThemePageAsync(
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

        return other is QuoteListByThemePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "QuoteListByThemePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
