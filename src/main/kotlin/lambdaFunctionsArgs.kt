fun main () {

    repeater(5) { index ->
        if (index < 3){
            //Hello 3 times
            println("Hello")
        }else {
            //Goodbye 2 times
            println("Goodbye")
        }
    }

    derbyAnnouncer { player: String -> "$player is a great asset to the team" }
}

    fun repeater(times: Int, bloco: (Int) -> Unit) {
        repeat(times) { index -> bloco(index) } //doesnt matter if u passing a index or a random number
    }

    fun derbyAnnouncer(block: (String) -> String) {
        val players: List<String> = listOf(
            "McGwire",
            "Canseco",
            "Honeycutt",
            "Davis",
            "Dawley",
            "Weiss"
        )

        val randomWord: String = players.random()
        println("The next player is... $randomWord")
        val announceMessage: String = block (randomWord) //blocks takes string and them returns string
        println(announceMessage)
    }

