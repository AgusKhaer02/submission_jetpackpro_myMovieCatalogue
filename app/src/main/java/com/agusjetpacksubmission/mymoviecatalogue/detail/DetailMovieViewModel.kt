package com.agusjetpacksubmission.mymoviecatalogue.detail

import androidx.lifecycle.ViewModel
import com.agusjetpacksubmission.mymoviecatalogue.entities.MovieEntity
import com.agusjetpacksubmission.mymoviecatalogue.utils.DataDummy

class DetailMovieViewModel : ViewModel() {
    private lateinit var movieId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie() : MovieEntity{
        lateinit var movie :MovieEntity

        val movieEntities = DataDummy.generateDummyMovies()

        for (movieEntity in movieEntities){
            if(movieEntity.movieId.toString() == movieId){
                movie = movieEntity
            }
        }

        return movie
    }
}