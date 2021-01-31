package com.agusjetpacksubmission.mymoviecatalogue.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agusjetpacksubmission.mymoviecatalogue.R
import com.agusjetpacksubmission.mymoviecatalogue.databinding.ListTvshowBinding
import com.agusjetpacksubmission.mymoviecatalogue.entities.TvShowEntity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>(){

    private var listTvShow = ArrayList<TvShowEntity>()

    fun setTvShow(tvShow: List<TvShowEntity>?) {
        if (tvShow == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvShow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val listTvShowBinding = ListTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(listTvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvShow = listTvShow[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int = listTvShow.size

    class TvShowViewHolder(private val binding: ListTvshowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: TvShowEntity) {
            with(binding) {
                tvTitle.text = tvshow.tvShowTitle
                tvCategory.text = tvshow.tvShowCategory
                Glide.with(itemView.context)
                    .load(tvshow.tvShowImage)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_baseline_hourglass_empty_24)
                            .error(R.drawable.ic_error))
                    .into(imgTvshow)
            }
        }
    }
}