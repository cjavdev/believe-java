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
import com.believe.api.core.http.parseable
import com.believe.api.core.prepare
import com.believe.api.models.stream.StreamTestConnectionParams
import com.believe.api.models.stream.StreamTestConnectionResponse
import java.util.function.Consumer

class StreamServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamService {

    private val withRawResponse: StreamService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService =
        StreamServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun testConnection(
        params: StreamTestConnectionParams,
        requestOptions: RequestOptions,
    ): StreamTestConnectionResponse =
        // get /stream/test
        withRawResponse().testConnection(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StreamService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamService.WithRawResponse =
            StreamServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val testConnectionHandler: Handler<StreamTestConnectionResponse> =
            jsonHandler<StreamTestConnectionResponse>(clientOptions.jsonMapper)

        override fun testConnection(
            params: StreamTestConnectionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamTestConnectionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("stream", "test")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { testConnectionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
