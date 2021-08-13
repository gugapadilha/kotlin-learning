fun main () {

    var myCar = Car()
    myCar.branding = "Volvo"
    myCar.mation()

    val sw = myCar.SteeringWheel()
    sw.mation()

    var transmission = myCar.Transmissions() //i have to declare as inner too
    transmission.shift()
}

class Car {
    var branding = "unknown"

    fun mation() = println(branding)

    inner class SteeringWheel { //by default, nested classes doesnt have accsess to the member variables of the outer class
        var name: String = "Leather" //so we have to specify that class with the "inner"
        fun mation() = println("$branding is the brand of a vehicle whit $name steering wheel")
    }

    inner class Transmissions {
        var theType = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}