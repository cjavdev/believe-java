// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams.logo

import com.believe.api.core.MultipartField
import com.believe.api.models.teams.logo.LogoUploadParams
import java.io.ByteArrayInputStream
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogoUploadParamsTest {

    @Test
    fun create() {
      LogoUploadParams.builder()
          .teamId("team_id")
          .file("Example data".byteInputStream())
          .build()
    }

    @Test
    fun pathParams() {
      val params = LogoUploadParams.builder()
          .teamId("team_id")
          .file("Example data".byteInputStream())
          .build()

      assertThat(params._pathParam(0)).isEqualTo("team_id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
      val params = LogoUploadParams.builder()
          .teamId("team_id")
          .file("Example data".byteInputStream())
          .build()

      val body = params._body()

      assertThat(body.filterValues { !it.value.isNull() })
          .usingRecursiveComparison()
          // TODO(AssertJ): Replace this and the `mapValues` below with:
          // https://github.com/assertj/assertj/issues/3165
          .withEqualsForType(
              { a, b -> a.readBytes() contentEquals b.readBytes() },
              InputStream::class.java,
          )
          .isEqualTo(mapOf("file" to MultipartField.of("Example data".byteInputStream())).mapValues { (_, field) -> field.map { (it as? ByteArray)?.inputStream() ?: it } })
    }
}
