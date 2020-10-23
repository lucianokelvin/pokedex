package br.com.pokedex.domain

data class Pokemon(
        val id: Long? = null,

        val name: String,

        val generation: Long = 1L,

        val type: Type,

        val pre: Pokemon? = null,

        val evolution: Pokemon? = null,

        val lendary: Boolean
)