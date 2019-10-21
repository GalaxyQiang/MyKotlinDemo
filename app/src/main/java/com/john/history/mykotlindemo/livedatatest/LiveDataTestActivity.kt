package com.john.history.mykotlindemo.livedatatest

import androidx.lifecycle.MediatorLiveData
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.john.history.mykotlindemo.R
import java.util.Random
import java.lang.Math
import kotlinx.android.synthetic.main.activity_live_data_test.*

class LiveDataTestActivity : AppCompatActivity(), LiveDataFragment.OnFragmentInteractionListener {
     var mLivedataA=MediatorLiveData<Double>()
     var mLivedataB=MediatorLiveData<Double>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_test)


        buttonA.setOnClickListener {
            var num:Double= 0.0
            num=Math.random()
            textViewA.text= num.toString()
            mLivedataA.value=num

        }

        buttonB.setOnClickListener {
            var num:Double= 0.0
            num=Math.random()
            textViewB.text= num.toString()
            mLivedataB.value=num
        }
    }

    fun getLiveDataA():MediatorLiveData<Double>{
        return mLivedataA
    }

    fun getLiveDataB():MediatorLiveData<Double>{
        return mLivedataB
    }
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
