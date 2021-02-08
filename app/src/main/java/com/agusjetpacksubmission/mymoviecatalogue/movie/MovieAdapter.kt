package com.agusjetpacksubmission.mymoviecatalogue.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agusjetpacksubmission.mymoviecatalogue.R
import com.agusjetpacksubmission.mymoviecatalogue.databinding.ListMovieBinding
import com.agusjetpacksubmission.mymoviecatalogue.detail.DetailActivity
import com.agusjetpacksubmission.mymoviecatalogue.entities.MovieEntity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.ArrayList

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listMovies = ArrayList<MovieEntity>()

    fun setCourses(movies: List<MovieEntity>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val listMovieBinding = ListMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(listMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val course = listMovies[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listMovies.size


    class MovieViewHolder(private val binding: ListMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                tvTitle.text = movie.movieTitle
                tvCategory.text = movie.movieCategory
                tvRating.text = movie.rating.toString()
                tvViewer.text = movie.viewer.toString()

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_MOVIE_ID, movie.movieId)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(movie.movieImage)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_baseline_hourglass_empty_24)
                        .error(R.drawable.ic_error))
                    .into(imgMovie)
            }
        }
    }
}