package com.john.history.mykotlindemo.livedatatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.observe
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_transformations.*
import kotlin.random.Random

class TransformationsActivity : AppCompatActivity() {
    lateinit var mSource:MediatorLiveData<Int>
    lateinit var swtichLiveData: MediatorLiveData<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transformations)

        mSource=MediatorLiveData<Int>().apply { value=10 }
        val mLiveData=Transformations.map(mSource){
            "数据监测：${mSource.value}"
        }
        mLiveData.observe(this){
            textView.setText(mLiveData.value)
        }

        button.setOnClickListener{
            mSource.value=Random.nextInt(0,100)
        }
    }
}
