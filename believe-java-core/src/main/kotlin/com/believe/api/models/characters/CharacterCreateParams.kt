// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import com.believe.api.core.BaseDeserializer
import com.believe.api.core.BaseSerializer
import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.allMaxBy
import com.believe.api.core.checkKnown
import com.believe.api.core.checkRequired
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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Add a new character to the Ted Lasso universe. */
class CharacterCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Character background and history
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun background(): String = body.background()

    /**
     * Emotional intelligence stats
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emotionalStats(): EmotionalStats = body.emotionalStats()

    /**
     * Character's full name
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Key personality traits
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun personalityTraits(): List<String> = body.personalityTraits()

    /**
     * Character's role
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun role(): CharacterRole = body.role()

    /**
     * Character's date of birth
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateOfBirth(): Optional<LocalDate> = body.dateOfBirth()

    /**
     * Character's email address
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = body.email()

    /**
     * Character development across seasons
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun growthArcs(): Optional<List<GrowthArc>> = body.growthArcs()

    /**
     * Height in meters
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun heightMeters(): Optional<Double> = body.heightMeters()

    /**
     * URL to character's profile image
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profileImageUrl(): Optional<String> = body.profileImageUrl()

    /**
     * Annual salary in GBP
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun salaryGbp(): Optional<SalaryGbp> = body.salaryGbp()

    /**
     * Memorable quotes from this character
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signatureQuotes(): Optional<List<String>> = body.signatureQuotes()

    /**
     * ID of the team they belong to
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamId(): Optional<String> = body.teamId()

    /**
     * Returns the raw JSON value of [background].
     *
     * Unlike [background], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _background(): JsonField<String> = body._background()

    /**
     * Returns the raw JSON value of [emotionalStats].
     *
     * Unlike [emotionalStats], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emotionalStats(): JsonField<EmotionalStats> = body._emotionalStats()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [personalityTraits].
     *
     * Unlike [personalityTraits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _personalityTraits(): JsonField<List<String>> = body._personalityTraits()

    /**
     * Returns the raw JSON value of [role].
     *
     * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _role(): JsonField<CharacterRole> = body._role()

    /**
     * Returns the raw JSON value of [dateOfBirth].
     *
     * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateOfBirth(): JsonField<LocalDate> = body._dateOfBirth()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [growthArcs].
     *
     * Unlike [growthArcs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _growthArcs(): JsonField<List<GrowthArc>> = body._growthArcs()

    /**
     * Returns the raw JSON value of [heightMeters].
     *
     * Unlike [heightMeters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _heightMeters(): JsonField<Double> = body._heightMeters()

    /**
     * Returns the raw JSON value of [profileImageUrl].
     *
     * Unlike [profileImageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _profileImageUrl(): JsonField<String> = body._profileImageUrl()

    /**
     * Returns the raw JSON value of [salaryGbp].
     *
     * Unlike [salaryGbp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _salaryGbp(): JsonField<SalaryGbp> = body._salaryGbp()

    /**
     * Returns the raw JSON value of [signatureQuotes].
     *
     * Unlike [signatureQuotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signatureQuotes(): JsonField<List<String>> = body._signatureQuotes()

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _teamId(): JsonField<String> = body._teamId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CharacterCreateParams].
         *
         * The following fields are required:
         * ```java
         * .background()
         * .emotionalStats()
         * .name()
         * .personalityTraits()
         * .role()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CharacterCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(characterCreateParams: CharacterCreateParams) = apply {
            body = characterCreateParams.body.toBuilder()
            additionalHeaders = characterCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = characterCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [background]
         * - [emotionalStats]
         * - [name]
         * - [personalityTraits]
         * - [role]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Character background and history */
        fun background(background: String) = apply { body.background(background) }

        /**
         * Sets [Builder.background] to an arbitrary JSON value.
         *
         * You should usually call [Builder.background] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun background(background: JsonField<String>) = apply { body.background(background) }

        /** Emotional intelligence stats */
        fun emotionalStats(emotionalStats: EmotionalStats) = apply {
            body.emotionalStats(emotionalStats)
        }

        /**
         * Sets [Builder.emotionalStats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emotionalStats] with a well-typed [EmotionalStats] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emotionalStats(emotionalStats: JsonField<EmotionalStats>) = apply {
            body.emotionalStats(emotionalStats)
        }

        /** Character's full name */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Key personality traits */
        fun personalityTraits(personalityTraits: List<String>) = apply {
            body.personalityTraits(personalityTraits)
        }

        /**
         * Sets [Builder.personalityTraits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personalityTraits] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun personalityTraits(personalityTraits: JsonField<List<String>>) = apply {
            body.personalityTraits(personalityTraits)
        }

        /**
         * Adds a single [String] to [personalityTraits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPersonalityTrait(personalityTrait: String) = apply {
            body.addPersonalityTrait(personalityTrait)
        }

        /** Character's role */
        fun role(role: CharacterRole) = apply { body.role(role) }

        /**
         * Sets [Builder.role] to an arbitrary JSON value.
         *
         * You should usually call [Builder.role] with a well-typed [CharacterRole] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun role(role: JsonField<CharacterRole>) = apply { body.role(role) }

        /** Character's date of birth */
        fun dateOfBirth(dateOfBirth: LocalDate?) = apply { body.dateOfBirth(dateOfBirth) }

        /** Alias for calling [Builder.dateOfBirth] with `dateOfBirth.orElse(null)`. */
        fun dateOfBirth(dateOfBirth: Optional<LocalDate>) = dateOfBirth(dateOfBirth.getOrNull())

        /**
         * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply { body.dateOfBirth(dateOfBirth) }

        /** Character's email address */
        fun email(email: String?) = apply { body.email(email) }

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** Character development across seasons */
        fun growthArcs(growthArcs: List<GrowthArc>) = apply { body.growthArcs(growthArcs) }

        /**
         * Sets [Builder.growthArcs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.growthArcs] with a well-typed `List<GrowthArc>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun growthArcs(growthArcs: JsonField<List<GrowthArc>>) = apply {
            body.growthArcs(growthArcs)
        }

        /**
         * Adds a single [GrowthArc] to [growthArcs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGrowthArc(growthArc: GrowthArc) = apply { body.addGrowthArc(growthArc) }

        /** Height in meters */
        fun heightMeters(heightMeters: Double?) = apply { body.heightMeters(heightMeters) }

        /**
         * Alias for [Builder.heightMeters].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun heightMeters(heightMeters: Double) = heightMeters(heightMeters as Double?)

        /** Alias for calling [Builder.heightMeters] with `heightMeters.orElse(null)`. */
        fun heightMeters(heightMeters: Optional<Double>) = heightMeters(heightMeters.getOrNull())

        /**
         * Sets [Builder.heightMeters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.heightMeters] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun heightMeters(heightMeters: JsonField<Double>) = apply {
            body.heightMeters(heightMeters)
        }

        /** URL to character's profile image */
        fun profileImageUrl(profileImageUrl: String?) = apply {
            body.profileImageUrl(profileImageUrl)
        }

        /** Alias for calling [Builder.profileImageUrl] with `profileImageUrl.orElse(null)`. */
        fun profileImageUrl(profileImageUrl: Optional<String>) =
            profileImageUrl(profileImageUrl.getOrNull())

        /**
         * Sets [Builder.profileImageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileImageUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun profileImageUrl(profileImageUrl: JsonField<String>) = apply {
            body.profileImageUrl(profileImageUrl)
        }

        /** Annual salary in GBP */
        fun salaryGbp(salaryGbp: SalaryGbp?) = apply { body.salaryGbp(salaryGbp) }

        /** Alias for calling [Builder.salaryGbp] with `salaryGbp.orElse(null)`. */
        fun salaryGbp(salaryGbp: Optional<SalaryGbp>) = salaryGbp(salaryGbp.getOrNull())

        /**
         * Sets [Builder.salaryGbp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.salaryGbp] with a well-typed [SalaryGbp] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun salaryGbp(salaryGbp: JsonField<SalaryGbp>) = apply { body.salaryGbp(salaryGbp) }

        /** Alias for calling [salaryGbp] with `SalaryGbp.ofNumber(number)`. */
        fun salaryGbp(number: Double) = apply { body.salaryGbp(number) }

        /** Alias for calling [salaryGbp] with `SalaryGbp.ofString(string)`. */
        fun salaryGbp(string: String) = apply { body.salaryGbp(string) }

        /** Memorable quotes from this character */
        fun signatureQuotes(signatureQuotes: List<String>) = apply {
            body.signatureQuotes(signatureQuotes)
        }

        /**
         * Sets [Builder.signatureQuotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signatureQuotes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signatureQuotes(signatureQuotes: JsonField<List<String>>) = apply {
            body.signatureQuotes(signatureQuotes)
        }

        /**
         * Adds a single [String] to [signatureQuotes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSignatureQuote(signatureQuote: String) = apply {
            body.addSignatureQuote(signatureQuote)
        }

        /** ID of the team they belong to */
        fun teamId(teamId: String?) = apply { body.teamId(teamId) }

        /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
        fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { body.teamId(teamId) }

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
         * Returns an immutable instance of [CharacterCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .background()
         * .emotionalStats()
         * .name()
         * .personalityTraits()
         * .role()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CharacterCreateParams =
            CharacterCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Model for creating a new character. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val background: JsonField<String>,
        private val emotionalStats: JsonField<EmotionalStats>,
        private val name: JsonField<String>,
        private val personalityTraits: JsonField<List<String>>,
        private val role: JsonField<CharacterRole>,
        private val dateOfBirth: JsonField<LocalDate>,
        private val email: JsonField<String>,
        private val growthArcs: JsonField<List<GrowthArc>>,
        private val heightMeters: JsonField<Double>,
        private val profileImageUrl: JsonField<String>,
        private val salaryGbp: JsonField<SalaryGbp>,
        private val signatureQuotes: JsonField<List<String>>,
        private val teamId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("background")
            @ExcludeMissing
            background: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emotional_stats")
            @ExcludeMissing
            emotionalStats: JsonField<EmotionalStats> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("personality_traits")
            @ExcludeMissing
            personalityTraits: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<CharacterRole> = JsonMissing.of(),
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("growth_arcs")
            @ExcludeMissing
            growthArcs: JsonField<List<GrowthArc>> = JsonMissing.of(),
            @JsonProperty("height_meters")
            @ExcludeMissing
            heightMeters: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("profile_image_url")
            @ExcludeMissing
            profileImageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("salary_gbp")
            @ExcludeMissing
            salaryGbp: JsonField<SalaryGbp> = JsonMissing.of(),
            @JsonProperty("signature_quotes")
            @ExcludeMissing
            signatureQuotes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        ) : this(
            background,
            emotionalStats,
            name,
            personalityTraits,
            role,
            dateOfBirth,
            email,
            growthArcs,
            heightMeters,
            profileImageUrl,
            salaryGbp,
            signatureQuotes,
            teamId,
            mutableMapOf(),
        )

        /**
         * Character background and history
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun background(): String = background.getRequired("background")

        /**
         * Emotional intelligence stats
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun emotionalStats(): EmotionalStats = emotionalStats.getRequired("emotional_stats")

        /**
         * Character's full name
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Key personality traits
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun personalityTraits(): List<String> = personalityTraits.getRequired("personality_traits")

        /**
         * Character's role
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun role(): CharacterRole = role.getRequired("role")

        /**
         * Character's date of birth
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateOfBirth(): Optional<LocalDate> = dateOfBirth.getOptional("date_of_birth")

        /**
         * Character's email address
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Character development across seasons
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun growthArcs(): Optional<List<GrowthArc>> = growthArcs.getOptional("growth_arcs")

        /**
         * Height in meters
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun heightMeters(): Optional<Double> = heightMeters.getOptional("height_meters")

        /**
         * URL to character's profile image
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun profileImageUrl(): Optional<String> = profileImageUrl.getOptional("profile_image_url")

        /**
         * Annual salary in GBP
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun salaryGbp(): Optional<SalaryGbp> = salaryGbp.getOptional("salary_gbp")

        /**
         * Memorable quotes from this character
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signatureQuotes(): Optional<List<String>> =
            signatureQuotes.getOptional("signature_quotes")

        /**
         * ID of the team they belong to
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teamId(): Optional<String> = teamId.getOptional("team_id")

        /**
         * Returns the raw JSON value of [background].
         *
         * Unlike [background], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("background")
        @ExcludeMissing
        fun _background(): JsonField<String> = background

        /**
         * Returns the raw JSON value of [emotionalStats].
         *
         * Unlike [emotionalStats], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emotional_stats")
        @ExcludeMissing
        fun _emotionalStats(): JsonField<EmotionalStats> = emotionalStats

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [personalityTraits].
         *
         * Unlike [personalityTraits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("personality_traits")
        @ExcludeMissing
        fun _personalityTraits(): JsonField<List<String>> = personalityTraits

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<CharacterRole> = role

        /**
         * Returns the raw JSON value of [dateOfBirth].
         *
         * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [growthArcs].
         *
         * Unlike [growthArcs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("growth_arcs")
        @ExcludeMissing
        fun _growthArcs(): JsonField<List<GrowthArc>> = growthArcs

        /**
         * Returns the raw JSON value of [heightMeters].
         *
         * Unlike [heightMeters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("height_meters")
        @ExcludeMissing
        fun _heightMeters(): JsonField<Double> = heightMeters

        /**
         * Returns the raw JSON value of [profileImageUrl].
         *
         * Unlike [profileImageUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("profile_image_url")
        @ExcludeMissing
        fun _profileImageUrl(): JsonField<String> = profileImageUrl

        /**
         * Returns the raw JSON value of [salaryGbp].
         *
         * Unlike [salaryGbp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("salary_gbp")
        @ExcludeMissing
        fun _salaryGbp(): JsonField<SalaryGbp> = salaryGbp

        /**
         * Returns the raw JSON value of [signatureQuotes].
         *
         * Unlike [signatureQuotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signature_quotes")
        @ExcludeMissing
        fun _signatureQuotes(): JsonField<List<String>> = signatureQuotes

        /**
         * Returns the raw JSON value of [teamId].
         *
         * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .background()
             * .emotionalStats()
             * .name()
             * .personalityTraits()
             * .role()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var background: JsonField<String>? = null
            private var emotionalStats: JsonField<EmotionalStats>? = null
            private var name: JsonField<String>? = null
            private var personalityTraits: JsonField<MutableList<String>>? = null
            private var role: JsonField<CharacterRole>? = null
            private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var growthArcs: JsonField<MutableList<GrowthArc>>? = null
            private var heightMeters: JsonField<Double> = JsonMissing.of()
            private var profileImageUrl: JsonField<String> = JsonMissing.of()
            private var salaryGbp: JsonField<SalaryGbp> = JsonMissing.of()
            private var signatureQuotes: JsonField<MutableList<String>>? = null
            private var teamId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                background = body.background
                emotionalStats = body.emotionalStats
                name = body.name
                personalityTraits = body.personalityTraits.map { it.toMutableList() }
                role = body.role
                dateOfBirth = body.dateOfBirth
                email = body.email
                growthArcs = body.growthArcs.map { it.toMutableList() }
                heightMeters = body.heightMeters
                profileImageUrl = body.profileImageUrl
                salaryGbp = body.salaryGbp
                signatureQuotes = body.signatureQuotes.map { it.toMutableList() }
                teamId = body.teamId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Character background and history */
            fun background(background: String) = background(JsonField.of(background))

            /**
             * Sets [Builder.background] to an arbitrary JSON value.
             *
             * You should usually call [Builder.background] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun background(background: JsonField<String>) = apply { this.background = background }

            /** Emotional intelligence stats */
            fun emotionalStats(emotionalStats: EmotionalStats) =
                emotionalStats(JsonField.of(emotionalStats))

            /**
             * Sets [Builder.emotionalStats] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emotionalStats] with a well-typed [EmotionalStats]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun emotionalStats(emotionalStats: JsonField<EmotionalStats>) = apply {
                this.emotionalStats = emotionalStats
            }

            /** Character's full name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Key personality traits */
            fun personalityTraits(personalityTraits: List<String>) =
                personalityTraits(JsonField.of(personalityTraits))

            /**
             * Sets [Builder.personalityTraits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personalityTraits] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun personalityTraits(personalityTraits: JsonField<List<String>>) = apply {
                this.personalityTraits = personalityTraits.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [personalityTraits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPersonalityTrait(personalityTrait: String) = apply {
                personalityTraits =
                    (personalityTraits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("personalityTraits", it).add(personalityTrait)
                    }
            }

            /** Character's role */
            fun role(role: CharacterRole) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [CharacterRole] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun role(role: JsonField<CharacterRole>) = apply { this.role = role }

            /** Character's date of birth */
            fun dateOfBirth(dateOfBirth: LocalDate?) =
                dateOfBirth(JsonField.ofNullable(dateOfBirth))

            /** Alias for calling [Builder.dateOfBirth] with `dateOfBirth.orElse(null)`. */
            fun dateOfBirth(dateOfBirth: Optional<LocalDate>) = dateOfBirth(dateOfBirth.getOrNull())

            /**
             * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            /** Character's email address */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Character development across seasons */
            fun growthArcs(growthArcs: List<GrowthArc>) = growthArcs(JsonField.of(growthArcs))

            /**
             * Sets [Builder.growthArcs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.growthArcs] with a well-typed `List<GrowthArc>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun growthArcs(growthArcs: JsonField<List<GrowthArc>>) = apply {
                this.growthArcs = growthArcs.map { it.toMutableList() }
            }

            /**
             * Adds a single [GrowthArc] to [growthArcs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGrowthArc(growthArc: GrowthArc) = apply {
                growthArcs =
                    (growthArcs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("growthArcs", it).add(growthArc)
                    }
            }

            /** Height in meters */
            fun heightMeters(heightMeters: Double?) =
                heightMeters(JsonField.ofNullable(heightMeters))

            /**
             * Alias for [Builder.heightMeters].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun heightMeters(heightMeters: Double) = heightMeters(heightMeters as Double?)

            /** Alias for calling [Builder.heightMeters] with `heightMeters.orElse(null)`. */
            fun heightMeters(heightMeters: Optional<Double>) =
                heightMeters(heightMeters.getOrNull())

            /**
             * Sets [Builder.heightMeters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.heightMeters] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun heightMeters(heightMeters: JsonField<Double>) = apply {
                this.heightMeters = heightMeters
            }

            /** URL to character's profile image */
            fun profileImageUrl(profileImageUrl: String?) =
                profileImageUrl(JsonField.ofNullable(profileImageUrl))

            /** Alias for calling [Builder.profileImageUrl] with `profileImageUrl.orElse(null)`. */
            fun profileImageUrl(profileImageUrl: Optional<String>) =
                profileImageUrl(profileImageUrl.getOrNull())

            /**
             * Sets [Builder.profileImageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profileImageUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profileImageUrl(profileImageUrl: JsonField<String>) = apply {
                this.profileImageUrl = profileImageUrl
            }

            /** Annual salary in GBP */
            fun salaryGbp(salaryGbp: SalaryGbp?) = salaryGbp(JsonField.ofNullable(salaryGbp))

            /** Alias for calling [Builder.salaryGbp] with `salaryGbp.orElse(null)`. */
            fun salaryGbp(salaryGbp: Optional<SalaryGbp>) = salaryGbp(salaryGbp.getOrNull())

            /**
             * Sets [Builder.salaryGbp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.salaryGbp] with a well-typed [SalaryGbp] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun salaryGbp(salaryGbp: JsonField<SalaryGbp>) = apply { this.salaryGbp = salaryGbp }

            /** Alias for calling [salaryGbp] with `SalaryGbp.ofNumber(number)`. */
            fun salaryGbp(number: Double) = salaryGbp(SalaryGbp.ofNumber(number))

            /** Alias for calling [salaryGbp] with `SalaryGbp.ofString(string)`. */
            fun salaryGbp(string: String) = salaryGbp(SalaryGbp.ofString(string))

            /** Memorable quotes from this character */
            fun signatureQuotes(signatureQuotes: List<String>) =
                signatureQuotes(JsonField.of(signatureQuotes))

            /**
             * Sets [Builder.signatureQuotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signatureQuotes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun signatureQuotes(signatureQuotes: JsonField<List<String>>) = apply {
                this.signatureQuotes = signatureQuotes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [signatureQuotes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSignatureQuote(signatureQuote: String) = apply {
                signatureQuotes =
                    (signatureQuotes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("signatureQuotes", it).add(signatureQuote)
                    }
            }

            /** ID of the team they belong to */
            fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

            /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
            fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

            /**
             * Sets [Builder.teamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

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
             *
             * The following fields are required:
             * ```java
             * .background()
             * .emotionalStats()
             * .name()
             * .personalityTraits()
             * .role()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("background", background),
                    checkRequired("emotionalStats", emotionalStats),
                    checkRequired("name", name),
                    checkRequired("personalityTraits", personalityTraits).map { it.toImmutable() },
                    checkRequired("role", role),
                    dateOfBirth,
                    email,
                    (growthArcs ?: JsonMissing.of()).map { it.toImmutable() },
                    heightMeters,
                    profileImageUrl,
                    salaryGbp,
                    (signatureQuotes ?: JsonMissing.of()).map { it.toImmutable() },
                    teamId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            background()
            emotionalStats().validate()
            name()
            personalityTraits()
            role().validate()
            dateOfBirth()
            email()
            growthArcs().ifPresent { it.forEach { it.validate() } }
            heightMeters()
            profileImageUrl()
            salaryGbp().ifPresent { it.validate() }
            signatureQuotes()
            teamId()
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
            (if (background.asKnown().isPresent) 1 else 0) +
                (emotionalStats.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (personalityTraits.asKnown().getOrNull()?.size ?: 0) +
                (role.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dateOfBirth.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (growthArcs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (heightMeters.asKnown().isPresent) 1 else 0) +
                (if (profileImageUrl.asKnown().isPresent) 1 else 0) +
                (salaryGbp.asKnown().getOrNull()?.validity() ?: 0) +
                (signatureQuotes.asKnown().getOrNull()?.size ?: 0) +
                (if (teamId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                background == other.background &&
                emotionalStats == other.emotionalStats &&
                name == other.name &&
                personalityTraits == other.personalityTraits &&
                role == other.role &&
                dateOfBirth == other.dateOfBirth &&
                email == other.email &&
                growthArcs == other.growthArcs &&
                heightMeters == other.heightMeters &&
                profileImageUrl == other.profileImageUrl &&
                salaryGbp == other.salaryGbp &&
                signatureQuotes == other.signatureQuotes &&
                teamId == other.teamId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                background,
                emotionalStats,
                name,
                personalityTraits,
                role,
                dateOfBirth,
                email,
                growthArcs,
                heightMeters,
                profileImageUrl,
                salaryGbp,
                signatureQuotes,
                teamId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{background=$background, emotionalStats=$emotionalStats, name=$name, personalityTraits=$personalityTraits, role=$role, dateOfBirth=$dateOfBirth, email=$email, growthArcs=$growthArcs, heightMeters=$heightMeters, profileImageUrl=$profileImageUrl, salaryGbp=$salaryGbp, signatureQuotes=$signatureQuotes, teamId=$teamId, additionalProperties=$additionalProperties}"
    }

    /** Annual salary in GBP */
    @JsonDeserialize(using = SalaryGbp.Deserializer::class)
    @JsonSerialize(using = SalaryGbp.Serializer::class)
    class SalaryGbp
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

        fun validate(): SalaryGbp = apply {
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

            return other is SalaryGbp && number == other.number && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, string)

        override fun toString(): String =
            when {
                number != null -> "SalaryGbp{number=$number}"
                string != null -> "SalaryGbp{string=$string}"
                _json != null -> "SalaryGbp{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SalaryGbp")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = SalaryGbp(number = number)

            @JvmStatic fun ofString(string: String) = SalaryGbp(string = string)
        }

        /**
         * An interface that defines how to map each variant of [SalaryGbp] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [SalaryGbp] to a value of type [T].
             *
             * An instance of [SalaryGbp] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BelieveInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BelieveInvalidDataException("Unknown SalaryGbp: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<SalaryGbp>(SalaryGbp::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SalaryGbp {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                SalaryGbp(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                SalaryGbp(number = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> SalaryGbp(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<SalaryGbp>(SalaryGbp::class) {

            override fun serialize(
                value: SalaryGbp,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid SalaryGbp")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CharacterCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CharacterCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
