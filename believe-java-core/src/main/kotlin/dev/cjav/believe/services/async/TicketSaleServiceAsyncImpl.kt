// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.checkRequired
import dev.cjav.believe.core.handlers.emptyHandler
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
import dev.cjav.believe.models.ticketsales.TicketSale
import dev.cjav.believe.models.ticketsales.TicketSaleCreateParams
import dev.cjav.believe.models.ticketsales.TicketSaleDeleteParams
import dev.cjav.believe.models.ticketsales.TicketSaleListPageAsync
import dev.cjav.believe.models.ticketsales.TicketSaleListPageResponse
import dev.cjav.believe.models.ticketsales.TicketSaleListParams
import dev.cjav.believe.models.ticketsales.TicketSaleRetrieveParams
import dev.cjav.believe.models.ticketsales.TicketSaleUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Ticket sales with 300 records for practicing pagination, filtering, and financial data */
class TicketSaleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TicketSaleServiceAsync {

    private val withRawResponse: TicketSaleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TicketSaleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TicketSaleServiceAsync =
        TicketSaleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TicketSaleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TicketSale> =
        // post /ticket-sales
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TicketSaleRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TicketSale> =
        // get /ticket-sales/{ticket_sale_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TicketSaleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TicketSale> =
        // patch /ticket-sales/{ticket_sale_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TicketSaleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TicketSaleListPageAsync> =
        // get /ticket-sales
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TicketSaleDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ticket-sales/{ticket_sale_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TicketSaleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TicketSaleServiceAsync.WithRawResponse =
            TicketSaleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TicketSale> =
            jsonHandler<TicketSale>(clientOptions.jsonMapper)

        override fun create(
            params: TicketSaleCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TicketSale>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ticket-sales")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<TicketSale> =
            jsonHandler<TicketSale>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TicketSaleRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TicketSale>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ticketSaleId", params.ticketSaleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ticket-sales", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<TicketSale> =
            jsonHandler<TicketSale>(clientOptions.jsonMapper)

        override fun update(
            params: TicketSaleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TicketSale>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ticketSaleId", params.ticketSaleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ticket-sales", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TicketSaleListPageResponse> =
            jsonHandler<TicketSaleListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TicketSaleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TicketSaleListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ticket-sales")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TicketSaleListPageAsync.builder()
                                    .service(TicketSaleServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TicketSaleDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ticketSaleId", params.ticketSaleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ticket-sales", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
