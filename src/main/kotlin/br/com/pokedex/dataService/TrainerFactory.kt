package br.com.pokedex.dataService

import br.com.pokedex.domain.Trainer
import br.com.pokedex.exceptions.PokemonNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.Month
import javax.annotation.PostConstruct

@Service
class TrainerFactory {

    @Autowired
    lateinit var pokemonFactory: PokemonFactory

    @PostConstruct
    fun init() {
        fillList()
    }

    private var trainers: MutableList<Trainer> = mutableListOf()

    fun getByName(name: String): Trainer {
        trainers.find { it.name.equals(name, ignoreCase = true) }?.let {
            return it
        }

        throw PokemonNotFoundException("Pokemon Not found")
    }

    fun all(): List<Trainer> {
        return this.trainers
    }


    private fun fillList() {
        trainers.add(Trainer(id = 1L, name = "Ash", birthDate = LocalDate.of(1990, Month.JULY, 1), pokemons = setOf(
                pokemonFactory.getInstance("Pikachu"),
                pokemonFactory.getInstance("Caterpie"),
                pokemonFactory.getInstance("Bulbasaur"),
                pokemonFactory.getInstance("Squirtle"),
                pokemonFactory.getInstance("Charmander"),
                pokemonFactory.getInstance("Pidgeotto")
        )))
    }


}