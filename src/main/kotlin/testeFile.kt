fun main () {

  /*  val frutas = arrayListOf<String>()
    frutas.add("Morango")
    frutas.add("Abacaxi")
    println(frutas)
*/
    val frutas2 = arrayListOf<Frutas>()
    /*
    frutas2.add(Frutas("morango", 78.2))
    frutas2.add(Frutas("abacaxi"))
    frutas2.add(Frutas("limao"))
    frutas2.add(Frutas("melancia"))
    frutas2.add(Frutas("abacate"))
    frutas2.add(Frutas("uva"))
    frutas2.add(Frutas("laranja"))

 */

    do {
        var fruta: String
        var peso: String

        println("Digite o nome de uma fruta: ")
        fruta = readLine().toString()

        if (fruta != "99"){ //validando
            println("Digite o peso da fruta:")
            peso = readLine().toString()

            frutas2.add(Frutas(fruta, peso))
        }


    } while(fruta != "99")

    println(frutas2)

    frutas2.forEach { fruta ->

        println(fruta)

    }
}

data class Frutas(
    var nome: String,
    var peso: String = "0.0"
)
