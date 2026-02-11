// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.BaseDeserializer
import com.believe.api.core.BaseSerializer
import com.believe.api.core.JsonValue
import com.believe.api.core.allMaxBy
import com.believe.api.core.getOrThrow
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

/** Full medical staff model with ID. */
@JsonDeserialize(using = TeamMemberListStaffResponse.Deserializer::class)
@JsonSerialize(using = TeamMemberListStaffResponse.Serializer::class)
class TeamMemberListStaffResponse
private constructor(
    private val medicalStaff: MedicalStaff? = null,
    private val equipmentManager: EquipmentManager? = null,
    private val _json: JsonValue? = null,
) {

    /** Full medical staff model with ID. */
    fun medicalStaff(): Optional<MedicalStaff> = Optional.ofNullable(medicalStaff)

    /** Full equipment manager model with ID. */
    fun equipmentManager(): Optional<EquipmentManager> = Optional.ofNullable(equipmentManager)

    fun isMedicalStaff(): Boolean = medicalStaff != null

    fun isEquipmentManager(): Boolean = equipmentManager != null

    /** Full medical staff model with ID. */
    fun asMedicalStaff(): MedicalStaff = medicalStaff.getOrThrow("medicalStaff")

    /** Full equipment manager model with ID. */
    fun asEquipmentManager(): EquipmentManager = equipmentManager.getOrThrow("equipmentManager")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            medicalStaff != null -> visitor.visitMedicalStaff(medicalStaff)
            equipmentManager != null -> visitor.visitEquipmentManager(equipmentManager)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TeamMemberListStaffResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitMedicalStaff(medicalStaff: MedicalStaff) {
                    medicalStaff.validate()
                }

                override fun visitEquipmentManager(equipmentManager: EquipmentManager) {
                    equipmentManager.validate()
                }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitMedicalStaff(medicalStaff: MedicalStaff) = medicalStaff.validity()

                override fun visitEquipmentManager(equipmentManager: EquipmentManager) =
                    equipmentManager.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamMemberListStaffResponse &&
            medicalStaff == other.medicalStaff &&
            equipmentManager == other.equipmentManager
    }

    override fun hashCode(): Int = Objects.hash(medicalStaff, equipmentManager)

    override fun toString(): String =
        when {
            medicalStaff != null -> "TeamMemberListStaffResponse{medicalStaff=$medicalStaff}"
            equipmentManager != null ->
                "TeamMemberListStaffResponse{equipmentManager=$equipmentManager}"
            _json != null -> "TeamMemberListStaffResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TeamMemberListStaffResponse")
        }

    companion object {

        /** Full medical staff model with ID. */
        @JvmStatic
        fun ofMedicalStaff(medicalStaff: MedicalStaff) =
            TeamMemberListStaffResponse(medicalStaff = medicalStaff)

        /** Full equipment manager model with ID. */
        @JvmStatic
        fun ofEquipmentManager(equipmentManager: EquipmentManager) =
            TeamMemberListStaffResponse(equipmentManager = equipmentManager)
    }

    /**
     * An interface that defines how to map each variant of [TeamMemberListStaffResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /** Full medical staff model with ID. */
        fun visitMedicalStaff(medicalStaff: MedicalStaff): T

        /** Full equipment manager model with ID. */
        fun visitEquipmentManager(equipmentManager: EquipmentManager): T

        /**
         * Maps an unknown variant of [TeamMemberListStaffResponse] to a value of type [T].
         *
         * An instance of [TeamMemberListStaffResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws BelieveInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw BelieveInvalidDataException("Unknown TeamMemberListStaffResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TeamMemberListStaffResponse>(TeamMemberListStaffResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TeamMemberListStaffResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<MedicalStaff>())?.let {
                            TeamMemberListStaffResponse(medicalStaff = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<EquipmentManager>())?.let {
                            TeamMemberListStaffResponse(equipmentManager = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> TeamMemberListStaffResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<TeamMemberListStaffResponse>(TeamMemberListStaffResponse::class) {

        override fun serialize(
            value: TeamMemberListStaffResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.medicalStaff != null -> generator.writeObject(value.medicalStaff)
                value.equipmentManager != null -> generator.writeObject(value.equipmentManager)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TeamMemberListStaffResponse")
            }
        }
    }
}
