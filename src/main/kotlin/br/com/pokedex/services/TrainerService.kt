package br.com.pokedex.services

import br.com.pokedex.dataService.PokemonFactory
import br.com.pokedex.dataService.TrainerFactory
import br.com.pokedex.domain.Pokemon
import br.com.pokedex.domain.PokemonInstance
import br.com.pokedex.domain.Trainer
import br.com.pokedex.domain.Type
import br.com.pokedex.exceptions.TrainerNotFoundException

class TrainerService {

    fun pokemonByTrainer(id: Long): Set<PokemonInstance>? {
        TrainerFactory.all().find { it.id == id }?.let {
            return it.pokemons
        }

        throw TrainerNotFoundException()
    }

    fun findTrainer(id: Long): Trainer {
        TrainerFactory.all().find { it.id == id }?.let {
            return it
        }
        throw TrainerNotFoundException()
    }

    fun pokemonByTrainerAndType(id: Long, type: Type): List<Pokemon> {
        return PokemonFactory.all().filter { it.id == id }
    }

    fun pokemonByName(name: String): List<Pokemon> {
        return PokemonFactory.all().filter { it.name == name }
    }


}