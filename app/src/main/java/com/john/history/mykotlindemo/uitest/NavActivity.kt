package com.john.history.mykotlindemo.uitest

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import com.john.history.mykotlindemo.R
import com.john.history.mykotlindemo.uitest.navfragment.ViewPagerAdapter
import com.john.history.mykotlindemo.uitest.navfragment.ViewPagerFragment1
import com.john.history.mykotlindemo.uitest.navfragment.ViewPagerFragment2
import kotlinx.android.synthetic.main.activity_nav.*

class NavActivity : AppCompatActivity() {

    private lateinit var viewPager: androidx.viewpager.widget.ViewPager
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
//                viewPager.setCurrentItem(0,false)
                Log.d("AAA","点击home")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
//                viewPager.setCurrentItem(1)
                Log.d("AAA","点击dashboard")
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav)
        val listfragment=arrayListOf<androidx.fragment.app.Fragment>(
            ViewPagerFragment1.newInstance("fragment1","googd"),
            ViewPagerFragment2.newInstance("fragment2","bad"))
        viewPager= androidx.viewpager.widget.ViewPager(this)
        viewpager.adapter=ViewPagerAdapter(supportFragmentManager,listfragment )
//        viewpager.offscreenPageLimit=1
        nav_view.setOnNavigationItemSelectedListener (onNavigationItemSelectedListener)
    }
}
