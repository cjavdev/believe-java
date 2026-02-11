// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.coaching.principles

import com.believe.api.core.AutoPagerAsync
import com.believe.api.core.PageAsync
import com.believe.api.core.checkRequired
import com.believe.api.services.async.coaching.PrincipleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PrincipleServiceAsync.list */
class PrincipleListPageAsync
private constructor(
    private val service: PrincipleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PrincipleListParams,
    private val response: PrincipleListPageResponse,
) : PageAsync<CoachingPrinciple> {

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

    override fun nextPage(): CompletableFuture<PrincipleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CoachingPrinciple> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PrincipleListParams = params

    /** The response that this page was parsed from. */
    fun response(): PrincipleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PrincipleListPageAsync].
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

    /** A builder for [PrincipleListPageAsync]. */
    class Builder internal constructor() {

        private var service: PrincipleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PrincipleListParams? = null
        private var response: PrincipleListPageResponse? = null

        @JvmSynthetic
        internal fun from(principleListPageAsync: PrincipleListPageAsync) = apply {
            service = principleListPageAsync.service
            streamHandlerExecutor = principleListPageAsync.streamHandlerExecutor
            params = principleListPageAsync.params
            response = principleListPageAsync.response
        }

        fun service(service: PrincipleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PrincipleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PrincipleListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PrincipleListPageAsync].
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
        fun build(): PrincipleListPageAsync =
            PrincipleListPageAsync(
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

        return other is PrincipleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PrincipleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
