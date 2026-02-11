// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.BaseDeserializer
import com.believe.api.core.BaseSerializer
import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.allMaxBy
import com.believe.api.core.checkKnown
import com.believe.api.core.getOrThrow
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import com.believe.api.core.toImmutable
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update specific fields of an existing team. */
class TeamUpdateParams
private constructor(
    private val teamId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun teamId(): Optional<String> = Optional.ofNullable(teamId)

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun annualBudgetGbp(): Optional<AnnualBudgetGbp> = body.annualBudgetGbp()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun averageAttendance(): Optional<Double> = body.averageAttendance()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactEmail(): Optional<String> = body.contactEmail()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cultureScore(): Optional<Long> = body.cultureScore()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foundedYear(): Optional<Long> = body.foundedYear()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = body.isActive()

    /**
     * Football leagues.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun league(): Optional<League> = body.league()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nickname(): Optional<String> = body.nickname()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryColor(): Optional<String> = body.primaryColor()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rivalTeams(): Optional<List<String>> = body.rivalTeams()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryColor(): Optional<String> = body.secondaryColor()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stadium(): Optional<String> = body.stadium()

    /**
     * Geographic coordinates for a location.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stadiumLocation(): Optional<GeoLocation> = body.stadiumLocation()

    /**
     * Core values that define a team's culture.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun values(): Optional<TeamValues> = body.values()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun website(): Optional<String> = body.website()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun winPercentage(): Optional<Double> = body.winPercentage()

    /**
     * Returns the raw JSON value of [annualBudgetGbp].
     *
     * Unlike [annualBudgetGbp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _annualBudgetGbp(): JsonField<AnnualBudgetGbp> = body._annualBudgetGbp()

    /**
     * Returns the raw JSON value of [averageAttendance].
     *
     * Unlike [averageAttendance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _averageAttendance(): JsonField<Double> = body._averageAttendance()

    /**
     * Returns the raw JSON value of [contactEmail].
     *
     * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactEmail(): JsonField<String> = body._contactEmail()

    /**
     * Returns the raw JSON value of [cultureScore].
     *
     * Unlike [cultureScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cultureScore(): JsonField<Long> = body._cultureScore()

    /**
     * Returns the raw JSON value of [foundedYear].
     *
     * Unlike [foundedYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _foundedYear(): JsonField<Long> = body._foundedYear()

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /**
     * Returns the raw JSON value of [league].
     *
     * Unlike [league], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _league(): JsonField<League> = body._league()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [nickname].
     *
     * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nickname(): JsonField<String> = body._nickname()

    /**
     * Returns the raw JSON value of [primaryColor].
     *
     * Unlike [primaryColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primaryColor(): JsonField<String> = body._primaryColor()

    /**
     * Returns the raw JSON value of [rivalTeams].
     *
     * Unlike [rivalTeams], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rivalTeams(): JsonField<List<String>> = body._rivalTeams()

    /**
     * Returns the raw JSON value of [secondaryColor].
     *
     * Unlike [secondaryColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _secondaryColor(): JsonField<String> = body._secondaryColor()

    /**
     * Returns the raw JSON value of [stadium].
     *
     * Unlike [stadium], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stadium(): JsonField<String> = body._stadium()

    /**
     * Returns the raw JSON value of [stadiumLocation].
     *
     * Unlike [stadiumLocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stadiumLocation(): JsonField<GeoLocation> = body._stadiumLocation()

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _values(): JsonField<TeamValues> = body._values()

    /**
     * Returns the raw JSON value of [website].
     *
     * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _website(): JsonField<String> = body._website()

    /**
     * Returns the raw JSON value of [winPercentage].
     *
     * Unlike [winPercentage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _winPercentage(): JsonField<Double> = body._winPercentage()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TeamUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TeamUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TeamUpdateParams]. */
    class Builder internal constructor() {

        private var teamId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(teamUpdateParams: TeamUpdateParams) = apply {
            teamId = teamUpdateParams.teamId
            body = teamUpdateParams.body.toBuilder()
            additionalHeaders = teamUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamUpdateParams.additionalQueryParams.toBuilder()
        }

        fun teamId(teamId: String?) = apply { this.teamId = teamId }

        /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
        fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [annualBudgetGbp]
         * - [averageAttendance]
         * - [contactEmail]
         * - [cultureScore]
         * - [foundedYear]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun annualBudgetGbp(annualBudgetGbp: AnnualBudgetGbp?) = apply {
            body.annualBudgetGbp(annualBudgetGbp)
        }

        /** Alias for calling [Builder.annualBudgetGbp] with `annualBudgetGbp.orElse(null)`. */
        fun annualBudgetGbp(annualBudgetGbp: Optional<AnnualBudgetGbp>) =
            annualBudgetGbp(annualBudgetGbp.getOrNull())

        /**
         * Sets [Builder.annualBudgetGbp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annualBudgetGbp] with a well-typed [AnnualBudgetGbp]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun annualBudgetGbp(annualBudgetGbp: JsonField<AnnualBudgetGbp>) = apply {
            body.annualBudgetGbp(annualBudgetGbp)
        }

        /** Alias for calling [annualBudgetGbp] with `AnnualBudgetGbp.ofNumber(number)`. */
        fun annualBudgetGbp(number: Double) = apply { body.annualBudgetGbp(number) }

        /** Alias for calling [annualBudgetGbp] with `AnnualBudgetGbp.ofString(string)`. */
        fun annualBudgetGbp(string: String) = apply { body.annualBudgetGbp(string) }

        fun averageAttendance(averageAttendance: Double?) = apply {
            body.averageAttendance(averageAttendance)
        }

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
            body.averageAttendance(averageAttendance)
        }

        fun contactEmail(contactEmail: String?) = apply { body.contactEmail(contactEmail) }

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
            body.contactEmail(contactEmail)
        }

        fun cultureScore(cultureScore: Long?) = apply { body.cultureScore(cultureScore) }

        /**
         * Alias for [Builder.cultureScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun cultureScore(cultureScore: Long) = cultureScore(cultureScore as Long?)

        /** Alias for calling [Builder.cultureScore] with `cultureScore.orElse(null)`. */
        fun cultureScore(cultureScore: Optional<Long>) = cultureScore(cultureScore.getOrNull())

        /**
         * Sets [Builder.cultureScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cultureScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cultureScore(cultureScore: JsonField<Long>) = apply { body.cultureScore(cultureScore) }

        fun foundedYear(foundedYear: Long?) = apply { body.foundedYear(foundedYear) }

        /**
         * Alias for [Builder.foundedYear].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun foundedYear(foundedYear: Long) = foundedYear(foundedYear as Long?)

        /** Alias for calling [Builder.foundedYear] with `foundedYear.orElse(null)`. */
        fun foundedYear(foundedYear: Optional<Long>) = foundedYear(foundedYear.getOrNull())

        /**
         * Sets [Builder.foundedYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foundedYear] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun foundedYear(foundedYear: JsonField<Long>) = apply { body.foundedYear(foundedYear) }

        fun isActive(isActive: Boolean?) = apply { body.isActive(isActive) }

        /**
         * Alias for [Builder.isActive].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

        /** Alias for calling [Builder.isActive] with `isActive.orElse(null)`. */
        fun isActive(isActive: Optional<Boolean>) = isActive(isActive.getOrNull())

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { body.isActive(isActive) }

        /** Football leagues. */
        fun league(league: League?) = apply { body.league(league) }

        /** Alias for calling [Builder.league] with `league.orElse(null)`. */
        fun league(league: Optional<League>) = league(league.getOrNull())

        /**
         * Sets [Builder.league] to an arbitrary JSON value.
         *
         * You should usually call [Builder.league] with a well-typed [League] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun league(league: JsonField<League>) = apply { body.league(league) }

        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun nickname(nickname: String?) = apply { body.nickname(nickname) }

        /** Alias for calling [Builder.nickname] with `nickname.orElse(null)`. */
        fun nickname(nickname: Optional<String>) = nickname(nickname.getOrNull())

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { body.nickname(nickname) }

        fun primaryColor(primaryColor: String?) = apply { body.primaryColor(primaryColor) }

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
            body.primaryColor(primaryColor)
        }

        fun rivalTeams(rivalTeams: List<String>?) = apply { body.rivalTeams(rivalTeams) }

        /** Alias for calling [Builder.rivalTeams] with `rivalTeams.orElse(null)`. */
        fun rivalTeams(rivalTeams: Optional<List<String>>) = rivalTeams(rivalTeams.getOrNull())

        /**
         * Sets [Builder.rivalTeams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rivalTeams] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rivalTeams(rivalTeams: JsonField<List<String>>) = apply { body.rivalTeams(rivalTeams) }

        /**
         * Adds a single [String] to [rivalTeams].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRivalTeam(rivalTeam: String) = apply { body.addRivalTeam(rivalTeam) }

        fun secondaryColor(secondaryColor: String?) = apply { body.secondaryColor(secondaryColor) }

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
            body.secondaryColor(secondaryColor)
        }

        fun stadium(stadium: String?) = apply { body.stadium(stadium) }

        /** Alias for calling [Builder.stadium] with `stadium.orElse(null)`. */
        fun stadium(stadium: Optional<String>) = stadium(stadium.getOrNull())

        /**
         * Sets [Builder.stadium] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stadium] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stadium(stadium: JsonField<String>) = apply { body.stadium(stadium) }

        /** Geographic coordinates for a location. */
        fun stadiumLocation(stadiumLocation: GeoLocation?) = apply {
            body.stadiumLocation(stadiumLocation)
        }

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
            body.stadiumLocation(stadiumLocation)
        }

        /** Core values that define a team's culture. */
        fun values(values: TeamValues?) = apply { body.values(values) }

        /** Alias for calling [Builder.values] with `values.orElse(null)`. */
        fun values(values: Optional<TeamValues>) = values(values.getOrNull())

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed [TeamValues] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun values(values: JsonField<TeamValues>) = apply { body.values(values) }

        fun website(website: String?) = apply { body.website(website) }

        /** Alias for calling [Builder.website] with `website.orElse(null)`. */
        fun website(website: Optional<String>) = website(website.getOrNull())

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun website(website: JsonField<String>) = apply { body.website(website) }

        fun winPercentage(winPercentage: Double?) = apply { body.winPercentage(winPercentage) }

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
            body.winPercentage(winPercentage)
        }

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
         * Returns an immutable instance of [TeamUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TeamUpdateParams =
            TeamUpdateParams(
                teamId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> teamId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Model for updating a team (all fields optional). */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val annualBudgetGbp: JsonField<AnnualBudgetGbp>,
        private val averageAttendance: JsonField<Double>,
        private val contactEmail: JsonField<String>,
        private val cultureScore: JsonField<Long>,
        private val foundedYear: JsonField<Long>,
        private val isActive: JsonField<Boolean>,
        private val league: JsonField<League>,
        private val name: JsonField<String>,
        private val nickname: JsonField<String>,
        private val primaryColor: JsonField<String>,
        private val rivalTeams: JsonField<List<String>>,
        private val secondaryColor: JsonField<String>,
        private val stadium: JsonField<String>,
        private val stadiumLocation: JsonField<GeoLocation>,
        private val values: JsonField<TeamValues>,
        private val website: JsonField<String>,
        private val winPercentage: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("annual_budget_gbp")
            @ExcludeMissing
            annualBudgetGbp: JsonField<AnnualBudgetGbp> = JsonMissing.of(),
            @JsonProperty("average_attendance")
            @ExcludeMissing
            averageAttendance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("contact_email")
            @ExcludeMissing
            contactEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("culture_score")
            @ExcludeMissing
            cultureScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("founded_year")
            @ExcludeMissing
            foundedYear: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("league") @ExcludeMissing league: JsonField<League> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nickname")
            @ExcludeMissing
            nickname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_color")
            @ExcludeMissing
            primaryColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rival_teams")
            @ExcludeMissing
            rivalTeams: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("secondary_color")
            @ExcludeMissing
            secondaryColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stadium") @ExcludeMissing stadium: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stadium_location")
            @ExcludeMissing
            stadiumLocation: JsonField<GeoLocation> = JsonMissing.of(),
            @JsonProperty("values")
            @ExcludeMissing
            values: JsonField<TeamValues> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
            @JsonProperty("win_percentage")
            @ExcludeMissing
            winPercentage: JsonField<Double> = JsonMissing.of(),
        ) : this(
            annualBudgetGbp,
            averageAttendance,
            contactEmail,
            cultureScore,
            foundedYear,
            isActive,
            league,
            name,
            nickname,
            primaryColor,
            rivalTeams,
            secondaryColor,
            stadium,
            stadiumLocation,
            values,
            website,
            winPercentage,
            mutableMapOf(),
        )

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun annualBudgetGbp(): Optional<AnnualBudgetGbp> =
            annualBudgetGbp.getOptional("annual_budget_gbp")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun averageAttendance(): Optional<Double> =
            averageAttendance.getOptional("average_attendance")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contactEmail(): Optional<String> = contactEmail.getOptional("contact_email")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cultureScore(): Optional<Long> = cultureScore.getOptional("culture_score")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun foundedYear(): Optional<Long> = foundedYear.getOptional("founded_year")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

        /**
         * Football leagues.
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun league(): Optional<League> = league.getOptional("league")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nickname(): Optional<String> = nickname.getOptional("nickname")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryColor(): Optional<String> = primaryColor.getOptional("primary_color")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rivalTeams(): Optional<List<String>> = rivalTeams.getOptional("rival_teams")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryColor(): Optional<String> = secondaryColor.getOptional("secondary_color")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stadium(): Optional<String> = stadium.getOptional("stadium")

        /**
         * Geographic coordinates for a location.
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stadiumLocation(): Optional<GeoLocation> =
            stadiumLocation.getOptional("stadium_location")

        /**
         * Core values that define a team's culture.
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun values(): Optional<TeamValues> = values.getOptional("values")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun website(): Optional<String> = website.getOptional("website")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun winPercentage(): Optional<Double> = winPercentage.getOptional("win_percentage")

        /**
         * Returns the raw JSON value of [annualBudgetGbp].
         *
         * Unlike [annualBudgetGbp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("annual_budget_gbp")
        @ExcludeMissing
        fun _annualBudgetGbp(): JsonField<AnnualBudgetGbp> = annualBudgetGbp

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
         * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_email")
        @ExcludeMissing
        fun _contactEmail(): JsonField<String> = contactEmail

        /**
         * Returns the raw JSON value of [cultureScore].
         *
         * Unlike [cultureScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("culture_score")
        @ExcludeMissing
        fun _cultureScore(): JsonField<Long> = cultureScore

        /**
         * Returns the raw JSON value of [foundedYear].
         *
         * Unlike [foundedYear], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("founded_year")
        @ExcludeMissing
        fun _foundedYear(): JsonField<Long> = foundedYear

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

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
         * Returns the raw JSON value of [nickname].
         *
         * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

        /**
         * Returns the raw JSON value of [primaryColor].
         *
         * Unlike [primaryColor], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [secondaryColor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondary_color")
        @ExcludeMissing
        fun _secondaryColor(): JsonField<String> = secondaryColor

        /**
         * Returns the raw JSON value of [stadium].
         *
         * Unlike [stadium], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stadium") @ExcludeMissing fun _stadium(): JsonField<String> = stadium

        /**
         * Returns the raw JSON value of [stadiumLocation].
         *
         * Unlike [stadiumLocation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stadium_location")
        @ExcludeMissing
        fun _stadiumLocation(): JsonField<GeoLocation> = stadiumLocation

        /**
         * Returns the raw JSON value of [values].
         *
         * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<TeamValues> = values

        /**
         * Returns the raw JSON value of [website].
         *
         * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

        /**
         * Returns the raw JSON value of [winPercentage].
         *
         * Unlike [winPercentage], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var annualBudgetGbp: JsonField<AnnualBudgetGbp> = JsonMissing.of()
            private var averageAttendance: JsonField<Double> = JsonMissing.of()
            private var contactEmail: JsonField<String> = JsonMissing.of()
            private var cultureScore: JsonField<Long> = JsonMissing.of()
            private var foundedYear: JsonField<Long> = JsonMissing.of()
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var league: JsonField<League> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var nickname: JsonField<String> = JsonMissing.of()
            private var primaryColor: JsonField<String> = JsonMissing.of()
            private var rivalTeams: JsonField<MutableList<String>>? = null
            private var secondaryColor: JsonField<String> = JsonMissing.of()
            private var stadium: JsonField<String> = JsonMissing.of()
            private var stadiumLocation: JsonField<GeoLocation> = JsonMissing.of()
            private var values: JsonField<TeamValues> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var winPercentage: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                annualBudgetGbp = body.annualBudgetGbp
                averageAttendance = body.averageAttendance
                contactEmail = body.contactEmail
                cultureScore = body.cultureScore
                foundedYear = body.foundedYear
                isActive = body.isActive
                league = body.league
                name = body.name
                nickname = body.nickname
                primaryColor = body.primaryColor
                rivalTeams = body.rivalTeams.map { it.toMutableList() }
                secondaryColor = body.secondaryColor
                stadium = body.stadium
                stadiumLocation = body.stadiumLocation
                values = body.values
                website = body.website
                winPercentage = body.winPercentage
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun annualBudgetGbp(annualBudgetGbp: AnnualBudgetGbp?) =
                annualBudgetGbp(JsonField.ofNullable(annualBudgetGbp))

            /** Alias for calling [Builder.annualBudgetGbp] with `annualBudgetGbp.orElse(null)`. */
            fun annualBudgetGbp(annualBudgetGbp: Optional<AnnualBudgetGbp>) =
                annualBudgetGbp(annualBudgetGbp.getOrNull())

            /**
             * Sets [Builder.annualBudgetGbp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.annualBudgetGbp] with a well-typed [AnnualBudgetGbp]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun annualBudgetGbp(annualBudgetGbp: JsonField<AnnualBudgetGbp>) = apply {
                this.annualBudgetGbp = annualBudgetGbp
            }

            /** Alias for calling [annualBudgetGbp] with `AnnualBudgetGbp.ofNumber(number)`. */
            fun annualBudgetGbp(number: Double) = annualBudgetGbp(AnnualBudgetGbp.ofNumber(number))

            /** Alias for calling [annualBudgetGbp] with `AnnualBudgetGbp.ofString(string)`. */
            fun annualBudgetGbp(string: String) = annualBudgetGbp(AnnualBudgetGbp.ofString(string))

            fun averageAttendance(averageAttendance: Double?) =
                averageAttendance(JsonField.ofNullable(averageAttendance))

            /**
             * Alias for [Builder.averageAttendance].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun averageAttendance(averageAttendance: Double) =
                averageAttendance(averageAttendance as Double?)

            /**
             * Alias for calling [Builder.averageAttendance] with `averageAttendance.orElse(null)`.
             */
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

            fun contactEmail(contactEmail: String?) =
                contactEmail(JsonField.ofNullable(contactEmail))

            /** Alias for calling [Builder.contactEmail] with `contactEmail.orElse(null)`. */
            fun contactEmail(contactEmail: Optional<String>) =
                contactEmail(contactEmail.getOrNull())

            /**
             * Sets [Builder.contactEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactEmail(contactEmail: JsonField<String>) = apply {
                this.contactEmail = contactEmail
            }

            fun cultureScore(cultureScore: Long?) = cultureScore(JsonField.ofNullable(cultureScore))

            /**
             * Alias for [Builder.cultureScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cultureScore(cultureScore: Long) = cultureScore(cultureScore as Long?)

            /** Alias for calling [Builder.cultureScore] with `cultureScore.orElse(null)`. */
            fun cultureScore(cultureScore: Optional<Long>) = cultureScore(cultureScore.getOrNull())

            /**
             * Sets [Builder.cultureScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cultureScore] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cultureScore(cultureScore: JsonField<Long>) = apply {
                this.cultureScore = cultureScore
            }

            fun foundedYear(foundedYear: Long?) = foundedYear(JsonField.ofNullable(foundedYear))

            /**
             * Alias for [Builder.foundedYear].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun foundedYear(foundedYear: Long) = foundedYear(foundedYear as Long?)

            /** Alias for calling [Builder.foundedYear] with `foundedYear.orElse(null)`. */
            fun foundedYear(foundedYear: Optional<Long>) = foundedYear(foundedYear.getOrNull())

            /**
             * Sets [Builder.foundedYear] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foundedYear] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun foundedYear(foundedYear: JsonField<Long>) = apply { this.foundedYear = foundedYear }

            fun isActive(isActive: Boolean?) = isActive(JsonField.ofNullable(isActive))

            /**
             * Alias for [Builder.isActive].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

            /** Alias for calling [Builder.isActive] with `isActive.orElse(null)`. */
            fun isActive(isActive: Optional<Boolean>) = isActive(isActive.getOrNull())

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** Football leagues. */
            fun league(league: League?) = league(JsonField.ofNullable(league))

            /** Alias for calling [Builder.league] with `league.orElse(null)`. */
            fun league(league: Optional<League>) = league(league.getOrNull())

            /**
             * Sets [Builder.league] to an arbitrary JSON value.
             *
             * You should usually call [Builder.league] with a well-typed [League] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun league(league: JsonField<League>) = apply { this.league = league }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun nickname(nickname: String?) = nickname(JsonField.ofNullable(nickname))

            /** Alias for calling [Builder.nickname] with `nickname.orElse(null)`. */
            fun nickname(nickname: Optional<String>) = nickname(nickname.getOrNull())

            /**
             * Sets [Builder.nickname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nickname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

            fun primaryColor(primaryColor: String?) =
                primaryColor(JsonField.ofNullable(primaryColor))

            /** Alias for calling [Builder.primaryColor] with `primaryColor.orElse(null)`. */
            fun primaryColor(primaryColor: Optional<String>) =
                primaryColor(primaryColor.getOrNull())

            /**
             * Sets [Builder.primaryColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryColor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primaryColor(primaryColor: JsonField<String>) = apply {
                this.primaryColor = primaryColor
            }

            fun rivalTeams(rivalTeams: List<String>?) = rivalTeams(JsonField.ofNullable(rivalTeams))

            /** Alias for calling [Builder.rivalTeams] with `rivalTeams.orElse(null)`. */
            fun rivalTeams(rivalTeams: Optional<List<String>>) = rivalTeams(rivalTeams.getOrNull())

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

            fun stadium(stadium: String?) = stadium(JsonField.ofNullable(stadium))

            /** Alias for calling [Builder.stadium] with `stadium.orElse(null)`. */
            fun stadium(stadium: Optional<String>) = stadium(stadium.getOrNull())

            /**
             * Sets [Builder.stadium] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stadium] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stadium(stadium: JsonField<String>) = apply { this.stadium = stadium }

            /** Geographic coordinates for a location. */
            fun stadiumLocation(stadiumLocation: GeoLocation?) =
                stadiumLocation(JsonField.ofNullable(stadiumLocation))

            /** Alias for calling [Builder.stadiumLocation] with `stadiumLocation.orElse(null)`. */
            fun stadiumLocation(stadiumLocation: Optional<GeoLocation>) =
                stadiumLocation(stadiumLocation.getOrNull())

            /**
             * Sets [Builder.stadiumLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stadiumLocation] with a well-typed [GeoLocation]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun stadiumLocation(stadiumLocation: JsonField<GeoLocation>) = apply {
                this.stadiumLocation = stadiumLocation
            }

            /** Core values that define a team's culture. */
            fun values(values: TeamValues?) = values(JsonField.ofNullable(values))

            /** Alias for calling [Builder.values] with `values.orElse(null)`. */
            fun values(values: Optional<TeamValues>) = values(values.getOrNull())

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed [TeamValues] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun values(values: JsonField<TeamValues>) = apply { this.values = values }

            fun website(website: String?) = website(JsonField.ofNullable(website))

            /** Alias for calling [Builder.website] with `website.orElse(null)`. */
            fun website(website: Optional<String>) = website(website.getOrNull())

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

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
             * You should usually call [Builder.winPercentage] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    annualBudgetGbp,
                    averageAttendance,
                    contactEmail,
                    cultureScore,
                    foundedYear,
                    isActive,
                    league,
                    name,
                    nickname,
                    primaryColor,
                    (rivalTeams ?: JsonMissing.of()).map { it.toImmutable() },
                    secondaryColor,
                    stadium,
                    stadiumLocation,
                    values,
                    website,
                    winPercentage,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            annualBudgetGbp().ifPresent { it.validate() }
            averageAttendance()
            contactEmail()
            cultureScore()
            foundedYear()
            isActive()
            league().ifPresent { it.validate() }
            name()
            nickname()
            primaryColor()
            rivalTeams()
            secondaryColor()
            stadium()
            stadiumLocation().ifPresent { it.validate() }
            values().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (annualBudgetGbp.asKnown().getOrNull()?.validity() ?: 0) +
                (if (averageAttendance.asKnown().isPresent) 1 else 0) +
                (if (contactEmail.asKnown().isPresent) 1 else 0) +
                (if (cultureScore.asKnown().isPresent) 1 else 0) +
                (if (foundedYear.asKnown().isPresent) 1 else 0) +
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (league.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (nickname.asKnown().isPresent) 1 else 0) +
                (if (primaryColor.asKnown().isPresent) 1 else 0) +
                (rivalTeams.asKnown().getOrNull()?.size ?: 0) +
                (if (secondaryColor.asKnown().isPresent) 1 else 0) +
                (if (stadium.asKnown().isPresent) 1 else 0) +
                (stadiumLocation.asKnown().getOrNull()?.validity() ?: 0) +
                (values.asKnown().getOrNull()?.validity() ?: 0) +
                (if (website.asKnown().isPresent) 1 else 0) +
                (if (winPercentage.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                annualBudgetGbp == other.annualBudgetGbp &&
                averageAttendance == other.averageAttendance &&
                contactEmail == other.contactEmail &&
                cultureScore == other.cultureScore &&
                foundedYear == other.foundedYear &&
                isActive == other.isActive &&
                league == other.league &&
                name == other.name &&
                nickname == other.nickname &&
                primaryColor == other.primaryColor &&
                rivalTeams == other.rivalTeams &&
                secondaryColor == other.secondaryColor &&
                stadium == other.stadium &&
                stadiumLocation == other.stadiumLocation &&
                values == other.values &&
                website == other.website &&
                winPercentage == other.winPercentage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                annualBudgetGbp,
                averageAttendance,
                contactEmail,
                cultureScore,
                foundedYear,
                isActive,
                league,
                name,
                nickname,
                primaryColor,
                rivalTeams,
                secondaryColor,
                stadium,
                stadiumLocation,
                values,
                website,
                winPercentage,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{annualBudgetGbp=$annualBudgetGbp, averageAttendance=$averageAttendance, contactEmail=$contactEmail, cultureScore=$cultureScore, foundedYear=$foundedYear, isActive=$isActive, league=$league, name=$name, nickname=$nickname, primaryColor=$primaryColor, rivalTeams=$rivalTeams, secondaryColor=$secondaryColor, stadium=$stadium, stadiumLocation=$stadiumLocation, values=$values, website=$website, winPercentage=$winPercentage, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = AnnualBudgetGbp.Deserializer::class)
    @JsonSerialize(using = AnnualBudgetGbp.Serializer::class)
    class AnnualBudgetGbp
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): AnnualBudgetGbp = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AnnualBudgetGbp && number == other.number && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, string)

        override fun toString(): String =
            when {
                number != null -> "AnnualBudgetGbp{number=$number}"
                string != null -> "AnnualBudgetGbp{string=$string}"
                _json != null -> "AnnualBudgetGbp{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AnnualBudgetGbp")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = AnnualBudgetGbp(number = number)

            @JvmStatic fun ofString(string: String) = AnnualBudgetGbp(string = string)
        }

        /**
         * An interface that defines how to map each variant of [AnnualBudgetGbp] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [AnnualBudgetGbp] to a value of type [T].
             *
             * An instance of [AnnualBudgetGbp] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws BelieveInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BelieveInvalidDataException("Unknown AnnualBudgetGbp: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<AnnualBudgetGbp>(AnnualBudgetGbp::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AnnualBudgetGbp {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                AnnualBudgetGbp(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                AnnualBudgetGbp(number = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> AnnualBudgetGbp(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<AnnualBudgetGbp>(AnnualBudgetGbp::class) {

            override fun serialize(
                value: AnnualBudgetGbp,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AnnualBudgetGbp")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamUpdateParams &&
            teamId == other.teamId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(teamId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TeamUpdateParams{teamId=$teamId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
