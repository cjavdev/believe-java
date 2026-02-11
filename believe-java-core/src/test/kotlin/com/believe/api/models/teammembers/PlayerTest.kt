// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerTest {

    @Test
    fun create() {
        val player =
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

        assertThat(player.id()).isEqualTo("jamie-tartt-richmond")
        assertThat(player.characterId()).isEqualTo("jamie-tartt")
        assertThat(player.jerseyNumber()).isEqualTo(9L)
        assertThat(player.position()).isEqualTo(Position.FORWARD)
        assertThat(player.teamId()).isEqualTo("afc-richmond")
        assertThat(player.yearsWithTeam()).isEqualTo(3L)
        assertThat(player.assists()).contains(23L)
        assertThat(player.goalsScored()).contains(47L)
        assertThat(player.isCaptain()).contains(false)
        assertThat(player.memberType()).contains(Player.MemberType.PLAYER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val player =
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

        val roundtrippedPlayer =
            jsonMapper.readValue(jsonMapper.writeValueAsString(player), jacksonTypeRef<Player>())

        assertThat(roundtrippedPlayer).isEqualTo(player)
    }
}
