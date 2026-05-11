// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

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
import dev.cjav.believe.core.prepareAsync
import dev.cjav.believe.models.conflicts.ConflictResolveParams
import dev.cjav.believe.models.conflicts.ConflictResolveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Interactive endpoints for motivation and guidance */
class ConflictServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConflictServiceAsync {

    private val withRawResponse: ConflictServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConflictServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConflictServiceAsync =
        ConflictServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun resolve(
        params: ConflictResolveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConflictResolveResponse> =
        // post /conflicts/resolve
        withRawResponse().resolve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConflictServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConflictServiceAsync.WithRawResponse =
            ConflictServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val resolveHandler: Handler<ConflictResolveResponse> =
            jsonHandler<ConflictResolveResponse>(clientOptions.jsonMapper)

        override fun resolve(
            params: ConflictResolveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConflictResolveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conflicts", "resolve")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
