package br.com.pokedex.domain

import java.time.LocalDateTime

data class PokemonInstance(
        val id: Long? = null,

        val pokemon: Pokemon,

        val trainer: Trainer? = null,

        val level: Long = 1L,

        val captureDate: LocalDateTime? = LocalDateTime.now()
){
    override fun toString(): String {
        return "PokemonInstance(id=$id, pokemon=${pokemon.name}, trainer=${trainer?.name}, level=$level, captureDate=$captureDate)"
    }
}