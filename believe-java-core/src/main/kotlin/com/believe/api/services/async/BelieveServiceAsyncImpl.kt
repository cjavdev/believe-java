// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
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
import com.believe.api.models.believe.BelieveSubmitParams
import com.believe.api.models.believe.BelieveSubmitResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BelieveServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BelieveServiceAsync {

    private val withRawResponse: BelieveServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BelieveServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BelieveServiceAsync =
        BelieveServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun submit(
        params: BelieveSubmitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BelieveSubmitResponse> =
        // post /believe
        withRawResponse().submit(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BelieveServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BelieveServiceAsync.WithRawResponse =
            BelieveServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val submitHandler: Handler<BelieveSubmitResponse> =
            jsonHandler<BelieveSubmitResponse>(clientOptions.jsonMapper)

        override fun submit(
            params: BelieveSubmitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BelieveSubmitResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("believe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { submitHandler.handle(it) }
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
