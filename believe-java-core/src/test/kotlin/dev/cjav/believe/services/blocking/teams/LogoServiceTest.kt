// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking.teams

import dev.cjav.believe.client.okhttp.BelieveOkHttpClient
import dev.cjav.believe.models.teams.logo.LogoDeleteParams
import dev.cjav.believe.models.teams.logo.LogoDownloadParams
import dev.cjav.believe.models.teams.logo.LogoUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogoServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val logoService = client.teams().logo()

        logoService.delete(
            LogoDeleteParams.builder()
                .teamId("team_id")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun download() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val logoService = client.teams().logo()

        val response =
            logoService.download(
                LogoDownloadParams.builder()
                    .teamId("team_id")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val logoService = client.teams().logo()

        val fileUpload =
            logoService.upload(
                LogoUploadParams.builder()
                    .teamId("team_id")
                    .file("Example data".byteInputStream())
                    .build()
            )

        fileUpload.validate()
    }
}
