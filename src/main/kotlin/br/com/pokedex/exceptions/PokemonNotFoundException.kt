package br.com.pokedex.exceptions

class PokemonNotFoundException(message: String = "Pokemon Not found") : RuntimeException(message) {
}