package com.john.history.mykotlindemo.uitest.navfragment

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log

class ViewPagerAdapter(fm: FragmentManager,val fragments:ArrayList<Fragment>) : FragmentPagerAdapter(fm){
    override fun getItem(p0: Int): Fragment {
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