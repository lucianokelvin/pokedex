package br.com.pokedex.services

import br.com.pokedex.dataService.PokemonFactory
import br.com.pokedex.domain.Pokemon
import br.com.pokedex.domain.Type

class PokemonService {

    fun pokemonByType(type: Type): List<Pokemon> {
        return PokemonFactory.all().filter { it.types.contains(type) }
    }

    fun pokemonByName(name: String): List<Pokemon> {
        return PokemonFactory.all().filter { it.name == name }
    }


}