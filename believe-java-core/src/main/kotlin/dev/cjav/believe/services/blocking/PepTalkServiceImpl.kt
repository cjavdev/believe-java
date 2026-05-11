// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
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
import dev.cjav.believe.models.peptalk.PepTalkRetrieveParams
import dev.cjav.believe.models.peptalk.PepTalkRetrieveResponse
import java.util.function.Consumer

/** Server-Sent Events (SSE) streaming endpoints */
class PepTalkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PepTalkService {

    private val withRawResponse: PepTalkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PepTalkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PepTalkService =
        PepTalkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PepTalkRetrieveParams,
        requestOptions: RequestOptions,
    ): PepTalkRetrieveResponse =
        // get /pep-talk
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PepTalkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PepTalkService.WithRawResponse =
            PepTalkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<PepTalkRetrieveResponse> =
            jsonHandler<PepTalkRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PepTalkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PepTalkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pep-talk")
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
    }
}
