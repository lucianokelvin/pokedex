package br.com.pokedex.controllers

import br.com.pokedex.domain.Pokemon
import br.com.pokedex.domain.Trainer
import br.com.pokedex.services.TrainerService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/trainers")
@Api("Pokedex")
class TrainerController {


    @Autowired
    lateinit var trainerService: TrainerService

    @GetMapping("/byName/{name}")
    @ApiOperation("Buscar Treinador por nome")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "Sucesso"),
        ApiResponse(code = 404, message = "Treinador não encontrado")
    ])
    fun trainerByName(@PathVariable name: String): Trainer {
        return trainerService.byName(name)
    }


    @GetMapping("/byAge/{age}")
    @ApiOperation("Buscar Treinador por idade")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "Sucesso"),
        ApiResponse(code = 404, message = "Treinador não encontrado")
    ])
    fun trainerByAge(@PathVariable age: Long): List<Trainer> {
        return trainerService.byAge(age)
    }

}