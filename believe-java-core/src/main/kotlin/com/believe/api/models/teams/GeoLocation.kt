// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.checkRequired
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Geographic coordinates for a location. */
class GeoLocation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val latitude: JsonField<Double>,
    private val longitude: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("latitude") @ExcludeMissing latitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("longitude") @ExcludeMissing longitude: JsonField<Double> = JsonMissing.of(),
    ) : this(latitude, longitude, mutableMapOf())

    /**
     * Latitude in degrees
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun latitude(): Double = latitude.getRequired("latitude")

    /**
     * Longitude in degrees
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun longitude(): Double = longitude.getRequired("longitude")

    /**
     * Returns the raw JSON value of [latitude].
     *
     * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

    /**
     * Returns the raw JSON value of [longitude].
     *
     * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("longitude") @ExcludeMissing fun _longitude(): JsonField<Double> = longitude

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
         * Returns a mutable builder for constructing an instance of [GeoLocation].
         *
         * The following fields are required:
         * ```java
         * .latitude()
         * .longitude()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeoLocation]. */
    class Builder internal constructor() {

        private var latitude: JsonField<Double>? = null
        private var longitude: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(geoLocation: GeoLocation) = apply {
            latitude = geoLocation.latitude
            longitude = geoLocation.longitude
            additionalProperties = geoLocation.additionalProperties.toMutableMap()
        }

        /** Latitude in degrees */
        fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

        /**
         * Sets [Builder.latitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latitude] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

        /** Longitude in degrees */
        fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

        /**
         * Sets [Builder.longitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

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
         * Returns an immutable instance of [GeoLocation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .latitude()
         * .longitude()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GeoLocation =
            GeoLocation(
                checkRequired("latitude", latitude),
                checkRequired("longitude", longitude),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GeoLocation = apply {
        if (validated) {
            return@apply
        }

        latitude()
        longitude()
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
        (if (latitude.asKnown().isPresent) 1 else 0) + (if (longitude.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GeoLocation &&
            latitude == other.latitude &&
            longitude == other.longitude &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GeoLocation{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
}
