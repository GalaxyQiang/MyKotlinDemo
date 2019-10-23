package com.john.history.mykotlindemo.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.lifecycle.*
import androidx.savedstate.SavedStateRegistry
import androidx.savedstate.SavedStateRegistryController
import androidx.savedstate.SavedStateRegistryOwner
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_view_model.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.log
import kotlin.random.Random

class ViewModelActivity : AppCompatActivity(){
    lateinit var vm:ViewModelProvider
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vm=ViewModelProvider(this,SavedStateViewModelFactory (application,this))
            .get(SavedStateViewModel::class.java)
//        val vm=ViewModelProviders.of(this).get(PlanetViewModel::class.java)
        setContentView(R.layout.activity_view_model)
        buttonnumber.setOnClickListener{
            vm.setNumber(Random.nextInt(0,100))
        }
        vm.getNumber().observe(this){
            textView.setText(it.toString())
        }

    }

    override fun onResume() {
        super.onResume()

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putCharSequence("aaa","001")
        super.onSaveInstanceState(outState)
        Log.d("xxx","onSaveInstanceState")

    }


}
