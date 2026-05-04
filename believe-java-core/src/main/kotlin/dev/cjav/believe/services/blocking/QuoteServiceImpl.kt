// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.checkRequired
import dev.cjav.believe.core.handlers.emptyHandler
import dev.cjav.believe.core.handlers.errorBodyHandler
import dev.cjav.believe.core.handlers.errorHandler
import dev.cjav.believe.core.handlers.jsonHandler
import dev.cjav.believe.core.http.HttpMethod
import dev.cjav.believe.core.http.HttpRequest
import dev.cjav.believe.core.http.HttpResponse
import dev.cjav.believe.core.http.HttpResponse.Handler
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.core.http.json
import dev.cjav.believe.core.http.parseable
import dev.cjav.believe.core.prepare
import dev.cjav.believe.models.quotes.PaginatedResponseQuote
import dev.cjav.believe.models.quotes.Quote
import dev.cjav.believe.models.quotes.QuoteCreateParams
import dev.cjav.believe.models.quotes.QuoteDeleteParams
import dev.cjav.believe.models.quotes.QuoteGetRandomParams
import dev.cjav.believe.models.quotes.QuoteListByCharacterPage
import dev.cjav.believe.models.quotes.QuoteListByCharacterParams
import dev.cjav.believe.models.quotes.QuoteListByThemePage
import dev.cjav.believe.models.quotes.QuoteListByThemeParams
import dev.cjav.believe.models.quotes.QuoteListPage
import dev.cjav.believe.models.quotes.QuoteListParams
import dev.cjav.believe.models.quotes.QuoteRetrieveParams
import dev.cjav.believe.models.quotes.QuoteUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Memorable quotes from the show */
class QuoteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    QuoteService {

    private val withRawResponse: QuoteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QuoteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuoteService =
        QuoteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: QuoteCreateParams, requestOptions: RequestOptions): Quote =
        // post /quotes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: QuoteRetrieveParams, requestOptions: RequestOptions): Quote =
        // get /quotes/{quote_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: QuoteUpdateParams, requestOptions: RequestOptions): Quote =
        // patch /quotes/{quote_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: QuoteListParams, requestOptions: RequestOptions): QuoteListPage =
        // get /quotes
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: QuoteDeleteParams, requestOptions: RequestOptions) {
        // delete /quotes/{quote_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun getRandom(params: QuoteGetRandomParams, requestOptions: RequestOptions): Quote =
        // get /quotes/random
        withRawResponse().getRandom(params, requestOptions).parse()

    override fun listByCharacter(
        params: QuoteListByCharacterParams,
        requestOptions: RequestOptions,
    ): QuoteListByCharacterPage =
        // get /quotes/characters/{character_id}
        withRawResponse().listByCharacter(params, requestOptions).parse()

    override fun listByTheme(
        params: QuoteListByThemeParams,
        requestOptions: RequestOptions,
    ): QuoteListByThemePage =
        // get /quotes/themes/{theme}
        withRawResponse().listByTheme(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QuoteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QuoteService.WithRawResponse =
            QuoteServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun create(
            params: QuoteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Quote> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun retrieve(
            params: QuoteRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Quote> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("quoteId", params.quoteId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun update(
            params: QuoteUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Quote> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("quoteId", params.quoteId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PaginatedResponseQuote> =
            jsonHandler<PaginatedResponseQuote>(clientOptions.jsonMapper)

        override fun list(
            params: QuoteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QuoteListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        QuoteListPage.builder()
                            .service(QuoteServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: QuoteDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("quoteId", params.quoteId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getRandomHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun getRandom(
            params: QuoteGetRandomParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Quote> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", "random")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRandomHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listByCharacterHandler: Handler<PaginatedResponseQuote> =
            jsonHandler<PaginatedResponseQuote>(clientOptions.jsonMapper)

        override fun listByCharacter(
            params: QuoteListByCharacterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QuoteListByCharacterPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("characterId", params.characterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", "characters", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByCharacterHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        QuoteListByCharacterPage.builder()
                            .service(QuoteServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listByThemeHandler: Handler<PaginatedResponseQuote> =
            jsonHandler<PaginatedResponseQuote>(clientOptions.jsonMapper)

        override fun listByTheme(
            params: QuoteListByThemeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QuoteListByThemePage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("theme", params.theme().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", "themes", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByThemeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        QuoteListByThemePage.builder()
                            .service(QuoteServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
