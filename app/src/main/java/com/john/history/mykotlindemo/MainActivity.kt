package com.john.history.mykotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_recycle_view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val data= listOf<String>("RecycleViewActivity","DatabindingActivity","FragmentLifeCycleActivity")
        val adapter=MainAdapter(data)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainRV.layoutManager= LinearLayoutManager(this)
        mainRV.adapter=adapter
    }
}
