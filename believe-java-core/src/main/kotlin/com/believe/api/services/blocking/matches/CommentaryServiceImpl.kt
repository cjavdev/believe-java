// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.matches

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.checkRequired
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
import com.believe.api.models.matches.commentary.CommentaryStreamParams
import com.believe.api.models.matches.commentary.CommentaryStreamResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

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
