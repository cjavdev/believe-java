// File generated from our OpenAPI spec by Stainless.

package com.believe.api.client

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.getPackageVersion
import com.believe.api.core.handlers.errorBodyHandler
import com.believe.api.core.handlers.errorHandler
import com.believe.api.core.handlers.jsonHandler
import com.believe.api.core.http.HttpMethod
import com.believe.api.core.http.HttpRequest
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponse.Handler
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.core.http.parseable
import com.believe.api.core.prepare
import com.believe.api.models.ClientGetWelcomeParams
import com.believe.api.models.ClientGetWelcomeResponse
import com.believe.api.services.blocking.BelieveService
import com.believe.api.services.blocking.BelieveServiceImpl
import com.believe.api.services.blocking.BiscuitService
import com.believe.api.services.blocking.BiscuitServiceImpl
import com.believe.api.services.blocking.CharacterService
import com.believe.api.services.blocking.CharacterServiceImpl
import com.believe.api.services.blocking.ClientService
import com.believe.api.services.blocking.ClientServiceImpl
import com.believe.api.services.blocking.CoachingService
import com.believe.api.services.blocking.CoachingServiceImpl
import com.believe.api.services.blocking.ConflictService
import com.believe.api.services.blocking.ConflictServiceImpl
import com.believe.api.services.blocking.EpisodeService
import com.believe.api.services.blocking.EpisodeServiceImpl
import com.believe.api.services.blocking.HealthService
import com.believe.api.services.blocking.HealthServiceImpl
import com.believe.api.services.blocking.MatchService
import com.believe.api.services.blocking.MatchServiceImpl
import com.believe.api.services.blocking.PepTalkService
import com.believe.api.services.blocking.PepTalkServiceImpl
import com.believe.api.services.blocking.PressService
import com.believe.api.services.blocking.PressServiceImpl
import com.believe.api.services.blocking.QuoteService
import com.believe.api.services.blocking.QuoteServiceImpl
import com.believe.api.services.blocking.ReframeService
import com.believe.api.services.blocking.ReframeServiceImpl
import com.believe.api.services.blocking.StreamService
import com.believe.api.services.blocking.StreamServiceImpl
import com.believe.api.services.blocking.TeamMemberService
import com.believe.api.services.blocking.TeamMemberServiceImpl
import com.believe.api.services.blocking.TeamService
import com.believe.api.services.blocking.TeamServiceImpl
import com.believe.api.services.blocking.VersionService
import com.believe.api.services.blocking.VersionServiceImpl
import com.believe.api.services.blocking.WebhookService
import com.believe.api.services.blocking.WebhookServiceImpl
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

    private val health: HealthService by lazy { HealthServiceImpl(clientOptionsWithUserAgent) }

    private val version: VersionService by lazy { VersionServiceImpl(clientOptionsWithUserAgent) }

    private val client: ClientService by lazy { ClientServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): BelieveClientAsync = async

    override fun withRawResponse(): BelieveClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BelieveClient =
        BelieveClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun characters(): CharacterService = characters

    override fun teams(): TeamService = teams

    override fun matches(): MatchService = matches

    override fun episodes(): EpisodeService = episodes

    override fun quotes(): QuoteService = quotes

    override fun believe(): BelieveService = believe

    override fun conflicts(): ConflictService = conflicts

    override fun reframe(): ReframeService = reframe

    override fun press(): PressService = press

    override fun coaching(): CoachingService = coaching

    override fun biscuits(): BiscuitService = biscuits

    override fun pepTalk(): PepTalkService = pepTalk

    override fun stream(): StreamService = stream

    override fun teamMembers(): TeamMemberService = teamMembers

    override fun webhooks(): WebhookService = webhooks

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

        override fun characters(): CharacterService.WithRawResponse = characters

        override fun teams(): TeamService.WithRawResponse = teams

        override fun matches(): MatchService.WithRawResponse = matches

        override fun episodes(): EpisodeService.WithRawResponse = episodes

        override fun quotes(): QuoteService.WithRawResponse = quotes

        override fun believe(): BelieveService.WithRawResponse = believe

        override fun conflicts(): ConflictService.WithRawResponse = conflicts

        override fun reframe(): ReframeService.WithRawResponse = reframe

        override fun press(): PressService.WithRawResponse = press

        override fun coaching(): CoachingService.WithRawResponse = coaching

        override fun biscuits(): BiscuitService.WithRawResponse = biscuits

        override fun pepTalk(): PepTalkService.WithRawResponse = pepTalk

        override fun stream(): StreamService.WithRawResponse = stream

        override fun teamMembers(): TeamMemberService.WithRawResponse = teamMembers

        override fun webhooks(): WebhookService.WithRawResponse = webhooks

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
