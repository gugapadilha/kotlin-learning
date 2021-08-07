fun main () {
    val usuario = Dados("guga", "padilha")
    println(usuario.nomeCompleto)

    usuario.nomeCompleto = "joe"
    println(usuario.nomeCompleto)

    usuario.nomeCompleto = "augustinho carrara"
    println(usuario.nomeCompleto)
}

class Dados(var nome: String, var sobrenome: String) {
    var nomeCompleto: String = "$nome $sobrenome"
        get() = "Nome Completo: $field" //usado para adicionar um prefixo

        set(value) {
            if (value.startsWith("joe")){ //se começar com "joe"...
                field = "joe donn" //adicione o donn no final
            }else {
                field = value
            }
        }
}