import java.lang.Thread.sleep

fun main () {
    val name: String by lazy {
        println("Computed") //printed just once
        println("foobar")   //printed just once, only lazy is printed many times.
        sleep(3000) //long running aplication simulation
        "guga"
    }

    println(name)
    println(name)
    println(name)
}