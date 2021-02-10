package com.agusjetpacksubmission.mymoviecatalogue.detailTvShow

import androidx.lifecycle.ViewModel
import com.agusjetpacksubmission.mymoviecatalogue.entities.TvShowEntity
import com.agusjetpacksubmission.mymoviecatalogue.utils.DataDummy

class DetailTvShowViewModel : ViewModel() {
    private lateinit var tvshowId: String

    fun setSelectedTvShow(id: String) {
        this.tvshowId = id
    }

    fun getTvShow() : TvShowEntity {
        lateinit var tvshow : TvShowEntity

        val tvshowEntities = DataDummy.generateDummyTvShow()

        for (tvshowEntity in tvshowEntities){
            if(tvshowEntity.id.toString() == tvshowId){
                tvshow = tvshowEntity
            }
        }

        return tvshow
    }
}