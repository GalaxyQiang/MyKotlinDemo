package com.john.history.mykotlindemo.recycleviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_recycle_view.*

class RecycleViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)
        rv.layoutManager= androidx.recyclerview.widget.LinearLayoutManager(this)
        rv.adapter=RvAdapter()
    }
}

