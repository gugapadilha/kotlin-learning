fun main () {
    val usuario = Dados("guga", "padilha")
    println(usuario.nomeCompleto)

    usuario.nomeCompleto = "joe"
    println(usuario.nomeCompleto)

    usuario.nomeCompleto = "augustinho carrara"
    println(usuario.nomeCompleto)

    println(usuario.nomeCompletoLength())
}

class Dados(var nome: String, var sobrenome: String) {
    var nomeCompleto: String = "$nome $sobrenome"
        get() = "Nome Completo: $field" //usado para adicionar um prefixo

        set(value) {
            if (value.startsWith("joe")){ //se começar com "joe"...
                field = "joe donn" //adicione o donn no final
            }else {
                field = value //caso contrario, escreva o novo nome normalmente.
            }
        }

    fun nomeCompletoLength(): Int { //se a var nomeCompleto fosse uma fun, poderia chamar da mesma forma
        return nomeCompleto.length
    }
}