// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.AutoPager
import com.believe.api.core.Page
import com.believe.api.core.checkRequired
import com.believe.api.services.blocking.TeamService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TeamService.list */
class TeamListPage
private constructor(
    private val service: TeamService,
    private val params: TeamListParams,
    private val response: TeamListPageResponse,
) : Page<Team> {

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

    override fun nextPage(): TeamListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Team> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TeamListParams = params

    /** The response that this page was parsed from. */
    fun response(): TeamListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamListPage].
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

    /** A builder for [TeamListPage]. */
    class Builder internal constructor() {

        private var service: TeamService? = null
        private var params: TeamListParams? = null
        private var response: TeamListPageResponse? = null

        @JvmSynthetic
        internal fun from(teamListPage: TeamListPage) = apply {
            service = teamListPage.service
            params = teamListPage.params
            response = teamListPage.response
        }

        fun service(service: TeamService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TeamListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TeamListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TeamListPage].
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
        fun build(): TeamListPage =
            TeamListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "TeamListPage{service=$service, params=$params, response=$response}"
}
