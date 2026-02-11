// File generated from our OpenAPI spec by Stainless.

package com.believe.api.proguard

import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.core.jsonMapper
import com.believe.api.models.characters.Character
import com.believe.api.models.characters.CharacterRole
import com.believe.api.models.characters.EmotionalStats
import com.believe.api.models.characters.GrowthArc
import com.believe.api.models.teammembers.Player
import com.believe.api.models.teammembers.Position
import com.believe.api.models.teammembers.TeamMemberCreateResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/believe-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.characters()).isNotNull()
        assertThat(client.teams()).isNotNull()
        assertThat(client.matches()).isNotNull()
        assertThat(client.episodes()).isNotNull()
        assertThat(client.quotes()).isNotNull()
        assertThat(client.believe()).isNotNull()
        assertThat(client.conflicts()).isNotNull()
        assertThat(client.reframe()).isNotNull()
        assertThat(client.press()).isNotNull()
        assertThat(client.coaching()).isNotNull()
        assertThat(client.biscuits()).isNotNull()
        assertThat(client.pepTalk()).isNotNull()
        assertThat(client.stream()).isNotNull()
        assertThat(client.teamMembers()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
        assertThat(client.health()).isNotNull()
        assertThat(client.version()).isNotNull()
        assertThat(client.client()).isNotNull()
    }

    @Test
    fun characterRoundtrip() {
        val jsonMapper = jsonMapper()
        val character =
            Character.builder()
                .id("ted-lasso")
                .background(
                    "Former American football coach from Kansas who moved to London to coach AFC Richmond"
                )
                .emotionalStats(
                    EmotionalStats.builder()
                        .curiosity(99L)
                        .empathy(100L)
                        .optimism(95L)
                        .resilience(90L)
                        .vulnerability(80L)
                        .build()
                )
                .name("Ted Lasso")
                .personalityTraits(listOf("optimistic", "kind", "folksy", "persistent"))
                .role(CharacterRole.COACH)
                .dateOfBirth(LocalDate.parse("1970-09-22"))
                .email("ted.lasso@afcrichmond.com")
                .addGrowthArc(
                    GrowthArc.builder()
                        .breakthrough("Showing vulnerability about his marriage")
                        .challenge("Earning respect despite inexperience")
                        .endingPoint("Accepted by the team despite relegation")
                        .season(1L)
                        .startingPoint("Fish out of water, hiding pain with humor")
                        .build()
                )
                .heightMeters(1.83)
                .profileImageUrl("https://afcrichmond.com/images/ted-lasso.jpg")
                .salaryGbp("150000.00")
                .addSignatureQuote("I believe in believe.")
                .addSignatureQuote("Be curious, not judgmental.")
                .teamId("afc-richmond")
                .build()

        val roundtrippedCharacter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(character),
                jacksonTypeRef<Character>(),
            )

        assertThat(roundtrippedCharacter).isEqualTo(character)
    }

    @Test
    fun teamMemberCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberCreateResponse =
            TeamMemberCreateResponse.ofPlayer(
                Player.builder()
                    .id("jamie-tartt-richmond")
                    .characterId("jamie-tartt")
                    .jerseyNumber(9L)
                    .position(Position.FORWARD)
                    .teamId("afc-richmond")
                    .yearsWithTeam(3L)
                    .assists(23L)
                    .goalsScored(47L)
                    .isCaptain(false)
                    .memberType(Player.MemberType.PLAYER)
                    .build()
            )

        val roundtrippedTeamMemberCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberCreateResponse),
                jacksonTypeRef<TeamMemberCreateResponse>(),
            )

        assertThat(roundtrippedTeamMemberCreateResponse).isEqualTo(teamMemberCreateResponse)
    }

    @Test
    fun characterRoleRoundtrip() {
        val jsonMapper = jsonMapper()
        val characterRole = CharacterRole.COACH

        val roundtrippedCharacterRole =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(characterRole),
                jacksonTypeRef<CharacterRole>(),
            )

        assertThat(roundtrippedCharacterRole).isEqualTo(characterRole)
    }
}
