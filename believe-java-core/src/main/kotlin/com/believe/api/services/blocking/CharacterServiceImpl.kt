// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

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
import com.believe.api.core.prepare
import com.believe.api.models.characters.Character
import com.believe.api.models.characters.CharacterCreateParams
import com.believe.api.models.characters.CharacterDeleteParams
import com.believe.api.models.characters.CharacterGetQuotesParams
import com.believe.api.models.characters.CharacterListPage
import com.believe.api.models.characters.CharacterListPageResponse
import com.believe.api.models.characters.CharacterListParams
import com.believe.api.models.characters.CharacterRetrieveParams
import com.believe.api.models.characters.CharacterUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CharacterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CharacterService {

    private val withRawResponse: CharacterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CharacterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CharacterService =
        CharacterServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: CharacterCreateParams, requestOptions: RequestOptions): Character =
        // post /characters
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CharacterRetrieveParams,
        requestOptions: RequestOptions,
    ): Character =
        // get /characters/{character_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: CharacterUpdateParams, requestOptions: RequestOptions): Character =
        // patch /characters/{character_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CharacterListParams,
        requestOptions: RequestOptions,
    ): CharacterListPage =
        // get /characters
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CharacterDeleteParams, requestOptions: RequestOptions) {
        // delete /characters/{character_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun getQuotes(
        params: CharacterGetQuotesParams,
        requestOptions: RequestOptions,
    ): List<String> =
        // get /characters/{character_id}/quotes
        withRawResponse().getQuotes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CharacterService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CharacterService.WithRawResponse =
            CharacterServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Character> =
            jsonHandler<Character>(clientOptions.jsonMapper)

        override fun create(
            params: CharacterCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Character> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters")
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

        private val retrieveHandler: Handler<Character> =
            jsonHandler<Character>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CharacterRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Character> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("characterId", params.characterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters", params._pathParam(0))
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

        private val updateHandler: Handler<Character> =
            jsonHandler<Character>(clientOptions.jsonMapper)

        override fun update(
            params: CharacterUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Character> {
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

        private val listHandler: Handler<CharacterListPageResponse> =
            jsonHandler<CharacterListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CharacterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CharacterListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters")
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
                        CharacterListPage.builder()
                            .service(CharacterServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CharacterDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getQuotesHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun getQuotes(
            params: CharacterGetQuotesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("characterId", params.characterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("characters", params._pathParam(0), "quotes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getQuotesHandler.handle(it) }
            }
        }
    }
}
