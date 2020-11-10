package br.com.pokedex.domain

data class Pokemon(
        val id: Long? = null,

        val name: String,

        val generation: Long = 1L,

        val types: List<Type> = listOf(),

        val pre: Pokemon? = null,

        val evolution: Pokemon? = null,

        val lendary: Boolean = false
) {
    override fun toString(): String {
        return "Pokemon(id=$id, name='$name', generation=$generation, types=$types)"
    }
}