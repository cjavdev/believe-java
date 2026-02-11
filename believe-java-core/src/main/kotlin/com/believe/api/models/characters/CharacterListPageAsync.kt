// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import com.believe.api.core.AutoPagerAsync
import com.believe.api.core.PageAsync
import com.believe.api.core.checkRequired
import com.believe.api.services.async.CharacterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CharacterServiceAsync.list */
class CharacterListPageAsync
private constructor(
    private val service: CharacterServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CharacterListParams,
    private val response: CharacterListPageResponse,
) : PageAsync<Character> {

    /**
     * Delegates to [CharacterListPageResponse], but gracefully handles missing data.
     *
     * @see CharacterListPageResponse.data
     */
    fun data(): List<Character> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CharacterListPageResponse], but gracefully handles missing data.
     *
     * @see CharacterListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [CharacterListPageResponse], but gracefully handles missing data.
     *
     * @see CharacterListPageResponse.skip
     */
    fun skip(): Optional<Long> = response._skip().getOptional("skip")

    override fun items(): List<Character> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = skip().getOrDefault(0)
        val totalCount = total().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): CharacterListParams {
        val offset = skip().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<CharacterListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Character> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CharacterListParams = params

    /** The response that this page was parsed from. */
    fun response(): CharacterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CharacterListPageAsync].
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

    /** A builder for [CharacterListPageAsync]. */
    class Builder internal constructor() {

        private var service: CharacterServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CharacterListParams? = null
        private var response: CharacterListPageResponse? = null

        @JvmSynthetic
        internal fun from(characterListPageAsync: CharacterListPageAsync) = apply {
            service = characterListPageAsync.service
            streamHandlerExecutor = characterListPageAsync.streamHandlerExecutor
            params = characterListPageAsync.params
            response = characterListPageAsync.response
        }

        fun service(service: CharacterServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CharacterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CharacterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CharacterListPageAsync].
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
        fun build(): CharacterListPageAsync =
            CharacterListPageAsync(
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

        return other is CharacterListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CharacterListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
