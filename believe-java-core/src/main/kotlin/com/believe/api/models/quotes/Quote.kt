// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.checkKnown
import com.believe.api.core.checkRequired
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

/** Full quote model with ID. */
class Quote
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val characterId: JsonField<String>,
    private val context: JsonField<String>,
    private val momentType: JsonField<QuoteMoment>,
    private val text: JsonField<String>,
    private val theme: JsonField<QuoteTheme>,
    private val episodeId: JsonField<String>,
    private val isFunny: JsonField<Boolean>,
    private val isInspirational: JsonField<Boolean>,
    private val popularityScore: JsonField<Double>,
    private val secondaryThemes: JsonField<List<QuoteTheme>>,
    private val timesShared: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("character_id")
        @ExcludeMissing
        characterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("context") @ExcludeMissing context: JsonField<String> = JsonMissing.of(),
        @JsonProperty("moment_type")
        @ExcludeMissing
        momentType: JsonField<QuoteMoment> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("theme") @ExcludeMissing theme: JsonField<QuoteTheme> = JsonMissing.of(),
        @JsonProperty("episode_id") @ExcludeMissing episodeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_funny") @ExcludeMissing isFunny: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_inspirational")
        @ExcludeMissing
        isInspirational: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("popularity_score")
        @ExcludeMissing
        popularityScore: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("secondary_themes")
        @ExcludeMissing
        secondaryThemes: JsonField<List<QuoteTheme>> = JsonMissing.of(),
        @JsonProperty("times_shared")
        @ExcludeMissing
        timesShared: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        characterId,
        context,
        momentType,
        text,
        theme,
        episodeId,
        isFunny,
        isInspirational,
        popularityScore,
        secondaryThemes,
        timesShared,
        mutableMapOf(),
    )

    /**
     * Unique identifier
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * ID of the character who said it
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun characterId(): String = characterId.getRequired("character_id")

    /**
     * Context in which the quote was said
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun context(): String = context.getRequired("context")

    /**
     * Type of moment when the quote was said
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun momentType(): QuoteMoment = momentType.getRequired("moment_type")

    /**
     * The quote text
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * Primary theme of the quote
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun theme(): QuoteTheme = theme.getRequired("theme")

    /**
     * Episode where the quote appears
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun episodeId(): Optional<String> = episodeId.getOptional("episode_id")

    /**
     * Whether this quote is humorous
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isFunny(): Optional<Boolean> = isFunny.getOptional("is_funny")

    /**
     * Whether this quote is inspirational
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isInspirational(): Optional<Boolean> = isInspirational.getOptional("is_inspirational")

    /**
     * Popularity/virality score (0-100)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun popularityScore(): Optional<Double> = popularityScore.getOptional("popularity_score")

    /**
     * Additional themes
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryThemes(): Optional<List<QuoteTheme>> =
        secondaryThemes.getOptional("secondary_themes")

    /**
     * Number of times shared on social media
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timesShared(): Optional<Long> = timesShared.getOptional("times_shared")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [momentType].
     *
     * Unlike [momentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("moment_type")
    @ExcludeMissing
    fun _momentType(): JsonField<QuoteMoment> = momentType

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
     * Unlike [isInspirational], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_inspirational")
    @ExcludeMissing
    fun _isInspirational(): JsonField<Boolean> = isInspirational

    /**
     * Returns the raw JSON value of [popularityScore].
     *
     * Unlike [popularityScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("popularity_score")
    @ExcludeMissing
    fun _popularityScore(): JsonField<Double> = popularityScore

    /**
     * Returns the raw JSON value of [secondaryThemes].
     *
     * Unlike [secondaryThemes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondary_themes")
    @ExcludeMissing
    fun _secondaryThemes(): JsonField<List<QuoteTheme>> = secondaryThemes

    /**
     * Returns the raw JSON value of [timesShared].
     *
     * Unlike [timesShared], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("times_shared") @ExcludeMissing fun _timesShared(): JsonField<Long> = timesShared

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

        /**
         * Returns a mutable builder for constructing an instance of [Quote].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .characterId()
         * .context()
         * .momentType()
         * .text()
         * .theme()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Quote]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var characterId: JsonField<String>? = null
        private var context: JsonField<String>? = null
        private var momentType: JsonField<QuoteMoment>? = null
        private var text: JsonField<String>? = null
        private var theme: JsonField<QuoteTheme>? = null
        private var episodeId: JsonField<String> = JsonMissing.of()
        private var isFunny: JsonField<Boolean> = JsonMissing.of()
        private var isInspirational: JsonField<Boolean> = JsonMissing.of()
        private var popularityScore: JsonField<Double> = JsonMissing.of()
        private var secondaryThemes: JsonField<MutableList<QuoteTheme>>? = null
        private var timesShared: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(quote: Quote) = apply {
            id = quote.id
            characterId = quote.characterId
            context = quote.context
            momentType = quote.momentType
            text = quote.text
            theme = quote.theme
            episodeId = quote.episodeId
            isFunny = quote.isFunny
            isInspirational = quote.isInspirational
            popularityScore = quote.popularityScore
            secondaryThemes = quote.secondaryThemes.map { it.toMutableList() }
            timesShared = quote.timesShared
            additionalProperties = quote.additionalProperties.toMutableMap()
        }

        /** Unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ID of the character who said it */
        fun characterId(characterId: String) = characterId(JsonField.of(characterId))

        /**
         * Sets [Builder.characterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun characterId(characterId: JsonField<String>) = apply { this.characterId = characterId }

        /** Context in which the quote was said */
        fun context(context: String) = context(JsonField.of(context))

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun context(context: JsonField<String>) = apply { this.context = context }

        /** Type of moment when the quote was said */
        fun momentType(momentType: QuoteMoment) = momentType(JsonField.of(momentType))

        /**
         * Sets [Builder.momentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.momentType] with a well-typed [QuoteMoment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun momentType(momentType: JsonField<QuoteMoment>) = apply { this.momentType = momentType }

        /** The quote text */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        /** Primary theme of the quote */
        fun theme(theme: QuoteTheme) = theme(JsonField.of(theme))

        /**
         * Sets [Builder.theme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.theme] with a well-typed [QuoteTheme] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun theme(theme: JsonField<QuoteTheme>) = apply { this.theme = theme }

        /** Episode where the quote appears */
        fun episodeId(episodeId: String?) = episodeId(JsonField.ofNullable(episodeId))

        /** Alias for calling [Builder.episodeId] with `episodeId.orElse(null)`. */
        fun episodeId(episodeId: Optional<String>) = episodeId(episodeId.getOrNull())

        /**
         * Sets [Builder.episodeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.episodeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun episodeId(episodeId: JsonField<String>) = apply { this.episodeId = episodeId }

        /** Whether this quote is humorous */
        fun isFunny(isFunny: Boolean) = isFunny(JsonField.of(isFunny))

        /**
         * Sets [Builder.isFunny] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isFunny] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isFunny(isFunny: JsonField<Boolean>) = apply { this.isFunny = isFunny }

        /** Whether this quote is inspirational */
        fun isInspirational(isInspirational: Boolean) =
            isInspirational(JsonField.of(isInspirational))

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

        /** Popularity/virality score (0-100) */
        fun popularityScore(popularityScore: Double?) =
            popularityScore(JsonField.ofNullable(popularityScore))

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
            this.popularityScore = popularityScore
        }

        /** Additional themes */
        fun secondaryThemes(secondaryThemes: List<QuoteTheme>) =
            secondaryThemes(JsonField.of(secondaryThemes))

        /**
         * Sets [Builder.secondaryThemes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryThemes] with a well-typed `List<QuoteTheme>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        /** Number of times shared on social media */
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [Quote].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .characterId()
         * .context()
         * .momentType()
         * .text()
         * .theme()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Quote =
            Quote(
                checkRequired("id", id),
                checkRequired("characterId", characterId),
                checkRequired("context", context),
                checkRequired("momentType", momentType),
                checkRequired("text", text),
                checkRequired("theme", theme),
                episodeId,
                isFunny,
                isInspirational,
                popularityScore,
                (secondaryThemes ?: JsonMissing.of()).map { it.toImmutable() },
                timesShared,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Quote = apply {
        if (validated) {
            return@apply
        }

        id()
        characterId()
        context()
        momentType().validate()
        text()
        theme().validate()
        episodeId()
        isFunny()
        isInspirational()
        popularityScore()
        secondaryThemes().ifPresent { it.forEach { it.validate() } }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (characterId.asKnown().isPresent) 1 else 0) +
            (if (context.asKnown().isPresent) 1 else 0) +
            (momentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (theme.asKnown().getOrNull()?.validity() ?: 0) +
            (if (episodeId.asKnown().isPresent) 1 else 0) +
            (if (isFunny.asKnown().isPresent) 1 else 0) +
            (if (isInspirational.asKnown().isPresent) 1 else 0) +
            (if (popularityScore.asKnown().isPresent) 1 else 0) +
            (secondaryThemes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (timesShared.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Quote &&
            id == other.id &&
            characterId == other.characterId &&
            context == other.context &&
            momentType == other.momentType &&
            text == other.text &&
            theme == other.theme &&
            episodeId == other.episodeId &&
            isFunny == other.isFunny &&
            isInspirational == other.isInspirational &&
            popularityScore == other.popularityScore &&
            secondaryThemes == other.secondaryThemes &&
            timesShared == other.timesShared &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            characterId,
            context,
            momentType,
            text,
            theme,
            episodeId,
            isFunny,
            isInspirational,
            popularityScore,
            secondaryThemes,
            timesShared,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Quote{id=$id, characterId=$characterId, context=$context, momentType=$momentType, text=$text, theme=$theme, episodeId=$episodeId, isFunny=$isFunny, isInspirational=$isInspirational, popularityScore=$popularityScore, secondaryThemes=$secondaryThemes, timesShared=$timesShared, additionalProperties=$additionalProperties}"
}
