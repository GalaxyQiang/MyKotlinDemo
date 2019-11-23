package com.john.history.mykotlindemo.livedatatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.observe
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_switch_map.*

import kotlin.random.Random

class SwitchMapActivity : AppCompatActivity() {
    lateinit var mSource: MediatorLiveData<Int>
    lateinit var swtichLiveData: MediatorLiveData<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_map)

        mSource=MediatorLiveData<Int>().apply { value=10 }
        swtichLiveData=MediatorLiveData<String>().apply { value="100" }

        val mLiveData= Transformations.switchMap(mSource){
            Log.d("xxx","生成新的中间livedata")
            swtichLiveData
        }

        mLiveData.observe(this){
            textView.setText(mLiveData.value)
        }

        button.setOnClickListener{
            mSource.value= Random.nextInt(0,100)
        }

        button2.setOnClickListener{
            swtichLiveData.value= Random.nextInt(100,200).toString()
        }
    }
}
