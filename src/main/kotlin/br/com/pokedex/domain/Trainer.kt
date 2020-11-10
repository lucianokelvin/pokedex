package br.com.pokedex.domain

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import java.time.LocalDateTime

data class Trainer(
        val id: Long? = null,

        val name: String,

        @JsonFormat(pattern="yyyy-MM-dd")
        val birthDate: LocalDate,

        @JsonIgnore
        val pokemons: Set<PokemonInstance> = hashSetOf(),

        @JsonFormat(pattern="yyyy-MM-dd")
        val startAsTrainerIn: LocalDateTime? = LocalDateTime.now()
) {

    override fun toString(): String {
        return "Trainer(id=$id, name='$name', birthDate=$birthDate, pokemons=${pokemons.map { it.pokemon.name }}, startAsTrainerIn=$startAsTrainerIn)"
    }
}