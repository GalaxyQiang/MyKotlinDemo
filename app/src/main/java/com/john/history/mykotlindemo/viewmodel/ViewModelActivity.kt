package com.john.history.mykotlindemo.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.john.history.mykotlindemo.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.log

class ViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
//        val vm=ViewModelProvider(this,SavedStateViewModelFactory(this,this))
        super.onCreate(savedInstanceState)
        Log.d("xxx",lifecycle.currentState.toString())
        setContentView(R.layout.activity_view_model)
        lifecycleScope.launch{
            val a=do1()
            val b=do2()
            val c=a+b
            Log.d("xxx",c.toString())
            Log.d("xxx",lifecycle.currentState.toString())

        }
        Log.d("xxx","over")

    }

    suspend fun do1():Int{
        Log.d("xxx","do1")
        delay(1000)
        return 1
    }

    suspend fun do2():Int{
        Log.d("xxx","do2")
        delay(5000)
        return 2
    }
}
