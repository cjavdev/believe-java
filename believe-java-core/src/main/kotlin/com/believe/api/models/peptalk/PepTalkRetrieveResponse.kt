// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.peptalk

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

/** A complete pep talk response. */
class PepTalkRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chunks: JsonField<List<Chunk>>,
    private val text: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chunks") @ExcludeMissing chunks: JsonField<List<Chunk>> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
    ) : this(chunks, text, mutableMapOf())

    /**
     * Individual chunks of the pep talk
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chunks(): List<Chunk> = chunks.getRequired("chunks")

    /**
     * The full pep talk text
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * Returns the raw JSON value of [chunks].
     *
     * Unlike [chunks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunks") @ExcludeMissing fun _chunks(): JsonField<List<Chunk>> = chunks

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
         * Returns a mutable builder for constructing an instance of [PepTalkRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .chunks()
         * .text()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PepTalkRetrieveResponse]. */
    class Builder internal constructor() {

        private var chunks: JsonField<MutableList<Chunk>>? = null
        private var text: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pepTalkRetrieveResponse: PepTalkRetrieveResponse) = apply {
            chunks = pepTalkRetrieveResponse.chunks.map { it.toMutableList() }
            text = pepTalkRetrieveResponse.text
            additionalProperties = pepTalkRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Individual chunks of the pep talk */
        fun chunks(chunks: List<Chunk>) = chunks(JsonField.of(chunks))

        /**
         * Sets [Builder.chunks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunks] with a well-typed `List<Chunk>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chunks(chunks: JsonField<List<Chunk>>) = apply {
            this.chunks = chunks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Chunk] to [chunks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChunk(chunk: Chunk) = apply {
            chunks =
                (chunks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("chunks", it).add(chunk)
                }
        }

        /** The full pep talk text */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

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
         * Returns an immutable instance of [PepTalkRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .chunks()
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PepTalkRetrieveResponse =
            PepTalkRetrieveResponse(
                checkRequired("chunks", chunks).map { it.toImmutable() },
                checkRequired("text", text),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PepTalkRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        chunks().forEach { it.validate() }
        text()
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
        (chunks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0)

    /** A chunk of a streaming pep talk from Ted. */
    class Chunk
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val chunkId: JsonField<Long>,
        private val isFinal: JsonField<Boolean>,
        private val text: JsonField<String>,
        private val emotionalBeat: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("chunk_id") @ExcludeMissing chunkId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("is_final")
            @ExcludeMissing
            isFinal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emotional_beat")
            @ExcludeMissing
            emotionalBeat: JsonField<String> = JsonMissing.of(),
        ) : this(chunkId, isFinal, text, emotionalBeat, mutableMapOf())

        /**
         * Chunk sequence number
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chunkId(): Long = chunkId.getRequired("chunk_id")

        /**
         * Is this the final chunk
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isFinal(): Boolean = isFinal.getRequired("is_final")

        /**
         * The text of this chunk
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * The emotional purpose of this chunk (e.g., greeting, acknowledgment, wisdom, affirmation,
         * encouragement)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emotionalBeat(): Optional<String> = emotionalBeat.getOptional("emotional_beat")

        /**
         * Returns the raw JSON value of [chunkId].
         *
         * Unlike [chunkId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chunk_id") @ExcludeMissing fun _chunkId(): JsonField<Long> = chunkId

        /**
         * Returns the raw JSON value of [isFinal].
         *
         * Unlike [isFinal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_final") @ExcludeMissing fun _isFinal(): JsonField<Boolean> = isFinal

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [emotionalBeat].
         *
         * Unlike [emotionalBeat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emotional_beat")
        @ExcludeMissing
        fun _emotionalBeat(): JsonField<String> = emotionalBeat

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
             * Returns a mutable builder for constructing an instance of [Chunk].
             *
             * The following fields are required:
             * ```java
             * .chunkId()
             * .isFinal()
             * .text()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Chunk]. */
        class Builder internal constructor() {

            private var chunkId: JsonField<Long>? = null
            private var isFinal: JsonField<Boolean>? = null
            private var text: JsonField<String>? = null
            private var emotionalBeat: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(chunk: Chunk) = apply {
                chunkId = chunk.chunkId
                isFinal = chunk.isFinal
                text = chunk.text
                emotionalBeat = chunk.emotionalBeat
                additionalProperties = chunk.additionalProperties.toMutableMap()
            }

            /** Chunk sequence number */
            fun chunkId(chunkId: Long) = chunkId(JsonField.of(chunkId))

            /**
             * Sets [Builder.chunkId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chunkId(chunkId: JsonField<Long>) = apply { this.chunkId = chunkId }

            /** Is this the final chunk */
            fun isFinal(isFinal: Boolean) = isFinal(JsonField.of(isFinal))

            /**
             * Sets [Builder.isFinal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isFinal] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isFinal(isFinal: JsonField<Boolean>) = apply { this.isFinal = isFinal }

            /** The text of this chunk */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /**
             * The emotional purpose of this chunk (e.g., greeting, acknowledgment, wisdom,
             * affirmation, encouragement)
             */
            fun emotionalBeat(emotionalBeat: String?) =
                emotionalBeat(JsonField.ofNullable(emotionalBeat))

            /** Alias for calling [Builder.emotionalBeat] with `emotionalBeat.orElse(null)`. */
            fun emotionalBeat(emotionalBeat: Optional<String>) =
                emotionalBeat(emotionalBeat.getOrNull())

            /**
             * Sets [Builder.emotionalBeat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emotionalBeat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emotionalBeat(emotionalBeat: JsonField<String>) = apply {
                this.emotionalBeat = emotionalBeat
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
             * Returns an immutable instance of [Chunk].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .chunkId()
             * .isFinal()
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Chunk =
                Chunk(
                    checkRequired("chunkId", chunkId),
                    checkRequired("isFinal", isFinal),
                    checkRequired("text", text),
                    emotionalBeat,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Chunk = apply {
            if (validated) {
                return@apply
            }

            chunkId()
            isFinal()
            text()
            emotionalBeat()
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
            (if (chunkId.asKnown().isPresent) 1 else 0) +
                (if (isFinal.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (emotionalBeat.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Chunk &&
                chunkId == other.chunkId &&
                isFinal == other.isFinal &&
                text == other.text &&
                emotionalBeat == other.emotionalBeat &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(chunkId, isFinal, text, emotionalBeat, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chunk{chunkId=$chunkId, isFinal=$isFinal, text=$text, emotionalBeat=$emotionalBeat, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PepTalkRetrieveResponse &&
            chunks == other.chunks &&
            text == other.text &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(chunks, text, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PepTalkRetrieveResponse{chunks=$chunks, text=$text, additionalProperties=$additionalProperties}"
}
