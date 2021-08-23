interface moviesRepository {

  fun getMovies()

  fun getBestMovies()

  fun getNewMovies()
  
}

class MoviesImplement : moviesRepository {
    override fun getMovies() {
        TODO("Not yet implemented")
    }

    override fun getBestMovies() {
        TODO("Not yet implemented")
    }

    override fun getNewMovies() {
        TODO("Not yet implemented")
    }

}

class moviesViewModel(var moviesImplement: moviesRepository) {

    fun getMovies(){
        moviesImplement.getBestMovies()
    }
}


