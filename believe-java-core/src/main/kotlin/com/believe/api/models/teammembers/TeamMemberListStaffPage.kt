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

/** @see TeamMemberService.listStaff */
class TeamMemberListStaffPage
private constructor(
    private val service: TeamMemberService,
    private val params: TeamMemberListStaffParams,
    private val response: TeamMemberListStaffPageResponse,
) : Page<TeamMemberListStaffResponse> {

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

    override fun nextPage(): TeamMemberListStaffPage = service.listStaff(nextPageParams())

    fun autoPager(): AutoPager<TeamMemberListStaffResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TeamMemberListStaffParams = params

    /** The response that this page was parsed from. */
    fun response(): TeamMemberListStaffPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamMemberListStaffPage].
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

    /** A builder for [TeamMemberListStaffPage]. */
    class Builder internal constructor() {

        private var service: TeamMemberService? = null
        private var params: TeamMemberListStaffParams? = null
        private var response: TeamMemberListStaffPageResponse? = null

        @JvmSynthetic
        internal fun from(teamMemberListStaffPage: TeamMemberListStaffPage) = apply {
            service = teamMemberListStaffPage.service
            params = teamMemberListStaffPage.params
            response = teamMemberListStaffPage.response
        }

        fun service(service: TeamMemberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TeamMemberListStaffParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TeamMemberListStaffPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TeamMemberListStaffPage].
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
        fun build(): TeamMemberListStaffPage =
            TeamMemberListStaffPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamMemberListStaffPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TeamMemberListStaffPage{service=$service, params=$params, response=$response}"
}
