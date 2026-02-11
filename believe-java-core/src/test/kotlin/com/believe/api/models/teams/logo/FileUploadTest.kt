// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams.logo

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUploadTest {

    @Test
    fun create() {
        val fileUpload =
            FileUpload.builder()
                .checksumSha256("checksum_sha256")
                .contentType("content_type")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filename("filename")
                .sizeBytes(0L)
                .uploadedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(fileUpload.checksumSha256()).isEqualTo("checksum_sha256")
        assertThat(fileUpload.contentType()).isEqualTo("content_type")
        assertThat(fileUpload.fileId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(fileUpload.filename()).isEqualTo("filename")
        assertThat(fileUpload.sizeBytes()).isEqualTo(0L)
        assertThat(fileUpload.uploadedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileUpload =
            FileUpload.builder()
                .checksumSha256("checksum_sha256")
                .contentType("content_type")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filename("filename")
                .sizeBytes(0L)
                .uploadedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFileUpload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileUpload),
                jacksonTypeRef<FileUpload>(),
            )

        assertThat(roundtrippedFileUpload).isEqualTo(fileUpload)
    }
}
