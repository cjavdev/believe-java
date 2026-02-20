// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async.teams

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.teams.logo.LogoDeleteParams
import com.believe.api.models.teams.logo.LogoDownloadParams
import com.believe.api.models.teams.logo.LogoUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogoServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logoServiceAsync = client.teams().logo()

        val future =
            logoServiceAsync.delete(
                LogoDeleteParams.builder()
                    .teamId("team_id")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun download() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logoServiceAsync = client.teams().logo()

        val responseFuture =
            logoServiceAsync.download(
                LogoDownloadParams.builder()
                    .teamId("team_id")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logoServiceAsync = client.teams().logo()

        val fileUploadFuture =
            logoServiceAsync.upload(
                LogoUploadParams.builder()
                    .teamId("team_id")
                    .file("some content".byteInputStream())
                    .build()
            )

        val fileUpload = fileUploadFuture.get()
        fileUpload.validate()
    }
}
