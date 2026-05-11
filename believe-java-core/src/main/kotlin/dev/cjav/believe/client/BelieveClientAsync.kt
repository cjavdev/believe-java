// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.client

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.ClientGetWelcomeParams
import dev.cjav.believe.models.ClientGetWelcomeResponse
import dev.cjav.believe.services.async.BelieveServiceAsync
import dev.cjav.believe.services.async.BiscuitServiceAsync
import dev.cjav.believe.services.async.CharacterServiceAsync
import dev.cjav.believe.services.async.ClientServiceAsync
import dev.cjav.believe.services.async.CoachingServiceAsync
import dev.cjav.believe.services.async.ConflictServiceAsync
import dev.cjav.believe.services.async.EpisodeServiceAsync
import dev.cjav.believe.services.async.HealthServiceAsync
import dev.cjav.believe.services.async.MatchServiceAsync
import dev.cjav.believe.services.async.PepTalkServiceAsync
import dev.cjav.believe.services.async.PressServiceAsync
import dev.cjav.believe.services.async.QuoteServiceAsync
import dev.cjav.believe.services.async.ReframeServiceAsync
import dev.cjav.believe.services.async.StreamServiceAsync
import dev.cjav.believe.services.async.TeamMemberServiceAsync
import dev.cjav.believe.services.async.TeamServiceAsync
import dev.cjav.believe.services.async.TicketSaleServiceAsync
import dev.cjav.believe.services.async.VersionServiceAsync
import dev.cjav.believe.services.async.WebhookServiceAsync
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

    /** Operations related to Ted Lasso characters */
    fun characters(): CharacterServiceAsync

    /** Operations related to football teams */
    fun teams(): TeamServiceAsync

    fun matches(): MatchServiceAsync

    /** Operations related to TV episodes */
    fun episodes(): EpisodeServiceAsync

    /** Memorable quotes from the show */
    fun quotes(): QuoteServiceAsync

    /** Interactive endpoints for motivation and guidance */
    fun believe(): BelieveServiceAsync

    /** Interactive endpoints for motivation and guidance */
    fun conflicts(): ConflictServiceAsync

    /** Interactive endpoints for motivation and guidance */
    fun reframe(): ReframeServiceAsync

    /** Interactive endpoints for motivation and guidance */
    fun press(): PressServiceAsync

    fun coaching(): CoachingServiceAsync

    /** Interactive endpoints for motivation and guidance */
    fun biscuits(): BiscuitServiceAsync

    /** Server-Sent Events (SSE) streaming endpoints */
    fun pepTalk(): PepTalkServiceAsync

    /** Server-Sent Events (SSE) streaming endpoints */
    fun stream(): StreamServiceAsync

    /**
     * Team members with union types (oneOf) - Players, Coaches, Medical Staff, Equipment Managers
     */
    fun teamMembers(): TeamMemberServiceAsync

    /** Register webhook endpoints and trigger events for testing */
    fun webhooks(): WebhookServiceAsync

    /** Ticket sales with 300 records for practicing pagination, filtering, and financial data */
    fun ticketSales(): TicketSaleServiceAsync

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

        /** Operations related to Ted Lasso characters */
        fun characters(): CharacterServiceAsync.WithRawResponse

        /** Operations related to football teams */
        fun teams(): TeamServiceAsync.WithRawResponse

        fun matches(): MatchServiceAsync.WithRawResponse

        /** Operations related to TV episodes */
        fun episodes(): EpisodeServiceAsync.WithRawResponse

        /** Memorable quotes from the show */
        fun quotes(): QuoteServiceAsync.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun believe(): BelieveServiceAsync.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun conflicts(): ConflictServiceAsync.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun reframe(): ReframeServiceAsync.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun press(): PressServiceAsync.WithRawResponse

        fun coaching(): CoachingServiceAsync.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun biscuits(): BiscuitServiceAsync.WithRawResponse

        /** Server-Sent Events (SSE) streaming endpoints */
        fun pepTalk(): PepTalkServiceAsync.WithRawResponse

        /** Server-Sent Events (SSE) streaming endpoints */
        fun stream(): StreamServiceAsync.WithRawResponse

        /**
         * Team members with union types (oneOf) - Players, Coaches, Medical Staff, Equipment
         * Managers
         */
        fun teamMembers(): TeamMemberServiceAsync.WithRawResponse

        /** Register webhook endpoints and trigger events for testing */
        fun webhooks(): WebhookServiceAsync.WithRawResponse

        /**
         * Ticket sales with 300 records for practicing pagination, filtering, and financial data
         */
        fun ticketSales(): TicketSaleServiceAsync.WithRawResponse

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
