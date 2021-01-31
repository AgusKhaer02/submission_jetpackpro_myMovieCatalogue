package com.agusjetpacksubmission.mymoviecatalogue.home

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.agusjetpacksubmission.mymoviecatalogue.R
import com.agusjetpacksubmission.mymoviecatalogue.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setPagerAdapter()
    }

    private fun setPagerAdapter(){
        val sectionsPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        binding.viewPager.adapter = sectionsPagerAdapter
        binding.tabs.setupWithViewPager(binding.viewPager)
        binding.tabs.getTabAt(0)?.setIcon(R.drawable.ic_clapperboard_active)
        binding.tabs.getTabAt(1)?.setIcon(R.drawable.ic_retrotv_active)
        binding.tabs.setSelectedTabIndicatorColor(Color.parseColor("#049ae0"))

        @Suppress("DEPRECATION")
        binding.tabs.setSelectedTabIndicatorHeight((5 * resources.displayMetrics.density).toInt())

        binding.tabs.setTabTextColors(Color.parseColor("#494949"), Color.parseColor("#049ae0"))
        supportActionBar?.elevation = 0f
    }

}