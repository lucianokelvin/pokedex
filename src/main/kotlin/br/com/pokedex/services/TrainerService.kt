package br.com.pokedex.services

import br.com.pokedex.dataService.PokemonFactory
import br.com.pokedex.dataService.TrainerFactory
import br.com.pokedex.domain.Pokemon
import br.com.pokedex.domain.PokemonInstance
import br.com.pokedex.domain.Trainer
import br.com.pokedex.domain.Type
import br.com.pokedex.exceptions.TrainerNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TrainerService {

    @Autowired
    lateinit var trainerFactory: TrainerFactory

    @Autowired
    lateinit var pokemonFactory: PokemonFactory

    fun pokemonByTrainer(id: Long): Set<PokemonInstance>? {
        trainerFactory.all().find { it.id == id }?.let {
            return it.pokemons
        }

        throw TrainerNotFoundException()
    }

    fun findTrainer(id: Long): Trainer {
        trainerFactory.all().find { it.id == id }?.let {
            return it
        }
        throw TrainerNotFoundException()
    }

    fun pokemonByTrainerAndType(id: Long, type: Type): List<Pokemon> {
        return pokemonFactory.all().filter { it.id == id }
    }

    fun pokemonByName(name: String): List<Pokemon> {
        return pokemonFactory.all().filter { it.name == name }
    }


}