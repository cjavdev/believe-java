// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.ticketsales

import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.checkRequired
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import com.believe.api.errors.BelieveInvalidDataException
import com.believe.api.models.ticketsales.PurchaseMethod
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Record a new ticket sale. */
class TicketSaleCreateParams private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /**
     * Name of the ticket buyer
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buyerName(): String = body.buyerName()

    /**
     * Currency code (GBP, USD, or EUR)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * Discount amount applied from coupon
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discount(): String = body.discount()

    /**
     * ID of the match
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun matchId(): String = body.matchId()

    /**
     * How the ticket was purchased
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun purchaseMethod(): PurchaseMethod = body.purchaseMethod()

    /**
     * Number of tickets purchased
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Long = body.quantity()

    /**
     * Subtotal before discount and tax (unit_price * quantity)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtotal(): String = body.subtotal()

    /**
     * Tax amount (20% UK VAT on discounted subtotal)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tax(): String = body.tax()

    /**
     * Final total (subtotal - discount + tax)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): String = body.total()

    /**
     * Price per ticket (decimal string)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unitPrice(): String = body.unitPrice()

    /**
     * Email of the ticket buyer
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun buyerEmail(): Optional<String> = body.buyerEmail()

    /**
     * Coupon code applied, if any
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun couponCode(): Optional<String> = body.couponCode()

    /**
     * Returns the raw JSON value of [buyerName].
     *
     * Unlike [buyerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _buyerName(): JsonField<String> = body._buyerName()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [discount].
     *
     * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _discount(): JsonField<String> = body._discount()

    /**
     * Returns the raw JSON value of [matchId].
     *
     * Unlike [matchId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _matchId(): JsonField<String> = body._matchId()

    /**
     * Returns the raw JSON value of [purchaseMethod].
     *
     * Unlike [purchaseMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _purchaseMethod(): JsonField<PurchaseMethod> = body._purchaseMethod()

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _quantity(): JsonField<Long> = body._quantity()

    /**
     * Returns the raw JSON value of [subtotal].
     *
     * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subtotal(): JsonField<String> = body._subtotal()

    /**
     * Returns the raw JSON value of [tax].
     *
     * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tax(): JsonField<String> = body._tax()

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _total(): JsonField<String> = body._total()

    /**
     * Returns the raw JSON value of [unitPrice].
     *
     * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _unitPrice(): JsonField<String> = body._unitPrice()

    /**
     * Returns the raw JSON value of [buyerEmail].
     *
     * Unlike [buyerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _buyerEmail(): JsonField<String> = body._buyerEmail()

    /**
     * Returns the raw JSON value of [couponCode].
     *
     * Unlike [couponCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _couponCode(): JsonField<String> = body._couponCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TicketSaleCreateParams].
         *
         * The following fields are required:
         *
         * ```java
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
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [TicketSaleCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ticketSaleCreateParams: TicketSaleCreateParams) =
            apply {
                body = ticketSaleCreateParams.body.toBuilder()
                additionalHeaders = ticketSaleCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams = ticketSaleCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately. Otherwise,
         * it's more convenient to use the top-level setters instead:
         * - [buyerName]
         * - [currency]
         * - [discount]
         * - [matchId]
         * - [purchaseMethod]
         * - etc.
         */
        fun body(body: Body) =
            apply {
                this.body = body.toBuilder()
            }

        /** Name of the ticket buyer */
        fun buyerName(buyerName: String) =
            apply {
                body.buyerName(buyerName)
            }

        /**
         * Sets [Builder.buyerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyerName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun buyerName(buyerName: JsonField<String>) =
            apply {
                body.buyerName(buyerName)
            }

        /** Currency code (GBP, USD, or EUR) */
        fun currency(currency: String) =
            apply {
                body.currency(currency)
            }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currency(currency: JsonField<String>) =
            apply {
                body.currency(currency)
            }

        /** Discount amount applied from coupon */
        fun discount(discount: String) =
            apply {
                body.discount(discount)
            }

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discount(discount: JsonField<String>) =
            apply {
                body.discount(discount)
            }

        /** ID of the match */
        fun matchId(matchId: String) =
            apply {
                body.matchId(matchId)
            }

        /**
         * Sets [Builder.matchId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun matchId(matchId: JsonField<String>) =
            apply {
                body.matchId(matchId)
            }

        /** How the ticket was purchased */
        fun purchaseMethod(purchaseMethod: PurchaseMethod) =
            apply {
                body.purchaseMethod(purchaseMethod)
            }

        /**
         * Sets [Builder.purchaseMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchaseMethod] with a well-typed [PurchaseMethod] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purchaseMethod(purchaseMethod: JsonField<PurchaseMethod>) =
            apply {
                body.purchaseMethod(purchaseMethod)
            }

        /** Number of tickets purchased */
        fun quantity(quantity: Long) =
            apply {
                body.quantity(quantity)
            }

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun quantity(quantity: JsonField<Long>) =
            apply {
                body.quantity(quantity)
            }

        /** Subtotal before discount and tax (unit_price * quantity) */
        fun subtotal(subtotal: String) =
            apply {
                body.subtotal(subtotal)
            }

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subtotal(subtotal: JsonField<String>) =
            apply {
                body.subtotal(subtotal)
            }

        /** Tax amount (20% UK VAT on discounted subtotal) */
        fun tax(tax: String) =
            apply {
                body.tax(tax)
            }

        /**
         * Sets [Builder.tax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tax] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tax(tax: JsonField<String>) =
            apply {
                body.tax(tax)
            }

        /** Final total (subtotal - discount + tax) */
        fun total(total: String) =
            apply {
                body.total(total)
            }

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun total(total: JsonField<String>) =
            apply {
                body.total(total)
            }

        /** Price per ticket (decimal string) */
        fun unitPrice(unitPrice: String) =
            apply {
                body.unitPrice(unitPrice)
            }

        /**
         * Sets [Builder.unitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitPrice] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unitPrice(unitPrice: JsonField<String>) =
            apply {
                body.unitPrice(unitPrice)
            }

        /** Email of the ticket buyer */
        fun buyerEmail(buyerEmail: String?) =
            apply {
                body.buyerEmail(buyerEmail)
            }

        /** Alias for calling [Builder.buyerEmail] with `buyerEmail.orElse(null)`. */
        fun buyerEmail(buyerEmail: Optional<String>) = buyerEmail(buyerEmail.getOrNull())

        /**
         * Sets [Builder.buyerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyerEmail] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun buyerEmail(buyerEmail: JsonField<String>) =
            apply {
                body.buyerEmail(buyerEmail)
            }

        /** Coupon code applied, if any */
        fun couponCode(couponCode: String?) =
            apply {
                body.couponCode(couponCode)
            }

        /** Alias for calling [Builder.couponCode] with `couponCode.orElse(null)`. */
        fun couponCode(couponCode: Optional<String>) = couponCode(couponCode.getOrNull())

        /**
         * Sets [Builder.couponCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.couponCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun couponCode(couponCode: JsonField<String>) =
            apply {
                body.couponCode(couponCode)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        /**
         * Returns an immutable instance of [TicketSaleCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
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
        fun build(): TicketSaleCreateParams =
            TicketSaleCreateParams(
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Model for creating a new ticket sale. */
    class Body @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
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
            @JsonProperty("buyer_name") @ExcludeMissing buyerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount") @ExcludeMissing discount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("match_id") @ExcludeMissing matchId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("purchase_method") @ExcludeMissing purchaseMethod: JsonField<PurchaseMethod> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit_price") @ExcludeMissing unitPrice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("buyer_email") @ExcludeMissing buyerEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("coupon_code") @ExcludeMissing couponCode: JsonField<String> = JsonMissing.of()
        ) : this(
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
         * Name of the ticket buyer
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun buyerName(): String = buyerName.getRequired("buyer_name")

        /**
         * Currency code (GBP, USD, or EUR)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Discount amount applied from coupon
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discount(): String = discount.getRequired("discount")

        /**
         * ID of the match
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun matchId(): String = matchId.getRequired("match_id")

        /**
         * How the ticket was purchased
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun purchaseMethod(): PurchaseMethod = purchaseMethod.getRequired("purchase_method")

        /**
         * Number of tickets purchased
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Long = quantity.getRequired("quantity")

        /**
         * Subtotal before discount and tax (unit_price * quantity)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /**
         * Tax amount (20% UK VAT on discounted subtotal)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tax(): String = tax.getRequired("tax")

        /**
         * Final total (subtotal - discount + tax)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): String = total.getRequired("total")

        /**
         * Price per ticket (decimal string)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unitPrice(): String = unitPrice.getRequired("unit_price")

        /**
         * Email of the ticket buyer
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun buyerEmail(): Optional<String> = buyerEmail.getOptional("buyer_email")

        /**
         * Coupon code applied, if any
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun couponCode(): Optional<String> = couponCode.getOptional("coupon_code")

        /**
         * Returns the raw JSON value of [buyerName].
         *
         * Unlike [buyerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("buyer_name")
        @ExcludeMissing
        fun _buyerName(): JsonField<String> = buyerName

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount")
        @ExcludeMissing
        fun _discount(): JsonField<String> = discount

        /**
         * Returns the raw JSON value of [matchId].
         *
         * Unlike [matchId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_id")
        @ExcludeMissing
        fun _matchId(): JsonField<String> = matchId

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
        @JsonProperty("quantity")
        @ExcludeMissing
        fun _quantity(): JsonField<Long> = quantity

        /**
         * Returns the raw JSON value of [subtotal].
         *
         * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtotal")
        @ExcludeMissing
        fun _subtotal(): JsonField<String> = subtotal

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax")
        @ExcludeMissing
        fun _tax(): JsonField<String> = tax

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total")
        @ExcludeMissing
        fun _total(): JsonField<String> = total

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_price")
        @ExcludeMissing
        fun _unitPrice(): JsonField<String> = unitPrice

        /**
         * Returns the raw JSON value of [buyerEmail].
         *
         * Unlike [buyerEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("buyer_email")
        @ExcludeMissing
        fun _buyerEmail(): JsonField<String> = buyerEmail

        /**
         * Returns the raw JSON value of [couponCode].
         *
         * Unlike [couponCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coupon_code")
        @ExcludeMissing
        fun _couponCode(): JsonField<String> = couponCode

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
          additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
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
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

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
            internal fun from(body: Body) =
                apply {
                    buyerName = body.buyerName
                    currency = body.currency
                    discount = body.discount
                    matchId = body.matchId
                    purchaseMethod = body.purchaseMethod
                    quantity = body.quantity
                    subtotal = body.subtotal
                    tax = body.tax
                    total = body.total
                    unitPrice = body.unitPrice
                    buyerEmail = body.buyerEmail
                    couponCode = body.couponCode
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** Name of the ticket buyer */
            fun buyerName(buyerName: String) = buyerName(JsonField.of(buyerName))

            /**
             * Sets [Builder.buyerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.buyerName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun buyerName(buyerName: JsonField<String>) =
                apply {
                    this.buyerName = buyerName
                }

            /** Currency code (GBP, USD, or EUR) */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) =
                apply {
                    this.currency = currency
                }

            /** Discount amount applied from coupon */
            fun discount(discount: String) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<String>) =
                apply {
                    this.discount = discount
                }

            /** ID of the match */
            fun matchId(matchId: String) = matchId(JsonField.of(matchId))

            /**
             * Sets [Builder.matchId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchId(matchId: JsonField<String>) =
                apply {
                    this.matchId = matchId
                }

            /** How the ticket was purchased */
            fun purchaseMethod(purchaseMethod: PurchaseMethod) = purchaseMethod(JsonField.of(purchaseMethod))

            /**
             * Sets [Builder.purchaseMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchaseMethod] with a well-typed [PurchaseMethod] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun purchaseMethod(purchaseMethod: JsonField<PurchaseMethod>) =
                apply {
                    this.purchaseMethod = purchaseMethod
                }

            /** Number of tickets purchased */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Long>) =
                apply {
                    this.quantity = quantity
                }

            /** Subtotal before discount and tax (unit_price * quantity) */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /**
             * Sets [Builder.subtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtotal] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtotal(subtotal: JsonField<String>) =
                apply {
                    this.subtotal = subtotal
                }

            /** Tax amount (20% UK VAT on discounted subtotal) */
            fun tax(tax: String) = tax(JsonField.of(tax))

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tax(tax: JsonField<String>) =
                apply {
                    this.tax = tax
                }

            /** Final total (subtotal - discount + tax) */
            fun total(total: String) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun total(total: JsonField<String>) =
                apply {
                    this.total = total
                }

            /** Price per ticket (decimal string) */
            fun unitPrice(unitPrice: String) = unitPrice(JsonField.of(unitPrice))

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<String>) =
                apply {
                    this.unitPrice = unitPrice
                }

            /** Email of the ticket buyer */
            fun buyerEmail(buyerEmail: String?) = buyerEmail(JsonField.ofNullable(buyerEmail))

            /** Alias for calling [Builder.buyerEmail] with `buyerEmail.orElse(null)`. */
            fun buyerEmail(buyerEmail: Optional<String>) = buyerEmail(buyerEmail.getOrNull())

            /**
             * Sets [Builder.buyerEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.buyerEmail] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun buyerEmail(buyerEmail: JsonField<String>) =
                apply {
                    this.buyerEmail = buyerEmail
                }

            /** Coupon code applied, if any */
            fun couponCode(couponCode: String?) = couponCode(JsonField.ofNullable(couponCode))

            /** Alias for calling [Builder.couponCode] with `couponCode.orElse(null)`. */
            fun couponCode(couponCode: Optional<String>) = couponCode(couponCode.getOrNull())

            /**
             * Sets [Builder.couponCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponCode(couponCode: JsonField<String>) =
                apply {
                    this.couponCode = couponCode
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
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
            fun build(): Body =
                Body(
                  checkRequired(
                    "buyerName", buyerName
                  ),
                  checkRequired(
                    "currency", currency
                  ),
                  checkRequired(
                    "discount", discount
                  ),
                  checkRequired(
                    "matchId", matchId
                  ),
                  checkRequired(
                    "purchaseMethod", purchaseMethod
                  ),
                  checkRequired(
                    "quantity", quantity
                  ),
                  checkRequired(
                    "subtotal", subtotal
                  ),
                  checkRequired(
                    "tax", tax
                  ),
                  checkRequired(
                    "total", total
                  ),
                  checkRequired(
                    "unitPrice", unitPrice
                  ),
                  buyerEmail,
                  couponCode,
                  additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

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
        internal fun validity(): Int = (if (buyerName.asKnown().isPresent) 1 else 0) + (if (currency.asKnown().isPresent) 1 else 0) + (if (discount.asKnown().isPresent) 1 else 0) + (if (matchId.asKnown().isPresent) 1 else 0) + (purchaseMethod.asKnown().getOrNull()?.validity() ?: 0) + (if (quantity.asKnown().isPresent) 1 else 0) + (if (subtotal.asKnown().isPresent) 1 else 0) + (if (tax.asKnown().isPresent) 1 else 0) + (if (total.asKnown().isPresent) 1 else 0) + (if (unitPrice.asKnown().isPresent) 1 else 0) + (if (buyerEmail.asKnown().isPresent) 1 else 0) + (if (couponCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Body && buyerName == other.buyerName && currency == other.currency && discount == other.discount && matchId == other.matchId && purchaseMethod == other.purchaseMethod && quantity == other.quantity && subtotal == other.subtotal && tax == other.tax && total == other.total && unitPrice == other.unitPrice && buyerEmail == other.buyerEmail && couponCode == other.couponCode && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(buyerName, currency, discount, matchId, purchaseMethod, quantity, subtotal, tax, total, unitPrice, buyerEmail, couponCode, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{buyerName=$buyerName, currency=$currency, discount=$discount, matchId=$matchId, purchaseMethod=$purchaseMethod, quantity=$quantity, subtotal=$subtotal, tax=$tax, total=$total, unitPrice=$unitPrice, buyerEmail=$buyerEmail, couponCode=$couponCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is TicketSaleCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() = "TicketSaleCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
