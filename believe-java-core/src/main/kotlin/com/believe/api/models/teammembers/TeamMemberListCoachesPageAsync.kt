// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.AutoPagerAsync
import com.believe.api.core.PageAsync
import com.believe.api.core.checkRequired
import com.believe.api.services.async.TeamMemberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TeamMemberServiceAsync.listCoaches */
class TeamMemberListCoachesPageAsync
private constructor(
    private val service: TeamMemberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TeamMemberListCoachesParams,
    private val response: TeamMemberListCoachesPageResponse,
) : PageAsync<Coach> {

    /**
     * Delegates to [TeamMemberListCoachesPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListCoachesPageResponse.data
     */
    fun data(): List<Coach> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TeamMemberListCoachesPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListCoachesPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [TeamMemberListCoachesPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListCoachesPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<Coach> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): TeamMemberListCoachesParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TeamMemberListCoachesPageAsync> =
        service.listCoaches(nextPageParams())

    fun autoPager(): AutoPagerAsync<Coach> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TeamMemberListCoachesParams = params

    /** The response that this page was parsed from. */
    fun response(): TeamMemberListCoachesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TeamMemberListCoachesPageAsync].
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

    /** A builder for [TeamMemberListCoachesPageAsync]. */
    class Builder internal constructor() {

        private var service: TeamMemberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TeamMemberListCoachesParams? = null
        private var response: TeamMemberListCoachesPageResponse? = null

        @JvmSynthetic
        internal fun from(teamMemberListCoachesPageAsync: TeamMemberListCoachesPageAsync) = apply {
            service = teamMemberListCoachesPageAsync.service
            streamHandlerExecutor = teamMemberListCoachesPageAsync.streamHandlerExecutor
            params = teamMemberListCoachesPageAsync.params
            response = teamMemberListCoachesPageAsync.response
        }

        fun service(service: TeamMemberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TeamMemberListCoachesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TeamMemberListCoachesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TeamMemberListCoachesPageAsync].
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
        fun build(): TeamMemberListCoachesPageAsync =
            TeamMemberListCoachesPageAsync(
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

        return other is TeamMemberListCoachesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TeamMemberListCoachesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
