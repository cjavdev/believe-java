// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.checkKnown
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import com.believe.api.core.toImmutable
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update specific fields of an existing quote. */
class QuoteUpdateParams
private constructor(
    private val quoteId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun quoteId(): Optional<String> = Optional.ofNullable(quoteId)

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun characterId(): Optional<String> = body.characterId()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<String> = body.context()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun episodeId(): Optional<String> = body.episodeId()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isFunny(): Optional<Boolean> = body.isFunny()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isInspirational(): Optional<Boolean> = body.isInspirational()

    /**
     * Types of moments when quotes occur.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun momentType(): Optional<QuoteMoment> = body.momentType()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun popularityScore(): Optional<Double> = body.popularityScore()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryThemes(): Optional<List<QuoteTheme>> = body.secondaryThemes()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = body.text()

    /**
     * Themes that quotes can be categorized under.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun theme(): Optional<QuoteTheme> = body.theme()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timesShared(): Optional<Long> = body.timesShared()

    /**
     * Returns the raw JSON value of [characterId].
     *
     * Unlike [characterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _characterId(): JsonField<String> = body._characterId()

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _context(): JsonField<String> = body._context()

    /**
     * Returns the raw JSON value of [episodeId].
     *
     * Unlike [episodeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _episodeId(): JsonField<String> = body._episodeId()

    /**
     * Returns the raw JSON value of [isFunny].
     *
     * Unlike [isFunny], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isFunny(): JsonField<Boolean> = body._isFunny()

    /**
     * Returns the raw JSON value of [isInspirational].
     *
     * Unlike [isInspirational], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isInspirational(): JsonField<Boolean> = body._isInspirational()

    /**
     * Returns the raw JSON value of [momentType].
     *
     * Unlike [momentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _momentType(): JsonField<QuoteMoment> = body._momentType()

    /**
     * Returns the raw JSON value of [popularityScore].
     *
     * Unlike [popularityScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _popularityScore(): JsonField<Double> = body._popularityScore()

    /**
     * Returns the raw JSON value of [secondaryThemes].
     *
     * Unlike [secondaryThemes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _secondaryThemes(): JsonField<List<QuoteTheme>> = body._secondaryThemes()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [theme].
     *
     * Unlike [theme], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _theme(): JsonField<QuoteTheme> = body._theme()

    /**
     * Returns the raw JSON value of [timesShared].
     *
     * Unlike [timesShared], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timesShared(): JsonField<Long> = body._timesShared()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): QuoteUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [QuoteUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuoteUpdateParams]. */
    class Builder internal constructor() {

        private var quoteId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(quoteUpdateParams: QuoteUpdateParams) = apply {
            quoteId = quoteUpdateParams.quoteId
            body = quoteUpdateParams.body.toBuilder()
            additionalHeaders = quoteUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = quoteUpdateParams.additionalQueryParams.toBuilder()
        }

        fun quoteId(quoteId: String?) = apply { this.quoteId = quoteId }

        /** Alias for calling [Builder.quoteId] with `quoteId.orElse(null)`. */
        fun quoteId(quoteId: Optional<String>) = quoteId(quoteId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [characterId]
         * - [context]
         * - [episodeId]
         * - [isFunny]
         * - [isInspirational]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun characterId(characterId: String?) = apply { body.characterId(characterId) }

        /** Alias for calling [Builder.characterId] with `characterId.orElse(null)`. */
        fun characterId(characterId: Optional<String>) = characterId(characterId.getOrNull())

        /**
         * Sets [Builder.characterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun characterId(characterId: JsonField<String>) = apply { body.characterId(characterId) }

        fun context(context: String?) = apply { body.context(context) }

        /** Alias for calling [Builder.context] with `context.orElse(null)`. */
        fun context(context: Optional<String>) = context(context.getOrNull())

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun context(context: JsonField<String>) = apply { body.context(context) }

        fun episodeId(episodeId: String?) = apply { body.episodeId(episodeId) }

        /** Alias for calling [Builder.episodeId] with `episodeId.orElse(null)`. */
        fun episodeId(episodeId: Optional<String>) = episodeId(episodeId.getOrNull())

        /**
         * Sets [Builder.episodeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.episodeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun episodeId(episodeId: JsonField<String>) = apply { body.episodeId(episodeId) }

        fun isFunny(isFunny: Boolean?) = apply { body.isFunny(isFunny) }

        /**
         * Alias for [Builder.isFunny].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isFunny(isFunny: Boolean) = isFunny(isFunny as Boolean?)

        /** Alias for calling [Builder.isFunny] with `isFunny.orElse(null)`. */
        fun isFunny(isFunny: Optional<Boolean>) = isFunny(isFunny.getOrNull())

        /**
         * Sets [Builder.isFunny] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isFunny] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isFunny(isFunny: JsonField<Boolean>) = apply { body.isFunny(isFunny) }

        fun isInspirational(isInspirational: Boolean?) = apply {
            body.isInspirational(isInspirational)
        }

        /**
         * Alias for [Builder.isInspirational].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isInspirational(isInspirational: Boolean) = isInspirational(isInspirational as Boolean?)

        /** Alias for calling [Builder.isInspirational] with `isInspirational.orElse(null)`. */
        fun isInspirational(isInspirational: Optional<Boolean>) =
            isInspirational(isInspirational.getOrNull())

        /**
         * Sets [Builder.isInspirational] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isInspirational] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isInspirational(isInspirational: JsonField<Boolean>) = apply {
            body.isInspirational(isInspirational)
        }

        /** Types of moments when quotes occur. */
        fun momentType(momentType: QuoteMoment?) = apply { body.momentType(momentType) }

        /** Alias for calling [Builder.momentType] with `momentType.orElse(null)`. */
        fun momentType(momentType: Optional<QuoteMoment>) = momentType(momentType.getOrNull())

        /**
         * Sets [Builder.momentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.momentType] with a well-typed [QuoteMoment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun momentType(momentType: JsonField<QuoteMoment>) = apply { body.momentType(momentType) }

        fun popularityScore(popularityScore: Double?) = apply {
            body.popularityScore(popularityScore)
        }

        /**
         * Alias for [Builder.popularityScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun popularityScore(popularityScore: Double) = popularityScore(popularityScore as Double?)

        /** Alias for calling [Builder.popularityScore] with `popularityScore.orElse(null)`. */
        fun popularityScore(popularityScore: Optional<Double>) =
            popularityScore(popularityScore.getOrNull())

        /**
         * Sets [Builder.popularityScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.popularityScore] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun popularityScore(popularityScore: JsonField<Double>) = apply {
            body.popularityScore(popularityScore)
        }

        fun secondaryThemes(secondaryThemes: List<QuoteTheme>?) = apply {
            body.secondaryThemes(secondaryThemes)
        }

        /** Alias for calling [Builder.secondaryThemes] with `secondaryThemes.orElse(null)`. */
        fun secondaryThemes(secondaryThemes: Optional<List<QuoteTheme>>) =
            secondaryThemes(secondaryThemes.getOrNull())

        /**
         * Sets [Builder.secondaryThemes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryThemes] with a well-typed `List<QuoteTheme>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun secondaryThemes(secondaryThemes: JsonField<List<QuoteTheme>>) = apply {
            body.secondaryThemes(secondaryThemes)
        }

        /**
         * Adds a single [QuoteTheme] to [secondaryThemes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecondaryTheme(secondaryTheme: QuoteTheme) = apply {
            body.addSecondaryTheme(secondaryTheme)
        }

        fun text(text: String?) = apply { body.text(text) }

        /** Alias for calling [Builder.text] with `text.orElse(null)`. */
        fun text(text: Optional<String>) = text(text.getOrNull())

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        /** Themes that quotes can be categorized under. */
        fun theme(theme: QuoteTheme?) = apply { body.theme(theme) }

        /** Alias for calling [Builder.theme] with `theme.orElse(null)`. */
        fun theme(theme: Optional<QuoteTheme>) = theme(theme.getOrNull())

        /**
         * Sets [Builder.theme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.theme] with a well-typed [QuoteTheme] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun theme(theme: JsonField<QuoteTheme>) = apply { body.theme(theme) }

        fun timesShared(timesShared: Long?) = apply { body.timesShared(timesShared) }

        /**
         * Alias for [Builder.timesShared].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timesShared(timesShared: Long) = timesShared(timesShared as Long?)

        /** Alias for calling [Builder.timesShared] with `timesShared.orElse(null)`. */
        fun timesShared(timesShared: Optional<Long>) = timesShared(timesShared.getOrNull())

        /**
         * Sets [Builder.timesShared] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timesShared] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timesShared(timesShared: JsonField<Long>) = apply { body.timesShared(timesShared) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [QuoteUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): QuoteUpdateParams =
            QuoteUpdateParams(
                quoteId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> quoteId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Model for updating a quote (all fields optional). */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val characterId: JsonField<String>,
        private val context: JsonField<String>,
        private val episodeId: JsonField<String>,
        private val isFunny: JsonField<Boolean>,
        private val isInspirational: JsonField<Boolean>,
        private val momentType: JsonField<QuoteMoment>,
        private val popularityScore: JsonField<Double>,
        private val secondaryThemes: JsonField<List<QuoteTheme>>,
        private val text: JsonField<String>,
        private val theme: JsonField<QuoteTheme>,
        private val timesShared: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("character_id")
            @ExcludeMissing
            characterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("context") @ExcludeMissing context: JsonField<String> = JsonMissing.of(),
            @JsonProperty("episode_id")
            @ExcludeMissing
            episodeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_funny")
            @ExcludeMissing
            isFunny: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_inspirational")
            @ExcludeMissing
            isInspirational: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("moment_type")
            @ExcludeMissing
            momentType: JsonField<QuoteMoment> = JsonMissing.of(),
            @JsonProperty("popularity_score")
            @ExcludeMissing
            popularityScore: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("secondary_themes")
            @ExcludeMissing
            secondaryThemes: JsonField<List<QuoteTheme>> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("theme") @ExcludeMissing theme: JsonField<QuoteTheme> = JsonMissing.of(),
            @JsonProperty("times_shared")
            @ExcludeMissing
            timesShared: JsonField<Long> = JsonMissing.of(),
        ) : this(
            characterId,
            context,
            episodeId,
            isFunny,
            isInspirational,
            momentType,
            popularityScore,
            secondaryThemes,
            text,
            theme,
            timesShared,
            mutableMapOf(),
        )

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun characterId(): Optional<String> = characterId.getOptional("character_id")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun context(): Optional<String> = context.getOptional("context")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun episodeId(): Optional<String> = episodeId.getOptional("episode_id")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isFunny(): Optional<Boolean> = isFunny.getOptional("is_funny")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isInspirational(): Optional<Boolean> = isInspirational.getOptional("is_inspirational")

        /**
         * Types of moments when quotes occur.
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun momentType(): Optional<QuoteMoment> = momentType.getOptional("moment_type")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun popularityScore(): Optional<Double> = popularityScore.getOptional("popularity_score")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryThemes(): Optional<List<QuoteTheme>> =
            secondaryThemes.getOptional("secondary_themes")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Themes that quotes can be categorized under.
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun theme(): Optional<QuoteTheme> = theme.getOptional("theme")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timesShared(): Optional<Long> = timesShared.getOptional("times_shared")

        /**
         * Returns the raw JSON value of [characterId].
         *
         * Unlike [characterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("character_id")
        @ExcludeMissing
        fun _characterId(): JsonField<String> = characterId

        /**
         * Returns the raw JSON value of [context].
         *
         * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<String> = context

        /**
         * Returns the raw JSON value of [episodeId].
         *
         * Unlike [episodeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("episode_id") @ExcludeMissing fun _episodeId(): JsonField<String> = episodeId

        /**
         * Returns the raw JSON value of [isFunny].
         *
         * Unlike [isFunny], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_funny") @ExcludeMissing fun _isFunny(): JsonField<Boolean> = isFunny

        /**
         * Returns the raw JSON value of [isInspirational].
         *
         * Unlike [isInspirational], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_inspirational")
        @ExcludeMissing
        fun _isInspirational(): JsonField<Boolean> = isInspirational

        /**
         * Returns the raw JSON value of [momentType].
         *
         * Unlike [momentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("moment_type")
        @ExcludeMissing
        fun _momentType(): JsonField<QuoteMoment> = momentType

        /**
         * Returns the raw JSON value of [popularityScore].
         *
         * Unlike [popularityScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("popularity_score")
        @ExcludeMissing
        fun _popularityScore(): JsonField<Double> = popularityScore

        /**
         * Returns the raw JSON value of [secondaryThemes].
         *
         * Unlike [secondaryThemes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondary_themes")
        @ExcludeMissing
        fun _secondaryThemes(): JsonField<List<QuoteTheme>> = secondaryThemes

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [theme].
         *
         * Unlike [theme], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("theme") @ExcludeMissing fun _theme(): JsonField<QuoteTheme> = theme

        /**
         * Returns the raw JSON value of [timesShared].
         *
         * Unlike [timesShared], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("times_shared")
        @ExcludeMissing
        fun _timesShared(): JsonField<Long> = timesShared

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var characterId: JsonField<String> = JsonMissing.of()
            private var context: JsonField<String> = JsonMissing.of()
            private var episodeId: JsonField<String> = JsonMissing.of()
            private var isFunny: JsonField<Boolean> = JsonMissing.of()
            private var isInspirational: JsonField<Boolean> = JsonMissing.of()
            private var momentType: JsonField<QuoteMoment> = JsonMissing.of()
            private var popularityScore: JsonField<Double> = JsonMissing.of()
            private var secondaryThemes: JsonField<MutableList<QuoteTheme>>? = null
            private var text: JsonField<String> = JsonMissing.of()
            private var theme: JsonField<QuoteTheme> = JsonMissing.of()
            private var timesShared: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                characterId = body.characterId
                context = body.context
                episodeId = body.episodeId
                isFunny = body.isFunny
                isInspirational = body.isInspirational
                momentType = body.momentType
                popularityScore = body.popularityScore
                secondaryThemes = body.secondaryThemes.map { it.toMutableList() }
                text = body.text
                theme = body.theme
                timesShared = body.timesShared
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun characterId(characterId: String?) = characterId(JsonField.ofNullable(characterId))

            /** Alias for calling [Builder.characterId] with `characterId.orElse(null)`. */
            fun characterId(characterId: Optional<String>) = characterId(characterId.getOrNull())

            /**
             * Sets [Builder.characterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.characterId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun characterId(characterId: JsonField<String>) = apply {
                this.characterId = characterId
            }

            fun context(context: String?) = context(JsonField.ofNullable(context))

            /** Alias for calling [Builder.context] with `context.orElse(null)`. */
            fun context(context: Optional<String>) = context(context.getOrNull())

            /**
             * Sets [Builder.context] to an arbitrary JSON value.
             *
             * You should usually call [Builder.context] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun context(context: JsonField<String>) = apply { this.context = context }

            fun episodeId(episodeId: String?) = episodeId(JsonField.ofNullable(episodeId))

            /** Alias for calling [Builder.episodeId] with `episodeId.orElse(null)`. */
            fun episodeId(episodeId: Optional<String>) = episodeId(episodeId.getOrNull())

            /**
             * Sets [Builder.episodeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.episodeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun episodeId(episodeId: JsonField<String>) = apply { this.episodeId = episodeId }

            fun isFunny(isFunny: Boolean?) = isFunny(JsonField.ofNullable(isFunny))

            /**
             * Alias for [Builder.isFunny].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isFunny(isFunny: Boolean) = isFunny(isFunny as Boolean?)

            /** Alias for calling [Builder.isFunny] with `isFunny.orElse(null)`. */
            fun isFunny(isFunny: Optional<Boolean>) = isFunny(isFunny.getOrNull())

            /**
             * Sets [Builder.isFunny] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isFunny] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isFunny(isFunny: JsonField<Boolean>) = apply { this.isFunny = isFunny }

            fun isInspirational(isInspirational: Boolean?) =
                isInspirational(JsonField.ofNullable(isInspirational))

            /**
             * Alias for [Builder.isInspirational].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isInspirational(isInspirational: Boolean) =
                isInspirational(isInspirational as Boolean?)

            /** Alias for calling [Builder.isInspirational] with `isInspirational.orElse(null)`. */
            fun isInspirational(isInspirational: Optional<Boolean>) =
                isInspirational(isInspirational.getOrNull())

            /**
             * Sets [Builder.isInspirational] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isInspirational] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isInspirational(isInspirational: JsonField<Boolean>) = apply {
                this.isInspirational = isInspirational
            }

            /** Types of moments when quotes occur. */
            fun momentType(momentType: QuoteMoment?) = momentType(JsonField.ofNullable(momentType))

            /** Alias for calling [Builder.momentType] with `momentType.orElse(null)`. */
            fun momentType(momentType: Optional<QuoteMoment>) = momentType(momentType.getOrNull())

            /**
             * Sets [Builder.momentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.momentType] with a well-typed [QuoteMoment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun momentType(momentType: JsonField<QuoteMoment>) = apply {
                this.momentType = momentType
            }

            fun popularityScore(popularityScore: Double?) =
                popularityScore(JsonField.ofNullable(popularityScore))

            /**
             * Alias for [Builder.popularityScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun popularityScore(popularityScore: Double) =
                popularityScore(popularityScore as Double?)

            /** Alias for calling [Builder.popularityScore] with `popularityScore.orElse(null)`. */
            fun popularityScore(popularityScore: Optional<Double>) =
                popularityScore(popularityScore.getOrNull())

            /**
             * Sets [Builder.popularityScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.popularityScore] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun popularityScore(popularityScore: JsonField<Double>) = apply {
                this.popularityScore = popularityScore
            }

            fun secondaryThemes(secondaryThemes: List<QuoteTheme>?) =
                secondaryThemes(JsonField.ofNullable(secondaryThemes))

            /** Alias for calling [Builder.secondaryThemes] with `secondaryThemes.orElse(null)`. */
            fun secondaryThemes(secondaryThemes: Optional<List<QuoteTheme>>) =
                secondaryThemes(secondaryThemes.getOrNull())

            /**
             * Sets [Builder.secondaryThemes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryThemes] with a well-typed
             * `List<QuoteTheme>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun secondaryThemes(secondaryThemes: JsonField<List<QuoteTheme>>) = apply {
                this.secondaryThemes = secondaryThemes.map { it.toMutableList() }
            }

            /**
             * Adds a single [QuoteTheme] to [secondaryThemes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSecondaryTheme(secondaryTheme: QuoteTheme) = apply {
                secondaryThemes =
                    (secondaryThemes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("secondaryThemes", it).add(secondaryTheme)
                    }
            }

            fun text(text: String?) = text(JsonField.ofNullable(text))

            /** Alias for calling [Builder.text] with `text.orElse(null)`. */
            fun text(text: Optional<String>) = text(text.getOrNull())

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Themes that quotes can be categorized under. */
            fun theme(theme: QuoteTheme?) = theme(JsonField.ofNullable(theme))

            /** Alias for calling [Builder.theme] with `theme.orElse(null)`. */
            fun theme(theme: Optional<QuoteTheme>) = theme(theme.getOrNull())

            /**
             * Sets [Builder.theme] to an arbitrary JSON value.
             *
             * You should usually call [Builder.theme] with a well-typed [QuoteTheme] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun theme(theme: JsonField<QuoteTheme>) = apply { this.theme = theme }

            fun timesShared(timesShared: Long?) = timesShared(JsonField.ofNullable(timesShared))

            /**
             * Alias for [Builder.timesShared].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun timesShared(timesShared: Long) = timesShared(timesShared as Long?)

            /** Alias for calling [Builder.timesShared] with `timesShared.orElse(null)`. */
            fun timesShared(timesShared: Optional<Long>) = timesShared(timesShared.getOrNull())

            /**
             * Sets [Builder.timesShared] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timesShared] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timesShared(timesShared: JsonField<Long>) = apply { this.timesShared = timesShared }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    characterId,
                    context,
                    episodeId,
                    isFunny,
                    isInspirational,
                    momentType,
                    popularityScore,
                    (secondaryThemes ?: JsonMissing.of()).map { it.toImmutable() },
                    text,
                    theme,
                    timesShared,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            characterId()
            context()
            episodeId()
            isFunny()
            isInspirational()
            momentType().ifPresent { it.validate() }
            popularityScore()
            secondaryThemes().ifPresent { it.forEach { it.validate() } }
            text()
            theme().ifPresent { it.validate() }
            timesShared()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BelieveInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (characterId.asKnown().isPresent) 1 else 0) +
                (if (context.asKnown().isPresent) 1 else 0) +
                (if (episodeId.asKnown().isPresent) 1 else 0) +
                (if (isFunny.asKnown().isPresent) 1 else 0) +
                (if (isInspirational.asKnown().isPresent) 1 else 0) +
                (momentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (popularityScore.asKnown().isPresent) 1 else 0) +
                (secondaryThemes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (theme.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timesShared.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                characterId == other.characterId &&
                context == other.context &&
                episodeId == other.episodeId &&
                isFunny == other.isFunny &&
                isInspirational == other.isInspirational &&
                momentType == other.momentType &&
                popularityScore == other.popularityScore &&
                secondaryThemes == other.secondaryThemes &&
                text == other.text &&
                theme == other.theme &&
                timesShared == other.timesShared &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                characterId,
                context,
                episodeId,
                isFunny,
                isInspirational,
                momentType,
                popularityScore,
                secondaryThemes,
                text,
                theme,
                timesShared,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{characterId=$characterId, context=$context, episodeId=$episodeId, isFunny=$isFunny, isInspirational=$isInspirational, momentType=$momentType, popularityScore=$popularityScore, secondaryThemes=$secondaryThemes, text=$text, theme=$theme, timesShared=$timesShared, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteUpdateParams &&
            quoteId == other.quoteId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(quoteId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "QuoteUpdateParams{quoteId=$quoteId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
