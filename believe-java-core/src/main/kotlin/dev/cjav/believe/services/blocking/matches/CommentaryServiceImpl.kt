// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking.matches

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
import dev.cjav.believe.models.matches.commentary.CommentaryStreamParams
import dev.cjav.believe.models.matches.commentary.CommentaryStreamResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Server-Sent Events (SSE) streaming endpoints */
class CommentaryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommentaryService {

    private val withRawResponse: CommentaryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommentaryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentaryService =
        CommentaryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun stream(
        params: CommentaryStreamParams,
        requestOptions: RequestOptions,
    ): CommentaryStreamResponse =
        // post /matches/{match_id}/commentary/stream
        withRawResponse().stream(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommentaryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentaryService.WithRawResponse =
            CommentaryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val streamHandler: Handler<CommentaryStreamResponse> =
            jsonHandler<CommentaryStreamResponse>(clientOptions.jsonMapper)

        override fun stream(
            params: CommentaryStreamParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentaryStreamResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
