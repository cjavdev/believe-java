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
import dev.cjav.believe.models.health.HealthCheckParams
import dev.cjav.believe.models.health.HealthCheckResponse
import java.util.function.Consumer

class HealthServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HealthService {

    private val withRawResponse: HealthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HealthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthService =
        HealthServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun check(
        params: HealthCheckParams,
        requestOptions: RequestOptions,
    ): HealthCheckResponse =
        // get /health
        withRawResponse().check(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HealthService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HealthService.WithRawResponse =
            HealthServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkHandler: Handler<HealthCheckResponse> =
            jsonHandler<HealthCheckResponse>(clientOptions.jsonMapper)

        override fun check(
            params: HealthCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("health")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { checkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
