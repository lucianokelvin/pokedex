package br.com.pokedex

import br.com.pokedex.dataService.PokemonFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PokedexApplication

fun main(args: Array<String>) {
    PokemonFactory.fillList()
    runApplication<PokedexApplication>(*args)
}
