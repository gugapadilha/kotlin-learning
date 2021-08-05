fun main () { //pegando a class do User.kt

    var user = User()
    user.firstName = "guga"
    user.lastName = "padilha"
    user.printFullName()

    user.updateName("clovinho")
    user.updateLastName("charlatao")
    user.printFullName()


    var friend = User()
    friend.firstName = "augustinho"
    friend.lastName = "carrara"
    friend.printFullName()
    friend.printWithPrefix("Ms")
    friend.lengthFirstName()
}
