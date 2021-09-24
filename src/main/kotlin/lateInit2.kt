fun main () {

    var country = Country()
    //country.name = "Brazil"
    //println(country.name)
    country.setup()


    var otherCountry = Country()
    otherCountry.newCountry()
}

class Country {

    lateinit var name: String

    fun setup() {
        name = "Brazil"
        println("The name of the country is $name")
    }

    fun newCountry() {
        name = "USA"
        println("the name of the new country is $name")
    }
}

//lateinit only use only with mutable data type [ var ]
//lateinit used only with non-nullable data type
//lateinit values must be initialized before you use it