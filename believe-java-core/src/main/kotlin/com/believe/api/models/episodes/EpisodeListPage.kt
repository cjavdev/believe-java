// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.episodes

import com.believe.api.core.AutoPager
import com.believe.api.core.Page
import com.believe.api.core.checkRequired
import com.believe.api.services.blocking.EpisodeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EpisodeService.list */
class EpisodeListPage
private constructor(
    private val service: EpisodeService,
    private val params: EpisodeListParams,
    private val response: PaginatedResponse,
) : Page<Episode> {

    /**
     * Delegates to [PaginatedResponse], but gracefully handles missing data.
     *
     * @see PaginatedResponse.data
     */
    fun data(): List<Episode> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PaginatedResponse], but gracefully handles missing data.
     *
     * @see PaginatedResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [PaginatedResponse], but gracefully handles missing data.
     *
     * @see PaginatedResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<Episode> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): EpisodeListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): EpisodeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Episode> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EpisodeListParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EpisodeListPage].
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

    /** A builder for [EpisodeListPage]. */
    class Builder internal constructor() {

        private var service: EpisodeService? = null
        private var params: EpisodeListParams? = null
        private var response: PaginatedResponse? = null

        @JvmSynthetic
        internal fun from(episodeListPage: EpisodeListPage) = apply {
            service = episodeListPage.service
            params = episodeListPage.params
            response = episodeListPage.response
        }

        fun service(service: EpisodeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EpisodeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EpisodeListPage].
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
        fun build(): EpisodeListPage =
            EpisodeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EpisodeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EpisodeListPage{service=$service, params=$params, response=$response}"
}
