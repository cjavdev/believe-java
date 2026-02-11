// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.checkRequired
import com.believe.api.core.handlers.emptyHandler
import com.believe.api.core.handlers.errorBodyHandler
import com.believe.api.core.handlers.errorHandler
import com.believe.api.core.handlers.jsonHandler
import com.believe.api.core.http.HttpMethod
import com.believe.api.core.http.HttpRequest
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponse.Handler
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.core.http.json
import com.believe.api.core.http.parseable
import com.believe.api.core.prepareAsync
import com.believe.api.models.quotes.PaginatedResponseQuote
import com.believe.api.models.quotes.Quote
import com.believe.api.models.quotes.QuoteCreateParams
import com.believe.api.models.quotes.QuoteDeleteParams
import com.believe.api.models.quotes.QuoteGetRandomParams
import com.believe.api.models.quotes.QuoteListByCharacterPageAsync
import com.believe.api.models.quotes.QuoteListByCharacterParams
import com.believe.api.models.quotes.QuoteListByThemePageAsync
import com.believe.api.models.quotes.QuoteListByThemeParams
import com.believe.api.models.quotes.QuoteListPageAsync
import com.believe.api.models.quotes.QuoteListParams
import com.believe.api.models.quotes.QuoteRetrieveParams
import com.believe.api.models.quotes.QuoteUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class QuoteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    QuoteServiceAsync {

    private val withRawResponse: QuoteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QuoteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuoteServiceAsync =
        QuoteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: QuoteCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Quote> =
        // post /quotes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: QuoteRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Quote> =
        // get /quotes/{quote_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: QuoteUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Quote> =
        // patch /quotes/{quote_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: QuoteListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<QuoteListPageAsync> =
        // get /quotes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: QuoteDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /quotes/{quote_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun getRandom(
        params: QuoteGetRandomParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Quote> =
        // get /quotes/random
        withRawResponse().getRandom(params, requestOptions).thenApply { it.parse() }

    override fun listByCharacter(
        params: QuoteListByCharacterParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<QuoteListByCharacterPageAsync> =
        // get /quotes/characters/{character_id}
        withRawResponse().listByCharacter(params, requestOptions).thenApply { it.parse() }

    override fun listByTheme(
        params: QuoteListByThemeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<QuoteListByThemePageAsync> =
        // get /quotes/themes/{theme}
        withRawResponse().listByTheme(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QuoteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QuoteServiceAsync.WithRawResponse =
            QuoteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun create(
            params: QuoteCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Quote>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun retrieve(
            params: QuoteRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Quote>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("quoteId", params.quoteId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun update(
            params: QuoteUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Quote>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<PaginatedResponseQuote> =
            jsonHandler<PaginatedResponseQuote>(clientOptions.jsonMapper)

        override fun list(
            params: QuoteListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QuoteListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                QuoteListPageAsync.builder()
                                    .service(QuoteServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: QuoteDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getRandomHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun getRandom(
            params: QuoteGetRandomParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Quote>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", "random")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRandomHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listByCharacterHandler: Handler<PaginatedResponseQuote> =
            jsonHandler<PaginatedResponseQuote>(clientOptions.jsonMapper)

        override fun listByCharacter(
            params: QuoteListByCharacterParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QuoteListByCharacterPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("characterId", params.characterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", "characters", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listByCharacterHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                QuoteListByCharacterPageAsync.builder()
                                    .service(QuoteServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listByThemeHandler: Handler<PaginatedResponseQuote> =
            jsonHandler<PaginatedResponseQuote>(clientOptions.jsonMapper)

        override fun listByTheme(
            params: QuoteListByThemeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QuoteListByThemePageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("theme", params.theme().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", "themes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listByThemeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                QuoteListByThemePageAsync.builder()
                                    .service(QuoteServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
