// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.client.ticketsales

import com.believe.api.core.Enum
import com.believe.api.core.JsonField
import com.believe.api.core.Params
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get a paginated list of all ticket sales with optional filtering. With 300 records, this endpoint
 * is ideal for practicing pagination.
 */
class TicketSaleListParams
private constructor(
    private val couponCode: String?,
    private val currency: String?,
    private val limit: Long?,
    private val matchId: String?,
    private val purchaseMethod: PurchaseMethod?,
    private val skip: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by coupon code (use 'none' for sales without coupons) */
    fun couponCode(): Optional<String> = Optional.ofNullable(couponCode)

    /** Filter by currency (GBP, USD, EUR) */
    fun currency(): Optional<String> = Optional.ofNullable(currency)

    /** Maximum number of items to return (max: 100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by match ID */
    fun matchId(): Optional<String> = Optional.ofNullable(matchId)

    /** Filter by purchase method */
    fun purchaseMethod(): Optional<PurchaseMethod> = Optional.ofNullable(purchaseMethod)

    /** Number of items to skip (offset) */
    fun skip(): Optional<Long> = Optional.ofNullable(skip)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TicketSaleListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TicketSaleListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TicketSaleListParams]. */
    class Builder internal constructor() {

        private var couponCode: String? = null
        private var currency: String? = null
        private var limit: Long? = null
        private var matchId: String? = null
        private var purchaseMethod: PurchaseMethod? = null
        private var skip: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ticketSaleListParams: TicketSaleListParams) = apply {
            couponCode = ticketSaleListParams.couponCode
            currency = ticketSaleListParams.currency
            limit = ticketSaleListParams.limit
            matchId = ticketSaleListParams.matchId
            purchaseMethod = ticketSaleListParams.purchaseMethod
            skip = ticketSaleListParams.skip
            additionalHeaders = ticketSaleListParams.additionalHeaders.toBuilder()
            additionalQueryParams = ticketSaleListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by coupon code (use 'none' for sales without coupons) */
        fun couponCode(couponCode: String?) = apply { this.couponCode = couponCode }

        /** Alias for calling [Builder.couponCode] with `couponCode.orElse(null)`. */
        fun couponCode(couponCode: Optional<String>) = couponCode(couponCode.getOrNull())

        /** Filter by currency (GBP, USD, EUR) */
        fun currency(currency: String?) = apply { this.currency = currency }

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /** Maximum number of items to return (max: 100) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter by match ID */
        fun matchId(matchId: String?) = apply { this.matchId = matchId }

        /** Alias for calling [Builder.matchId] with `matchId.orElse(null)`. */
        fun matchId(matchId: Optional<String>) = matchId(matchId.getOrNull())

        /** Filter by purchase method */
        fun purchaseMethod(purchaseMethod: PurchaseMethod?) = apply {
            this.purchaseMethod = purchaseMethod
        }

        /** Alias for calling [Builder.purchaseMethod] with `purchaseMethod.orElse(null)`. */
        fun purchaseMethod(purchaseMethod: Optional<PurchaseMethod>) =
            purchaseMethod(purchaseMethod.getOrNull())

        /** Number of items to skip (offset) */
        fun skip(skip: Long?) = apply { this.skip = skip }

        /**
         * Alias for [Builder.skip].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun skip(skip: Long) = skip(skip as Long?)

        /** Alias for calling [Builder.skip] with `skip.orElse(null)`. */
        fun skip(skip: Optional<Long>) = skip(skip.getOrNull())

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
         * Returns an immutable instance of [TicketSaleListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TicketSaleListParams =
            TicketSaleListParams(
                couponCode,
                currency,
                limit,
                matchId,
                purchaseMethod,
                skip,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                couponCode?.let { put("coupon_code", it) }
                currency?.let { put("currency", it) }
                limit?.let { put("limit", it.toString()) }
                matchId?.let { put("match_id", it) }
                purchaseMethod?.let { put("purchase_method", it.toString()) }
                skip?.let { put("skip", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by purchase method */
    class PurchaseMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ONLINE = of("online")

            @JvmField val BOX_OFFICE = of("box_office")

            @JvmField val WILL_CALL = of("will_call")

            @JvmField val PHONE = of("phone")

            @JvmStatic fun of(value: String) = PurchaseMethod(JsonField.of(value))
        }

        /** An enum containing [PurchaseMethod]'s known values. */
        enum class Known {
            ONLINE,
            BOX_OFFICE,
            WILL_CALL,
            PHONE,
        }

        /**
         * An enum containing [PurchaseMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PurchaseMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ONLINE,
            BOX_OFFICE,
            WILL_CALL,
            PHONE,
            /**
             * An enum member indicating that [PurchaseMethod] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ONLINE -> Value.ONLINE
                BOX_OFFICE -> Value.BOX_OFFICE
                WILL_CALL -> Value.WILL_CALL
                PHONE -> Value.PHONE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BelieveInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ONLINE -> Known.ONLINE
                BOX_OFFICE -> Known.BOX_OFFICE
                WILL_CALL -> Known.WILL_CALL
                PHONE -> Known.PHONE
                else -> throw BelieveInvalidDataException("Unknown PurchaseMethod: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BelieveInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { BelieveInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): PurchaseMethod = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PurchaseMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TicketSaleListParams &&
            couponCode == other.couponCode &&
            currency == other.currency &&
            limit == other.limit &&
            matchId == other.matchId &&
            purchaseMethod == other.purchaseMethod &&
            skip == other.skip &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            couponCode,
            currency,
            limit,
            matchId,
            purchaseMethod,
            skip,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TicketSaleListParams{couponCode=$couponCode, currency=$currency, limit=$limit, matchId=$matchId, purchaseMethod=$purchaseMethod, skip=$skip, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
