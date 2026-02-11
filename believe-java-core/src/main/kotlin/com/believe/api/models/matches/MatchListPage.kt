// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.AutoPager
import com.believe.api.core.Page
import com.believe.api.core.checkRequired
import com.believe.api.services.blocking.MatchService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MatchService.list */
class MatchListPage
private constructor(
    private val service: MatchService,
    private val params: MatchListParams,
    private val response: MatchListPageResponse,
) : Page<Match> {

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

    override fun nextPage(): MatchListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Match> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MatchListParams = params

    /** The response that this page was parsed from. */
    fun response(): MatchListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MatchListPage].
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

    /** A builder for [MatchListPage]. */
    class Builder internal constructor() {

        private var service: MatchService? = null
        private var params: MatchListParams? = null
        private var response: MatchListPageResponse? = null

        @JvmSynthetic
        internal fun from(matchListPage: MatchListPage) = apply {
            service = matchListPage.service
            params = matchListPage.params
            response = matchListPage.response
        }

        fun service(service: MatchService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MatchListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MatchListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MatchListPage].
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
        fun build(): MatchListPage =
            MatchListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MatchListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "MatchListPage{service=$service, params=$params, response=$response}"
}
