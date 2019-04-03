package com.john.history.mykotlindemo.livedatatest

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_databinding.*
import kotlinx.android.synthetic.main.activity_observe.*
import kotlin.random.Random

class ObserveActivity : AppCompatActivity() {
    var mutableLiveData=MutableLiveData<Int>()
    var mutableLiveData2=MutableLiveData<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observe)
        val observer=Observer<Int>{
            textview.text=it.toString()
        }
        val observer2=Observer<Int>{
            textView2.text=it.toString()
        }

        mutableLiveData.observe(this,observer)
        mutableLiveData2.observe(this,observer)

        button1.setOnClickListener {
            mutableLiveData.value=Random.nextInt(100)

        }

        button2.setOnClickListener {

            mutableLiveData2.value=Random.nextInt(100)
        }
    }
}
