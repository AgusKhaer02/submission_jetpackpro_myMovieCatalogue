package com.agusjetpacksubmission.mymoviecatalogue.detailTvShow

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.agusjetpacksubmission.mymoviecatalogue.R
import com.agusjetpacksubmission.mymoviecatalogue.databinding.ActivityDetailTvShowBinding
import com.agusjetpacksubmission.mymoviecatalogue.entities.TvShowEntity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class DetailTvShowActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_TVSHOW_ID = "tvshowId"
    }

    private lateinit var binding : ActivityDetailTvShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTvShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getSelectedTvShow()
    }

    private fun getSelectedTvShow(){
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailTvShowViewModel::class.java]

        val extras = intent.extras
        if(extras != null){
            val tvShowId = extras.getInt(EXTRA_TVSHOW_ID)
            @Suppress("SENSELESS_COMPARISON")
            if (tvShowId != null) {
                viewModel.setSelectedTvShow(tvShowId.toString())
                setSelectedTvShow(viewModel.getTvShow())
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setSelectedTvShow(tvShowEntity : TvShowEntity){
        binding.tvTitle.text = tvShowEntity.title
        binding.tvCategory.text = tvShowEntity.category
        binding.tvSeasons.text = "${tvShowEntity.seasons} seasons"

        Glide.with(this)
            .load(tvShowEntity.image)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_baseline_hourglass_empty_24)
                    .error(R.drawable.ic_error))
            .into(binding.imgTvshow)
    }
}