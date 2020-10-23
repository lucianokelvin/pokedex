package br.com.pokedex

import br.com.pokedex.services.PokemonService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PokemonServiceTests {

    @Autowired
    lateinit var pokemonService: PokemonService

    @Test
    fun test_get_by_name() {
        Assertions.assertNotNull(pokemonService.pokemonByName("pikachu"))
    }

}
