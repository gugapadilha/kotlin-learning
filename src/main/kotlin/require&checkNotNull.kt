fun main () {

    // Double Bang Operator !!

    var name: String? = "Guga"

    val length: Int = name!!.length
    println(length)

    val person: PersonNames? = PersonNames("Guga") //if the value is null - them will crash
    println(person!!.name)


    //RequireNotNull - forcing something thats is nullable to be not null

    val person2: PersonNames? = PersonNames("guga") //PersonNames("Guga")

    println(requireNotNull(person2, {"Person shouldnt be null"}).name) //shows this message in the console


    //checkNotNull

    val person3: PersonNames? = PersonNames("Guga") //PersonName("Guga")

    if (checkNotNull(person3).name == "Guga") {
        println("hi guga!")
    } else {
        println("hi")
    }


    //filterNotNull

    val names = listOf<String?>("guga", "jake", "john", null, "sophia", "alexa", null, "isaias")

    val namesNotNull = names.filterNotNull()
    println(namesNotNull)
}