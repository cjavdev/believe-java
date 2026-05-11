// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

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
import dev.cjav.believe.core.prepareAsync
import dev.cjav.believe.models.characters.Character
import dev.cjav.believe.models.characters.CharacterCreateParams
import dev.cjav.believe.models.characters.CharacterDeleteParams
import dev.cjav.believe.models.characters.CharacterGetQuotesParams
import dev.cjav.believe.models.characters.CharacterListPageAsync
import dev.cjav.believe.models.characters.CharacterListPageResponse
import dev.cjav.believe.models.characters.CharacterListParams
import dev.cjav.believe.models.characters.CharacterRetrieveParams
import dev.cjav.believe.models.characters.CharacterUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Operations related to Ted Lasso characters */
class CharacterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CharacterServiceAsync {

    private val withRawResponse: CharacterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CharacterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CharacterServiceAsync =
        CharacterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CharacterCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Character> =
        // post /characters
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CharacterRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Character> =
        // get /characters/{character_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CharacterUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Character> =
        // patch /characters/{character_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CharacterListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CharacterListPageAsync> =
        // get /characters
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CharacterDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /characters/{character_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun getQuotes(
        params: CharacterGetQuotesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<String>> =
        // get /characters/{character_id}/quotes
        withRawResponse().getQuotes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CharacterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CharacterServiceAsync.WithRawResponse =
            CharacterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Character> =
            jsonHandler<Character>(clientOptions.jsonMapper)

        override fun create(
            params: CharacterCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Character>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters")
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

        private val retrieveHandler: Handler<Character> =
            jsonHandler<Character>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CharacterRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Character>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("characterId", params.characterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters", params._pathParam(0))
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

        private val updateHandler: Handler<Character> =
            jsonHandler<Character>(clientOptions.jsonMapper)

        override fun update(
            params: CharacterUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Character>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("characterId", params.characterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters", params._pathParam(0))
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

        private val listHandler: Handler<CharacterListPageResponse> =
            jsonHandler<CharacterListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CharacterListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CharacterListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters")
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
                                CharacterListPageAsync.builder()
                                    .service(CharacterServiceAsyncImpl(clientOptions))
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
            params: CharacterDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("characterId", params.characterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters", params._pathParam(0))
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

        private val getQuotesHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun getQuotes(
            params: CharacterGetQuotesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("characterId", params.characterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters", params._pathParam(0), "quotes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getQuotesHandler.handle(it) }
                    }
                }
        }
    }
}
