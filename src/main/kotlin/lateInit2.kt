fun main () {

    var country = Country()
    country.name = "Brazil"
    println(country.name)
}

class Country {

    lateinit var name: String
}