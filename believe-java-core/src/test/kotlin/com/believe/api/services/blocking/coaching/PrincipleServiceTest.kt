// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.coaching

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PrincipleServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val principleService = client.coaching().principles()

        val coachingPrinciple = principleService.retrieve("principle_id")

        coachingPrinciple.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val principleService = client.coaching().principles()

        val page = principleService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRandom() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val principleService = client.coaching().principles()

        val coachingPrinciple = principleService.getRandom()

        coachingPrinciple.validate()
    }
}
