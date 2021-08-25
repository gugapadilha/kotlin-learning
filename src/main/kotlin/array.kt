fun main() {
    val itens = arrayOf(1, 2, 3, 4, 5)
    itens.forEach { println(it) }

    val usuarios = arrayOf(
        NewUsuarios("guga", "padilha"),
        NewUsuarios("james", "bond")
    )
    usuarios.forEach { println(it) }

    val updateUsers = usuarios.plus((NewUsuarios("Augustinho", "Carrara")))
    updateUsers.forEach { println(it) }

    usuarios.set(0, NewUsuarios("Foo", "Bar"))
    val item = usuarios[0] //setting new value on position 0
    println(item)

    //LIST

    val first = usuarios.first()
    println(first) //printing the firsts values of the list whos been mutable tho

    val last = usuarios.last()
    println(last)

    val name: String? = "abdal"
    val stuff = if(name == null) emptyList() else listOf(name)
    println(stuff)

}

class NewUsuarios(var firstNames: String,var lastNames: String){

    fun nomeCompleto(): String = "$firstNames - $lastNames"

    override fun toString(): String {
       return nomeCompleto()
    }
}