fun main () {

    var student = Student()
    println(" Pass status: ${student.hasPassed(57)}")

    println("Scholarship status: ${student.isScholar(57)}")


    //OTHER VALUES
    val x: Int = 6
    val y: Int = 10

    val greaterVal = x.greaterValue(y)
    println(greaterVal)
}

fun Student.isScholar(marks: Int): Boolean {
    return  marks > 70 //else ele retorna false, pois o valor de retorno passado na fun é boolean
}

class Student { //OWN CLASS

    fun hasPassed(marks: Int): Boolean {
        return marks > 40 //else ele retorna false, pois o valor de retorno passado na fun é boolean
    }
}


//OTHER VALUES
fun Int.greaterValue(other: Int): Int {
    if(this > other){
        return this
    }else {
        return other
    }
}