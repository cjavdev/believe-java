// File generated from our OpenAPI spec by Stainless.

package com.believe.api.client

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.ClientGetWelcomeParams
import com.believe.api.models.ClientGetWelcomeResponse
import com.believe.api.services.blocking.BelieveService
import com.believe.api.services.blocking.BiscuitService
import com.believe.api.services.blocking.CharacterService
import com.believe.api.services.blocking.ClientService
import com.believe.api.services.blocking.CoachingService
import com.believe.api.services.blocking.ConflictService
import com.believe.api.services.blocking.EpisodeService
import com.believe.api.services.blocking.HealthService
import com.believe.api.services.blocking.MatchService
import com.believe.api.services.blocking.PepTalkService
import com.believe.api.services.blocking.PressService
import com.believe.api.services.blocking.QuoteService
import com.believe.api.services.blocking.ReframeService
import com.believe.api.services.blocking.StreamService
import com.believe.api.services.blocking.TeamMemberService
import com.believe.api.services.blocking.TeamService
import com.believe.api.services.blocking.TicketSaleService
import com.believe.api.services.blocking.VersionService
import com.believe.api.services.blocking.WebhookService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * A client for interacting with the Believe REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
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
interface BelieveClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): BelieveClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BelieveClient

    /** Operations related to Ted Lasso characters */
    fun characters(): CharacterService

    /** Operations related to football teams */
    fun teams(): TeamService

    fun matches(): MatchService

    /** Operations related to TV episodes */
    fun episodes(): EpisodeService

    /** Memorable quotes from the show */
    fun quotes(): QuoteService

    /** Interactive endpoints for motivation and guidance */
    fun believe(): BelieveService

    /** Interactive endpoints for motivation and guidance */
    fun conflicts(): ConflictService

    /** Interactive endpoints for motivation and guidance */
    fun reframe(): ReframeService

    /** Interactive endpoints for motivation and guidance */
    fun press(): PressService

    fun coaching(): CoachingService

    /** Interactive endpoints for motivation and guidance */
    fun biscuits(): BiscuitService

    /** Server-Sent Events (SSE) streaming endpoints */
    fun pepTalk(): PepTalkService

    /** Server-Sent Events (SSE) streaming endpoints */
    fun stream(): StreamService

    /**
     * Team members with union types (oneOf) - Players, Coaches, Medical Staff, Equipment Managers
     */
    fun teamMembers(): TeamMemberService

    /** Register webhook endpoints and trigger events for testing */
    fun webhooks(): WebhookService

    /** Ticket sales with 300 records for practicing pagination, filtering, and financial data */
    fun ticketSales(): TicketSaleService

    fun health(): HealthService

    fun version(): VersionService

    fun client(): ClientService

    /** Get a warm welcome and overview of available endpoints. */
    fun getWelcome(): ClientGetWelcomeResponse = getWelcome(ClientGetWelcomeParams.none())

    /** @see getWelcome */
    fun getWelcome(
        params: ClientGetWelcomeParams = ClientGetWelcomeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientGetWelcomeResponse

    /** @see getWelcome */
    fun getWelcome(
        params: ClientGetWelcomeParams = ClientGetWelcomeParams.none()
    ): ClientGetWelcomeResponse = getWelcome(params, RequestOptions.none())

    /** @see getWelcome */
    fun getWelcome(requestOptions: RequestOptions): ClientGetWelcomeResponse =
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

    /** A view of [BelieveClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BelieveClient.WithRawResponse

        /** Operations related to Ted Lasso characters */
        fun characters(): CharacterService.WithRawResponse

        /** Operations related to football teams */
        fun teams(): TeamService.WithRawResponse

        fun matches(): MatchService.WithRawResponse

        /** Operations related to TV episodes */
        fun episodes(): EpisodeService.WithRawResponse

        /** Memorable quotes from the show */
        fun quotes(): QuoteService.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun believe(): BelieveService.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun conflicts(): ConflictService.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun reframe(): ReframeService.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun press(): PressService.WithRawResponse

        fun coaching(): CoachingService.WithRawResponse

        /** Interactive endpoints for motivation and guidance */
        fun biscuits(): BiscuitService.WithRawResponse

        /** Server-Sent Events (SSE) streaming endpoints */
        fun pepTalk(): PepTalkService.WithRawResponse

        /** Server-Sent Events (SSE) streaming endpoints */
        fun stream(): StreamService.WithRawResponse

        /**
         * Team members with union types (oneOf) - Players, Coaches, Medical Staff, Equipment
         * Managers
         */
        fun teamMembers(): TeamMemberService.WithRawResponse

        /** Register webhook endpoints and trigger events for testing */
        fun webhooks(): WebhookService.WithRawResponse

        /**
         * Ticket sales with 300 records for practicing pagination, filtering, and financial data
         */
        fun ticketSales(): TicketSaleService.WithRawResponse

        fun health(): HealthService.WithRawResponse

        fun version(): VersionService.WithRawResponse

        fun client(): ClientService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /`, but is otherwise the same as
         * [BelieveClient.getWelcome].
         */
        @MustBeClosed
        fun getWelcome(): HttpResponseFor<ClientGetWelcomeResponse> =
            getWelcome(ClientGetWelcomeParams.none())

        /** @see getWelcome */
        @MustBeClosed
        fun getWelcome(
            params: ClientGetWelcomeParams = ClientGetWelcomeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientGetWelcomeResponse>

        /** @see getWelcome */
        @MustBeClosed
        fun getWelcome(
            params: ClientGetWelcomeParams = ClientGetWelcomeParams.none()
        ): HttpResponseFor<ClientGetWelcomeResponse> = getWelcome(params, RequestOptions.none())

        /** @see getWelcome */
        @MustBeClosed
        fun getWelcome(requestOptions: RequestOptions): HttpResponseFor<ClientGetWelcomeResponse> =
            getWelcome(ClientGetWelcomeParams.none(), requestOptions)
    }
}
