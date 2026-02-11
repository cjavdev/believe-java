// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.biscuits

import com.believe.api.core.AutoPagerAsync
import com.believe.api.core.PageAsync
import com.believe.api.core.checkRequired
import com.believe.api.services.async.BiscuitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BiscuitServiceAsync.list */
class BiscuitListPageAsync
private constructor(
    private val service: BiscuitServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BiscuitListParams,
    private val response: BiscuitListPageResponse,
) : PageAsync<Biscuit> {

    /**
     * Delegates to [BiscuitListPageResponse], but gracefully handles missing data.
     *
     * @see BiscuitListPageResponse.data
     */
    fun data(): List<Biscuit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BiscuitListPageResponse], but gracefully handles missing data.
     *
     * @see BiscuitListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [BiscuitListPageResponse], but gracefully handles missing data.
     *
     * @see BiscuitListPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<Biscuit> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): BiscuitListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<BiscuitListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Biscuit> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BiscuitListParams = params

    /** The response that this page was parsed from. */
    fun response(): BiscuitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BiscuitListPageAsync].
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

    /** A builder for [BiscuitListPageAsync]. */
    class Builder internal constructor() {

        private var service: BiscuitServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BiscuitListParams? = null
        private var response: BiscuitListPageResponse? = null

        @JvmSynthetic
        internal fun from(biscuitListPageAsync: BiscuitListPageAsync) = apply {
            service = biscuitListPageAsync.service
            streamHandlerExecutor = biscuitListPageAsync.streamHandlerExecutor
            params = biscuitListPageAsync.params
            response = biscuitListPageAsync.response
        }

        fun service(service: BiscuitServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BiscuitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BiscuitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BiscuitListPageAsync].
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
        fun build(): BiscuitListPageAsync =
            BiscuitListPageAsync(
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

        return other is BiscuitListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BiscuitListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
