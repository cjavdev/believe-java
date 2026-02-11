// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.episodes

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Full episode model with ID. */
class Episode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val airDate: JsonField<LocalDate>,
    private val characterFocus: JsonField<List<String>>,
    private val director: JsonField<String>,
    private val episodeNumber: JsonField<Long>,
    private val mainTheme: JsonField<String>,
    private val runtimeMinutes: JsonField<Long>,
    private val season: JsonField<Long>,
    private val synopsis: JsonField<String>,
    private val tedWisdom: JsonField<String>,
    private val title: JsonField<String>,
    private val writer: JsonField<String>,
    private val biscuitsWithBossMoment: JsonField<String>,
    private val memorableMoments: JsonField<List<String>>,
    private val usViewersMillions: JsonField<Double>,
    private val viewerRating: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("air_date") @ExcludeMissing airDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("character_focus")
        @ExcludeMissing
        characterFocus: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("director") @ExcludeMissing director: JsonField<String> = JsonMissing.of(),
        @JsonProperty("episode_number")
        @ExcludeMissing
        episodeNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("main_theme") @ExcludeMissing mainTheme: JsonField<String> = JsonMissing.of(),
        @JsonProperty("runtime_minutes")
        @ExcludeMissing
        runtimeMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("season") @ExcludeMissing season: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("synopsis") @ExcludeMissing synopsis: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ted_wisdom") @ExcludeMissing tedWisdom: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("writer") @ExcludeMissing writer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("biscuits_with_boss_moment")
        @ExcludeMissing
        biscuitsWithBossMoment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memorable_moments")
        @ExcludeMissing
        memorableMoments: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("us_viewers_millions")
        @ExcludeMissing
        usViewersMillions: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("viewer_rating")
        @ExcludeMissing
        viewerRating: JsonField<Double> = JsonMissing.of(),
    ) : this(
        id,
        airDate,
        characterFocus,
        director,
        episodeNumber,
        mainTheme,
        runtimeMinutes,
        season,
        synopsis,
        tedWisdom,
        title,
        writer,
        biscuitsWithBossMoment,
        memorableMoments,
        usViewersMillions,
        viewerRating,
        mutableMapOf(),
    )

    /**
     * Unique identifier (format: s##e##)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Original air date
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun airDate(): LocalDate = airDate.getRequired("air_date")

    /**
     * Characters with significant development
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun characterFocus(): List<String> = characterFocus.getRequired("character_focus")

    /**
     * Episode director
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun director(): String = director.getRequired("director")

    /**
     * Episode number within season
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun episodeNumber(): Long = episodeNumber.getRequired("episode_number")

    /**
     * Central theme of the episode
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mainTheme(): String = mainTheme.getRequired("main_theme")

    /**
     * Episode runtime in minutes
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runtimeMinutes(): Long = runtimeMinutes.getRequired("runtime_minutes")

    /**
     * Season number
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun season(): Long = season.getRequired("season")

    /**
     * Brief plot synopsis
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun synopsis(): String = synopsis.getRequired("synopsis")

    /**
     * Key piece of Ted wisdom from the episode
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tedWisdom(): String = tedWisdom.getRequired("ted_wisdom")

    /**
     * Episode title
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * Episode writer(s)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun writer(): String = writer.getRequired("writer")

    /**
     * Notable biscuits with the boss scene
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun biscuitsWithBossMoment(): Optional<String> =
        biscuitsWithBossMoment.getOptional("biscuits_with_boss_moment")

    /**
     * Standout moments from the episode
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memorableMoments(): Optional<List<String>> =
        memorableMoments.getOptional("memorable_moments")

    /**
     * US viewership in millions
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usViewersMillions(): Optional<Double> = usViewersMillions.getOptional("us_viewers_millions")

    /**
     * Viewer rating out of 10
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun viewerRating(): Optional<Double> = viewerRating.getOptional("viewer_rating")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [airDate].
     *
     * Unlike [airDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("air_date") @ExcludeMissing fun _airDate(): JsonField<LocalDate> = airDate

    /**
     * Returns the raw JSON value of [characterFocus].
     *
     * Unlike [characterFocus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("character_focus")
    @ExcludeMissing
    fun _characterFocus(): JsonField<List<String>> = characterFocus

    /**
     * Returns the raw JSON value of [director].
     *
     * Unlike [director], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("director") @ExcludeMissing fun _director(): JsonField<String> = director

    /**
     * Returns the raw JSON value of [episodeNumber].
     *
     * Unlike [episodeNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("episode_number")
    @ExcludeMissing
    fun _episodeNumber(): JsonField<Long> = episodeNumber

    /**
     * Returns the raw JSON value of [mainTheme].
     *
     * Unlike [mainTheme], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("main_theme") @ExcludeMissing fun _mainTheme(): JsonField<String> = mainTheme

    /**
     * Returns the raw JSON value of [runtimeMinutes].
     *
     * Unlike [runtimeMinutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtime_minutes")
    @ExcludeMissing
    fun _runtimeMinutes(): JsonField<Long> = runtimeMinutes

    /**
     * Returns the raw JSON value of [season].
     *
     * Unlike [season], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("season") @ExcludeMissing fun _season(): JsonField<Long> = season

    /**
     * Returns the raw JSON value of [synopsis].
     *
     * Unlike [synopsis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("synopsis") @ExcludeMissing fun _synopsis(): JsonField<String> = synopsis

    /**
     * Returns the raw JSON value of [tedWisdom].
     *
     * Unlike [tedWisdom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ted_wisdom") @ExcludeMissing fun _tedWisdom(): JsonField<String> = tedWisdom

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [writer].
     *
     * Unlike [writer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("writer") @ExcludeMissing fun _writer(): JsonField<String> = writer

    /**
     * Returns the raw JSON value of [biscuitsWithBossMoment].
     *
     * Unlike [biscuitsWithBossMoment], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("biscuits_with_boss_moment")
    @ExcludeMissing
    fun _biscuitsWithBossMoment(): JsonField<String> = biscuitsWithBossMoment

    /**
     * Returns the raw JSON value of [memorableMoments].
     *
     * Unlike [memorableMoments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("memorable_moments")
    @ExcludeMissing
    fun _memorableMoments(): JsonField<List<String>> = memorableMoments

    /**
     * Returns the raw JSON value of [usViewersMillions].
     *
     * Unlike [usViewersMillions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("us_viewers_millions")
    @ExcludeMissing
    fun _usViewersMillions(): JsonField<Double> = usViewersMillions

    /**
     * Returns the raw JSON value of [viewerRating].
     *
     * Unlike [viewerRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("viewer_rating")
    @ExcludeMissing
    fun _viewerRating(): JsonField<Double> = viewerRating

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
         * Returns a mutable builder for constructing an instance of [Episode].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .airDate()
         * .characterFocus()
         * .director()
         * .episodeNumber()
         * .mainTheme()
         * .runtimeMinutes()
         * .season()
         * .synopsis()
         * .tedWisdom()
         * .title()
         * .writer()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Episode]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var airDate: JsonField<LocalDate>? = null
        private var characterFocus: JsonField<MutableList<String>>? = null
        private var director: JsonField<String>? = null
        private var episodeNumber: JsonField<Long>? = null
        private var mainTheme: JsonField<String>? = null
        private var runtimeMinutes: JsonField<Long>? = null
        private var season: JsonField<Long>? = null
        private var synopsis: JsonField<String>? = null
        private var tedWisdom: JsonField<String>? = null
        private var title: JsonField<String>? = null
        private var writer: JsonField<String>? = null
        private var biscuitsWithBossMoment: JsonField<String> = JsonMissing.of()
        private var memorableMoments: JsonField<MutableList<String>>? = null
        private var usViewersMillions: JsonField<Double> = JsonMissing.of()
        private var viewerRating: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(episode: Episode) = apply {
            id = episode.id
            airDate = episode.airDate
            characterFocus = episode.characterFocus.map { it.toMutableList() }
            director = episode.director
            episodeNumber = episode.episodeNumber
            mainTheme = episode.mainTheme
            runtimeMinutes = episode.runtimeMinutes
            season = episode.season
            synopsis = episode.synopsis
            tedWisdom = episode.tedWisdom
            title = episode.title
            writer = episode.writer
            biscuitsWithBossMoment = episode.biscuitsWithBossMoment
            memorableMoments = episode.memorableMoments.map { it.toMutableList() }
            usViewersMillions = episode.usViewersMillions
            viewerRating = episode.viewerRating
            additionalProperties = episode.additionalProperties.toMutableMap()
        }

        /** Unique identifier (format: s##e##) */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Original air date */
        fun airDate(airDate: LocalDate) = airDate(JsonField.of(airDate))

        /**
         * Sets [Builder.airDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.airDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun airDate(airDate: JsonField<LocalDate>) = apply { this.airDate = airDate }

        /** Characters with significant development */
        fun characterFocus(characterFocus: List<String>) =
            characterFocus(JsonField.of(characterFocus))

        /**
         * Sets [Builder.characterFocus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterFocus] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun characterFocus(characterFocus: JsonField<List<String>>) = apply {
            this.characterFocus = characterFocus.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.characterFocus].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCharacterFocus(characterFocus: String) = apply {
            this.characterFocus =
                (this.characterFocus ?: JsonField.of(mutableListOf())).also {
                    checkKnown("characterFocus", it).add(characterFocus)
                }
        }

        /** Episode director */
        fun director(director: String) = director(JsonField.of(director))

        /**
         * Sets [Builder.director] to an arbitrary JSON value.
         *
         * You should usually call [Builder.director] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun director(director: JsonField<String>) = apply { this.director = director }

        /** Episode number within season */
        fun episodeNumber(episodeNumber: Long) = episodeNumber(JsonField.of(episodeNumber))

        /**
         * Sets [Builder.episodeNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.episodeNumber] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun episodeNumber(episodeNumber: JsonField<Long>) = apply {
            this.episodeNumber = episodeNumber
        }

        /** Central theme of the episode */
        fun mainTheme(mainTheme: String) = mainTheme(JsonField.of(mainTheme))

        /**
         * Sets [Builder.mainTheme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mainTheme] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mainTheme(mainTheme: JsonField<String>) = apply { this.mainTheme = mainTheme }

        /** Episode runtime in minutes */
        fun runtimeMinutes(runtimeMinutes: Long) = runtimeMinutes(JsonField.of(runtimeMinutes))

        /**
         * Sets [Builder.runtimeMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtimeMinutes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runtimeMinutes(runtimeMinutes: JsonField<Long>) = apply {
            this.runtimeMinutes = runtimeMinutes
        }

        /** Season number */
        fun season(season: Long) = season(JsonField.of(season))

        /**
         * Sets [Builder.season] to an arbitrary JSON value.
         *
         * You should usually call [Builder.season] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun season(season: JsonField<Long>) = apply { this.season = season }

        /** Brief plot synopsis */
        fun synopsis(synopsis: String) = synopsis(JsonField.of(synopsis))

        /**
         * Sets [Builder.synopsis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.synopsis] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun synopsis(synopsis: JsonField<String>) = apply { this.synopsis = synopsis }

        /** Key piece of Ted wisdom from the episode */
        fun tedWisdom(tedWisdom: String) = tedWisdom(JsonField.of(tedWisdom))

        /**
         * Sets [Builder.tedWisdom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedWisdom] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tedWisdom(tedWisdom: JsonField<String>) = apply { this.tedWisdom = tedWisdom }

        /** Episode title */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** Episode writer(s) */
        fun writer(writer: String) = writer(JsonField.of(writer))

        /**
         * Sets [Builder.writer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.writer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun writer(writer: JsonField<String>) = apply { this.writer = writer }

        /** Notable biscuits with the boss scene */
        fun biscuitsWithBossMoment(biscuitsWithBossMoment: String?) =
            biscuitsWithBossMoment(JsonField.ofNullable(biscuitsWithBossMoment))

        /**
         * Alias for calling [Builder.biscuitsWithBossMoment] with
         * `biscuitsWithBossMoment.orElse(null)`.
         */
        fun biscuitsWithBossMoment(biscuitsWithBossMoment: Optional<String>) =
            biscuitsWithBossMoment(biscuitsWithBossMoment.getOrNull())

        /**
         * Sets [Builder.biscuitsWithBossMoment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.biscuitsWithBossMoment] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun biscuitsWithBossMoment(biscuitsWithBossMoment: JsonField<String>) = apply {
            this.biscuitsWithBossMoment = biscuitsWithBossMoment
        }

        /** Standout moments from the episode */
        fun memorableMoments(memorableMoments: List<String>) =
            memorableMoments(JsonField.of(memorableMoments))

        /**
         * Sets [Builder.memorableMoments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memorableMoments] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun memorableMoments(memorableMoments: JsonField<List<String>>) = apply {
            this.memorableMoments = memorableMoments.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [memorableMoments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMemorableMoment(memorableMoment: String) = apply {
            memorableMoments =
                (memorableMoments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("memorableMoments", it).add(memorableMoment)
                }
        }

        /** US viewership in millions */
        fun usViewersMillions(usViewersMillions: Double?) =
            usViewersMillions(JsonField.ofNullable(usViewersMillions))

        /**
         * Alias for [Builder.usViewersMillions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun usViewersMillions(usViewersMillions: Double) =
            usViewersMillions(usViewersMillions as Double?)

        /** Alias for calling [Builder.usViewersMillions] with `usViewersMillions.orElse(null)`. */
        fun usViewersMillions(usViewersMillions: Optional<Double>) =
            usViewersMillions(usViewersMillions.getOrNull())

        /**
         * Sets [Builder.usViewersMillions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usViewersMillions] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usViewersMillions(usViewersMillions: JsonField<Double>) = apply {
            this.usViewersMillions = usViewersMillions
        }

        /** Viewer rating out of 10 */
        fun viewerRating(viewerRating: Double?) = viewerRating(JsonField.ofNullable(viewerRating))

        /**
         * Alias for [Builder.viewerRating].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun viewerRating(viewerRating: Double) = viewerRating(viewerRating as Double?)

        /** Alias for calling [Builder.viewerRating] with `viewerRating.orElse(null)`. */
        fun viewerRating(viewerRating: Optional<Double>) = viewerRating(viewerRating.getOrNull())

        /**
         * Sets [Builder.viewerRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.viewerRating] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun viewerRating(viewerRating: JsonField<Double>) = apply {
            this.viewerRating = viewerRating
        }

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
         * Returns an immutable instance of [Episode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .airDate()
         * .characterFocus()
         * .director()
         * .episodeNumber()
         * .mainTheme()
         * .runtimeMinutes()
         * .season()
         * .synopsis()
         * .tedWisdom()
         * .title()
         * .writer()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Episode =
            Episode(
                checkRequired("id", id),
                checkRequired("airDate", airDate),
                checkRequired("characterFocus", characterFocus).map { it.toImmutable() },
                checkRequired("director", director),
                checkRequired("episodeNumber", episodeNumber),
                checkRequired("mainTheme", mainTheme),
                checkRequired("runtimeMinutes", runtimeMinutes),
                checkRequired("season", season),
                checkRequired("synopsis", synopsis),
                checkRequired("tedWisdom", tedWisdom),
                checkRequired("title", title),
                checkRequired("writer", writer),
                biscuitsWithBossMoment,
                (memorableMoments ?: JsonMissing.of()).map { it.toImmutable() },
                usViewersMillions,
                viewerRating,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Episode = apply {
        if (validated) {
            return@apply
        }

        id()
        airDate()
        characterFocus()
        director()
        episodeNumber()
        mainTheme()
        runtimeMinutes()
        season()
        synopsis()
        tedWisdom()
        title()
        writer()
        biscuitsWithBossMoment()
        memorableMoments()
        usViewersMillions()
        viewerRating()
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
            (if (airDate.asKnown().isPresent) 1 else 0) +
            (characterFocus.asKnown().getOrNull()?.size ?: 0) +
            (if (director.asKnown().isPresent) 1 else 0) +
            (if (episodeNumber.asKnown().isPresent) 1 else 0) +
            (if (mainTheme.asKnown().isPresent) 1 else 0) +
            (if (runtimeMinutes.asKnown().isPresent) 1 else 0) +
            (if (season.asKnown().isPresent) 1 else 0) +
            (if (synopsis.asKnown().isPresent) 1 else 0) +
            (if (tedWisdom.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (writer.asKnown().isPresent) 1 else 0) +
            (if (biscuitsWithBossMoment.asKnown().isPresent) 1 else 0) +
            (memorableMoments.asKnown().getOrNull()?.size ?: 0) +
            (if (usViewersMillions.asKnown().isPresent) 1 else 0) +
            (if (viewerRating.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Episode &&
            id == other.id &&
            airDate == other.airDate &&
            characterFocus == other.characterFocus &&
            director == other.director &&
            episodeNumber == other.episodeNumber &&
            mainTheme == other.mainTheme &&
            runtimeMinutes == other.runtimeMinutes &&
            season == other.season &&
            synopsis == other.synopsis &&
            tedWisdom == other.tedWisdom &&
            title == other.title &&
            writer == other.writer &&
            biscuitsWithBossMoment == other.biscuitsWithBossMoment &&
            memorableMoments == other.memorableMoments &&
            usViewersMillions == other.usViewersMillions &&
            viewerRating == other.viewerRating &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            airDate,
            characterFocus,
            director,
            episodeNumber,
            mainTheme,
            runtimeMinutes,
            season,
            synopsis,
            tedWisdom,
            title,
            writer,
            biscuitsWithBossMoment,
            memorableMoments,
            usViewersMillions,
            viewerRating,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Episode{id=$id, airDate=$airDate, characterFocus=$characterFocus, director=$director, episodeNumber=$episodeNumber, mainTheme=$mainTheme, runtimeMinutes=$runtimeMinutes, season=$season, synopsis=$synopsis, tedWisdom=$tedWisdom, title=$title, writer=$writer, biscuitsWithBossMoment=$biscuitsWithBossMoment, memorableMoments=$memorableMoments, usViewersMillions=$usViewersMillions, viewerRating=$viewerRating, additionalProperties=$additionalProperties}"
}
