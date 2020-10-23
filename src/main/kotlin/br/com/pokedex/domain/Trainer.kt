package br.com.pokedex.domain

import java.time.LocalDate
import java.time.LocalDateTime

data class Trainer(
        val id: Long? = null,

        val name: String,

        val birthDate: LocalDate,

        val pokemons: Set<PokemonInstance> = hashSetOf(),

        val startAsTrainerIn: LocalDateTime? = LocalDateTime.now()
)