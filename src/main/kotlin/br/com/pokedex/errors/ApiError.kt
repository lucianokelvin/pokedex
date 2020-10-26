package br.com.pokedex.errors

import java.time.LocalDateTime

class ApiError(
        val code: Int,
        val date: String,
        val messages: List<String> = listOf()
) {

    constructor(code: Int, message: String) : this(code, LocalDateTime.now().toString(), listOf(message))
}