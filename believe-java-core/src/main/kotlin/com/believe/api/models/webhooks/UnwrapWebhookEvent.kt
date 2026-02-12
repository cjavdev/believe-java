// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import com.believe.api.core.BaseDeserializer
import com.believe.api.core.BaseSerializer
import com.believe.api.core.JsonValue
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
import kotlin.jvm.optionals.getOrNull

/** Webhook event sent when a match completes. */
@JsonDeserialize(using = UnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnwrapWebhookEvent.Serializer::class)
class UnwrapWebhookEvent
private constructor(
    private val matchCompleted: MatchCompletedWebhookEvent? = null,
    private val teamMemberTransferred: TeamMemberTransferredWebhookEvent? = null,
    private val _json: JsonValue? = null,
) {

    /** Webhook event sent when a match completes. */
    fun matchCompleted(): Optional<MatchCompletedWebhookEvent> = Optional.ofNullable(matchCompleted)

    /** Webhook event sent when a team member (player, coach, staff) transfers between teams. */
    fun teamMemberTransferred(): Optional<TeamMemberTransferredWebhookEvent> =
        Optional.ofNullable(teamMemberTransferred)

    fun isMatchCompleted(): Boolean = matchCompleted != null

    fun isTeamMemberTransferred(): Boolean = teamMemberTransferred != null

    /** Webhook event sent when a match completes. */
    fun asMatchCompleted(): MatchCompletedWebhookEvent = matchCompleted.getOrThrow("matchCompleted")

    /** Webhook event sent when a team member (player, coach, staff) transfers between teams. */
    fun asTeamMemberTransferred(): TeamMemberTransferredWebhookEvent =
        teamMemberTransferred.getOrThrow("teamMemberTransferred")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            matchCompleted != null -> visitor.visitMatchCompleted(matchCompleted)
            teamMemberTransferred != null ->
                visitor.visitTeamMemberTransferred(teamMemberTransferred)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): UnwrapWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitMatchCompleted(matchCompleted: MatchCompletedWebhookEvent) {
                    matchCompleted.validate()
                }

                override fun visitTeamMemberTransferred(
                    teamMemberTransferred: TeamMemberTransferredWebhookEvent
                ) {
                    teamMemberTransferred.validate()
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
                override fun visitMatchCompleted(matchCompleted: MatchCompletedWebhookEvent) =
                    matchCompleted.validity()

                override fun visitTeamMemberTransferred(
                    teamMemberTransferred: TeamMemberTransferredWebhookEvent
                ) = teamMemberTransferred.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnwrapWebhookEvent &&
            matchCompleted == other.matchCompleted &&
            teamMemberTransferred == other.teamMemberTransferred
    }

    override fun hashCode(): Int = Objects.hash(matchCompleted, teamMemberTransferred)

    override fun toString(): String =
        when {
            matchCompleted != null -> "UnwrapWebhookEvent{matchCompleted=$matchCompleted}"
            teamMemberTransferred != null ->
                "UnwrapWebhookEvent{teamMemberTransferred=$teamMemberTransferred}"
            _json != null -> "UnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
        }

    companion object {

        /** Webhook event sent when a match completes. */
        @JvmStatic
        fun ofMatchCompleted(matchCompleted: MatchCompletedWebhookEvent) =
            UnwrapWebhookEvent(matchCompleted = matchCompleted)

        /** Webhook event sent when a team member (player, coach, staff) transfers between teams. */
        @JvmStatic
        fun ofTeamMemberTransferred(teamMemberTransferred: TeamMemberTransferredWebhookEvent) =
            UnwrapWebhookEvent(teamMemberTransferred = teamMemberTransferred)
    }

    /**
     * An interface that defines how to map each variant of [UnwrapWebhookEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Webhook event sent when a match completes. */
        fun visitMatchCompleted(matchCompleted: MatchCompletedWebhookEvent): T

        /** Webhook event sent when a team member (player, coach, staff) transfers between teams. */
        fun visitTeamMemberTransferred(teamMemberTransferred: TeamMemberTransferredWebhookEvent): T

        /**
         * Maps an unknown variant of [UnwrapWebhookEvent] to a value of type [T].
         *
         * An instance of [UnwrapWebhookEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws BelieveInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw BelieveInvalidDataException("Unknown UnwrapWebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UnwrapWebhookEvent {
            val json = JsonValue.fromJsonNode(node)
            val eventType = json.asObject().getOrNull()?.get("event_type")?.asString()?.getOrNull()

            when (eventType) {
                "match.completed" -> {
                    return tryDeserialize(node, jacksonTypeRef<MatchCompletedWebhookEvent>())?.let {
                        UnwrapWebhookEvent(matchCompleted = it, _json = json)
                    } ?: UnwrapWebhookEvent(_json = json)
                }
                "team_member.transferred" -> {
                    return tryDeserialize(node, jacksonTypeRef<TeamMemberTransferredWebhookEvent>())
                        ?.let { UnwrapWebhookEvent(teamMemberTransferred = it, _json = json) }
                        ?: UnwrapWebhookEvent(_json = json)
                }
            }

            return UnwrapWebhookEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun serialize(
            value: UnwrapWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.matchCompleted != null -> generator.writeObject(value.matchCompleted)
                value.teamMemberTransferred != null ->
                    generator.writeObject(value.teamMemberTransferred)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
            }
        }
    }
}
