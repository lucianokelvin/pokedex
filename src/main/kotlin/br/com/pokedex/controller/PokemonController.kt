package br.com.pokedex.controller

import br.com.pokedex.domain.Pokemon
import br.com.pokedex.domain.Type
import br.com.pokedex.services.PokemonService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pokemons")
@Api("Pokedex")
class PokemonController {

    @Autowired
    lateinit var pokemonService: PokemonService


    @GetMapping("/byType/{type}")
    @ApiOperation("Buscar pokemon por tipo")
    @ResponseStatus(HttpStatus.OK)
    fun pokemonByType(@PathVariable type: Type): List<Pokemon> {
        return pokemonService.pokemonByType(type)
    }


    @GetMapping("/byName/{name}}")
    @ApiOperation("Buscar pokemon por nome")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "Sucesso"),
        ApiResponse(code = 404, message = "Pokemon não encontrado")
    ])
    fun pokemonByName(@PathVariable name: String): Pokemon {
        return pokemonService.pokemonByName(name)
    }

}