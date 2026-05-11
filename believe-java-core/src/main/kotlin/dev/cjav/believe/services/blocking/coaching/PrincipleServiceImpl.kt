// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking.coaching

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.checkRequired
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
import dev.cjav.believe.models.coaching.principles.CoachingPrinciple
import dev.cjav.believe.models.coaching.principles.PrincipleGetRandomParams
import dev.cjav.believe.models.coaching.principles.PrincipleListPage
import dev.cjav.believe.models.coaching.principles.PrincipleListPageResponse
import dev.cjav.believe.models.coaching.principles.PrincipleListParams
import dev.cjav.believe.models.coaching.principles.PrincipleRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Interactive endpoints for motivation and guidance */
class PrincipleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PrincipleService {

    private val withRawResponse: PrincipleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PrincipleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrincipleService =
        PrincipleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PrincipleRetrieveParams,
        requestOptions: RequestOptions,
    ): CoachingPrinciple =
        // get /coaching/principles/{principle_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PrincipleListParams,
        requestOptions: RequestOptions,
    ): PrincipleListPage =
        // get /coaching/principles
        withRawResponse().list(params, requestOptions).parse()

    override fun getRandom(
        params: PrincipleGetRandomParams,
        requestOptions: RequestOptions,
    ): CoachingPrinciple =
        // get /coaching/principles/random
        withRawResponse().getRandom(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrincipleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrincipleService.WithRawResponse =
            PrincipleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CoachingPrinciple> =
            jsonHandler<CoachingPrinciple>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PrincipleRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CoachingPrinciple> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("principleId", params.principleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coaching", "principles", params._pathParam(0))
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

        private val listHandler: Handler<PrincipleListPageResponse> =
            jsonHandler<PrincipleListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PrincipleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrincipleListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coaching", "principles")
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
                        PrincipleListPage.builder()
                            .service(PrincipleServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getRandomHandler: Handler<CoachingPrinciple> =
            jsonHandler<CoachingPrinciple>(clientOptions.jsonMapper)

        override fun getRandom(
            params: PrincipleGetRandomParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CoachingPrinciple> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coaching", "principles", "random")
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
    }
}
