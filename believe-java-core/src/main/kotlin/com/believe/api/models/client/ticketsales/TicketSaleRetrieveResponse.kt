// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.client.ticketsales

import com.believe.api.core.Enum
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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Full ticket sale model with ID. */
class TicketSaleRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val buyerName: JsonField<String>,
    private val currency: JsonField<String>,
    private val discount: JsonField<String>,
    private val matchId: JsonField<String>,
    private val purchaseMethod: JsonField<PurchaseMethod>,
    private val quantity: JsonField<Long>,
    private val subtotal: JsonField<String>,
    private val tax: JsonField<String>,
    private val total: JsonField<String>,
    private val unitPrice: JsonField<String>,
    private val buyerEmail: JsonField<String>,
    private val couponCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("buyer_name") @ExcludeMissing buyerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount") @ExcludeMissing discount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("match_id") @ExcludeMissing matchId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purchase_method")
        @ExcludeMissing
        purchaseMethod: JsonField<PurchaseMethod> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax") @ExcludeMissing tax: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit_price") @ExcludeMissing unitPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("buyer_email")
        @ExcludeMissing
        buyerEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coupon_code")
        @ExcludeMissing
        couponCode: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        buyerName,
        currency,
        discount,
        matchId,
        purchaseMethod,
        quantity,
        subtotal,
        tax,
        total,
        unitPrice,
        buyerEmail,
        couponCode,
        mutableMapOf(),
    )

    /**
     * Unique identifier
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Name of the ticket buyer
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buyerName(): String = buyerName.getRequired("buyer_name")

    /**
     * Currency code (GBP, USD, or EUR)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Discount amount applied from coupon
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discount(): String = discount.getRequired("discount")

    /**
     * ID of the match
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun matchId(): String = matchId.getRequired("match_id")

    /**
     * How the ticket was purchased
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun purchaseMethod(): PurchaseMethod = purchaseMethod.getRequired("purchase_method")

    /**
     * Number of tickets purchased
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Long = quantity.getRequired("quantity")

    /**
     * Subtotal before discount and tax (unit_price * quantity)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * Tax amount (20% UK VAT on discounted subtotal)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tax(): String = tax.getRequired("tax")

    /**
     * Final total (subtotal - discount + tax)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): String = total.getRequired("total")

    /**
     * Price per ticket (decimal string)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unitPrice(): String = unitPrice.getRequired("unit_price")

    /**
     * Email of the ticket buyer
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun buyerEmail(): Optional<String> = buyerEmail.getOptional("buyer_email")

    /**
     * Coupon code applied, if any
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun couponCode(): Optional<String> = couponCode.getOptional("coupon_code")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [buyerName].
     *
     * Unlike [buyerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buyer_name") @ExcludeMissing fun _buyerName(): JsonField<String> = buyerName

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [discount].
     *
     * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<String> = discount

    /**
     * Returns the raw JSON value of [matchId].
     *
     * Unlike [matchId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("match_id") @ExcludeMissing fun _matchId(): JsonField<String> = matchId

    /**
     * Returns the raw JSON value of [purchaseMethod].
     *
     * Unlike [purchaseMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purchase_method")
    @ExcludeMissing
    fun _purchaseMethod(): JsonField<PurchaseMethod> = purchaseMethod

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /**
     * Returns the raw JSON value of [subtotal].
     *
     * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    /**
     * Returns the raw JSON value of [tax].
     *
     * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<String> = tax

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    /**
     * Returns the raw JSON value of [unitPrice].
     *
     * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<String> = unitPrice

    /**
     * Returns the raw JSON value of [buyerEmail].
     *
     * Unlike [buyerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buyer_email") @ExcludeMissing fun _buyerEmail(): JsonField<String> = buyerEmail

    /**
     * Returns the raw JSON value of [couponCode].
     *
     * Unlike [couponCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coupon_code") @ExcludeMissing fun _couponCode(): JsonField<String> = couponCode

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
         * Returns a mutable builder for constructing an instance of [TicketSaleRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .buyerName()
         * .currency()
         * .discount()
         * .matchId()
         * .purchaseMethod()
         * .quantity()
         * .subtotal()
         * .tax()
         * .total()
         * .unitPrice()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TicketSaleRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var buyerName: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var discount: JsonField<String>? = null
        private var matchId: JsonField<String>? = null
        private var purchaseMethod: JsonField<PurchaseMethod>? = null
        private var quantity: JsonField<Long>? = null
        private var subtotal: JsonField<String>? = null
        private var tax: JsonField<String>? = null
        private var total: JsonField<String>? = null
        private var unitPrice: JsonField<String>? = null
        private var buyerEmail: JsonField<String> = JsonMissing.of()
        private var couponCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ticketSaleRetrieveResponse: TicketSaleRetrieveResponse) = apply {
            id = ticketSaleRetrieveResponse.id
            buyerName = ticketSaleRetrieveResponse.buyerName
            currency = ticketSaleRetrieveResponse.currency
            discount = ticketSaleRetrieveResponse.discount
            matchId = ticketSaleRetrieveResponse.matchId
            purchaseMethod = ticketSaleRetrieveResponse.purchaseMethod
            quantity = ticketSaleRetrieveResponse.quantity
            subtotal = ticketSaleRetrieveResponse.subtotal
            tax = ticketSaleRetrieveResponse.tax
            total = ticketSaleRetrieveResponse.total
            unitPrice = ticketSaleRetrieveResponse.unitPrice
            buyerEmail = ticketSaleRetrieveResponse.buyerEmail
            couponCode = ticketSaleRetrieveResponse.couponCode
            additionalProperties = ticketSaleRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the ticket buyer */
        fun buyerName(buyerName: String) = buyerName(JsonField.of(buyerName))

        /**
         * Sets [Builder.buyerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buyerName(buyerName: JsonField<String>) = apply { this.buyerName = buyerName }

        /** Currency code (GBP, USD, or EUR) */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Discount amount applied from coupon */
        fun discount(discount: String) = discount(JsonField.of(discount))

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun discount(discount: JsonField<String>) = apply { this.discount = discount }

        /** ID of the match */
        fun matchId(matchId: String) = matchId(JsonField.of(matchId))

        /**
         * Sets [Builder.matchId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun matchId(matchId: JsonField<String>) = apply { this.matchId = matchId }

        /** How the ticket was purchased */
        fun purchaseMethod(purchaseMethod: PurchaseMethod) =
            purchaseMethod(JsonField.of(purchaseMethod))

        /**
         * Sets [Builder.purchaseMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchaseMethod] with a well-typed [PurchaseMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purchaseMethod(purchaseMethod: JsonField<PurchaseMethod>) = apply {
            this.purchaseMethod = purchaseMethod
        }

        /** Number of tickets purchased */
        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /** Subtotal before discount and tax (unit_price * quantity) */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /** Tax amount (20% UK VAT on discounted subtotal) */
        fun tax(tax: String) = tax(JsonField.of(tax))

        /**
         * Sets [Builder.tax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tax] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tax(tax: JsonField<String>) = apply { this.tax = tax }

        /** Final total (subtotal - discount + tax) */
        fun total(total: String) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<String>) = apply { this.total = total }

        /** Price per ticket (decimal string) */
        fun unitPrice(unitPrice: String) = unitPrice(JsonField.of(unitPrice))

        /**
         * Sets [Builder.unitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unitPrice(unitPrice: JsonField<String>) = apply { this.unitPrice = unitPrice }

        /** Email of the ticket buyer */
        fun buyerEmail(buyerEmail: String?) = buyerEmail(JsonField.ofNullable(buyerEmail))

        /** Alias for calling [Builder.buyerEmail] with `buyerEmail.orElse(null)`. */
        fun buyerEmail(buyerEmail: Optional<String>) = buyerEmail(buyerEmail.getOrNull())

        /**
         * Sets [Builder.buyerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyerEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buyerEmail(buyerEmail: JsonField<String>) = apply { this.buyerEmail = buyerEmail }

        /** Coupon code applied, if any */
        fun couponCode(couponCode: String?) = couponCode(JsonField.ofNullable(couponCode))

        /** Alias for calling [Builder.couponCode] with `couponCode.orElse(null)`. */
        fun couponCode(couponCode: Optional<String>) = couponCode(couponCode.getOrNull())

        /**
         * Sets [Builder.couponCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.couponCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun couponCode(couponCode: JsonField<String>) = apply { this.couponCode = couponCode }

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
         * Returns an immutable instance of [TicketSaleRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .buyerName()
         * .currency()
         * .discount()
         * .matchId()
         * .purchaseMethod()
         * .quantity()
         * .subtotal()
         * .tax()
         * .total()
         * .unitPrice()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TicketSaleRetrieveResponse =
            TicketSaleRetrieveResponse(
                checkRequired("id", id),
                checkRequired("buyerName", buyerName),
                checkRequired("currency", currency),
                checkRequired("discount", discount),
                checkRequired("matchId", matchId),
                checkRequired("purchaseMethod", purchaseMethod),
                checkRequired("quantity", quantity),
                checkRequired("subtotal", subtotal),
                checkRequired("tax", tax),
                checkRequired("total", total),
                checkRequired("unitPrice", unitPrice),
                buyerEmail,
                couponCode,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TicketSaleRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        buyerName()
        currency()
        discount()
        matchId()
        purchaseMethod().validate()
        quantity()
        subtotal()
        tax()
        total()
        unitPrice()
        buyerEmail()
        couponCode()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (buyerName.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (discount.asKnown().isPresent) 1 else 0) +
            (if (matchId.asKnown().isPresent) 1 else 0) +
            (purchaseMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (subtotal.asKnown().isPresent) 1 else 0) +
            (if (tax.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0) +
            (if (unitPrice.asKnown().isPresent) 1 else 0) +
            (if (buyerEmail.asKnown().isPresent) 1 else 0) +
            (if (couponCode.asKnown().isPresent) 1 else 0)

    /** How the ticket was purchased */
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

        return other is TicketSaleRetrieveResponse &&
            id == other.id &&
            buyerName == other.buyerName &&
            currency == other.currency &&
            discount == other.discount &&
            matchId == other.matchId &&
            purchaseMethod == other.purchaseMethod &&
            quantity == other.quantity &&
            subtotal == other.subtotal &&
            tax == other.tax &&
            total == other.total &&
            unitPrice == other.unitPrice &&
            buyerEmail == other.buyerEmail &&
            couponCode == other.couponCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            buyerName,
            currency,
            discount,
            matchId,
            purchaseMethod,
            quantity,
            subtotal,
            tax,
            total,
            unitPrice,
            buyerEmail,
            couponCode,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TicketSaleRetrieveResponse{id=$id, buyerName=$buyerName, currency=$currency, discount=$discount, matchId=$matchId, purchaseMethod=$purchaseMethod, quantity=$quantity, subtotal=$subtotal, tax=$tax, total=$total, unitPrice=$unitPrice, buyerEmail=$buyerEmail, couponCode=$couponCode, additionalProperties=$additionalProperties}"
}
