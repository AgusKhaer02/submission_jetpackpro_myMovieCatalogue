package com.agusjetpacksubmission.mymoviecatalogue.detailMovie

import junit.framework.Assert
import org.junit.Before
import org.junit.Test

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel

    @Before
    fun setUp(){
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedMovie(1.toString())
    }

    @Test
    fun getMovies() {
        val detailMovieEntities = viewModel.getMovie()
        Assert.assertNotNull(detailMovieEntities)
    }
}