package br.com.pokedex.domain

import java.time.LocalDateTime

data class Trainer(
        val id: Long? = null,

        val name: String,

        val birthDate: LocalDateTime,

        val pokemons: Set<PokemonInstance> = hashSetOf(),

        val startAsTrainerIn: LocalDateTime? = LocalDateTime.now()
)