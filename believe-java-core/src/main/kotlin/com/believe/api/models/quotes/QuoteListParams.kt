// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.Params
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a paginated list of all memorable Ted Lasso quotes with optional filtering. */
class QuoteListParams
private constructor(
    private val characterId: String?,
    private val funny: Boolean?,
    private val inspirational: Boolean?,
    private val limit: Long?,
    private val momentType: QuoteMoment?,
    private val skip: Long?,
    private val theme: QuoteTheme?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by character */
    fun characterId(): Optional<String> = Optional.ofNullable(characterId)

    /** Filter funny quotes */
    fun funny(): Optional<Boolean> = Optional.ofNullable(funny)

    /** Filter inspirational quotes */
    fun inspirational(): Optional<Boolean> = Optional.ofNullable(inspirational)

    /** Maximum number of items to return (max: 100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by moment type */
    fun momentType(): Optional<QuoteMoment> = Optional.ofNullable(momentType)

    /** Number of items to skip (offset) */
    fun skip(): Optional<Long> = Optional.ofNullable(skip)

    /** Filter by theme */
    fun theme(): Optional<QuoteTheme> = Optional.ofNullable(theme)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): QuoteListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [QuoteListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuoteListParams]. */
    class Builder internal constructor() {

        private var characterId: String? = null
        private var funny: Boolean? = null
        private var inspirational: Boolean? = null
        private var limit: Long? = null
        private var momentType: QuoteMoment? = null
        private var skip: Long? = null
        private var theme: QuoteTheme? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(quoteListParams: QuoteListParams) = apply {
            characterId = quoteListParams.characterId
            funny = quoteListParams.funny
            inspirational = quoteListParams.inspirational
            limit = quoteListParams.limit
            momentType = quoteListParams.momentType
            skip = quoteListParams.skip
            theme = quoteListParams.theme
            additionalHeaders = quoteListParams.additionalHeaders.toBuilder()
            additionalQueryParams = quoteListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by character */
        fun characterId(characterId: String?) = apply { this.characterId = characterId }

        /** Alias for calling [Builder.characterId] with `characterId.orElse(null)`. */
        fun characterId(characterId: Optional<String>) = characterId(characterId.getOrNull())

        /** Filter funny quotes */
        fun funny(funny: Boolean?) = apply { this.funny = funny }

        /**
         * Alias for [Builder.funny].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun funny(funny: Boolean) = funny(funny as Boolean?)

        /** Alias for calling [Builder.funny] with `funny.orElse(null)`. */
        fun funny(funny: Optional<Boolean>) = funny(funny.getOrNull())

        /** Filter inspirational quotes */
        fun inspirational(inspirational: Boolean?) = apply { this.inspirational = inspirational }

        /**
         * Alias for [Builder.inspirational].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun inspirational(inspirational: Boolean) = inspirational(inspirational as Boolean?)

        /** Alias for calling [Builder.inspirational] with `inspirational.orElse(null)`. */
        fun inspirational(inspirational: Optional<Boolean>) =
            inspirational(inspirational.getOrNull())

        /** Maximum number of items to return (max: 100) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter by moment type */
        fun momentType(momentType: QuoteMoment?) = apply { this.momentType = momentType }

        /** Alias for calling [Builder.momentType] with `momentType.orElse(null)`. */
        fun momentType(momentType: Optional<QuoteMoment>) = momentType(momentType.getOrNull())

        /** Number of items to skip (offset) */
        fun skip(skip: Long?) = apply { this.skip = skip }

        /**
         * Alias for [Builder.skip].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun skip(skip: Long) = skip(skip as Long?)

        /** Alias for calling [Builder.skip] with `skip.orElse(null)`. */
        fun skip(skip: Optional<Long>) = skip(skip.getOrNull())

        /** Filter by theme */
        fun theme(theme: QuoteTheme?) = apply { this.theme = theme }

        /** Alias for calling [Builder.theme] with `theme.orElse(null)`. */
        fun theme(theme: Optional<QuoteTheme>) = theme(theme.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [QuoteListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): QuoteListParams =
            QuoteListParams(
                characterId,
                funny,
                inspirational,
                limit,
                momentType,
                skip,
                theme,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                characterId?.let { put("character_id", it) }
                funny?.let { put("funny", it.toString()) }
                inspirational?.let { put("inspirational", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                momentType?.let { put("moment_type", it.toString()) }
                skip?.let { put("skip", it.toString()) }
                theme?.let { put("theme", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteListParams &&
            characterId == other.characterId &&
            funny == other.funny &&
            inspirational == other.inspirational &&
            limit == other.limit &&
            momentType == other.momentType &&
            skip == other.skip &&
            theme == other.theme &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            characterId,
            funny,
            inspirational,
            limit,
            momentType,
            skip,
            theme,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "QuoteListParams{characterId=$characterId, funny=$funny, inspirational=$inspirational, limit=$limit, momentType=$momentType, skip=$skip, theme=$theme, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
