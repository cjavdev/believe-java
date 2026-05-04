// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async.teams

import dev.cjav.believe.core.ClientOptions
import dev.cjav.believe.core.RequestOptions
import dev.cjav.believe.core.http.HttpResponse
import dev.cjav.believe.core.http.HttpResponseFor
import dev.cjav.believe.models.teams.logo.FileUpload
import dev.cjav.believe.models.teams.logo.LogoDeleteParams
import dev.cjav.believe.models.teams.logo.LogoDownloadParams
import dev.cjav.believe.models.teams.logo.LogoDownloadResponse
import dev.cjav.believe.models.teams.logo.LogoUploadParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to football teams */
interface LogoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogoServiceAsync

    /** Delete a team's logo. */
    fun delete(fileId: String, params: LogoDeleteParams): CompletableFuture<Void?> =
        delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: LogoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(params: LogoDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LogoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Download a team's logo by file ID. */
    fun download(
        fileId: String,
        params: LogoDownloadParams,
    ): CompletableFuture<LogoDownloadResponse> = download(fileId, params, RequestOptions.none())

    /** @see download */
    fun download(
        fileId: String,
        params: LogoDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogoDownloadResponse> =
        download(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see download */
    fun download(params: LogoDownloadParams): CompletableFuture<LogoDownloadResponse> =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: LogoDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogoDownloadResponse>

    /** Upload a logo image for a team. Accepts image files (jpg, png, gif, webp). */
    fun upload(teamId: String, params: LogoUploadParams): CompletableFuture<FileUpload> =
        upload(teamId, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        teamId: String,
        params: LogoUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileUpload> =
        upload(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see upload */
    fun upload(params: LogoUploadParams): CompletableFuture<FileUpload> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: LogoUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileUpload>

    /** A view of [LogoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /teams/{team_id}/logo/{file_id}`, but is
         * otherwise the same as [LogoServiceAsync.delete].
         */
        fun delete(fileId: String, params: LogoDeleteParams): CompletableFuture<HttpResponse> =
            delete(fileId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            fileId: String,
            params: LogoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        fun delete(params: LogoDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LogoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /teams/{team_id}/logo/{file_id}`, but is otherwise
         * the same as [LogoServiceAsync.download].
         */
        fun download(
            fileId: String,
            params: LogoDownloadParams,
        ): CompletableFuture<HttpResponseFor<LogoDownloadResponse>> =
            download(fileId, params, RequestOptions.none())

        /** @see download */
        fun download(
            fileId: String,
            params: LogoDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogoDownloadResponse>> =
            download(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see download */
        fun download(
            params: LogoDownloadParams
        ): CompletableFuture<HttpResponseFor<LogoDownloadResponse>> =
            download(params, RequestOptions.none())

        /** @see download */
        fun download(
            params: LogoDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogoDownloadResponse>>

        /**
         * Returns a raw HTTP response for `post /teams/{team_id}/logo`, but is otherwise the same
         * as [LogoServiceAsync.upload].
         */
        fun upload(
            teamId: String,
            params: LogoUploadParams,
        ): CompletableFuture<HttpResponseFor<FileUpload>> =
            upload(teamId, params, RequestOptions.none())

        /** @see upload */
        fun upload(
            teamId: String,
            params: LogoUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileUpload>> =
            upload(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see upload */
        fun upload(params: LogoUploadParams): CompletableFuture<HttpResponseFor<FileUpload>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: LogoUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileUpload>>
    }
}
