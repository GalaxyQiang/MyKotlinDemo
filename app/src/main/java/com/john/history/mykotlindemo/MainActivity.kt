package com.john.history.mykotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_recycle_view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val data= listOf<String>(
            "SystemUiActivity",
            "SwitchMapActivity","GestureActivity",
            "MediatorLiveDataActivity","TransformationsActivity",
            "CoroutineActivity","RecycleViewActivity","DatabindingActivity",
            "FragmentLifeCycleActivity","ViewModelActivity")
        val adapter=MainAdapter(data)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainRV.layoutManager= androidx.recyclerview.widget.LinearLayoutManager(this)
        mainRV.adapter=adapter
    }
}
