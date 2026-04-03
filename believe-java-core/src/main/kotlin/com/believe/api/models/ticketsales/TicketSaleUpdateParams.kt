// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.ticketsales

import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update specific fields of an existing ticket sale. */
class TicketSaleUpdateParams
private constructor(
    private val ticketSaleId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun ticketSaleId(): Optional<String> = Optional.ofNullable(ticketSaleId)

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun buyerEmail(): Optional<String> = body.buyerEmail()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun buyerName(): Optional<String> = body.buyerName()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun couponCode(): Optional<String> = body.couponCode()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = body.currency()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun discount(): Optional<String> = body.discount()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun matchId(): Optional<String> = body.matchId()

    /**
     * How the ticket was purchased.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purchaseMethod(): Optional<PurchaseMethod> = body.purchaseMethod()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Optional<Long> = body.quantity()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subtotal(): Optional<String> = body.subtotal()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tax(): Optional<String> = body.tax()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun total(): Optional<String> = body.total()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unitPrice(): Optional<String> = body.unitPrice()

    /**
     * Returns the raw JSON value of [buyerEmail].
     *
     * Unlike [buyerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _buyerEmail(): JsonField<String> = body._buyerEmail()

    /**
     * Returns the raw JSON value of [buyerName].
     *
     * Unlike [buyerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _buyerName(): JsonField<String> = body._buyerName()

    /**
     * Returns the raw JSON value of [couponCode].
     *
     * Unlike [couponCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _couponCode(): JsonField<String> = body._couponCode()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TicketSaleUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TicketSaleUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TicketSaleUpdateParams]. */
    class Builder internal constructor() {

        private var ticketSaleId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ticketSaleUpdateParams: TicketSaleUpdateParams) = apply {
            ticketSaleId = ticketSaleUpdateParams.ticketSaleId
            body = ticketSaleUpdateParams.body.toBuilder()
            additionalHeaders = ticketSaleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ticketSaleUpdateParams.additionalQueryParams.toBuilder()
        }

        fun ticketSaleId(ticketSaleId: String?) = apply { this.ticketSaleId = ticketSaleId }

        /** Alias for calling [Builder.ticketSaleId] with `ticketSaleId.orElse(null)`. */
        fun ticketSaleId(ticketSaleId: Optional<String>) = ticketSaleId(ticketSaleId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [buyerEmail]
         * - [buyerName]
         * - [couponCode]
         * - [currency]
         * - [discount]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun buyerEmail(buyerEmail: String?) = apply { body.buyerEmail(buyerEmail) }

        /** Alias for calling [Builder.buyerEmail] with `buyerEmail.orElse(null)`. */
        fun buyerEmail(buyerEmail: Optional<String>) = buyerEmail(buyerEmail.getOrNull())

        /**
         * Sets [Builder.buyerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyerEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buyerEmail(buyerEmail: JsonField<String>) = apply { body.buyerEmail(buyerEmail) }

        fun buyerName(buyerName: String?) = apply { body.buyerName(buyerName) }

        /** Alias for calling [Builder.buyerName] with `buyerName.orElse(null)`. */
        fun buyerName(buyerName: Optional<String>) = buyerName(buyerName.getOrNull())

        /**
         * Sets [Builder.buyerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buyerName(buyerName: JsonField<String>) = apply { body.buyerName(buyerName) }

        fun couponCode(couponCode: String?) = apply { body.couponCode(couponCode) }

        /** Alias for calling [Builder.couponCode] with `couponCode.orElse(null)`. */
        fun couponCode(couponCode: Optional<String>) = couponCode(couponCode.getOrNull())

        /**
         * Sets [Builder.couponCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.couponCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun couponCode(couponCode: JsonField<String>) = apply { body.couponCode(couponCode) }

        fun currency(currency: String?) = apply { body.currency(currency) }

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        fun discount(discount: String?) = apply { body.discount(discount) }

        /** Alias for calling [Builder.discount] with `discount.orElse(null)`. */
        fun discount(discount: Optional<String>) = discount(discount.getOrNull())

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun discount(discount: JsonField<String>) = apply { body.discount(discount) }

        fun matchId(matchId: String?) = apply { body.matchId(matchId) }

        /** Alias for calling [Builder.matchId] with `matchId.orElse(null)`. */
        fun matchId(matchId: Optional<String>) = matchId(matchId.getOrNull())

        /**
         * Sets [Builder.matchId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun matchId(matchId: JsonField<String>) = apply { body.matchId(matchId) }

        /** How the ticket was purchased. */
        fun purchaseMethod(purchaseMethod: PurchaseMethod?) = apply {
            body.purchaseMethod(purchaseMethod)
        }

        /** Alias for calling [Builder.purchaseMethod] with `purchaseMethod.orElse(null)`. */
        fun purchaseMethod(purchaseMethod: Optional<PurchaseMethod>) =
            purchaseMethod(purchaseMethod.getOrNull())

        /**
         * Sets [Builder.purchaseMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchaseMethod] with a well-typed [PurchaseMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purchaseMethod(purchaseMethod: JsonField<PurchaseMethod>) = apply {
            body.purchaseMethod(purchaseMethod)
        }

        fun quantity(quantity: Long?) = apply { body.quantity(quantity) }

        /**
         * Alias for [Builder.quantity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun quantity(quantity: Long) = quantity(quantity as Long?)

        /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
        fun quantity(quantity: Optional<Long>) = quantity(quantity.getOrNull())

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Long>) = apply { body.quantity(quantity) }

        fun subtotal(subtotal: String?) = apply { body.subtotal(subtotal) }

        /** Alias for calling [Builder.subtotal] with `subtotal.orElse(null)`. */
        fun subtotal(subtotal: Optional<String>) = subtotal(subtotal.getOrNull())

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<String>) = apply { body.subtotal(subtotal) }

        fun tax(tax: String?) = apply { body.tax(tax) }

        /** Alias for calling [Builder.tax] with `tax.orElse(null)`. */
        fun tax(tax: Optional<String>) = tax(tax.getOrNull())

        /**
         * Sets [Builder.tax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tax] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tax(tax: JsonField<String>) = apply { body.tax(tax) }

        fun total(total: String?) = apply { body.total(total) }

        /** Alias for calling [Builder.total] with `total.orElse(null)`. */
        fun total(total: Optional<String>) = total(total.getOrNull())

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<String>) = apply { body.total(total) }

        fun unitPrice(unitPrice: String?) = apply { body.unitPrice(unitPrice) }

        /** Alias for calling [Builder.unitPrice] with `unitPrice.orElse(null)`. */
        fun unitPrice(unitPrice: Optional<String>) = unitPrice(unitPrice.getOrNull())

        /**
         * Sets [Builder.unitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unitPrice(unitPrice: JsonField<String>) = apply { body.unitPrice(unitPrice) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [TicketSaleUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TicketSaleUpdateParams =
            TicketSaleUpdateParams(
                ticketSaleId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> ticketSaleId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Model for updating a ticket sale (all fields optional). */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val buyerEmail: JsonField<String>,
        private val buyerName: JsonField<String>,
        private val couponCode: JsonField<String>,
        private val currency: JsonField<String>,
        private val discount: JsonField<String>,
        private val matchId: JsonField<String>,
        private val purchaseMethod: JsonField<PurchaseMethod>,
        private val quantity: JsonField<Long>,
        private val subtotal: JsonField<String>,
        private val tax: JsonField<String>,
        private val total: JsonField<String>,
        private val unitPrice: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("buyer_email")
            @ExcludeMissing
            buyerEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("buyer_name")
            @ExcludeMissing
            buyerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("coupon_code")
            @ExcludeMissing
            couponCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount")
            @ExcludeMissing
            discount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("match_id") @ExcludeMissing matchId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("purchase_method")
            @ExcludeMissing
            purchaseMethod: JsonField<PurchaseMethod> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("subtotal")
            @ExcludeMissing
            subtotal: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            unitPrice: JsonField<String> = JsonMissing.of(),
        ) : this(
            buyerEmail,
            buyerName,
            couponCode,
            currency,
            discount,
            matchId,
            purchaseMethod,
            quantity,
            subtotal,
            tax,
            total,
            unitPrice,
            mutableMapOf(),
        )

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun buyerEmail(): Optional<String> = buyerEmail.getOptional("buyer_email")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun buyerName(): Optional<String> = buyerName.getOptional("buyer_name")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun couponCode(): Optional<String> = couponCode.getOptional("coupon_code")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun discount(): Optional<String> = discount.getOptional("discount")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun matchId(): Optional<String> = matchId.getOptional("match_id")

        /**
         * How the ticket was purchased.
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun purchaseMethod(): Optional<PurchaseMethod> =
            purchaseMethod.getOptional("purchase_method")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quantity(): Optional<Long> = quantity.getOptional("quantity")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subtotal(): Optional<String> = subtotal.getOptional("subtotal")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tax(): Optional<String> = tax.getOptional("tax")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun total(): Optional<String> = total.getOptional("total")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitPrice(): Optional<String> = unitPrice.getOptional("unit_price")

        /**
         * Returns the raw JSON value of [buyerEmail].
         *
         * Unlike [buyerEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("buyer_email")
        @ExcludeMissing
        fun _buyerEmail(): JsonField<String> = buyerEmail

        /**
         * Returns the raw JSON value of [buyerName].
         *
         * Unlike [buyerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("buyer_name") @ExcludeMissing fun _buyerName(): JsonField<String> = buyerName

        /**
         * Returns the raw JSON value of [couponCode].
         *
         * Unlike [couponCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coupon_code")
        @ExcludeMissing
        fun _couponCode(): JsonField<String> = couponCode

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
         * Unlike [purchaseMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var buyerEmail: JsonField<String> = JsonMissing.of()
            private var buyerName: JsonField<String> = JsonMissing.of()
            private var couponCode: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var discount: JsonField<String> = JsonMissing.of()
            private var matchId: JsonField<String> = JsonMissing.of()
            private var purchaseMethod: JsonField<PurchaseMethod> = JsonMissing.of()
            private var quantity: JsonField<Long> = JsonMissing.of()
            private var subtotal: JsonField<String> = JsonMissing.of()
            private var tax: JsonField<String> = JsonMissing.of()
            private var total: JsonField<String> = JsonMissing.of()
            private var unitPrice: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                buyerEmail = body.buyerEmail
                buyerName = body.buyerName
                couponCode = body.couponCode
                currency = body.currency
                discount = body.discount
                matchId = body.matchId
                purchaseMethod = body.purchaseMethod
                quantity = body.quantity
                subtotal = body.subtotal
                tax = body.tax
                total = body.total
                unitPrice = body.unitPrice
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun buyerEmail(buyerEmail: String?) = buyerEmail(JsonField.ofNullable(buyerEmail))

            /** Alias for calling [Builder.buyerEmail] with `buyerEmail.orElse(null)`. */
            fun buyerEmail(buyerEmail: Optional<String>) = buyerEmail(buyerEmail.getOrNull())

            /**
             * Sets [Builder.buyerEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.buyerEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun buyerEmail(buyerEmail: JsonField<String>) = apply { this.buyerEmail = buyerEmail }

            fun buyerName(buyerName: String?) = buyerName(JsonField.ofNullable(buyerName))

            /** Alias for calling [Builder.buyerName] with `buyerName.orElse(null)`. */
            fun buyerName(buyerName: Optional<String>) = buyerName(buyerName.getOrNull())

            /**
             * Sets [Builder.buyerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.buyerName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun buyerName(buyerName: JsonField<String>) = apply { this.buyerName = buyerName }

            fun couponCode(couponCode: String?) = couponCode(JsonField.ofNullable(couponCode))

            /** Alias for calling [Builder.couponCode] with `couponCode.orElse(null)`. */
            fun couponCode(couponCode: Optional<String>) = couponCode(couponCode.getOrNull())

            /**
             * Sets [Builder.couponCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponCode(couponCode: JsonField<String>) = apply { this.couponCode = couponCode }

            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
            fun currency(currency: Optional<String>) = currency(currency.getOrNull())

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun discount(discount: String?) = discount(JsonField.ofNullable(discount))

            /** Alias for calling [Builder.discount] with `discount.orElse(null)`. */
            fun discount(discount: Optional<String>) = discount(discount.getOrNull())

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<String>) = apply { this.discount = discount }

            fun matchId(matchId: String?) = matchId(JsonField.ofNullable(matchId))

            /** Alias for calling [Builder.matchId] with `matchId.orElse(null)`. */
            fun matchId(matchId: Optional<String>) = matchId(matchId.getOrNull())

            /**
             * Sets [Builder.matchId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchId(matchId: JsonField<String>) = apply { this.matchId = matchId }

            /** How the ticket was purchased. */
            fun purchaseMethod(purchaseMethod: PurchaseMethod?) =
                purchaseMethod(JsonField.ofNullable(purchaseMethod))

            /** Alias for calling [Builder.purchaseMethod] with `purchaseMethod.orElse(null)`. */
            fun purchaseMethod(purchaseMethod: Optional<PurchaseMethod>) =
                purchaseMethod(purchaseMethod.getOrNull())

            /**
             * Sets [Builder.purchaseMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchaseMethod] with a well-typed [PurchaseMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun purchaseMethod(purchaseMethod: JsonField<PurchaseMethod>) = apply {
                this.purchaseMethod = purchaseMethod
            }

            fun quantity(quantity: Long?) = quantity(JsonField.ofNullable(quantity))

            /**
             * Alias for [Builder.quantity].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun quantity(quantity: Long) = quantity(quantity as Long?)

            /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
            fun quantity(quantity: Optional<Long>) = quantity(quantity.getOrNull())

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            fun subtotal(subtotal: String?) = subtotal(JsonField.ofNullable(subtotal))

            /** Alias for calling [Builder.subtotal] with `subtotal.orElse(null)`. */
            fun subtotal(subtotal: Optional<String>) = subtotal(subtotal.getOrNull())

            /**
             * Sets [Builder.subtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtotal] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            fun tax(tax: String?) = tax(JsonField.ofNullable(tax))

            /** Alias for calling [Builder.tax] with `tax.orElse(null)`. */
            fun tax(tax: Optional<String>) = tax(tax.getOrNull())

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<String>) = apply { this.tax = tax }

            fun total(total: String?) = total(JsonField.ofNullable(total))

            /** Alias for calling [Builder.total] with `total.orElse(null)`. */
            fun total(total: Optional<String>) = total(total.getOrNull())

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun total(total: JsonField<String>) = apply { this.total = total }

            fun unitPrice(unitPrice: String?) = unitPrice(JsonField.ofNullable(unitPrice))

            /** Alias for calling [Builder.unitPrice] with `unitPrice.orElse(null)`. */
            fun unitPrice(unitPrice: Optional<String>) = unitPrice(unitPrice.getOrNull())

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<String>) = apply { this.unitPrice = unitPrice }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    buyerEmail,
                    buyerName,
                    couponCode,
                    currency,
                    discount,
                    matchId,
                    purchaseMethod,
                    quantity,
                    subtotal,
                    tax,
                    total,
                    unitPrice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            buyerEmail()
            buyerName()
            couponCode()
            currency()
            discount()
            matchId()
            purchaseMethod().ifPresent { it.validate() }
            quantity()
            subtotal()
            tax()
            total()
            unitPrice()
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
            (if (buyerEmail.asKnown().isPresent) 1 else 0) +
                (if (buyerName.asKnown().isPresent) 1 else 0) +
                (if (couponCode.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (discount.asKnown().isPresent) 1 else 0) +
                (if (matchId.asKnown().isPresent) 1 else 0) +
                (purchaseMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (subtotal.asKnown().isPresent) 1 else 0) +
                (if (tax.asKnown().isPresent) 1 else 0) +
                (if (total.asKnown().isPresent) 1 else 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                buyerEmail == other.buyerEmail &&
                buyerName == other.buyerName &&
                couponCode == other.couponCode &&
                currency == other.currency &&
                discount == other.discount &&
                matchId == other.matchId &&
                purchaseMethod == other.purchaseMethod &&
                quantity == other.quantity &&
                subtotal == other.subtotal &&
                tax == other.tax &&
                total == other.total &&
                unitPrice == other.unitPrice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                buyerEmail,
                buyerName,
                couponCode,
                currency,
                discount,
                matchId,
                purchaseMethod,
                quantity,
                subtotal,
                tax,
                total,
                unitPrice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{buyerEmail=$buyerEmail, buyerName=$buyerName, couponCode=$couponCode, currency=$currency, discount=$discount, matchId=$matchId, purchaseMethod=$purchaseMethod, quantity=$quantity, subtotal=$subtotal, tax=$tax, total=$total, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TicketSaleUpdateParams &&
            ticketSaleId == other.ticketSaleId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(ticketSaleId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TicketSaleUpdateParams{ticketSaleId=$ticketSaleId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
