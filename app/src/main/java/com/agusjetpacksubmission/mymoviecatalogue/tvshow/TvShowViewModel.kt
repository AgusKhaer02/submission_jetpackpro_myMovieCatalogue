package com.agusjetpacksubmission.mymoviecatalogue.tvshow

import androidx.lifecycle.ViewModel
import com.agusjetpacksubmission.mymoviecatalogue.entities.TvShowEntity
import com.agusjetpacksubmission.mymoviecatalogue.utils.DataDummy

class TvShowViewModel : ViewModel() {

    fun getTvShow() : List<TvShowEntity> = DataDummy.generateDummyTvShow()
}