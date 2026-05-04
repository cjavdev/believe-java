// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.client

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.getPackageVersion
import dev.cjav.believe.core.handlers.errorBodyHandler
import dev.cjav.believe.core.handlers.errorHandler
import dev.cjav.believe.core.handlers.jsonHandler
import dev.cjav.believe.core.http.HttpMethod
import dev.cjav.believe.core.http.HttpRequest
import dev.cjav.believe.core.http.HttpResponse
import dev.cjav.believe.core.http.HttpResponse.Handler
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.core.http.parseable
import dev.cjav.believe.core.prepare
import dev.cjav.believe.models.ClientGetWelcomeParams
import dev.cjav.believe.models.ClientGetWelcomeResponse
import dev.cjav.believe.services.blocking.BelieveService
import dev.cjav.believe.services.blocking.BelieveServiceImpl
import dev.cjav.believe.services.blocking.BiscuitService
import dev.cjav.believe.services.blocking.BiscuitServiceImpl
import dev.cjav.believe.services.blocking.CharacterService
import dev.cjav.believe.services.blocking.CharacterServiceImpl
import dev.cjav.believe.services.blocking.ClientService
import dev.cjav.believe.services.blocking.ClientServiceImpl
import dev.cjav.believe.services.blocking.CoachingService
import dev.cjav.believe.services.blocking.CoachingServiceImpl
import dev.cjav.believe.services.blocking.ConflictService
import dev.cjav.believe.services.blocking.ConflictServiceImpl
import dev.cjav.believe.services.blocking.EpisodeService
import dev.cjav.believe.services.blocking.EpisodeServiceImpl
import dev.cjav.believe.services.blocking.HealthService
import dev.cjav.believe.services.blocking.HealthServiceImpl
import dev.cjav.believe.services.blocking.MatchService
import dev.cjav.believe.services.blocking.MatchServiceImpl
import dev.cjav.believe.services.blocking.PepTalkService
import dev.cjav.believe.services.blocking.PepTalkServiceImpl
import dev.cjav.believe.services.blocking.PressService
import dev.cjav.believe.services.blocking.PressServiceImpl
import dev.cjav.believe.services.blocking.QuoteService
import dev.cjav.believe.services.blocking.QuoteServiceImpl
import dev.cjav.believe.services.blocking.ReframeService
import dev.cjav.believe.services.blocking.ReframeServiceImpl
import dev.cjav.believe.services.blocking.StreamService
import dev.cjav.believe.services.blocking.StreamServiceImpl
import dev.cjav.believe.services.blocking.TeamMemberService
import dev.cjav.believe.services.blocking.TeamMemberServiceImpl
import dev.cjav.believe.services.blocking.TeamService
import dev.cjav.believe.services.blocking.TeamServiceImpl
import dev.cjav.believe.services.blocking.TicketSaleService
import dev.cjav.believe.services.blocking.TicketSaleServiceImpl
import dev.cjav.believe.services.blocking.VersionService
import dev.cjav.believe.services.blocking.VersionServiceImpl
import dev.cjav.believe.services.blocking.WebhookService
import dev.cjav.believe.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class BelieveClientImpl(private val clientOptions: ClientOptions) : BelieveClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: BelieveClientAsync by lazy { BelieveClientAsyncImpl(clientOptions) }

    private val withRawResponse: BelieveClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val characters: CharacterService by lazy {
        CharacterServiceImpl(clientOptionsWithUserAgent)
    }

    private val teams: TeamService by lazy { TeamServiceImpl(clientOptionsWithUserAgent) }

    private val matches: MatchService by lazy { MatchServiceImpl(clientOptionsWithUserAgent) }

    private val episodes: EpisodeService by lazy { EpisodeServiceImpl(clientOptionsWithUserAgent) }

    private val quotes: QuoteService by lazy { QuoteServiceImpl(clientOptionsWithUserAgent) }

    private val believe: BelieveService by lazy { BelieveServiceImpl(clientOptionsWithUserAgent) }

    private val conflicts: ConflictService by lazy {
        ConflictServiceImpl(clientOptionsWithUserAgent)
    }

    private val reframe: ReframeService by lazy { ReframeServiceImpl(clientOptionsWithUserAgent) }

    private val press: PressService by lazy { PressServiceImpl(clientOptionsWithUserAgent) }

    private val coaching: CoachingService by lazy {
        CoachingServiceImpl(clientOptionsWithUserAgent)
    }

    private val biscuits: BiscuitService by lazy { BiscuitServiceImpl(clientOptionsWithUserAgent) }

    private val pepTalk: PepTalkService by lazy { PepTalkServiceImpl(clientOptionsWithUserAgent) }

    private val stream: StreamService by lazy { StreamServiceImpl(clientOptionsWithUserAgent) }

    private val teamMembers: TeamMemberService by lazy {
        TeamMemberServiceImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val ticketSales: TicketSaleService by lazy {
        TicketSaleServiceImpl(clientOptionsWithUserAgent)
    }

    private val health: HealthService by lazy { HealthServiceImpl(clientOptionsWithUserAgent) }

    private val version: VersionService by lazy { VersionServiceImpl(clientOptionsWithUserAgent) }

    private val client: ClientService by lazy { ClientServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): BelieveClientAsync = async

    override fun withRawResponse(): BelieveClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BelieveClient =
        BelieveClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Operations related to Ted Lasso characters */
    override fun characters(): CharacterService = characters

    /** Operations related to football teams */
    override fun teams(): TeamService = teams

    override fun matches(): MatchService = matches

    /** Operations related to TV episodes */
    override fun episodes(): EpisodeService = episodes

    /** Memorable quotes from the show */
    override fun quotes(): QuoteService = quotes

    /** Interactive endpoints for motivation and guidance */
    override fun believe(): BelieveService = believe

    /** Interactive endpoints for motivation and guidance */
    override fun conflicts(): ConflictService = conflicts

    /** Interactive endpoints for motivation and guidance */
    override fun reframe(): ReframeService = reframe

    /** Interactive endpoints for motivation and guidance */
    override fun press(): PressService = press

    override fun coaching(): CoachingService = coaching

    /** Interactive endpoints for motivation and guidance */
    override fun biscuits(): BiscuitService = biscuits

    /** Server-Sent Events (SSE) streaming endpoints */
    override fun pepTalk(): PepTalkService = pepTalk

    /** Server-Sent Events (SSE) streaming endpoints */
    override fun stream(): StreamService = stream

    /**
     * Team members with union types (oneOf) - Players, Coaches, Medical Staff, Equipment Managers
     */
    override fun teamMembers(): TeamMemberService = teamMembers

    /** Register webhook endpoints and trigger events for testing */
    override fun webhooks(): WebhookService = webhooks

    /** Ticket sales with 300 records for practicing pagination, filtering, and financial data */
    override fun ticketSales(): TicketSaleService = ticketSales

    override fun health(): HealthService = health

    override fun version(): VersionService = version

    override fun client(): ClientService = client

    override fun getWelcome(
        params: ClientGetWelcomeParams,
        requestOptions: RequestOptions,
    ): ClientGetWelcomeResponse =
        // get /
        withRawResponse().getWelcome(params, requestOptions).parse()

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BelieveClient.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val characters: CharacterService.WithRawResponse by lazy {
            CharacterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val teams: TeamService.WithRawResponse by lazy {
            TeamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val matches: MatchService.WithRawResponse by lazy {
            MatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val episodes: EpisodeService.WithRawResponse by lazy {
            EpisodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val quotes: QuoteService.WithRawResponse by lazy {
            QuoteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val believe: BelieveService.WithRawResponse by lazy {
            BelieveServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val conflicts: ConflictService.WithRawResponse by lazy {
            ConflictServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reframe: ReframeService.WithRawResponse by lazy {
            ReframeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val press: PressService.WithRawResponse by lazy {
            PressServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val coaching: CoachingService.WithRawResponse by lazy {
            CoachingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val biscuits: BiscuitService.WithRawResponse by lazy {
            BiscuitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pepTalk: PepTalkService.WithRawResponse by lazy {
            PepTalkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stream: StreamService.WithRawResponse by lazy {
            StreamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val teamMembers: TeamMemberService.WithRawResponse by lazy {
            TeamMemberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ticketSales: TicketSaleService.WithRawResponse by lazy {
            TicketSaleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val health: HealthService.WithRawResponse by lazy {
            HealthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val version: VersionService.WithRawResponse by lazy {
            VersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val client: ClientService.WithRawResponse by lazy {
            ClientServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BelieveClient.WithRawResponse =
            BelieveClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Operations related to Ted Lasso characters */
        override fun characters(): CharacterService.WithRawResponse = characters

        /** Operations related to football teams */
        override fun teams(): TeamService.WithRawResponse = teams

        override fun matches(): MatchService.WithRawResponse = matches

        /** Operations related to TV episodes */
        override fun episodes(): EpisodeService.WithRawResponse = episodes

        /** Memorable quotes from the show */
        override fun quotes(): QuoteService.WithRawResponse = quotes

        /** Interactive endpoints for motivation and guidance */
        override fun believe(): BelieveService.WithRawResponse = believe

        /** Interactive endpoints for motivation and guidance */
        override fun conflicts(): ConflictService.WithRawResponse = conflicts

        /** Interactive endpoints for motivation and guidance */
        override fun reframe(): ReframeService.WithRawResponse = reframe

        /** Interactive endpoints for motivation and guidance */
        override fun press(): PressService.WithRawResponse = press

        override fun coaching(): CoachingService.WithRawResponse = coaching

        /** Interactive endpoints for motivation and guidance */
        override fun biscuits(): BiscuitService.WithRawResponse = biscuits

        /** Server-Sent Events (SSE) streaming endpoints */
        override fun pepTalk(): PepTalkService.WithRawResponse = pepTalk

        /** Server-Sent Events (SSE) streaming endpoints */
        override fun stream(): StreamService.WithRawResponse = stream

        /**
         * Team members with union types (oneOf) - Players, Coaches, Medical Staff, Equipment
         * Managers
         */
        override fun teamMembers(): TeamMemberService.WithRawResponse = teamMembers

        /** Register webhook endpoints and trigger events for testing */
        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        /**
         * Ticket sales with 300 records for practicing pagination, filtering, and financial data
         */
        override fun ticketSales(): TicketSaleService.WithRawResponse = ticketSales

        override fun health(): HealthService.WithRawResponse = health

        override fun version(): VersionService.WithRawResponse = version

        override fun client(): ClientService.WithRawResponse = client

        private val getWelcomeHandler: Handler<ClientGetWelcomeResponse> =
            jsonHandler<ClientGetWelcomeResponse>(clientOptions.jsonMapper)

        override fun getWelcome(
            params: ClientGetWelcomeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientGetWelcomeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getWelcomeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
