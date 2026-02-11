// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.biscuits

import com.believe.api.core.AutoPager
import com.believe.api.core.Page
import com.believe.api.core.checkRequired
import com.believe.api.services.blocking.BiscuitService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BiscuitService.list */
class BiscuitListPage
private constructor(
    private val service: BiscuitService,
    private val params: BiscuitListParams,
    private val response: BiscuitListPageResponse,
) : Page<Biscuit> {

    /**
     * Delegates to [BiscuitListPageResponse], but gracefully handles missing data.
     *
     * @see BiscuitListPageResponse.data
     */
    fun data(): List<Biscuit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BiscuitListPageResponse], but gracefully handles missing data.
     *
     * @see BiscuitListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [BiscuitListPageResponse], but gracefully handles missing data.
     *
     * @see BiscuitListPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<Biscuit> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): BiscuitListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): BiscuitListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Biscuit> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BiscuitListParams = params

    /** The response that this page was parsed from. */
    fun response(): BiscuitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BiscuitListPage].
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

    /** A builder for [BiscuitListPage]. */
    class Builder internal constructor() {

        private var service: BiscuitService? = null
        private var params: BiscuitListParams? = null
        private var response: BiscuitListPageResponse? = null

        @JvmSynthetic
        internal fun from(biscuitListPage: BiscuitListPage) = apply {
            service = biscuitListPage.service
            params = biscuitListPage.params
            response = biscuitListPage.response
        }

        fun service(service: BiscuitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BiscuitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BiscuitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BiscuitListPage].
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
        fun build(): BiscuitListPage =
            BiscuitListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BiscuitListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BiscuitListPage{service=$service, params=$params, response=$response}"
}
