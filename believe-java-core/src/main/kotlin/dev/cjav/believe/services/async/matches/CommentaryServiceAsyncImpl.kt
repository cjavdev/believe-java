// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async.matches

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
import dev.cjav.believe.core.prepareAsync
import dev.cjav.believe.models.matches.commentary.CommentaryStreamParams
import dev.cjav.believe.models.matches.commentary.CommentaryStreamResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Server-Sent Events (SSE) streaming endpoints */
class CommentaryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommentaryServiceAsync {

    private val withRawResponse: CommentaryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommentaryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentaryServiceAsync =
        CommentaryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun stream(
        params: CommentaryStreamParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentaryStreamResponse> =
        // post /matches/{match_id}/commentary/stream
        withRawResponse().stream(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommentaryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentaryServiceAsync.WithRawResponse =
            CommentaryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val streamHandler: Handler<CommentaryStreamResponse> =
            jsonHandler<CommentaryStreamResponse>(clientOptions.jsonMapper)

        override fun stream(
            params: CommentaryStreamParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentaryStreamResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("matchId", params.matchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matches", params._pathParam(0), "commentary", "stream")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { streamHandler.handle(it) }
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
