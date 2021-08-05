fun main () { //pegando a class de Usuario.kt

    var usuario = Usuario("guga", "padilha")
    usuario.nomeCompleto()
    usuario.tamanhoNome() //do primeiro nome

    var visitante = Usuario("augustinho", "carrara")
    visitante.nomeCompleto()
    visitante.tamanhoNome()

    visitante.atualizarNome("felipe")//apesar de não ter sobrenome, ele pega o sobrenome do visitante anterior.
    visitante.nomeCompleto() //pois aqui peço pra printar na tela o nome completo do visitante.
    visitante.tamanhoNome()

}

