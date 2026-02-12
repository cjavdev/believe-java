// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.errors.BelieveInvalidDataException
import com.believe.api.models.webhooks.RegisteredWebhook
import com.believe.api.models.webhooks.UnwrapWebhookEvent
import com.believe.api.models.webhooks.WebhookCreateParams
import com.believe.api.models.webhooks.WebhookCreateResponse
import com.believe.api.models.webhooks.WebhookDeleteParams
import com.believe.api.models.webhooks.WebhookDeleteResponse
import com.believe.api.models.webhooks.WebhookListParams
import com.believe.api.models.webhooks.WebhookRetrieveParams
import com.believe.api.models.webhooks.WebhookTriggerEventParams
import com.believe.api.models.webhooks.WebhookTriggerEventResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync

    /**
     * Register a new webhook endpoint to receive event notifications.
     *
     * ## Event Types
     *
     * Available event types to subscribe to:
     * - `match.completed` - Fired when a football match ends
     * - `team_member.transferred` - Fired when a player/coach joins or leaves a team
     *
     * If no event types are specified, the webhook will receive all event types.
     *
     * ## Webhook Signatures
     *
     * All webhook deliveries include Standard Webhooks signature headers:
     * - `webhook-id` - Unique message identifier
     * - `webhook-timestamp` - Unix timestamp of when the webhook was sent
     * - `webhook-signature` - HMAC-SHA256 signature in format `v1,{base64_signature}`
     *
     * Store the returned `secret` securely - you'll need it to verify webhook signatures.
     */
    fun create(params: WebhookCreateParams): CompletableFuture<WebhookCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookCreateResponse>

    /** Get details of a specific webhook endpoint. */
    fun retrieve(webhookId: String): CompletableFuture<RegisteredWebhook> =
        retrieve(webhookId, WebhookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegisteredWebhook> =
        retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
    ): CompletableFuture<RegisteredWebhook> = retrieve(webhookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegisteredWebhook>

    /** @see retrieve */
    fun retrieve(params: WebhookRetrieveParams): CompletableFuture<RegisteredWebhook> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RegisteredWebhook> =
        retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

    /** Get a list of all registered webhook endpoints. */
    fun list(): CompletableFuture<List<RegisteredWebhook>> = list(WebhookListParams.none())

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RegisteredWebhook>>

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none()
    ): CompletableFuture<List<RegisteredWebhook>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<RegisteredWebhook>> =
        list(WebhookListParams.none(), requestOptions)

    /** Unregister a webhook endpoint. It will no longer receive events. */
    fun delete(webhookId: String): CompletableFuture<WebhookDeleteResponse> =
        delete(webhookId, WebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeleteResponse> =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
    ): CompletableFuture<WebhookDeleteResponse> = delete(webhookId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeleteResponse>

    /** @see delete */
    fun delete(params: WebhookDeleteParams): CompletableFuture<WebhookDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDeleteResponse> =
        delete(webhookId, WebhookDeleteParams.none(), requestOptions)

    /**
     * Trigger a webhook event and deliver it to all subscribed endpoints.
     *
     * This endpoint is useful for testing your webhook integration. It will:
     * 1. Generate an event with the specified type and payload
     * 2. Find all webhooks subscribed to that event type
     * 3. Send a POST request to each webhook URL with signature headers
     * 4. Return the delivery results
     *
     * ## Event Payload
     *
     * You can provide a custom payload, or leave it empty to use a sample payload.
     *
     * ## Webhook Signature Headers
     *
     * Each webhook delivery includes:
     * - `webhook-id` - Unique event identifier (e.g., `evt_abc123...`)
     * - `webhook-timestamp` - Unix timestamp
     * - `webhook-signature` - HMAC-SHA256 signature (`v1,{base64}`)
     *
     * To verify signatures, compute:
     * ```
     * signature = HMAC-SHA256(
     *     key = base64_decode(secret_without_prefix),
     *     message = "{timestamp}.{raw_json_payload}"
     * )
     * ```
     */
    fun triggerEvent(
        params: WebhookTriggerEventParams
    ): CompletableFuture<WebhookTriggerEventResponse> = triggerEvent(params, RequestOptions.none())

    /** @see triggerEvent */
    fun triggerEvent(
        params: WebhookTriggerEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookTriggerEventResponse>

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws BelieveInvalidDataException if the body could not be parsed.
     */
    fun unwrap(body: String): UnwrapWebhookEvent

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.create].
         */
        fun create(
            params: WebhookCreateParams
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhook_id}`, but is otherwise the same
         * as [WebhookServiceAsync.retrieve].
         */
        fun retrieve(webhookId: String): CompletableFuture<HttpResponseFor<RegisteredWebhook>> =
            retrieve(webhookId, WebhookRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegisteredWebhook>> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RegisteredWebhook>> =
            retrieve(webhookId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegisteredWebhook>>

        /** @see retrieve */
        fun retrieve(
            params: WebhookRetrieveParams
        ): CompletableFuture<HttpResponseFor<RegisteredWebhook>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RegisteredWebhook>> =
            retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<RegisteredWebhook>>> =
            list(WebhookListParams.none())

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RegisteredWebhook>>>

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): CompletableFuture<HttpResponseFor<List<RegisteredWebhook>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<RegisteredWebhook>>> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/{webhook_id}`, but is otherwise the
         * same as [WebhookServiceAsync.delete].
         */
        fun delete(webhookId: String): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(webhookId, WebhookDeleteParams.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(webhookId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>>

        /** @see delete */
        fun delete(
            params: WebhookDeleteParams
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(webhookId, WebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/trigger`, but is otherwise the same as
         * [WebhookServiceAsync.triggerEvent].
         */
        fun triggerEvent(
            params: WebhookTriggerEventParams
        ): CompletableFuture<HttpResponseFor<WebhookTriggerEventResponse>> =
            triggerEvent(params, RequestOptions.none())

        /** @see triggerEvent */
        fun triggerEvent(
            params: WebhookTriggerEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookTriggerEventResponse>>
    }
}
