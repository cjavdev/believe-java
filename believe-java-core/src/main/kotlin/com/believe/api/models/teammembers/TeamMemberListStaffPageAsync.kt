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

/** @see TeamMemberServiceAsync.listStaff */
class TeamMemberListStaffPageAsync
private constructor(
    private val service: TeamMemberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TeamMemberListStaffParams,
    private val response: TeamMemberListStaffPageResponse,
) : PageAsync<TeamMemberListStaffResponse> {

    /**
     * Delegates to [TeamMemberListStaffPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListStaffPageResponse.data
     */
    fun data(): List<TeamMemberListStaffResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TeamMemberListStaffPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListStaffPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [TeamMemberListStaffPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListStaffPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<TeamMemberListStaffResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): TeamMemberListStaffParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TeamMemberListStaffPageAsync> =
        service.listStaff(nextPageParams())

    fun autoPager(): AutoPagerAsync<TeamMemberListStaffResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TeamMemberListStaffParams = params

    /** The response that this page was parsed from. */
    fun response(): TeamMemberListStaffPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamMemberListStaffPageAsync].
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

    /** A builder for [TeamMemberListStaffPageAsync]. */
    class Builder internal constructor() {

        private var service: TeamMemberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TeamMemberListStaffParams? = null
        private var response: TeamMemberListStaffPageResponse? = null

        @JvmSynthetic
        internal fun from(teamMemberListStaffPageAsync: TeamMemberListStaffPageAsync) = apply {
            service = teamMemberListStaffPageAsync.service
            streamHandlerExecutor = teamMemberListStaffPageAsync.streamHandlerExecutor
            params = teamMemberListStaffPageAsync.params
            response = teamMemberListStaffPageAsync.response
        }

        fun service(service: TeamMemberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TeamMemberListStaffParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TeamMemberListStaffPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TeamMemberListStaffPageAsync].
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
        fun build(): TeamMemberListStaffPageAsync =
            TeamMemberListStaffPageAsync(
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

        return other is TeamMemberListStaffPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TeamMemberListStaffPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
