// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

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

/** Full team model with ID. */
class Team
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cultureScore: JsonField<Long>,
    private val foundedYear: JsonField<Long>,
    private val league: JsonField<League>,
    private val name: JsonField<String>,
    private val stadium: JsonField<String>,
    private val values: JsonField<TeamValues>,
    private val annualBudgetGbp: JsonField<String>,
    private val averageAttendance: JsonField<Double>,
    private val contactEmail: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val nickname: JsonField<String>,
    private val primaryColor: JsonField<String>,
    private val rivalTeams: JsonField<List<String>>,
    private val secondaryColor: JsonField<String>,
    private val stadiumLocation: JsonField<GeoLocation>,
    private val website: JsonField<String>,
    private val winPercentage: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("culture_score")
        @ExcludeMissing
        cultureScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("founded_year")
        @ExcludeMissing
        foundedYear: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("league") @ExcludeMissing league: JsonField<League> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stadium") @ExcludeMissing stadium: JsonField<String> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<TeamValues> = JsonMissing.of(),
        @JsonProperty("annual_budget_gbp")
        @ExcludeMissing
        annualBudgetGbp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("average_attendance")
        @ExcludeMissing
        averageAttendance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("contact_email")
        @ExcludeMissing
        contactEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("nickname") @ExcludeMissing nickname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_color")
        @ExcludeMissing
        primaryColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rival_teams")
        @ExcludeMissing
        rivalTeams: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("secondary_color")
        @ExcludeMissing
        secondaryColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stadium_location")
        @ExcludeMissing
        stadiumLocation: JsonField<GeoLocation> = JsonMissing.of(),
        @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        @JsonProperty("win_percentage")
        @ExcludeMissing
        winPercentage: JsonField<Double> = JsonMissing.of(),
    ) : this(
        id,
        cultureScore,
        foundedYear,
        league,
        name,
        stadium,
        values,
        annualBudgetGbp,
        averageAttendance,
        contactEmail,
        isActive,
        nickname,
        primaryColor,
        rivalTeams,
        secondaryColor,
        stadiumLocation,
        website,
        winPercentage,
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
     * Team culture/morale score (0-100)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cultureScore(): Long = cultureScore.getRequired("culture_score")

    /**
     * Year the club was founded
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun foundedYear(): Long = foundedYear.getRequired("founded_year")

    /**
     * Current league
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun league(): League = league.getRequired("league")

    /**
     * Team name
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Home stadium name
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stadium(): String = stadium.getRequired("stadium")

    /**
     * Team's core values
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun values(): TeamValues = values.getRequired("values")

    /**
     * Annual budget in GBP
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun annualBudgetGbp(): Optional<String> = annualBudgetGbp.getOptional("annual_budget_gbp")

    /**
     * Average match attendance
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun averageAttendance(): Optional<Double> = averageAttendance.getOptional("average_attendance")

    /**
     * Team contact email
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactEmail(): Optional<String> = contactEmail.getOptional("contact_email")

    /**
     * Whether the team is currently active
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

    /**
     * Team nickname
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nickname(): Optional<String> = nickname.getOptional("nickname")

    /**
     * Primary team color (hex)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryColor(): Optional<String> = primaryColor.getOptional("primary_color")

    /**
     * List of rival team IDs
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rivalTeams(): Optional<List<String>> = rivalTeams.getOptional("rival_teams")

    /**
     * Secondary team color (hex)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryColor(): Optional<String> = secondaryColor.getOptional("secondary_color")

    /**
     * Geographic coordinates for a location.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stadiumLocation(): Optional<GeoLocation> = stadiumLocation.getOptional("stadium_location")

    /**
     * Official team website
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun website(): Optional<String> = website.getOptional("website")

    /**
     * Season win percentage
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun winPercentage(): Optional<Double> = winPercentage.getOptional("win_percentage")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cultureScore].
     *
     * Unlike [cultureScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("culture_score")
    @ExcludeMissing
    fun _cultureScore(): JsonField<Long> = cultureScore

    /**
     * Returns the raw JSON value of [foundedYear].
     *
     * Unlike [foundedYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("founded_year") @ExcludeMissing fun _foundedYear(): JsonField<Long> = foundedYear

    /**
     * Returns the raw JSON value of [league].
     *
     * Unlike [league], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("league") @ExcludeMissing fun _league(): JsonField<League> = league

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [stadium].
     *
     * Unlike [stadium], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stadium") @ExcludeMissing fun _stadium(): JsonField<String> = stadium

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<TeamValues> = values

    /**
     * Returns the raw JSON value of [annualBudgetGbp].
     *
     * Unlike [annualBudgetGbp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("annual_budget_gbp")
    @ExcludeMissing
    fun _annualBudgetGbp(): JsonField<String> = annualBudgetGbp

    /**
     * Returns the raw JSON value of [averageAttendance].
     *
     * Unlike [averageAttendance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("average_attendance")
    @ExcludeMissing
    fun _averageAttendance(): JsonField<Double> = averageAttendance

    /**
     * Returns the raw JSON value of [contactEmail].
     *
     * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_email")
    @ExcludeMissing
    fun _contactEmail(): JsonField<String> = contactEmail

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [nickname].
     *
     * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

    /**
     * Returns the raw JSON value of [primaryColor].
     *
     * Unlike [primaryColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_color")
    @ExcludeMissing
    fun _primaryColor(): JsonField<String> = primaryColor

    /**
     * Returns the raw JSON value of [rivalTeams].
     *
     * Unlike [rivalTeams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rival_teams")
    @ExcludeMissing
    fun _rivalTeams(): JsonField<List<String>> = rivalTeams

    /**
     * Returns the raw JSON value of [secondaryColor].
     *
     * Unlike [secondaryColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondary_color")
    @ExcludeMissing
    fun _secondaryColor(): JsonField<String> = secondaryColor

    /**
     * Returns the raw JSON value of [stadiumLocation].
     *
     * Unlike [stadiumLocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stadium_location")
    @ExcludeMissing
    fun _stadiumLocation(): JsonField<GeoLocation> = stadiumLocation

    /**
     * Returns the raw JSON value of [website].
     *
     * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

    /**
     * Returns the raw JSON value of [winPercentage].
     *
     * Unlike [winPercentage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("win_percentage")
    @ExcludeMissing
    fun _winPercentage(): JsonField<Double> = winPercentage

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
         * Returns a mutable builder for constructing an instance of [Team].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cultureScore()
         * .foundedYear()
         * .league()
         * .name()
         * .stadium()
         * .values()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Team]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cultureScore: JsonField<Long>? = null
        private var foundedYear: JsonField<Long>? = null
        private var league: JsonField<League>? = null
        private var name: JsonField<String>? = null
        private var stadium: JsonField<String>? = null
        private var values: JsonField<TeamValues>? = null
        private var annualBudgetGbp: JsonField<String> = JsonMissing.of()
        private var averageAttendance: JsonField<Double> = JsonMissing.of()
        private var contactEmail: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var nickname: JsonField<String> = JsonMissing.of()
        private var primaryColor: JsonField<String> = JsonMissing.of()
        private var rivalTeams: JsonField<MutableList<String>>? = null
        private var secondaryColor: JsonField<String> = JsonMissing.of()
        private var stadiumLocation: JsonField<GeoLocation> = JsonMissing.of()
        private var website: JsonField<String> = JsonMissing.of()
        private var winPercentage: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(team: Team) = apply {
            id = team.id
            cultureScore = team.cultureScore
            foundedYear = team.foundedYear
            league = team.league
            name = team.name
            stadium = team.stadium
            values = team.values
            annualBudgetGbp = team.annualBudgetGbp
            averageAttendance = team.averageAttendance
            contactEmail = team.contactEmail
            isActive = team.isActive
            nickname = team.nickname
            primaryColor = team.primaryColor
            rivalTeams = team.rivalTeams.map { it.toMutableList() }
            secondaryColor = team.secondaryColor
            stadiumLocation = team.stadiumLocation
            website = team.website
            winPercentage = team.winPercentage
            additionalProperties = team.additionalProperties.toMutableMap()
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

        /** Team culture/morale score (0-100) */
        fun cultureScore(cultureScore: Long) = cultureScore(JsonField.of(cultureScore))

        /**
         * Sets [Builder.cultureScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cultureScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cultureScore(cultureScore: JsonField<Long>) = apply { this.cultureScore = cultureScore }

        /** Year the club was founded */
        fun foundedYear(foundedYear: Long) = foundedYear(JsonField.of(foundedYear))

        /**
         * Sets [Builder.foundedYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foundedYear] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun foundedYear(foundedYear: JsonField<Long>) = apply { this.foundedYear = foundedYear }

        /** Current league */
        fun league(league: League) = league(JsonField.of(league))

        /**
         * Sets [Builder.league] to an arbitrary JSON value.
         *
         * You should usually call [Builder.league] with a well-typed [League] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun league(league: JsonField<League>) = apply { this.league = league }

        /** Team name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Home stadium name */
        fun stadium(stadium: String) = stadium(JsonField.of(stadium))

        /**
         * Sets [Builder.stadium] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stadium] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stadium(stadium: JsonField<String>) = apply { this.stadium = stadium }

        /** Team's core values */
        fun values(values: TeamValues) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed [TeamValues] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun values(values: JsonField<TeamValues>) = apply { this.values = values }

        /** Annual budget in GBP */
        fun annualBudgetGbp(annualBudgetGbp: String?) =
            annualBudgetGbp(JsonField.ofNullable(annualBudgetGbp))

        /** Alias for calling [Builder.annualBudgetGbp] with `annualBudgetGbp.orElse(null)`. */
        fun annualBudgetGbp(annualBudgetGbp: Optional<String>) =
            annualBudgetGbp(annualBudgetGbp.getOrNull())

        /**
         * Sets [Builder.annualBudgetGbp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annualBudgetGbp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun annualBudgetGbp(annualBudgetGbp: JsonField<String>) = apply {
            this.annualBudgetGbp = annualBudgetGbp
        }

        /** Average match attendance */
        fun averageAttendance(averageAttendance: Double?) =
            averageAttendance(JsonField.ofNullable(averageAttendance))

        /**
         * Alias for [Builder.averageAttendance].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun averageAttendance(averageAttendance: Double) =
            averageAttendance(averageAttendance as Double?)

        /** Alias for calling [Builder.averageAttendance] with `averageAttendance.orElse(null)`. */
        fun averageAttendance(averageAttendance: Optional<Double>) =
            averageAttendance(averageAttendance.getOrNull())

        /**
         * Sets [Builder.averageAttendance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.averageAttendance] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun averageAttendance(averageAttendance: JsonField<Double>) = apply {
            this.averageAttendance = averageAttendance
        }

        /** Team contact email */
        fun contactEmail(contactEmail: String?) = contactEmail(JsonField.ofNullable(contactEmail))

        /** Alias for calling [Builder.contactEmail] with `contactEmail.orElse(null)`. */
        fun contactEmail(contactEmail: Optional<String>) = contactEmail(contactEmail.getOrNull())

        /**
         * Sets [Builder.contactEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactEmail(contactEmail: JsonField<String>) = apply {
            this.contactEmail = contactEmail
        }

        /** Whether the team is currently active */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** Team nickname */
        fun nickname(nickname: String?) = nickname(JsonField.ofNullable(nickname))

        /** Alias for calling [Builder.nickname] with `nickname.orElse(null)`. */
        fun nickname(nickname: Optional<String>) = nickname(nickname.getOrNull())

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        /** Primary team color (hex) */
        fun primaryColor(primaryColor: String?) = primaryColor(JsonField.ofNullable(primaryColor))

        /** Alias for calling [Builder.primaryColor] with `primaryColor.orElse(null)`. */
        fun primaryColor(primaryColor: Optional<String>) = primaryColor(primaryColor.getOrNull())

        /**
         * Sets [Builder.primaryColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryColor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryColor(primaryColor: JsonField<String>) = apply {
            this.primaryColor = primaryColor
        }

        /** List of rival team IDs */
        fun rivalTeams(rivalTeams: List<String>) = rivalTeams(JsonField.of(rivalTeams))

        /**
         * Sets [Builder.rivalTeams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rivalTeams] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rivalTeams(rivalTeams: JsonField<List<String>>) = apply {
            this.rivalTeams = rivalTeams.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [rivalTeams].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRivalTeam(rivalTeam: String) = apply {
            rivalTeams =
                (rivalTeams ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rivalTeams", it).add(rivalTeam)
                }
        }

        /** Secondary team color (hex) */
        fun secondaryColor(secondaryColor: String?) =
            secondaryColor(JsonField.ofNullable(secondaryColor))

        /** Alias for calling [Builder.secondaryColor] with `secondaryColor.orElse(null)`. */
        fun secondaryColor(secondaryColor: Optional<String>) =
            secondaryColor(secondaryColor.getOrNull())

        /**
         * Sets [Builder.secondaryColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryColor(secondaryColor: JsonField<String>) = apply {
            this.secondaryColor = secondaryColor
        }

        /** Geographic coordinates for a location. */
        fun stadiumLocation(stadiumLocation: GeoLocation?) =
            stadiumLocation(JsonField.ofNullable(stadiumLocation))

        /** Alias for calling [Builder.stadiumLocation] with `stadiumLocation.orElse(null)`. */
        fun stadiumLocation(stadiumLocation: Optional<GeoLocation>) =
            stadiumLocation(stadiumLocation.getOrNull())

        /**
         * Sets [Builder.stadiumLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stadiumLocation] with a well-typed [GeoLocation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stadiumLocation(stadiumLocation: JsonField<GeoLocation>) = apply {
            this.stadiumLocation = stadiumLocation
        }

        /** Official team website */
        fun website(website: String?) = website(JsonField.ofNullable(website))

        /** Alias for calling [Builder.website] with `website.orElse(null)`. */
        fun website(website: Optional<String>) = website(website.getOrNull())

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun website(website: JsonField<String>) = apply { this.website = website }

        /** Season win percentage */
        fun winPercentage(winPercentage: Double?) =
            winPercentage(JsonField.ofNullable(winPercentage))

        /**
         * Alias for [Builder.winPercentage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun winPercentage(winPercentage: Double) = winPercentage(winPercentage as Double?)

        /** Alias for calling [Builder.winPercentage] with `winPercentage.orElse(null)`. */
        fun winPercentage(winPercentage: Optional<Double>) =
            winPercentage(winPercentage.getOrNull())

        /**
         * Sets [Builder.winPercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.winPercentage] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun winPercentage(winPercentage: JsonField<Double>) = apply {
            this.winPercentage = winPercentage
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
         * Returns an immutable instance of [Team].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cultureScore()
         * .foundedYear()
         * .league()
         * .name()
         * .stadium()
         * .values()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Team =
            Team(
                checkRequired("id", id),
                checkRequired("cultureScore", cultureScore),
                checkRequired("foundedYear", foundedYear),
                checkRequired("league", league),
                checkRequired("name", name),
                checkRequired("stadium", stadium),
                checkRequired("values", values),
                annualBudgetGbp,
                averageAttendance,
                contactEmail,
                isActive,
                nickname,
                primaryColor,
                (rivalTeams ?: JsonMissing.of()).map { it.toImmutable() },
                secondaryColor,
                stadiumLocation,
                website,
                winPercentage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Team = apply {
        if (validated) {
            return@apply
        }

        id()
        cultureScore()
        foundedYear()
        league().validate()
        name()
        stadium()
        values().validate()
        annualBudgetGbp()
        averageAttendance()
        contactEmail()
        isActive()
        nickname()
        primaryColor()
        rivalTeams()
        secondaryColor()
        stadiumLocation().ifPresent { it.validate() }
        website()
        winPercentage()
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
            (if (cultureScore.asKnown().isPresent) 1 else 0) +
            (if (foundedYear.asKnown().isPresent) 1 else 0) +
            (league.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (stadium.asKnown().isPresent) 1 else 0) +
            (values.asKnown().getOrNull()?.validity() ?: 0) +
            (if (annualBudgetGbp.asKnown().isPresent) 1 else 0) +
            (if (averageAttendance.asKnown().isPresent) 1 else 0) +
            (if (contactEmail.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (nickname.asKnown().isPresent) 1 else 0) +
            (if (primaryColor.asKnown().isPresent) 1 else 0) +
            (rivalTeams.asKnown().getOrNull()?.size ?: 0) +
            (if (secondaryColor.asKnown().isPresent) 1 else 0) +
            (stadiumLocation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (website.asKnown().isPresent) 1 else 0) +
            (if (winPercentage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Team &&
            id == other.id &&
            cultureScore == other.cultureScore &&
            foundedYear == other.foundedYear &&
            league == other.league &&
            name == other.name &&
            stadium == other.stadium &&
            values == other.values &&
            annualBudgetGbp == other.annualBudgetGbp &&
            averageAttendance == other.averageAttendance &&
            contactEmail == other.contactEmail &&
            isActive == other.isActive &&
            nickname == other.nickname &&
            primaryColor == other.primaryColor &&
            rivalTeams == other.rivalTeams &&
            secondaryColor == other.secondaryColor &&
            stadiumLocation == other.stadiumLocation &&
            website == other.website &&
            winPercentage == other.winPercentage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cultureScore,
            foundedYear,
            league,
            name,
            stadium,
            values,
            annualBudgetGbp,
            averageAttendance,
            contactEmail,
            isActive,
            nickname,
            primaryColor,
            rivalTeams,
            secondaryColor,
            stadiumLocation,
            website,
            winPercentage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Team{id=$id, cultureScore=$cultureScore, foundedYear=$foundedYear, league=$league, name=$name, stadium=$stadium, values=$values, annualBudgetGbp=$annualBudgetGbp, averageAttendance=$averageAttendance, contactEmail=$contactEmail, isActive=$isActive, nickname=$nickname, primaryColor=$primaryColor, rivalTeams=$rivalTeams, secondaryColor=$secondaryColor, stadiumLocation=$stadiumLocation, website=$website, winPercentage=$winPercentage, additionalProperties=$additionalProperties}"
}
