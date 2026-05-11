// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.models.teammembers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.believe.core.BaseDeserializer
import dev.cjav.believe.core.BaseSerializer
import dev.cjav.believe.core.JsonValue
import dev.cjav.believe.core.getOrThrow
import dev.cjav.believe.errors.BelieveInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Full player model with ID. */
@JsonDeserialize(using = TeamMemberRetrieveResponse.Deserializer::class)
@JsonSerialize(using = TeamMemberRetrieveResponse.Serializer::class)
class TeamMemberRetrieveResponse
private constructor(
    private val player: Player? = null,
    private val coach: Coach? = null,
    private val medicalStaff: MedicalStaff? = null,
    private val equipmentManager: EquipmentManager? = null,
    private val _json: JsonValue? = null,
) {

    /** Full player model with ID. */
    fun player(): Optional<Player> = Optional.ofNullable(player)

    /** Full coach model with ID. */
    fun coach(): Optional<Coach> = Optional.ofNullable(coach)

    /** Full medical staff model with ID. */
    fun medicalStaff(): Optional<MedicalStaff> = Optional.ofNullable(medicalStaff)

    /** Full equipment manager model with ID. */
    fun equipmentManager(): Optional<EquipmentManager> = Optional.ofNullable(equipmentManager)

    fun isPlayer(): Boolean = player != null

    fun isCoach(): Boolean = coach != null

    fun isMedicalStaff(): Boolean = medicalStaff != null

    fun isEquipmentManager(): Boolean = equipmentManager != null

    /** Full player model with ID. */
    fun asPlayer(): Player = player.getOrThrow("player")

    /** Full coach model with ID. */
    fun asCoach(): Coach = coach.getOrThrow("coach")

    /** Full medical staff model with ID. */
    fun asMedicalStaff(): MedicalStaff = medicalStaff.getOrThrow("medicalStaff")

    /** Full equipment manager model with ID. */
    fun asEquipmentManager(): EquipmentManager = equipmentManager.getOrThrow("equipmentManager")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import dev.cjav.believe.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = teamMemberRetrieveResponse.accept(new TeamMemberRetrieveResponse.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitPlayer(Player player) {
     *         return Optional.of(player.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws BelieveInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            player != null -> visitor.visitPlayer(player)
            coach != null -> visitor.visitCoach(coach)
            medicalStaff != null -> visitor.visitMedicalStaff(medicalStaff)
            equipmentManager != null -> visitor.visitEquipmentManager(equipmentManager)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws BelieveInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TeamMemberRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPlayer(player: Player) {
                    player.validate()
                }

                override fun visitCoach(coach: Coach) {
                    coach.validate()
                }

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
                override fun visitPlayer(player: Player) = player.validity()

                override fun visitCoach(coach: Coach) = coach.validity()

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

        return other is TeamMemberRetrieveResponse &&
            player == other.player &&
            coach == other.coach &&
            medicalStaff == other.medicalStaff &&
            equipmentManager == other.equipmentManager
    }

    override fun hashCode(): Int = Objects.hash(player, coach, medicalStaff, equipmentManager)

    override fun toString(): String =
        when {
            player != null -> "TeamMemberRetrieveResponse{player=$player}"
            coach != null -> "TeamMemberRetrieveResponse{coach=$coach}"
            medicalStaff != null -> "TeamMemberRetrieveResponse{medicalStaff=$medicalStaff}"
            equipmentManager != null ->
                "TeamMemberRetrieveResponse{equipmentManager=$equipmentManager}"
            _json != null -> "TeamMemberRetrieveResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TeamMemberRetrieveResponse")
        }

    companion object {

        /** Full player model with ID. */
        @JvmStatic fun ofPlayer(player: Player) = TeamMemberRetrieveResponse(player = player)

        /** Full coach model with ID. */
        @JvmStatic fun ofCoach(coach: Coach) = TeamMemberRetrieveResponse(coach = coach)

        /** Full medical staff model with ID. */
        @JvmStatic
        fun ofMedicalStaff(medicalStaff: MedicalStaff) =
            TeamMemberRetrieveResponse(medicalStaff = medicalStaff)

        /** Full equipment manager model with ID. */
        @JvmStatic
        fun ofEquipmentManager(equipmentManager: EquipmentManager) =
            TeamMemberRetrieveResponse(equipmentManager = equipmentManager)
    }

    /**
     * An interface that defines how to map each variant of [TeamMemberRetrieveResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /** Full player model with ID. */
        fun visitPlayer(player: Player): T

        /** Full coach model with ID. */
        fun visitCoach(coach: Coach): T

        /** Full medical staff model with ID. */
        fun visitMedicalStaff(medicalStaff: MedicalStaff): T

        /** Full equipment manager model with ID. */
        fun visitEquipmentManager(equipmentManager: EquipmentManager): T

        /**
         * Maps an unknown variant of [TeamMemberRetrieveResponse] to a value of type [T].
         *
         * An instance of [TeamMemberRetrieveResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws BelieveInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw BelieveInvalidDataException("Unknown TeamMemberRetrieveResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TeamMemberRetrieveResponse>(TeamMemberRetrieveResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TeamMemberRetrieveResponse {
            val json = JsonValue.fromJsonNode(node)
            val memberType =
                json.asObject().getOrNull()?.get("member_type")?.asString()?.getOrNull()

            when (memberType) {
                "player" -> {
                    return tryDeserialize(node, jacksonTypeRef<Player>())?.let {
                        TeamMemberRetrieveResponse(player = it, _json = json)
                    } ?: TeamMemberRetrieveResponse(_json = json)
                }
                "coach" -> {
                    return tryDeserialize(node, jacksonTypeRef<Coach>())?.let {
                        TeamMemberRetrieveResponse(coach = it, _json = json)
                    } ?: TeamMemberRetrieveResponse(_json = json)
                }
                "medical_staff" -> {
                    return tryDeserialize(node, jacksonTypeRef<MedicalStaff>())?.let {
                        TeamMemberRetrieveResponse(medicalStaff = it, _json = json)
                    } ?: TeamMemberRetrieveResponse(_json = json)
                }
                "equipment_manager" -> {
                    return tryDeserialize(node, jacksonTypeRef<EquipmentManager>())?.let {
                        TeamMemberRetrieveResponse(equipmentManager = it, _json = json)
                    } ?: TeamMemberRetrieveResponse(_json = json)
                }
            }

            return TeamMemberRetrieveResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<TeamMemberRetrieveResponse>(TeamMemberRetrieveResponse::class) {

        override fun serialize(
            value: TeamMemberRetrieveResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.player != null -> generator.writeObject(value.player)
                value.coach != null -> generator.writeObject(value.coach)
                value.medicalStaff != null -> generator.writeObject(value.medicalStaff)
                value.equipmentManager != null -> generator.writeObject(value.equipmentManager)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TeamMemberRetrieveResponse")
            }
        }
    }
}
