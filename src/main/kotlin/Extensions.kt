//EXTENSIONS
fun String.initials(): String { //MOVING THIS METHODS TO extensionFunctions2.kt
    val values: List<String> = this.split(' ') //this actuall calling String
    val firstInitial: String = values[0].substring(0, 1)
    val lastInitial: String = values[1]. substring(0, 1)
    return "$firstInitial$lastInitial"
}

fun Int.isAdult(): Boolean {
    return this >= 18  //this actuall calling Int
}

fun PersonHave.fullName() = "${this.firstName} ${this.lastName}"

//MODELS
class PersonHave(val firstName: String, val lastName: String, val age: Int)
