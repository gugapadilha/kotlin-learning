fun main () {

    //VEHICLE
    var vehicle = Vehicle()
    vehicle.brand = "Fiat"
    vehicle.info()

    val sw = Vehicle.Steeringwheel()
    sw.info()

    val transmission = Vehicle.Transmission()
    transmission.shift()
    transmission.type


    //STUDENTS
    var student = Students()
    student.formation()

    var inGraduation = Students.Graduation()
    inGraduation.formation()

    var inPrimary = Students.PrimarySchool()
    inPrimary.formation()

    //Nested classes can access external classes members.
    //Kotlin define uma referência para um objeto da classe externa
}

class Vehicle {
    var brand: String = "unknown"

    fun info() = println(brand) //printing brand

    class Steeringwheel {
        val name = "The Steering Wheel"
        fun info() = println(name) //printing name
    }

    class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}

class Students {

    var highSchhol = "still doing"
    fun formation() = println(highSchhol)

    class Graduation {
        val have: Boolean = false
        fun formation() = println(have)
    }

    class PrimarySchool {
        val alreadyDid: Boolean = true
        fun formation() = println(alreadyDid)
    }
}