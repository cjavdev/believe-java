// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.coaching.principles

import com.believe.api.core.AutoPager
import com.believe.api.core.Page
import com.believe.api.core.checkRequired
import com.believe.api.services.blocking.coaching.PrincipleService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PrincipleService.list */
class PrincipleListPage
private constructor(
    private val service: PrincipleService,
    private val params: PrincipleListParams,
    private val response: PrincipleListPageResponse,
) : Page<CoachingPrinciple> {

    /**
     * Delegates to [PrincipleListPageResponse], but gracefully handles missing data.
     *
     * @see PrincipleListPageResponse.data
     */
    fun data(): List<CoachingPrinciple> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PrincipleListPageResponse], but gracefully handles missing data.
     *
     * @see PrincipleListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [PrincipleListPageResponse], but gracefully handles missing data.
     *
     * @see PrincipleListPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<CoachingPrinciple> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): PrincipleListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): PrincipleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CoachingPrinciple> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PrincipleListParams = params

    /** The response that this page was parsed from. */
    fun response(): PrincipleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PrincipleListPage].
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

    /** A builder for [PrincipleListPage]. */
    class Builder internal constructor() {

        private var service: PrincipleService? = null
        private var params: PrincipleListParams? = null
        private var response: PrincipleListPageResponse? = null

        @JvmSynthetic
        internal fun from(principleListPage: PrincipleListPage) = apply {
            service = principleListPage.service
            params = principleListPage.params
            response = principleListPage.response
        }

        fun service(service: PrincipleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PrincipleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PrincipleListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PrincipleListPage].
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
        fun build(): PrincipleListPage =
            PrincipleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrincipleListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PrincipleListPage{service=$service, params=$params, response=$response}"
}
