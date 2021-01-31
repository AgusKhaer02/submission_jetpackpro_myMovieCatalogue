package com.agusjetpacksubmission.mymoviecatalogue.home

import android.content.Context
import android.util.Log
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.agusjetpacksubmission.mymoviecatalogue.R
import com.agusjetpacksubmission.mymoviecatalogue.tvshow.TvShowFragment
import com.agusjetpacksubmission.mymoviecatalogue.movie.MovieFragment

class SectionPagerAdapter(private val mContext : Context, fm : FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object{
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.fr_title_movie, R.string.fr_title_tvshow)
    }

    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment {
        Log.i("getItem", position.toString())
        return when(position) {

            0 -> MovieFragment()
            1 -> TvShowFragment()
            else -> Fragment()
        }
    }


    override fun getPageTitle(position: Int): CharSequence = mContext.resources.getString(TAB_TITLES[position])
}