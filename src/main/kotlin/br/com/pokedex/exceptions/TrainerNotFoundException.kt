package br.com.pokedex.exceptions

class TrainerNotFoundException(message: String = "Pokemon Not found") : RuntimeException(message) {
}