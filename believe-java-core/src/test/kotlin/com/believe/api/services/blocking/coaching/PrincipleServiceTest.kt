// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.coaching

import com.believe.api.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PrincipleServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val principleService = client.coaching().principles()

        val coachingPrinciple = principleService.retrieve("principle_id")

        coachingPrinciple.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val principleService = client.coaching().principles()

        val page = principleService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRandom() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val principleService = client.coaching().principles()

        val coachingPrinciple = principleService.getRandom()

        coachingPrinciple.validate()
    }
}
