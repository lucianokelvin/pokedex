package br.com.pokedex.services

import br.com.pokedex.dataService.PokemonFactory
import br.com.pokedex.domain.Pokemon
import br.com.pokedex.domain.Type
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PokemonService {

    @Autowired
    lateinit var pokemonFactory: PokemonFactory

    fun pokemonByType(type: Type): List<Pokemon> {
        return pokemonFactory.all().filter { it.types.contains(type) }
    }

    fun pokemonByName(name: String): Pokemon {
        return pokemonFactory.get(name)
    }


}