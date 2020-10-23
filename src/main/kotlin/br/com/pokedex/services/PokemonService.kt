package br.com.pokedex.services

import br.com.pokedex.dataService.PokemonFactory
import br.com.pokedex.domain.Pokemon
import br.com.pokedex.domain.Type
import org.springframework.stereotype.Service

@Service
class PokemonService {

    fun pokemonByType(type: Type): List<Pokemon> {
        return PokemonFactory.all().filter { it.types.contains(type) }
    }

    fun pokemonByName(name: String): Pokemon {
        return PokemonFactory.get(name)
    }


}