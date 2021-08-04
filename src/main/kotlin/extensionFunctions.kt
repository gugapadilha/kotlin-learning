import java.math.BigInteger

fun main () {

    var student = Student()
    println("Pass status: ${student.hasPassed(57)}")
    println("Scholarship status: ${student.isScholar(57)}")

    //OTHER VALUES - maior valor
    val x: Int = 12
    val y: Int = 10

    val greaterVal = x.greaterValue(y) //normalmente passada assim com extension function.
    //val greaterVal = x greaterValue y //com infix function posso passar os valores desta forma.
    println(greaterVal)
}


//Basicamente Extension Functions servem para  adicionar funções em classes, sem declara-las
//Novas funcoes adicionas tem novas propriedades estáticas

fun Student.isScholar(marks: Int): Boolean {
    return  marks > 70 //else ele retorna false, pois o valor de retorno passado na fun é boolean
}

class Student { //OWN CLASS

    fun hasPassed(marks: Int): Boolean {
        return marks > 40 //else ele retorna false, pois o valor de retorno passado na fun é boolean
    }
}


//OTHER VALUES
//INFIX FUNCTION AND ALSO EXTENSION FUNCTION
infix fun Int.greaterValue(other: Int): Int {
    if(this > other){ //this é o "x"
        return this
    }else {
        return other //other é o "y"
    }
}