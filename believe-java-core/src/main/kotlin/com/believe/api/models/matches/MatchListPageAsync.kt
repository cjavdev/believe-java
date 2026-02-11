// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.AutoPagerAsync
import com.believe.api.core.PageAsync
import com.believe.api.core.checkRequired
import com.believe.api.services.async.MatchServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MatchServiceAsync.list */
class MatchListPageAsync
private constructor(
    private val service: MatchServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MatchListParams,
    private val response: MatchListPageResponse,
) : PageAsync<Match> {

    /**
     * Delegates to [MatchListPageResponse], but gracefully handles missing data.
     *
     * @see MatchListPageResponse.data
     */
    fun data(): List<Match> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MatchListPageResponse], but gracefully handles missing data.
     *
     * @see MatchListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [MatchListPageResponse], but gracefully handles missing data.
     *
     * @see MatchListPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<Match> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): MatchListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<MatchListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Match> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MatchListParams = params

    /** The response that this page was parsed from. */
    fun response(): MatchListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MatchListPageAsync].
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

    /** A builder for [MatchListPageAsync]. */
    class Builder internal constructor() {

        private var service: MatchServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MatchListParams? = null
        private var response: MatchListPageResponse? = null

        @JvmSynthetic
        internal fun from(matchListPageAsync: MatchListPageAsync) = apply {
            service = matchListPageAsync.service
            streamHandlerExecutor = matchListPageAsync.streamHandlerExecutor
            params = matchListPageAsync.params
            response = matchListPageAsync.response
        }

        fun service(service: MatchServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MatchListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MatchListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MatchListPageAsync].
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
        fun build(): MatchListPageAsync =
            MatchListPageAsync(
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

        return other is MatchListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MatchListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
