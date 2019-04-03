package com.john.history.mykotlindemo.livedatatest

import android.arch.lifecycle.MediatorLiveData
import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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
        val observer=Observer<Int> {textViewA.text=it.toString()  }
        val observer2=Observer<Int> {textViewB.text=it.toString()  }
        mMediatorLiveData.addSource(mMediatorLiveDataA,observer)
        mMediatorLiveData.addSource(mMediatorLiveDataB,observer2)
//        mMediatorLiveData.addSource(mMediatorLiveDataA){
//            textViewA.text=it.toString()
//        }
//        mMediatorLiveData.addSource(mMediatorLiveDataB){
//            textViewB.text=it.toString()
//        }

        mMediatorLiveData.observe(this, Observer<Int> { it.toString() })

        buttonA.setOnClickListener { mMediatorLiveDataA.value=Random.nextInt() }
        buttonB.setOnClickListener { mMediatorLiveDataB.value=Random.nextInt() }

    }
}
