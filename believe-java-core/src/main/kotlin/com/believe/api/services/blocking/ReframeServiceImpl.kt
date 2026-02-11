// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

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
import com.believe.api.core.prepare
import com.believe.api.models.reframe.ReframeTransformNegativeThoughtsParams
import com.believe.api.models.reframe.ReframeTransformNegativeThoughtsResponse
import java.util.function.Consumer

class ReframeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReframeService {

    private val withRawResponse: ReframeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReframeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReframeService =
        ReframeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun transformNegativeThoughts(
        params: ReframeTransformNegativeThoughtsParams,
        requestOptions: RequestOptions,
    ): ReframeTransformNegativeThoughtsResponse =
        // post /reframe
        withRawResponse().transformNegativeThoughts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReframeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReframeService.WithRawResponse =
            ReframeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val transformNegativeThoughtsHandler:
            Handler<ReframeTransformNegativeThoughtsResponse> =
            jsonHandler<ReframeTransformNegativeThoughtsResponse>(clientOptions.jsonMapper)

        override fun transformNegativeThoughts(
            params: ReframeTransformNegativeThoughtsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReframeTransformNegativeThoughtsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reframe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { transformNegativeThoughtsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
