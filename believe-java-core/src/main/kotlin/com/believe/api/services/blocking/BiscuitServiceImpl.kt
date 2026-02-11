// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.checkRequired
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
import com.believe.api.models.biscuits.Biscuit
import com.believe.api.models.biscuits.BiscuitGetFreshParams
import com.believe.api.models.biscuits.BiscuitListPage
import com.believe.api.models.biscuits.BiscuitListPageResponse
import com.believe.api.models.biscuits.BiscuitListParams
import com.believe.api.models.biscuits.BiscuitRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BiscuitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BiscuitService {

    private val withRawResponse: BiscuitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BiscuitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BiscuitService =
        BiscuitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(params: BiscuitRetrieveParams, requestOptions: RequestOptions): Biscuit =
        // get /biscuits/{biscuit_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: BiscuitListParams, requestOptions: RequestOptions): BiscuitListPage =
        // get /biscuits
        withRawResponse().list(params, requestOptions).parse()

    override fun getFresh(params: BiscuitGetFreshParams, requestOptions: RequestOptions): Biscuit =
        // get /biscuits/fresh
        withRawResponse().getFresh(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BiscuitService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BiscuitService.WithRawResponse =
            BiscuitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<Biscuit> =
            jsonHandler<Biscuit>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BiscuitRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Biscuit> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("biscuitId", params.biscuitId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("biscuits", params._pathParam(0))
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

        private val listHandler: Handler<BiscuitListPageResponse> =
            jsonHandler<BiscuitListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BiscuitListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BiscuitListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("biscuits")
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
                        BiscuitListPage.builder()
                            .service(BiscuitServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getFreshHandler: Handler<Biscuit> =
            jsonHandler<Biscuit>(clientOptions.jsonMapper)

        override fun getFresh(
            params: BiscuitGetFreshParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Biscuit> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("biscuits", "fresh")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getFreshHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
