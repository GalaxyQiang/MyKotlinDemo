package com.john.history.mykotlindemo.livedatatest

import android.arch.lifecycle.MediatorLiveData
import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_mediator_live_data.*

class MediatorLiveDataActivity : AppCompatActivity() {
     var mMediatorLiveDataA=MediatorLiveData<Double>()
     var mMediatorLiveDataB=MediatorLiveData<Double>()
     var mMediatorLiveData=MediatorLiveData<Double>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mediator_live_data)
        val observer=Observer<Double> {textViewA.text=it.toString()  }
        val observer2=Observer<Double> {textViewB.text=it.toString()  }
        mMediatorLiveData.addSource(mMediatorLiveDataA,observer)
        mMediatorLiveData.addSource(mMediatorLiveDataB,observer)
//        mMediatorLiveData.addSource(mMediatorLiveDataA){
//            textViewA.text=it.toString()
//        }
//        mMediatorLiveData.addSource(mMediatorLiveDataB){
//            textViewB.text=it.toString()
//        }

        mMediatorLiveData.observe(this, Observer<Double> { it.toString() })

        buttonA.setOnClickListener { mMediatorLiveDataA.value=Math.random() }
        buttonB.setOnClickListener { mMediatorLiveDataB.value=Math.random() }

    }
}
