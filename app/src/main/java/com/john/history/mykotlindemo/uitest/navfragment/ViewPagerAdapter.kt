package com.john.history.mykotlindemo.uitest.navfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import android.util.Log

class ViewPagerAdapter(fm: androidx.fragment.app.FragmentManager, val fragments:ArrayList<androidx.fragment.app.Fragment>) : androidx.fragment.app.FragmentPagerAdapter(fm){
    override fun getItem(p0: Int): androidx.fragment.app.Fragment {
        Log.d("AAA","getItem"+p0.toString())
        return fragments.get(p0)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        Log.d("AAA","getCount"+fragments.size)
        return fragments.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}