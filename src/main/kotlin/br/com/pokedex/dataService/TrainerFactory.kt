package br.com.pokedex.dataService

import br.com.pokedex.domain.Trainer
import br.com.pokedex.exceptions.PokemonNotFoundException
import java.time.LocalDate
import java.time.Month

class TrainerFactory {

    companion object {
        private lateinit var trainers: MutableList<Trainer>

        fun get(name: String): Trainer {
            trainers.find { it.name == name }?.let {
                return it
            }

            throw PokemonNotFoundException("Pokemon Not found")
        }

        fun all(): List<Trainer> {
            return this.trainers
        }


        public fun fillList() {
            trainers.add(Trainer(id = 1L, name = "Ash", birthDate = LocalDate.of(1990, Month.JULY, 1), pokemons = setOf(
                    PokemonFactory.getInstance("Pikachu"),
                    PokemonFactory.getInstance("Caterpie"),
                    PokemonFactory.getInstance("Bulbasaur"),
                    PokemonFactory.getInstance("Squirtle"),
                    PokemonFactory.getInstance("Charmander"),
                    PokemonFactory.getInstance("Pidgeotto")
            )))
        }

    }


}