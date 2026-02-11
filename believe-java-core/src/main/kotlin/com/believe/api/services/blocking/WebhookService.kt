// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.webhooks.RegisteredWebhook
import com.believe.api.models.webhooks.WebhookCreateParams
import com.believe.api.models.webhooks.WebhookCreateResponse
import com.believe.api.models.webhooks.WebhookDeleteParams
import com.believe.api.models.webhooks.WebhookDeleteResponse
import com.believe.api.models.webhooks.WebhookListParams
import com.believe.api.models.webhooks.WebhookRetrieveParams
import com.believe.api.models.webhooks.WebhookTriggerEventParams
import com.believe.api.models.webhooks.WebhookTriggerEventResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

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
    fun create(params: WebhookCreateParams): WebhookCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookCreateResponse

    /** Get details of a specific webhook endpoint. */
    fun retrieve(webhookId: String): RegisteredWebhook =
        retrieve(webhookId, WebhookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegisteredWebhook = retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
    ): RegisteredWebhook = retrieve(webhookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegisteredWebhook

    /** @see retrieve */
    fun retrieve(params: WebhookRetrieveParams): RegisteredWebhook =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(webhookId: String, requestOptions: RequestOptions): RegisteredWebhook =
        retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

    /** Get a list of all registered webhook endpoints. */
    fun list(): List<RegisteredWebhook> = list(WebhookListParams.none())

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RegisteredWebhook>

    /** @see list */
    fun list(params: WebhookListParams = WebhookListParams.none()): List<RegisteredWebhook> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<RegisteredWebhook> =
        list(WebhookListParams.none(), requestOptions)

    /** Unregister a webhook endpoint. It will no longer receive events. */
    fun delete(webhookId: String): WebhookDeleteResponse =
        delete(webhookId, WebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeleteResponse =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
    ): WebhookDeleteResponse = delete(webhookId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeleteResponse

    /** @see delete */
    fun delete(params: WebhookDeleteParams): WebhookDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(webhookId: String, requestOptions: RequestOptions): WebhookDeleteResponse =
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
    fun triggerEvent(params: WebhookTriggerEventParams): WebhookTriggerEventResponse =
        triggerEvent(params, RequestOptions.none())

    /** @see triggerEvent */
    fun triggerEvent(
        params: WebhookTriggerEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookTriggerEventResponse

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks`, but is otherwise the same as
         * [WebhookService.create].
         */
        @MustBeClosed
        fun create(params: WebhookCreateParams): HttpResponseFor<WebhookCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookCreateResponse>

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhook_id}`, but is otherwise the same
         * as [WebhookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(webhookId: String): HttpResponseFor<RegisteredWebhook> =
            retrieve(webhookId, WebhookRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegisteredWebhook> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        ): HttpResponseFor<RegisteredWebhook> = retrieve(webhookId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegisteredWebhook>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: WebhookRetrieveParams): HttpResponseFor<RegisteredWebhook> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegisteredWebhook> =
            retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks`, but is otherwise the same as
         * [WebhookService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<RegisteredWebhook>> = list(WebhookListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RegisteredWebhook>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): HttpResponseFor<List<RegisteredWebhook>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<RegisteredWebhook>> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/{webhook_id}`, but is otherwise the
         * same as [WebhookService.delete].
         */
        @MustBeClosed
        fun delete(webhookId: String): HttpResponseFor<WebhookDeleteResponse> =
            delete(webhookId, WebhookDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeleteResponse> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): HttpResponseFor<WebhookDeleteResponse> = delete(webhookId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: WebhookDeleteParams): HttpResponseFor<WebhookDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookDeleteResponse> =
            delete(webhookId, WebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/trigger`, but is otherwise the same as
         * [WebhookService.triggerEvent].
         */
        @MustBeClosed
        fun triggerEvent(
            params: WebhookTriggerEventParams
        ): HttpResponseFor<WebhookTriggerEventResponse> =
            triggerEvent(params, RequestOptions.none())

        /** @see triggerEvent */
        @MustBeClosed
        fun triggerEvent(
            params: WebhookTriggerEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookTriggerEventResponse>
    }
}
