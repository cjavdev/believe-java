// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.teams

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.teams.logo.FileUpload
import com.believe.api.models.teams.logo.LogoDeleteParams
import com.believe.api.models.teams.logo.LogoDownloadParams
import com.believe.api.models.teams.logo.LogoDownloadResponse
import com.believe.api.models.teams.logo.LogoUploadParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface LogoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogoService

    /** Delete a team's logo. */
    fun delete(fileId: String, params: LogoDeleteParams) =
        delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: LogoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(params: LogoDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: LogoDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Download a team's logo by file ID. */
    fun download(fileId: String, params: LogoDownloadParams): LogoDownloadResponse =
        download(fileId, params, RequestOptions.none())

    /** @see download */
    fun download(
        fileId: String,
        params: LogoDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogoDownloadResponse = download(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see download */
    fun download(params: LogoDownloadParams): LogoDownloadResponse =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: LogoDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogoDownloadResponse

    /** Upload a logo image for a team. Accepts image files (jpg, png, gif, webp). */
    fun upload(teamId: String, params: LogoUploadParams): FileUpload =
        upload(teamId, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        teamId: String,
        params: LogoUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUpload = upload(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see upload */
    fun upload(params: LogoUploadParams): FileUpload = upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: LogoUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUpload

    /** A view of [LogoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /teams/{team_id}/logo/{file_id}`, but is
         * otherwise the same as [LogoService.delete].
         */
        @MustBeClosed
        fun delete(fileId: String, params: LogoDeleteParams): HttpResponse =
            delete(fileId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: LogoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: LogoDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LogoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /teams/{team_id}/logo/{file_id}`, but is otherwise
         * the same as [LogoService.download].
         */
        @MustBeClosed
        fun download(
            fileId: String,
            params: LogoDownloadParams,
        ): HttpResponseFor<LogoDownloadResponse> = download(fileId, params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            fileId: String,
            params: LogoDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogoDownloadResponse> =
            download(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        fun download(params: LogoDownloadParams): HttpResponseFor<LogoDownloadResponse> =
            download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: LogoDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogoDownloadResponse>

        /**
         * Returns a raw HTTP response for `post /teams/{team_id}/logo`, but is otherwise the same
         * as [LogoService.upload].
         */
        @MustBeClosed
        fun upload(teamId: String, params: LogoUploadParams): HttpResponseFor<FileUpload> =
            upload(teamId, params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            teamId: String,
            params: LogoUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUpload> =
            upload(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(params: LogoUploadParams): HttpResponseFor<FileUpload> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: LogoUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUpload>
    }
}
