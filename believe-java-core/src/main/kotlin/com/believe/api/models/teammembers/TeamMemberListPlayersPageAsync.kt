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

/** @see TeamMemberServiceAsync.listPlayers */
class TeamMemberListPlayersPageAsync
private constructor(
    private val service: TeamMemberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TeamMemberListPlayersParams,
    private val response: TeamMemberListPlayersPageResponse,
) : PageAsync<Player> {

    /**
     * Delegates to [TeamMemberListPlayersPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListPlayersPageResponse.data
     */
    fun data(): List<Player> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TeamMemberListPlayersPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListPlayersPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [TeamMemberListPlayersPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListPlayersPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<Player> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): TeamMemberListPlayersParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TeamMemberListPlayersPageAsync> =
        service.listPlayers(nextPageParams())

    fun autoPager(): AutoPagerAsync<Player> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TeamMemberListPlayersParams = params

    /** The response that this page was parsed from. */
    fun response(): TeamMemberListPlayersPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TeamMemberListPlayersPageAsync].
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

    /** A builder for [TeamMemberListPlayersPageAsync]. */
    class Builder internal constructor() {

        private var service: TeamMemberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TeamMemberListPlayersParams? = null
        private var response: TeamMemberListPlayersPageResponse? = null

        @JvmSynthetic
        internal fun from(teamMemberListPlayersPageAsync: TeamMemberListPlayersPageAsync) = apply {
            service = teamMemberListPlayersPageAsync.service
            streamHandlerExecutor = teamMemberListPlayersPageAsync.streamHandlerExecutor
            params = teamMemberListPlayersPageAsync.params
            response = teamMemberListPlayersPageAsync.response
        }

        fun service(service: TeamMemberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TeamMemberListPlayersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TeamMemberListPlayersPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TeamMemberListPlayersPageAsync].
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
        fun build(): TeamMemberListPlayersPageAsync =
            TeamMemberListPlayersPageAsync(
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

        return other is TeamMemberListPlayersPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TeamMemberListPlayersPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
