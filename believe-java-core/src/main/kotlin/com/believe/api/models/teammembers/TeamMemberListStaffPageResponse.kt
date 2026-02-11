// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

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
import kotlin.jvm.optionals.getOrNull

class TeamMemberListStaffPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<TeamMemberListStaffResponse>>,
    private val hasMore: JsonField<Boolean>,
    private val limit: JsonField<Long>,
    private val page: JsonField<Long>,
    private val pages: JsonField<Long>,
    private val skip: JsonField<Long>,
    private val total: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<TeamMemberListStaffResponse>> = JsonMissing.of(),
        @JsonProperty("has_more") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pages") @ExcludeMissing pages: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("skip") @ExcludeMissing skip: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
    ) : this(data, hasMore, limit, page, pages, skip, total, mutableMapOf())

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<TeamMemberListStaffResponse> = data.getRequired("data")

    /**
     * Whether there are more items after this page.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * Current page number (1-indexed, for display purposes).
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun page(): Long = page.getRequired("page")

    /**
     * Total number of pages.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pages(): Long = pages.getRequired("pages")

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun skip(): Long = skip.getRequired("skip")

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Long = total.getRequired("total")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<TeamMemberListStaffResponse>> = data

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [page].
     *
     * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

    /**
     * Returns the raw JSON value of [pages].
     *
     * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<Long> = pages

    /**
     * Returns the raw JSON value of [skip].
     *
     * Unlike [skip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skip") @ExcludeMissing fun _skip(): JsonField<Long> = skip

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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
         * Returns a mutable builder for constructing an instance of
         * [TeamMemberListStaffPageResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .hasMore()
         * .limit()
         * .page()
         * .pages()
         * .skip()
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TeamMemberListStaffPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<TeamMemberListStaffResponse>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var limit: JsonField<Long>? = null
        private var page: JsonField<Long>? = null
        private var pages: JsonField<Long>? = null
        private var skip: JsonField<Long>? = null
        private var total: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(teamMemberListStaffPageResponse: TeamMemberListStaffPageResponse) =
            apply {
                data = teamMemberListStaffPageResponse.data.map { it.toMutableList() }
                hasMore = teamMemberListStaffPageResponse.hasMore
                limit = teamMemberListStaffPageResponse.limit
                page = teamMemberListStaffPageResponse.page
                pages = teamMemberListStaffPageResponse.pages
                skip = teamMemberListStaffPageResponse.skip
                total = teamMemberListStaffPageResponse.total
                additionalProperties =
                    teamMemberListStaffPageResponse.additionalProperties.toMutableMap()
            }

        fun data(data: List<TeamMemberListStaffResponse>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed
         * `List<TeamMemberListStaffResponse>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<TeamMemberListStaffResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [TeamMemberListStaffResponse] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: TeamMemberListStaffResponse) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /**
         * Alias for calling [addData] with
         * `TeamMemberListStaffResponse.ofMedicalStaff(medicalStaff)`.
         */
        fun addData(medicalStaff: MedicalStaff) =
            addData(TeamMemberListStaffResponse.ofMedicalStaff(medicalStaff))

        /**
         * Alias for calling [addData] with
         * `TeamMemberListStaffResponse.ofEquipmentManager(equipmentManager)`.
         */
        fun addData(equipmentManager: EquipmentManager) =
            addData(TeamMemberListStaffResponse.ofEquipmentManager(equipmentManager))

        /** Whether there are more items after this page. */
        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /** Current page number (1-indexed, for display purposes). */
        fun page(page: Long) = page(JsonField.of(page))

        /**
         * Sets [Builder.page] to an arbitrary JSON value.
         *
         * You should usually call [Builder.page] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun page(page: JsonField<Long>) = apply { this.page = page }

        /** Total number of pages. */
        fun pages(pages: Long) = pages(JsonField.of(pages))

        /**
         * Sets [Builder.pages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pages] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pages(pages: JsonField<Long>) = apply { this.pages = pages }

        fun skip(skip: Long) = skip(JsonField.of(skip))

        /**
         * Sets [Builder.skip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skip] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun skip(skip: JsonField<Long>) = apply { this.skip = skip }

        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

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
         * Returns an immutable instance of [TeamMemberListStaffPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .hasMore()
         * .limit()
         * .page()
         * .pages()
         * .skip()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamMemberListStaffPageResponse =
            TeamMemberListStaffPageResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                checkRequired("limit", limit),
                checkRequired("page", page),
                checkRequired("pages", pages),
                checkRequired("skip", skip),
                checkRequired("total", total),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TeamMemberListStaffPageResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        hasMore()
        limit()
        page()
        pages()
        skip()
        total()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hasMore.asKnown().isPresent) 1 else 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (page.asKnown().isPresent) 1 else 0) +
            (if (pages.asKnown().isPresent) 1 else 0) +
            (if (skip.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamMemberListStaffPageResponse &&
            data == other.data &&
            hasMore == other.hasMore &&
            limit == other.limit &&
            page == other.page &&
            pages == other.pages &&
            skip == other.skip &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, hasMore, limit, page, pages, skip, total, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TeamMemberListStaffPageResponse{data=$data, hasMore=$hasMore, limit=$limit, page=$page, pages=$pages, skip=$skip, total=$total, additionalProperties=$additionalProperties}"
}
