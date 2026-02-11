// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.characters.CharacterCreateParams
import com.believe.api.models.characters.CharacterRole
import com.believe.api.models.characters.CharacterUpdateParams
import com.believe.api.models.characters.EmotionalStats
import com.believe.api.models.characters.GrowthArc
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CharacterServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val characterServiceAsync = client.characters()

        val characterFuture =
            characterServiceAsync.create(
                CharacterCreateParams.builder()
                    .background(
                        "Legendary midfielder for Chelsea and AFC Richmond, now assistant coach. Known for his gruff exterior hiding a heart of gold."
                    )
                    .emotionalStats(
                        EmotionalStats.builder()
                            .curiosity(40L)
                            .empathy(85L)
                            .optimism(45L)
                            .resilience(95L)
                            .vulnerability(60L)
                            .build()
                    )
                    .name("Roy Kent")
                    .personalityTraits(listOf("intense", "loyal", "secretly caring", "profane"))
                    .role(CharacterRole.COACH)
                    .dateOfBirth(LocalDate.parse("1977-03-15"))
                    .email("roy.kent@afcrichmond.com")
                    .addGrowthArc(
                        GrowthArc.builder()
                            .breakthrough("Finding purpose beyond playing")
                            .challenge("Accepting his body's limitations")
                            .endingPoint("Retired but lost")
                            .season(1L)
                            .startingPoint("Aging footballer facing retirement")
                            .build()
                    )
                    .heightMeters(1.78)
                    .profileImageUrl("https://afcrichmond.com/images/roy-kent.jpg")
                    .salaryGbp("175000.00")
                    .addSignatureQuote("He's here, he's there, he's every-f***ing-where, Roy Kent!")
                    .addSignatureQuote("Whistle!")
                    .teamId("afc-richmond")
                    .build()
            )

        val character = characterFuture.get()
        character.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val characterServiceAsync = client.characters()

        val characterFuture = characterServiceAsync.retrieve("character_id")

        val character = characterFuture.get()
        character.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val characterServiceAsync = client.characters()

        val characterFuture =
            characterServiceAsync.update(
                CharacterUpdateParams.builder()
                    .characterId("character_id")
                    .background("background")
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .email("dev@stainless.com")
                    .emotionalStats(
                        EmotionalStats.builder()
                            .curiosity(99L)
                            .empathy(100L)
                            .optimism(95L)
                            .resilience(90L)
                            .vulnerability(80L)
                            .build()
                    )
                    .addGrowthArc(
                        GrowthArc.builder()
                            .breakthrough("breakthrough")
                            .challenge("challenge")
                            .endingPoint("ending_point")
                            .season(1L)
                            .startingPoint("starting_point")
                            .build()
                    )
                    .heightMeters(1.0)
                    .name("x")
                    .addPersonalityTrait("string")
                    .profileImageUrl("https://example.com")
                    .role(CharacterRole.COACH)
                    .salaryGbp(0.0)
                    .addSignatureQuote("string")
                    .teamId("team_id")
                    .build()
            )

        val character = characterFuture.get()
        character.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val characterServiceAsync = client.characters()

        val pageFuture = characterServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val characterServiceAsync = client.characters()

        val future = characterServiceAsync.delete("character_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getQuotes() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val characterServiceAsync = client.characters()

        val responseFuture = characterServiceAsync.getQuotes("character_id")

        val response = responseFuture.get()
    }
}
