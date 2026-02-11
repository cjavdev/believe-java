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

/** @see TeamMemberService.listCoaches */
class TeamMemberListCoachesPage
private constructor(
    private val service: TeamMemberService,
    private val params: TeamMemberListCoachesParams,
    private val response: TeamMemberListCoachesPageResponse,
) : Page<Coach> {

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

    override fun nextPage(): TeamMemberListCoachesPage = service.listCoaches(nextPageParams())

    fun autoPager(): AutoPager<Coach> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TeamMemberListCoachesParams = params

    /** The response that this page was parsed from. */
    fun response(): TeamMemberListCoachesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamMemberListCoachesPage].
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

    /** A builder for [TeamMemberListCoachesPage]. */
    class Builder internal constructor() {

        private var service: TeamMemberService? = null
        private var params: TeamMemberListCoachesParams? = null
        private var response: TeamMemberListCoachesPageResponse? = null

        @JvmSynthetic
        internal fun from(teamMemberListCoachesPage: TeamMemberListCoachesPage) = apply {
            service = teamMemberListCoachesPage.service
            params = teamMemberListCoachesPage.params
            response = teamMemberListCoachesPage.response
        }

        fun service(service: TeamMemberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TeamMemberListCoachesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TeamMemberListCoachesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TeamMemberListCoachesPage].
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
        fun build(): TeamMemberListCoachesPage =
            TeamMemberListCoachesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamMemberListCoachesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TeamMemberListCoachesPage{service=$service, params=$params, response=$response}"
}
