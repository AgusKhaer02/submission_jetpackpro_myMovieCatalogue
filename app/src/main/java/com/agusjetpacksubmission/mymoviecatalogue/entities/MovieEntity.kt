package com.agusjetpacksubmission.mymoviecatalogue.entities

data class MovieEntity (
    var movieId : Int,
    var movieImage : String,
    var movieTitle : String,
    var movieCategory : String,
    var releaseDate : String,
    var rating : Double,
    var viewer : Int,
    var percentLike : Int,
    var director : String,
    var sinopsis : String,
    var age : String
)