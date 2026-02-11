// File generated from our OpenAPI spec by Stainless.

package com.believe.api.client

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.ClientGetWelcomeParams
import com.believe.api.models.ClientGetWelcomeResponse
import com.believe.api.services.async.BelieveServiceAsync
import com.believe.api.services.async.BiscuitServiceAsync
import com.believe.api.services.async.CharacterServiceAsync
import com.believe.api.services.async.ClientServiceAsync
import com.believe.api.services.async.CoachingServiceAsync
import com.believe.api.services.async.ConflictServiceAsync
import com.believe.api.services.async.EpisodeServiceAsync
import com.believe.api.services.async.HealthServiceAsync
import com.believe.api.services.async.MatchServiceAsync
import com.believe.api.services.async.PepTalkServiceAsync
import com.believe.api.services.async.PressServiceAsync
import com.believe.api.services.async.QuoteServiceAsync
import com.believe.api.services.async.ReframeServiceAsync
import com.believe.api.services.async.StreamServiceAsync
import com.believe.api.services.async.TeamMemberServiceAsync
import com.believe.api.services.async.TeamServiceAsync
import com.believe.api.services.async.VersionServiceAsync
import com.believe.api.services.async.WebhookServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * A client for interacting with the Believe REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface BelieveClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): BelieveClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BelieveClientAsync

    fun characters(): CharacterServiceAsync

    fun teams(): TeamServiceAsync

    fun matches(): MatchServiceAsync

    fun episodes(): EpisodeServiceAsync

    fun quotes(): QuoteServiceAsync

    fun believe(): BelieveServiceAsync

    fun conflicts(): ConflictServiceAsync

    fun reframe(): ReframeServiceAsync

    fun press(): PressServiceAsync

    fun coaching(): CoachingServiceAsync

    fun biscuits(): BiscuitServiceAsync

    fun pepTalk(): PepTalkServiceAsync

    fun stream(): StreamServiceAsync

    fun teamMembers(): TeamMemberServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun health(): HealthServiceAsync

    fun version(): VersionServiceAsync

    fun client(): ClientServiceAsync

    /** Get a warm welcome and overview of available endpoints. */
    fun getWelcome(): CompletableFuture<ClientGetWelcomeResponse> =
        getWelcome(ClientGetWelcomeParams.none())

    /** @see getWelcome */
    fun getWelcome(
        params: ClientGetWelcomeParams = ClientGetWelcomeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClientGetWelcomeResponse>

    /** @see getWelcome */
    fun getWelcome(
        params: ClientGetWelcomeParams = ClientGetWelcomeParams.none()
    ): CompletableFuture<ClientGetWelcomeResponse> = getWelcome(params, RequestOptions.none())

    /** @see getWelcome */
    fun getWelcome(requestOptions: RequestOptions): CompletableFuture<ClientGetWelcomeResponse> =
        getWelcome(ClientGetWelcomeParams.none(), requestOptions)

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [BelieveClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BelieveClientAsync.WithRawResponse

        fun characters(): CharacterServiceAsync.WithRawResponse

        fun teams(): TeamServiceAsync.WithRawResponse

        fun matches(): MatchServiceAsync.WithRawResponse

        fun episodes(): EpisodeServiceAsync.WithRawResponse

        fun quotes(): QuoteServiceAsync.WithRawResponse

        fun believe(): BelieveServiceAsync.WithRawResponse

        fun conflicts(): ConflictServiceAsync.WithRawResponse

        fun reframe(): ReframeServiceAsync.WithRawResponse

        fun press(): PressServiceAsync.WithRawResponse

        fun coaching(): CoachingServiceAsync.WithRawResponse

        fun biscuits(): BiscuitServiceAsync.WithRawResponse

        fun pepTalk(): PepTalkServiceAsync.WithRawResponse

        fun stream(): StreamServiceAsync.WithRawResponse

        fun teamMembers(): TeamMemberServiceAsync.WithRawResponse

        fun webhooks(): WebhookServiceAsync.WithRawResponse

        fun health(): HealthServiceAsync.WithRawResponse

        fun version(): VersionServiceAsync.WithRawResponse

        fun client(): ClientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /`, but is otherwise the same as
         * [BelieveClientAsync.getWelcome].
         */
        fun getWelcome(): CompletableFuture<HttpResponseFor<ClientGetWelcomeResponse>> =
            getWelcome(ClientGetWelcomeParams.none())

        /** @see getWelcome */
        fun getWelcome(
            params: ClientGetWelcomeParams = ClientGetWelcomeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClientGetWelcomeResponse>>

        /** @see getWelcome */
        fun getWelcome(
            params: ClientGetWelcomeParams = ClientGetWelcomeParams.none()
        ): CompletableFuture<HttpResponseFor<ClientGetWelcomeResponse>> =
            getWelcome(params, RequestOptions.none())

        /** @see getWelcome */
        fun getWelcome(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ClientGetWelcomeResponse>> =
            getWelcome(ClientGetWelcomeParams.none(), requestOptions)
    }
}
