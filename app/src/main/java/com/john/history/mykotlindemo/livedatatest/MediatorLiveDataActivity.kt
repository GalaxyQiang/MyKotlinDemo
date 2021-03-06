package com.john.history.mykotlindemo.livedatatest

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_mediator_live_data.*
import kotlin.random.Random

class MediatorLiveDataActivity : AppCompatActivity() {
     var mMediatorLiveDataA=MediatorLiveData<Int>()
     var mMediatorLiveDataB=MediatorLiveData<Int>()
     var mMediatorLiveData=MediatorLiveData<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mediator_live_data)
        val observer=Observer<Int> {textViewA.text=it.toString()
            mMediatorLiveData.value= Random.nextInt(0,100)
        }
        val observer2=Observer<Int> {textViewB.text=it.toString()  }
        mMediatorLiveData.addSource(mMediatorLiveDataA,observer)
        mMediatorLiveData.addSource(mMediatorLiveDataB,observer2)


        mMediatorLiveData.observe(this, Observer<Int> {
            Log.d("xxx",it.toString()) })

        buttonA.setOnClickListener { mMediatorLiveDataA.value=Random.nextInt() }
        buttonB.setOnClickListener { mMediatorLiveDataB.value=Random.nextInt() }

    }
}
