package com.ben.pokerplanningservice.domain.model

import lombok.EqualsAndHashCode

@EqualsAndHashCode(of = ["id.privateId"])
data class Player(
    val name: String,
    val card: String? = null,
    val hasPlayed: Boolean = false,
    val id: PlayerId = PlayerId()
)