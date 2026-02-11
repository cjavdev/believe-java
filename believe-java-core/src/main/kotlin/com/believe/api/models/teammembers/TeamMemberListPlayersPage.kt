// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.AutoPager
import com.believe.api.core.Page
import com.believe.api.core.checkRequired
import com.believe.api.services.blocking.TeamMemberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TeamMemberService.listPlayers */
class TeamMemberListPlayersPage
private constructor(
    private val service: TeamMemberService,
    private val params: TeamMemberListPlayersParams,
    private val response: TeamMemberListPlayersPageResponse,
) : Page<Player> {

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

    override fun nextPage(): TeamMemberListPlayersPage = service.listPlayers(nextPageParams())

    fun autoPager(): AutoPager<Player> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TeamMemberListPlayersParams = params

    /** The response that this page was parsed from. */
    fun response(): TeamMemberListPlayersPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamMemberListPlayersPage].
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

    /** A builder for [TeamMemberListPlayersPage]. */
    class Builder internal constructor() {

        private var service: TeamMemberService? = null
        private var params: TeamMemberListPlayersParams? = null
        private var response: TeamMemberListPlayersPageResponse? = null

        @JvmSynthetic
        internal fun from(teamMemberListPlayersPage: TeamMemberListPlayersPage) = apply {
            service = teamMemberListPlayersPage.service
            params = teamMemberListPlayersPage.params
            response = teamMemberListPlayersPage.response
        }

        fun service(service: TeamMemberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TeamMemberListPlayersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TeamMemberListPlayersPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TeamMemberListPlayersPage].
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
        fun build(): TeamMemberListPlayersPage =
            TeamMemberListPlayersPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamMemberListPlayersPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TeamMemberListPlayersPage{service=$service, params=$params, response=$response}"
}
