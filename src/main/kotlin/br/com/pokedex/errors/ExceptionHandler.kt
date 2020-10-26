package br.com.pokedex.errors

import br.com.pokedex.exceptions.PokemonNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class ExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(PokemonNotFoundException::class)
    fun handleNotFoidExcpetion(pokemonNotFoundException: PokemonNotFoundException): ResponseEntity<ApiError> {
        val apiError = ApiError(HttpStatus.NOT_FOUND.value(), pokemonNotFoundException.message
                ?: "")
        return ResponseEntity(apiError, HttpStatus.NOT_FOUND)
    }

}