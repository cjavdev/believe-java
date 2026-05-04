// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async.teams

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
import dev.cjav.believe.core.http.multipartFormData
import dev.cjav.believe.core.http.parseable
import dev.cjav.believe.core.prepareAsync
import dev.cjav.believe.models.teams.logo.FileUpload
import dev.cjav.believe.models.teams.logo.LogoDeleteParams
import dev.cjav.believe.models.teams.logo.LogoDownloadParams
import dev.cjav.believe.models.teams.logo.LogoDownloadResponse
import dev.cjav.believe.models.teams.logo.LogoUploadParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Operations related to football teams */
class LogoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LogoServiceAsync {

    private val withRawResponse: LogoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LogoServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogoServiceAsync =
        LogoServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(
        params: LogoDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /teams/{team_id}/logo/{file_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun download(
        params: LogoDownloadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LogoDownloadResponse> =
        // get /teams/{team_id}/logo/{file_id}
        withRawResponse().download(params, requestOptions).thenApply { it.parse() }

    override fun upload(
        params: LogoUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileUpload> =
        // post /teams/{team_id}/logo
        withRawResponse().upload(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LogoServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LogoServiceAsync.WithRawResponse =
            LogoServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LogoDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", params._pathParam(0), "logo", params._pathParam(1))
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

        private val downloadHandler: Handler<LogoDownloadResponse> =
            jsonHandler<LogoDownloadResponse>(clientOptions.jsonMapper)

        override fun download(
            params: LogoDownloadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogoDownloadResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", params._pathParam(0), "logo", params._pathParam(1))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { downloadHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val uploadHandler: Handler<FileUpload> =
            jsonHandler<FileUpload>(clientOptions.jsonMapper)

        override fun upload(
            params: LogoUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileUpload>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("teams", params._pathParam(0), "logo")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uploadHandler.handle(it) }
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
