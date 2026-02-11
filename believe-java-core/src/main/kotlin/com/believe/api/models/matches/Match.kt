// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Full match model with ID. */
class Match
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val awayTeamId: JsonField<String>,
    private val date: JsonField<OffsetDateTime>,
    private val homeTeamId: JsonField<String>,
    private val matchType: JsonField<MatchType>,
    private val attendance: JsonField<Long>,
    private val awayScore: JsonField<Long>,
    private val episodeId: JsonField<String>,
    private val homeScore: JsonField<Long>,
    private val lessonLearned: JsonField<String>,
    private val possessionPercentage: JsonField<Double>,
    private val result: JsonField<MatchResult>,
    private val tedHalftimeSpeech: JsonField<String>,
    private val ticketRevenueGbp: JsonField<String>,
    private val turningPoints: JsonField<List<TurningPoint>>,
    private val weatherTempCelsius: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("away_team_id")
        @ExcludeMissing
        awayTeamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date") @ExcludeMissing date: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("home_team_id")
        @ExcludeMissing
        homeTeamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("match_type")
        @ExcludeMissing
        matchType: JsonField<MatchType> = JsonMissing.of(),
        @JsonProperty("attendance") @ExcludeMissing attendance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("away_score") @ExcludeMissing awayScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("episode_id") @ExcludeMissing episodeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("home_score") @ExcludeMissing homeScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lesson_learned")
        @ExcludeMissing
        lessonLearned: JsonField<String> = JsonMissing.of(),
        @JsonProperty("possession_percentage")
        @ExcludeMissing
        possessionPercentage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<MatchResult> = JsonMissing.of(),
        @JsonProperty("ted_halftime_speech")
        @ExcludeMissing
        tedHalftimeSpeech: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ticket_revenue_gbp")
        @ExcludeMissing
        ticketRevenueGbp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("turning_points")
        @ExcludeMissing
        turningPoints: JsonField<List<TurningPoint>> = JsonMissing.of(),
        @JsonProperty("weather_temp_celsius")
        @ExcludeMissing
        weatherTempCelsius: JsonField<Double> = JsonMissing.of(),
    ) : this(
        id,
        awayTeamId,
        date,
        homeTeamId,
        matchType,
        attendance,
        awayScore,
        episodeId,
        homeScore,
        lessonLearned,
        possessionPercentage,
        result,
        tedHalftimeSpeech,
        ticketRevenueGbp,
        turningPoints,
        weatherTempCelsius,
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
     * Away team ID
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun awayTeamId(): String = awayTeamId.getRequired("away_team_id")

    /**
     * Match date and time
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): OffsetDateTime = date.getRequired("date")

    /**
     * Home team ID
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun homeTeamId(): String = homeTeamId.getRequired("home_team_id")

    /**
     * Type of match
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun matchType(): MatchType = matchType.getRequired("match_type")

    /**
     * Match attendance
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attendance(): Optional<Long> = attendance.getOptional("attendance")

    /**
     * Away team score
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awayScore(): Optional<Long> = awayScore.getOptional("away_score")

    /**
     * Episode ID where this match is featured
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun episodeId(): Optional<String> = episodeId.getOptional("episode_id")

    /**
     * Home team score
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun homeScore(): Optional<Long> = homeScore.getOptional("home_score")

    /**
     * The life lesson learned from this match
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lessonLearned(): Optional<String> = lessonLearned.getOptional("lesson_learned")

    /**
     * Home team possession percentage
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun possessionPercentage(): Optional<Double> =
        possessionPercentage.getOptional("possession_percentage")

    /**
     * Match result from home team perspective
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<MatchResult> = result.getOptional("result")

    /**
     * Ted's inspirational halftime speech
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tedHalftimeSpeech(): Optional<String> = tedHalftimeSpeech.getOptional("ted_halftime_speech")

    /**
     * Total ticket revenue in GBP
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ticketRevenueGbp(): Optional<String> = ticketRevenueGbp.getOptional("ticket_revenue_gbp")

    /**
     * Key moments that changed the match
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun turningPoints(): Optional<List<TurningPoint>> = turningPoints.getOptional("turning_points")

    /**
     * Temperature at kickoff in Celsius
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weatherTempCelsius(): Optional<Double> =
        weatherTempCelsius.getOptional("weather_temp_celsius")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [awayTeamId].
     *
     * Unlike [awayTeamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("away_team_id") @ExcludeMissing fun _awayTeamId(): JsonField<String> = awayTeamId

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

    /**
     * Returns the raw JSON value of [homeTeamId].
     *
     * Unlike [homeTeamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("home_team_id") @ExcludeMissing fun _homeTeamId(): JsonField<String> = homeTeamId

    /**
     * Returns the raw JSON value of [matchType].
     *
     * Unlike [matchType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("match_type") @ExcludeMissing fun _matchType(): JsonField<MatchType> = matchType

    /**
     * Returns the raw JSON value of [attendance].
     *
     * Unlike [attendance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attendance") @ExcludeMissing fun _attendance(): JsonField<Long> = attendance

    /**
     * Returns the raw JSON value of [awayScore].
     *
     * Unlike [awayScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("away_score") @ExcludeMissing fun _awayScore(): JsonField<Long> = awayScore

    /**
     * Returns the raw JSON value of [episodeId].
     *
     * Unlike [episodeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("episode_id") @ExcludeMissing fun _episodeId(): JsonField<String> = episodeId

    /**
     * Returns the raw JSON value of [homeScore].
     *
     * Unlike [homeScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("home_score") @ExcludeMissing fun _homeScore(): JsonField<Long> = homeScore

    /**
     * Returns the raw JSON value of [lessonLearned].
     *
     * Unlike [lessonLearned], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lesson_learned")
    @ExcludeMissing
    fun _lessonLearned(): JsonField<String> = lessonLearned

    /**
     * Returns the raw JSON value of [possessionPercentage].
     *
     * Unlike [possessionPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("possession_percentage")
    @ExcludeMissing
    fun _possessionPercentage(): JsonField<Double> = possessionPercentage

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<MatchResult> = result

    /**
     * Returns the raw JSON value of [tedHalftimeSpeech].
     *
     * Unlike [tedHalftimeSpeech], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ted_halftime_speech")
    @ExcludeMissing
    fun _tedHalftimeSpeech(): JsonField<String> = tedHalftimeSpeech

    /**
     * Returns the raw JSON value of [ticketRevenueGbp].
     *
     * Unlike [ticketRevenueGbp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ticket_revenue_gbp")
    @ExcludeMissing
    fun _ticketRevenueGbp(): JsonField<String> = ticketRevenueGbp

    /**
     * Returns the raw JSON value of [turningPoints].
     *
     * Unlike [turningPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("turning_points")
    @ExcludeMissing
    fun _turningPoints(): JsonField<List<TurningPoint>> = turningPoints

    /**
     * Returns the raw JSON value of [weatherTempCelsius].
     *
     * Unlike [weatherTempCelsius], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("weather_temp_celsius")
    @ExcludeMissing
    fun _weatherTempCelsius(): JsonField<Double> = weatherTempCelsius

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
         * Returns a mutable builder for constructing an instance of [Match].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .awayTeamId()
         * .date()
         * .homeTeamId()
         * .matchType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Match]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var awayTeamId: JsonField<String>? = null
        private var date: JsonField<OffsetDateTime>? = null
        private var homeTeamId: JsonField<String>? = null
        private var matchType: JsonField<MatchType>? = null
        private var attendance: JsonField<Long> = JsonMissing.of()
        private var awayScore: JsonField<Long> = JsonMissing.of()
        private var episodeId: JsonField<String> = JsonMissing.of()
        private var homeScore: JsonField<Long> = JsonMissing.of()
        private var lessonLearned: JsonField<String> = JsonMissing.of()
        private var possessionPercentage: JsonField<Double> = JsonMissing.of()
        private var result: JsonField<MatchResult> = JsonMissing.of()
        private var tedHalftimeSpeech: JsonField<String> = JsonMissing.of()
        private var ticketRevenueGbp: JsonField<String> = JsonMissing.of()
        private var turningPoints: JsonField<MutableList<TurningPoint>>? = null
        private var weatherTempCelsius: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(match: Match) = apply {
            id = match.id
            awayTeamId = match.awayTeamId
            date = match.date
            homeTeamId = match.homeTeamId
            matchType = match.matchType
            attendance = match.attendance
            awayScore = match.awayScore
            episodeId = match.episodeId
            homeScore = match.homeScore
            lessonLearned = match.lessonLearned
            possessionPercentage = match.possessionPercentage
            result = match.result
            tedHalftimeSpeech = match.tedHalftimeSpeech
            ticketRevenueGbp = match.ticketRevenueGbp
            turningPoints = match.turningPoints.map { it.toMutableList() }
            weatherTempCelsius = match.weatherTempCelsius
            additionalProperties = match.additionalProperties.toMutableMap()
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

        /** Away team ID */
        fun awayTeamId(awayTeamId: String) = awayTeamId(JsonField.of(awayTeamId))

        /**
         * Sets [Builder.awayTeamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awayTeamId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun awayTeamId(awayTeamId: JsonField<String>) = apply { this.awayTeamId = awayTeamId }

        /** Match date and time */
        fun date(date: OffsetDateTime) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

        /** Home team ID */
        fun homeTeamId(homeTeamId: String) = homeTeamId(JsonField.of(homeTeamId))

        /**
         * Sets [Builder.homeTeamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.homeTeamId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun homeTeamId(homeTeamId: JsonField<String>) = apply { this.homeTeamId = homeTeamId }

        /** Type of match */
        fun matchType(matchType: MatchType) = matchType(JsonField.of(matchType))

        /**
         * Sets [Builder.matchType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchType] with a well-typed [MatchType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun matchType(matchType: JsonField<MatchType>) = apply { this.matchType = matchType }

        /** Match attendance */
        fun attendance(attendance: Long?) = attendance(JsonField.ofNullable(attendance))

        /**
         * Alias for [Builder.attendance].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun attendance(attendance: Long) = attendance(attendance as Long?)

        /** Alias for calling [Builder.attendance] with `attendance.orElse(null)`. */
        fun attendance(attendance: Optional<Long>) = attendance(attendance.getOrNull())

        /**
         * Sets [Builder.attendance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attendance] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun attendance(attendance: JsonField<Long>) = apply { this.attendance = attendance }

        /** Away team score */
        fun awayScore(awayScore: Long) = awayScore(JsonField.of(awayScore))

        /**
         * Sets [Builder.awayScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awayScore] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun awayScore(awayScore: JsonField<Long>) = apply { this.awayScore = awayScore }

        /** Episode ID where this match is featured */
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

        /** Home team score */
        fun homeScore(homeScore: Long) = homeScore(JsonField.of(homeScore))

        /**
         * Sets [Builder.homeScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.homeScore] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun homeScore(homeScore: JsonField<Long>) = apply { this.homeScore = homeScore }

        /** The life lesson learned from this match */
        fun lessonLearned(lessonLearned: String?) =
            lessonLearned(JsonField.ofNullable(lessonLearned))

        /** Alias for calling [Builder.lessonLearned] with `lessonLearned.orElse(null)`. */
        fun lessonLearned(lessonLearned: Optional<String>) =
            lessonLearned(lessonLearned.getOrNull())

        /**
         * Sets [Builder.lessonLearned] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lessonLearned] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lessonLearned(lessonLearned: JsonField<String>) = apply {
            this.lessonLearned = lessonLearned
        }

        /** Home team possession percentage */
        fun possessionPercentage(possessionPercentage: Double?) =
            possessionPercentage(JsonField.ofNullable(possessionPercentage))

        /**
         * Alias for [Builder.possessionPercentage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun possessionPercentage(possessionPercentage: Double) =
            possessionPercentage(possessionPercentage as Double?)

        /**
         * Alias for calling [Builder.possessionPercentage] with
         * `possessionPercentage.orElse(null)`.
         */
        fun possessionPercentage(possessionPercentage: Optional<Double>) =
            possessionPercentage(possessionPercentage.getOrNull())

        /**
         * Sets [Builder.possessionPercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.possessionPercentage] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun possessionPercentage(possessionPercentage: JsonField<Double>) = apply {
            this.possessionPercentage = possessionPercentage
        }

        /** Match result from home team perspective */
        fun result(result: MatchResult) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [MatchResult] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun result(result: JsonField<MatchResult>) = apply { this.result = result }

        /** Ted's inspirational halftime speech */
        fun tedHalftimeSpeech(tedHalftimeSpeech: String?) =
            tedHalftimeSpeech(JsonField.ofNullable(tedHalftimeSpeech))

        /** Alias for calling [Builder.tedHalftimeSpeech] with `tedHalftimeSpeech.orElse(null)`. */
        fun tedHalftimeSpeech(tedHalftimeSpeech: Optional<String>) =
            tedHalftimeSpeech(tedHalftimeSpeech.getOrNull())

        /**
         * Sets [Builder.tedHalftimeSpeech] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedHalftimeSpeech] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tedHalftimeSpeech(tedHalftimeSpeech: JsonField<String>) = apply {
            this.tedHalftimeSpeech = tedHalftimeSpeech
        }

        /** Total ticket revenue in GBP */
        fun ticketRevenueGbp(ticketRevenueGbp: String?) =
            ticketRevenueGbp(JsonField.ofNullable(ticketRevenueGbp))

        /** Alias for calling [Builder.ticketRevenueGbp] with `ticketRevenueGbp.orElse(null)`. */
        fun ticketRevenueGbp(ticketRevenueGbp: Optional<String>) =
            ticketRevenueGbp(ticketRevenueGbp.getOrNull())

        /**
         * Sets [Builder.ticketRevenueGbp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ticketRevenueGbp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ticketRevenueGbp(ticketRevenueGbp: JsonField<String>) = apply {
            this.ticketRevenueGbp = ticketRevenueGbp
        }

        /** Key moments that changed the match */
        fun turningPoints(turningPoints: List<TurningPoint>) =
            turningPoints(JsonField.of(turningPoints))

        /**
         * Sets [Builder.turningPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turningPoints] with a well-typed `List<TurningPoint>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun turningPoints(turningPoints: JsonField<List<TurningPoint>>) = apply {
            this.turningPoints = turningPoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [TurningPoint] to [turningPoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTurningPoint(turningPoint: TurningPoint) = apply {
            turningPoints =
                (turningPoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("turningPoints", it).add(turningPoint)
                }
        }

        /** Temperature at kickoff in Celsius */
        fun weatherTempCelsius(weatherTempCelsius: Double?) =
            weatherTempCelsius(JsonField.ofNullable(weatherTempCelsius))

        /**
         * Alias for [Builder.weatherTempCelsius].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun weatherTempCelsius(weatherTempCelsius: Double) =
            weatherTempCelsius(weatherTempCelsius as Double?)

        /**
         * Alias for calling [Builder.weatherTempCelsius] with `weatherTempCelsius.orElse(null)`.
         */
        fun weatherTempCelsius(weatherTempCelsius: Optional<Double>) =
            weatherTempCelsius(weatherTempCelsius.getOrNull())

        /**
         * Sets [Builder.weatherTempCelsius] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weatherTempCelsius] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun weatherTempCelsius(weatherTempCelsius: JsonField<Double>) = apply {
            this.weatherTempCelsius = weatherTempCelsius
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
         * Returns an immutable instance of [Match].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .awayTeamId()
         * .date()
         * .homeTeamId()
         * .matchType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Match =
            Match(
                checkRequired("id", id),
                checkRequired("awayTeamId", awayTeamId),
                checkRequired("date", date),
                checkRequired("homeTeamId", homeTeamId),
                checkRequired("matchType", matchType),
                attendance,
                awayScore,
                episodeId,
                homeScore,
                lessonLearned,
                possessionPercentage,
                result,
                tedHalftimeSpeech,
                ticketRevenueGbp,
                (turningPoints ?: JsonMissing.of()).map { it.toImmutable() },
                weatherTempCelsius,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Match = apply {
        if (validated) {
            return@apply
        }

        id()
        awayTeamId()
        date()
        homeTeamId()
        matchType().validate()
        attendance()
        awayScore()
        episodeId()
        homeScore()
        lessonLearned()
        possessionPercentage()
        result().ifPresent { it.validate() }
        tedHalftimeSpeech()
        ticketRevenueGbp()
        turningPoints().ifPresent { it.forEach { it.validate() } }
        weatherTempCelsius()
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
            (if (awayTeamId.asKnown().isPresent) 1 else 0) +
            (if (date.asKnown().isPresent) 1 else 0) +
            (if (homeTeamId.asKnown().isPresent) 1 else 0) +
            (matchType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (attendance.asKnown().isPresent) 1 else 0) +
            (if (awayScore.asKnown().isPresent) 1 else 0) +
            (if (episodeId.asKnown().isPresent) 1 else 0) +
            (if (homeScore.asKnown().isPresent) 1 else 0) +
            (if (lessonLearned.asKnown().isPresent) 1 else 0) +
            (if (possessionPercentage.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tedHalftimeSpeech.asKnown().isPresent) 1 else 0) +
            (if (ticketRevenueGbp.asKnown().isPresent) 1 else 0) +
            (turningPoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (weatherTempCelsius.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Match &&
            id == other.id &&
            awayTeamId == other.awayTeamId &&
            date == other.date &&
            homeTeamId == other.homeTeamId &&
            matchType == other.matchType &&
            attendance == other.attendance &&
            awayScore == other.awayScore &&
            episodeId == other.episodeId &&
            homeScore == other.homeScore &&
            lessonLearned == other.lessonLearned &&
            possessionPercentage == other.possessionPercentage &&
            result == other.result &&
            tedHalftimeSpeech == other.tedHalftimeSpeech &&
            ticketRevenueGbp == other.ticketRevenueGbp &&
            turningPoints == other.turningPoints &&
            weatherTempCelsius == other.weatherTempCelsius &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            awayTeamId,
            date,
            homeTeamId,
            matchType,
            attendance,
            awayScore,
            episodeId,
            homeScore,
            lessonLearned,
            possessionPercentage,
            result,
            tedHalftimeSpeech,
            ticketRevenueGbp,
            turningPoints,
            weatherTempCelsius,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Match{id=$id, awayTeamId=$awayTeamId, date=$date, homeTeamId=$homeTeamId, matchType=$matchType, attendance=$attendance, awayScore=$awayScore, episodeId=$episodeId, homeScore=$homeScore, lessonLearned=$lessonLearned, possessionPercentage=$possessionPercentage, result=$result, tedHalftimeSpeech=$tedHalftimeSpeech, ticketRevenueGbp=$ticketRevenueGbp, turningPoints=$turningPoints, weatherTempCelsius=$weatherTempCelsius, additionalProperties=$additionalProperties}"
}
