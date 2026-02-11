// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.AutoPagerAsync
import com.believe.api.core.PageAsync
import com.believe.api.core.checkRequired
import com.believe.api.services.async.TeamServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TeamServiceAsync.list */
class TeamListPageAsync
private constructor(
    private val service: TeamServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TeamListParams,
    private val response: TeamListPageResponse,
) : PageAsync<Team> {

    /**
     * Delegates to [TeamListPageResponse], but gracefully handles missing data.
     *
     * @see TeamListPageResponse.data
     */
    fun data(): List<Team> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TeamListPageResponse], but gracefully handles missing data.
     *
     * @see TeamListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [TeamListPageResponse], but gracefully handles missing data.
     *
     * @see TeamListPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<Team> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): TeamListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TeamListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Team> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TeamListParams = params

    /** The response that this page was parsed from. */
    fun response(): TeamListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamListPageAsync].
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

    /** A builder for [TeamListPageAsync]. */
    class Builder internal constructor() {

        private var service: TeamServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TeamListParams? = null
        private var response: TeamListPageResponse? = null

        @JvmSynthetic
        internal fun from(teamListPageAsync: TeamListPageAsync) = apply {
            service = teamListPageAsync.service
            streamHandlerExecutor = teamListPageAsync.streamHandlerExecutor
            params = teamListPageAsync.params
            response = teamListPageAsync.response
        }

        fun service(service: TeamServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TeamListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TeamListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TeamListPageAsync].
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
        fun build(): TeamListPageAsync =
            TeamListPageAsync(
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

        return other is TeamListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TeamListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
