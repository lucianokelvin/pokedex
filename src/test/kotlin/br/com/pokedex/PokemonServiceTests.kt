package br.com.pokedex

import br.com.pokedex.exceptions.PokemonNotFoundException
import br.com.pokedex.services.PokemonService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PokemonServiceTests {

    @Autowired
    lateinit var pokemonService: PokemonService

    @Test
    fun test_get_by_name() {
        Assertions.assertNotNull(pokemonService.pokemonByName("Pikachu"))
    }


    @Test
    fun test_get_by_name_return_not_found() {
        val exception = assertThrows(PokemonNotFoundException::class.java) { pokemonService.pokemonByName("Ash") }
        assertEquals(exception.message, "Pokemon Não encontrado")
    }

}
