package com.john.history.mykotlindemo.launchmodetest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.john.history.mykotlindemo.R

class LaunchModeActivityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_mode_main)
        val intent = Intent(this, ActivityA::class.java)
        Log.d("AAA", "onCreate: AAA_Activity_A"+"/n"+taskId)
        startActivity(intent)
    }
}
