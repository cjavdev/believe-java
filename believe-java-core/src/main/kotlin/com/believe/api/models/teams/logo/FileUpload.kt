// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams.logo

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Response model for file uploads. */
class FileUpload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val checksumSha256: JsonField<String>,
    private val contentType: JsonField<String>,
    private val fileId: JsonField<String>,
    private val filename: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val uploadedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("checksum_sha256")
        @ExcludeMissing
        checksumSha256: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content_type")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size_bytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uploaded_at")
        @ExcludeMissing
        uploadedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(checksumSha256, contentType, fileId, filename, sizeBytes, uploadedAt, mutableMapOf())

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun checksumSha256(): String = checksumSha256.getRequired("checksum_sha256")

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentType(): String = contentType.getRequired("content_type")

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filename(): String = filename.getRequired("filename")

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sizeBytes(): Long = sizeBytes.getRequired("size_bytes")

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uploadedAt(): OffsetDateTime = uploadedAt.getRequired("uploaded_at")

    /**
     * Returns the raw JSON value of [checksumSha256].
     *
     * Unlike [checksumSha256], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checksum_sha256")
    @ExcludeMissing
    fun _checksumSha256(): JsonField<String> = checksumSha256

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_type")
    @ExcludeMissing
    fun _contentType(): JsonField<String> = contentType

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size_bytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

    /**
     * Returns the raw JSON value of [uploadedAt].
     *
     * Unlike [uploadedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uploaded_at")
    @ExcludeMissing
    fun _uploadedAt(): JsonField<OffsetDateTime> = uploadedAt

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
         * Returns a mutable builder for constructing an instance of [FileUpload].
         *
         * The following fields are required:
         * ```java
         * .checksumSha256()
         * .contentType()
         * .fileId()
         * .filename()
         * .sizeBytes()
         * .uploadedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileUpload]. */
    class Builder internal constructor() {

        private var checksumSha256: JsonField<String>? = null
        private var contentType: JsonField<String>? = null
        private var fileId: JsonField<String>? = null
        private var filename: JsonField<String>? = null
        private var sizeBytes: JsonField<Long>? = null
        private var uploadedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileUpload: FileUpload) = apply {
            checksumSha256 = fileUpload.checksumSha256
            contentType = fileUpload.contentType
            fileId = fileUpload.fileId
            filename = fileUpload.filename
            sizeBytes = fileUpload.sizeBytes
            uploadedAt = fileUpload.uploadedAt
            additionalProperties = fileUpload.additionalProperties.toMutableMap()
        }

        fun checksumSha256(checksumSha256: String) = checksumSha256(JsonField.of(checksumSha256))

        /**
         * Sets [Builder.checksumSha256] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checksumSha256] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun checksumSha256(checksumSha256: JsonField<String>) = apply {
            this.checksumSha256 = checksumSha256
        }

        fun contentType(contentType: String) = contentType(JsonField.of(contentType))

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { this.contentType = contentType }

        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

        fun uploadedAt(uploadedAt: OffsetDateTime) = uploadedAt(JsonField.of(uploadedAt))

        /**
         * Sets [Builder.uploadedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun uploadedAt(uploadedAt: JsonField<OffsetDateTime>) = apply {
            this.uploadedAt = uploadedAt
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
         * Returns an immutable instance of [FileUpload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .checksumSha256()
         * .contentType()
         * .fileId()
         * .filename()
         * .sizeBytes()
         * .uploadedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileUpload =
            FileUpload(
                checkRequired("checksumSha256", checksumSha256),
                checkRequired("contentType", contentType),
                checkRequired("fileId", fileId),
                checkRequired("filename", filename),
                checkRequired("sizeBytes", sizeBytes),
                checkRequired("uploadedAt", uploadedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileUpload = apply {
        if (validated) {
            return@apply
        }

        checksumSha256()
        contentType()
        fileId()
        filename()
        sizeBytes()
        uploadedAt()
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
        (if (checksumSha256.asKnown().isPresent) 1 else 0) +
            (if (contentType.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (if (filename.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (if (uploadedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileUpload &&
            checksumSha256 == other.checksumSha256 &&
            contentType == other.contentType &&
            fileId == other.fileId &&
            filename == other.filename &&
            sizeBytes == other.sizeBytes &&
            uploadedAt == other.uploadedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            checksumSha256,
            contentType,
            fileId,
            filename,
            sizeBytes,
            uploadedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileUpload{checksumSha256=$checksumSha256, contentType=$contentType, fileId=$fileId, filename=$filename, sizeBytes=$sizeBytes, uploadedAt=$uploadedAt, additionalProperties=$additionalProperties}"
}
