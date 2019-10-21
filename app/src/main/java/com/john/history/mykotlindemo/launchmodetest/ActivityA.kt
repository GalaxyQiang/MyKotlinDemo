package com.john.history.mykotlindemo.launchmodetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.john.history.mykotlindemo.R

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val intent = Intent("com.activityb")
        Log.d("AAA", "onCreate: AAA_Activity_A"+"/n"+taskId)
        startActivity(intent)
    }
}
