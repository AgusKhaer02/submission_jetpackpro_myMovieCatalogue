package com.agusjetpacksubmission.mymoviecatalogue.detailTvShow

import junit.framework.Assert
import org.junit.Before
import org.junit.Test

class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel

    @Before
    fun setUp(){
        viewModel = DetailTvShowViewModel()
        viewModel.setSelectedTvShow(1.toString())
    }

    @Test
    fun getTvshow() {
        val detailMovieEntities = viewModel.getTvShow()
        Assert.assertNotNull(detailMovieEntities)
    }
}