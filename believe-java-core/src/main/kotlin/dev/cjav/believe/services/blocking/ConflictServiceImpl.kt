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
import dev.cjav.believe.core.http.json
import dev.cjav.believe.core.http.parseable
import dev.cjav.believe.core.prepare
import dev.cjav.believe.models.conflicts.ConflictResolveParams
import dev.cjav.believe.models.conflicts.ConflictResolveResponse
import java.util.function.Consumer

/** Interactive endpoints for motivation and guidance */
class ConflictServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConflictService {

    private val withRawResponse: ConflictService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConflictService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConflictService =
        ConflictServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun resolve(
        params: ConflictResolveParams,
        requestOptions: RequestOptions,
    ): ConflictResolveResponse =
        // post /conflicts/resolve
        withRawResponse().resolve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConflictService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConflictService.WithRawResponse =
            ConflictServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val resolveHandler: Handler<ConflictResolveResponse> =
            jsonHandler<ConflictResolveResponse>(clientOptions.jsonMapper)

        override fun resolve(
            params: ConflictResolveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConflictResolveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conflicts", "resolve")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { resolveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
