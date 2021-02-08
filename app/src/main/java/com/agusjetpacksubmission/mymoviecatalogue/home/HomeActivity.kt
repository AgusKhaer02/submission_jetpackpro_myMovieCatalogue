package com.agusjetpacksubmission.mymoviecatalogue.home

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.PhoneNumberUtils
import android.widget.PopupMenu
import android.widget.Toast
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

        binding.btnMenuMore.setOnClickListener {
            setDropdownMenu()
        }

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


    private fun setDropdownMenu(){
        val popup = PopupMenu(this, binding.btnMenuMore)

        popup.menuInflater.inflate(R.menu.menu_home, popup.menu)
        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_payMeACoffee -> {
                    val message = "Heyy I wanna pay you some coffee"
                    val intent = Intent(Intent.ACTION_SEND)
                    val myWhatsappNumber = "+628999533158"
                    @Suppress("DEPRECATION")
                    val formattedNumber = PhoneNumberUtils.formatNumber(myWhatsappNumber)
                    intent.type = "text/plain"
                    intent.setPackage("com.whatsapp")
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.putExtra("jid", "$formattedNumber@s.whatsapp.net")

                    @SuppressLint("QueryPermissionsNeeded")
                    if (intent.resolveActivity(packageManager) == null) {
                        Toast.makeText(this, "Please install whatsapp first.", Toast.LENGTH_SHORT).show()
                        return@OnMenuItemClickListener true
                    }
                    startActivity(intent)

                    return@OnMenuItemClickListener true
                }
                else -> {
                    return@OnMenuItemClickListener true
                }
            }
        })
        popup.show()
    }

}