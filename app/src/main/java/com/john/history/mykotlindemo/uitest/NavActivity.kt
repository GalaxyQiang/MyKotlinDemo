package com.john.history.mykotlindemo.uitest

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.john.history.mykotlindemo.R
import com.john.history.mykotlindemo.uitest.navfragment.ViewPagerAdapter
import com.john.history.mykotlindemo.uitest.navfragment.ViewPagerFragment1
import com.john.history.mykotlindemo.uitest.navfragment.ViewPagerFragment2
import kotlinx.android.synthetic.main.activity_nav.*

class NavActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
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
        val listfragment=arrayListOf<Fragment>(
            ViewPagerFragment1.newInstance("fragment1","googd"),
            ViewPagerFragment2.newInstance("fragment2","bad"))
        viewPager= ViewPager(this)
        viewpager.adapter=ViewPagerAdapter(supportFragmentManager,listfragment )
//        viewpager.offscreenPageLimit=1
        nav_view.setOnNavigationItemSelectedListener (onNavigationItemSelectedListener)
    }
}
