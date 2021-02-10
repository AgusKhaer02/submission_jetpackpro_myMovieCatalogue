package com.agusjetpacksubmission.mymoviecatalogue.detailMovie

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.agusjetpacksubmission.mymoviecatalogue.R
import com.agusjetpacksubmission.mymoviecatalogue.databinding.ActivityDetailMovieBinding
import com.agusjetpacksubmission.mymoviecatalogue.entities.MovieEntity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions


class DetailMovieActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_MOVIE_ID = "movieId"
    }

    private lateinit var binding : ActivityDetailMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        setCollapsingToolbar()

        getSelectedMovie()
    }

    private fun setCollapsingToolbar(){

    }

    private fun getSelectedMovie(){
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]

        val extras = intent.extras
        if(extras != null){
            val movieId = extras.getInt(EXTRA_MOVIE_ID)
            @Suppress("SENSELESS_COMPARISON")
            if (movieId != null) {
                viewModel.setSelectedMovie(movieId.toString())
                setSelectedMovies(viewModel.getMovie())
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setSelectedMovies(movieEntity : MovieEntity){
        Log.d("DetailActivity", "TITLE : ${movieEntity.movieTitle}")

        binding.collapsingToolbar.title = movieEntity.movieTitle

        binding.collapsingToolbar.setCollapsedTitleTextColor(
            ContextCompat.getColor(this, R.color.white)
        )

        binding.collapsingToolbar.setExpandedTitleColor(
            ContextCompat.getColor(this, R.color.white)
        )

        binding.tvTitle.text = movieEntity.movieTitle
        binding.tvCategory.text = movieEntity.movieCategory
        binding.tvReleaseDate.text = movieEntity.releaseDate
        binding.tvRating.text = movieEntity.rating.toString()
        binding.tvViewer.text = movieEntity.viewer.toString()
        binding.tvPercentLike.text ="${movieEntity.percentLike}%"
        binding.tvDirector.text = movieEntity.director
        binding.tvAge.text = movieEntity.age
        binding.tvSynopsis.text = movieEntity.sinopsis

        Glide.with(this)
            .load(movieEntity.movieImage)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_baseline_hourglass_empty_24)
                .error(R.drawable.ic_error))
            .into(binding.imgMovie)

        Glide.with(this)
            .load(movieEntity.movieImage)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_baseline_hourglass_empty_24)
                .error(R.drawable.ic_error))
            .into(binding.imgMovie2)
    }
}