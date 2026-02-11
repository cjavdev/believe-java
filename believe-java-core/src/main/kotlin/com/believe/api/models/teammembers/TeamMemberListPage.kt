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

/** @see TeamMemberService.list */
class TeamMemberListPage
private constructor(
    private val service: TeamMemberService,
    private val params: TeamMemberListParams,
    private val response: TeamMemberListPageResponse,
) : Page<TeamMemberListResponse> {

    /**
     * Delegates to [TeamMemberListPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListPageResponse.data
     */
    fun data(): List<TeamMemberListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TeamMemberListPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [TeamMemberListPageResponse], but gracefully handles missing data.
     *
     * @see TeamMemberListPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<TeamMemberListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): TeamMemberListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): TeamMemberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TeamMemberListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TeamMemberListParams = params

    /** The response that this page was parsed from. */
    fun response(): TeamMemberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamMemberListPage].
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

    /** A builder for [TeamMemberListPage]. */
    class Builder internal constructor() {

        private var service: TeamMemberService? = null
        private var params: TeamMemberListParams? = null
        private var response: TeamMemberListPageResponse? = null

        @JvmSynthetic
        internal fun from(teamMemberListPage: TeamMemberListPage) = apply {
            service = teamMemberListPage.service
            params = teamMemberListPage.params
            response = teamMemberListPage.response
        }

        fun service(service: TeamMemberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TeamMemberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TeamMemberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TeamMemberListPage].
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
        fun build(): TeamMemberListPage =
            TeamMemberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamMemberListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TeamMemberListPage{service=$service, params=$params, response=$response}"
}
