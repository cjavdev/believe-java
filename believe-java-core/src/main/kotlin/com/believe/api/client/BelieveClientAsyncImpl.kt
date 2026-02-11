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
import com.believe.api.core.prepareAsync
import com.believe.api.models.ClientGetWelcomeParams
import com.believe.api.models.ClientGetWelcomeResponse
import com.believe.api.services.async.BelieveServiceAsync
import com.believe.api.services.async.BelieveServiceAsyncImpl
import com.believe.api.services.async.BiscuitServiceAsync
import com.believe.api.services.async.BiscuitServiceAsyncImpl
import com.believe.api.services.async.CharacterServiceAsync
import com.believe.api.services.async.CharacterServiceAsyncImpl
import com.believe.api.services.async.ClientServiceAsync
import com.believe.api.services.async.ClientServiceAsyncImpl
import com.believe.api.services.async.CoachingServiceAsync
import com.believe.api.services.async.CoachingServiceAsyncImpl
import com.believe.api.services.async.ConflictServiceAsync
import com.believe.api.services.async.ConflictServiceAsyncImpl
import com.believe.api.services.async.EpisodeServiceAsync
import com.believe.api.services.async.EpisodeServiceAsyncImpl
import com.believe.api.services.async.HealthServiceAsync
import com.believe.api.services.async.HealthServiceAsyncImpl
import com.believe.api.services.async.MatchServiceAsync
import com.believe.api.services.async.MatchServiceAsyncImpl
import com.believe.api.services.async.PepTalkServiceAsync
import com.believe.api.services.async.PepTalkServiceAsyncImpl
import com.believe.api.services.async.PressServiceAsync
import com.believe.api.services.async.PressServiceAsyncImpl
import com.believe.api.services.async.QuoteServiceAsync
import com.believe.api.services.async.QuoteServiceAsyncImpl
import com.believe.api.services.async.ReframeServiceAsync
import com.believe.api.services.async.ReframeServiceAsyncImpl
import com.believe.api.services.async.StreamServiceAsync
import com.believe.api.services.async.StreamServiceAsyncImpl
import com.believe.api.services.async.TeamMemberServiceAsync
import com.believe.api.services.async.TeamMemberServiceAsyncImpl
import com.believe.api.services.async.TeamServiceAsync
import com.believe.api.services.async.TeamServiceAsyncImpl
import com.believe.api.services.async.VersionServiceAsync
import com.believe.api.services.async.VersionServiceAsyncImpl
import com.believe.api.services.async.WebhookServiceAsync
import com.believe.api.services.async.WebhookServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BelieveClientAsyncImpl(private val clientOptions: ClientOptions) : BelieveClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: BelieveClient by lazy { BelieveClientImpl(clientOptions) }

    private val withRawResponse: BelieveClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val characters: CharacterServiceAsync by lazy {
        CharacterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val teams: TeamServiceAsync by lazy { TeamServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val matches: MatchServiceAsync by lazy {
        MatchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val episodes: EpisodeServiceAsync by lazy {
        EpisodeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val quotes: QuoteServiceAsync by lazy {
        QuoteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val believe: BelieveServiceAsync by lazy {
        BelieveServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val conflicts: ConflictServiceAsync by lazy {
        ConflictServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val reframe: ReframeServiceAsync by lazy {
        ReframeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val press: PressServiceAsync by lazy {
        PressServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val coaching: CoachingServiceAsync by lazy {
        CoachingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val biscuits: BiscuitServiceAsync by lazy {
        BiscuitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val pepTalk: PepTalkServiceAsync by lazy {
        PepTalkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stream: StreamServiceAsync by lazy {
        StreamServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val teamMembers: TeamMemberServiceAsync by lazy {
        TeamMemberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val health: HealthServiceAsync by lazy {
        HealthServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val version: VersionServiceAsync by lazy {
        VersionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val client: ClientServiceAsync by lazy {
        ClientServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): BelieveClient = sync

    override fun withRawResponse(): BelieveClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BelieveClientAsync =
        BelieveClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun characters(): CharacterServiceAsync = characters

    override fun teams(): TeamServiceAsync = teams

    override fun matches(): MatchServiceAsync = matches

    override fun episodes(): EpisodeServiceAsync = episodes

    override fun quotes(): QuoteServiceAsync = quotes

    override fun believe(): BelieveServiceAsync = believe

    override fun conflicts(): ConflictServiceAsync = conflicts

    override fun reframe(): ReframeServiceAsync = reframe

    override fun press(): PressServiceAsync = press

    override fun coaching(): CoachingServiceAsync = coaching

    override fun biscuits(): BiscuitServiceAsync = biscuits

    override fun pepTalk(): PepTalkServiceAsync = pepTalk

    override fun stream(): StreamServiceAsync = stream

    override fun teamMembers(): TeamMemberServiceAsync = teamMembers

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun health(): HealthServiceAsync = health

    override fun version(): VersionServiceAsync = version

    override fun client(): ClientServiceAsync = client

    override fun getWelcome(
        params: ClientGetWelcomeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClientGetWelcomeResponse> =
        // get /
        withRawResponse().getWelcome(params, requestOptions).thenApply { it.parse() }

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BelieveClientAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val characters: CharacterServiceAsync.WithRawResponse by lazy {
            CharacterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val teams: TeamServiceAsync.WithRawResponse by lazy {
            TeamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val matches: MatchServiceAsync.WithRawResponse by lazy {
            MatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val episodes: EpisodeServiceAsync.WithRawResponse by lazy {
            EpisodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val quotes: QuoteServiceAsync.WithRawResponse by lazy {
            QuoteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val believe: BelieveServiceAsync.WithRawResponse by lazy {
            BelieveServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val conflicts: ConflictServiceAsync.WithRawResponse by lazy {
            ConflictServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reframe: ReframeServiceAsync.WithRawResponse by lazy {
            ReframeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val press: PressServiceAsync.WithRawResponse by lazy {
            PressServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val coaching: CoachingServiceAsync.WithRawResponse by lazy {
            CoachingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val biscuits: BiscuitServiceAsync.WithRawResponse by lazy {
            BiscuitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pepTalk: PepTalkServiceAsync.WithRawResponse by lazy {
            PepTalkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val stream: StreamServiceAsync.WithRawResponse by lazy {
            StreamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val teamMembers: TeamMemberServiceAsync.WithRawResponse by lazy {
            TeamMemberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val health: HealthServiceAsync.WithRawResponse by lazy {
            HealthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val version: VersionServiceAsync.WithRawResponse by lazy {
            VersionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val client: ClientServiceAsync.WithRawResponse by lazy {
            ClientServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BelieveClientAsync.WithRawResponse =
            BelieveClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun characters(): CharacterServiceAsync.WithRawResponse = characters

        override fun teams(): TeamServiceAsync.WithRawResponse = teams

        override fun matches(): MatchServiceAsync.WithRawResponse = matches

        override fun episodes(): EpisodeServiceAsync.WithRawResponse = episodes

        override fun quotes(): QuoteServiceAsync.WithRawResponse = quotes

        override fun believe(): BelieveServiceAsync.WithRawResponse = believe

        override fun conflicts(): ConflictServiceAsync.WithRawResponse = conflicts

        override fun reframe(): ReframeServiceAsync.WithRawResponse = reframe

        override fun press(): PressServiceAsync.WithRawResponse = press

        override fun coaching(): CoachingServiceAsync.WithRawResponse = coaching

        override fun biscuits(): BiscuitServiceAsync.WithRawResponse = biscuits

        override fun pepTalk(): PepTalkServiceAsync.WithRawResponse = pepTalk

        override fun stream(): StreamServiceAsync.WithRawResponse = stream

        override fun teamMembers(): TeamMemberServiceAsync.WithRawResponse = teamMembers

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        override fun health(): HealthServiceAsync.WithRawResponse = health

        override fun version(): VersionServiceAsync.WithRawResponse = version

        override fun client(): ClientServiceAsync.WithRawResponse = client

        private val getWelcomeHandler: Handler<ClientGetWelcomeResponse> =
            jsonHandler<ClientGetWelcomeResponse>(clientOptions.jsonMapper)

        override fun getWelcome(
            params: ClientGetWelcomeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClientGetWelcomeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
