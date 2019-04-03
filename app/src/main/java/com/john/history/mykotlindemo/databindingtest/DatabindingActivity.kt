package com.john.history.mykotlindemo.databindingtest

import android.databinding.DataBindingUtil
import android.databinding.ObservableInt
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.john.history.mykotlindemo.R
import com.john.history.mykotlindemo.databinding.ActivityDatabindingBinding
import kotlinx.android.synthetic.main.activity_databinding.*
import kotlin.random.Random

class DatabindingActivity : AppCompatActivity() {
    var score=Score("john",10, ObservableInt(100))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val databinding:ActivityDatabindingBinding=DataBindingUtil.setContentView(this,R.layout.activity_databinding)

        databinding.score=score

        button.setOnClickListener {
            var random=Random.nextInt(1000)
            score.socre.set(random)
            score.name=Integer.toString(random)
        }
    }
}
