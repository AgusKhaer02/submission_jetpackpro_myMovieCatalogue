package com.agusjetpacksubmission.mymoviecatalogue.movie

import androidx.lifecycle.ViewModel
import com.agusjetpacksubmission.mymoviecatalogue.entities.MovieEntity
import com.agusjetpacksubmission.mymoviecatalogue.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovies() : List<MovieEntity> = DataDummy.generateDummyMovies()
}