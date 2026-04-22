// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import com.believe.api.core.AutoPager
import com.believe.api.core.Page
import com.believe.api.core.checkRequired
import com.believe.api.services.blocking.CharacterService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CharacterService.list */
class CharacterListPage
private constructor(
    private val service: CharacterService,
    private val params: CharacterListParams,
    private val response: CharacterListPageResponse,
) : Page<Character> {

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

    override fun nextPage(): CharacterListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Character> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CharacterListParams = params

    /** The response that this page was parsed from. */
    fun response(): CharacterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CharacterListPage].
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

    /** A builder for [CharacterListPage]. */
    class Builder internal constructor() {

        private var service: CharacterService? = null
        private var params: CharacterListParams? = null
        private var response: CharacterListPageResponse? = null

        @JvmSynthetic
        internal fun from(characterListPage: CharacterListPage) = apply {
            service = characterListPage.service
            params = characterListPage.params
            response = characterListPage.response
        }

        fun service(service: CharacterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CharacterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CharacterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CharacterListPage].
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
        fun build(): CharacterListPage =
            CharacterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CharacterListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CharacterListPage{service=$service, params=$params, response=$response}"
}
