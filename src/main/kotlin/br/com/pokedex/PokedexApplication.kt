package br.com.pokedex

import br.com.pokedex.dataService.PokemonFactory
import br.com.pokedex.dataService.TrainerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PokedexApplication

fun main(args: Array<String>) {
    PokemonFactory.fillList()
    TrainerFactory.fillList()
    runApplication<PokedexApplication>(*args)
}
