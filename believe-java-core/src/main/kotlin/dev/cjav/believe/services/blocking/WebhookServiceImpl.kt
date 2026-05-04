// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
import dev.cjav.believe.core.http.json
import dev.cjav.believe.core.http.parseable
import dev.cjav.believe.core.prepare
import dev.cjav.believe.errors.BelieveInvalidDataException
import dev.cjav.believe.models.webhooks.RegisteredWebhook
import dev.cjav.believe.models.webhooks.UnwrapWebhookEvent
import dev.cjav.believe.models.webhooks.WebhookCreateParams
import dev.cjav.believe.models.webhooks.WebhookCreateResponse
import dev.cjav.believe.models.webhooks.WebhookDeleteParams
import dev.cjav.believe.models.webhooks.WebhookDeleteResponse
import dev.cjav.believe.models.webhooks.WebhookListParams
import dev.cjav.believe.models.webhooks.WebhookRetrieveParams
import dev.cjav.believe.models.webhooks.WebhookTriggerEventParams
import dev.cjav.believe.models.webhooks.WebhookTriggerEventResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Register webhook endpoints and trigger events for testing */
class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions,
    ): WebhookCreateResponse =
        // post /webhooks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions,
    ): RegisteredWebhook =
        // get /webhooks/{webhook_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions,
    ): List<RegisteredWebhook> =
        // get /webhooks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions,
    ): WebhookDeleteResponse =
        // delete /webhooks/{webhook_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun triggerEvent(
        params: WebhookTriggerEventParams,
        requestOptions: RequestOptions,
    ): WebhookTriggerEventResponse =
        // post /webhooks/trigger
        withRawResponse().triggerEvent(params, requestOptions).parse()

    override fun unwrap(body: String): UnwrapWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<UnwrapWebhookEvent>())
        } catch (e: Exception) {
            throw BelieveInvalidDataException("Error parsing body", e)
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WebhookCreateResponse> =
            jsonHandler<WebhookCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks")
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

        private val retrieveHandler: Handler<RegisteredWebhook> =
            jsonHandler<RegisteredWebhook>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegisteredWebhook> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", params._pathParam(0))
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

        private val listHandler: Handler<List<RegisteredWebhook>> =
            jsonHandler<List<RegisteredWebhook>>(clientOptions.jsonMapper)

        override fun list(
            params: WebhookListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RegisteredWebhook>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<WebhookDeleteResponse> =
            jsonHandler<WebhookDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val triggerEventHandler: Handler<WebhookTriggerEventResponse> =
            jsonHandler<WebhookTriggerEventResponse>(clientOptions.jsonMapper)

        override fun triggerEvent(
            params: WebhookTriggerEventParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookTriggerEventResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", "trigger")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { triggerEventHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
