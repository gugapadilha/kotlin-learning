import java.lang.Thread.sleep
import kotlin.random.Random

fun main () {
    //LAZY OPERATOR

    val name: String by lazy {
        println("Computed") //printed just once
        println("foobar")   //printed just once, only lazy is printed many times.
        sleep(3000) //long running aplication simulation
        "guga"
    }

    println(name)
    println(name)
    println(name)


    //LAZY INITIALIZER BLOCK
    
    val resul:Lazy<Int> = lazy {someExpensiveOperation()}

    println(resul)
    println("is initialized: ${resul.isInitialized()}")
    println(resul.value) //the first time this values is computed inside  on someExpensiveOperation
    println(resul.value) // in subsequentes times we gonna see the same value
    println(resul.value)

}

fun someExpensiveOperation(): Int {
    println("computed")
    sleep(1000)
    return Random(System.currentTimeMillis()).nextInt() //gering a random value
}