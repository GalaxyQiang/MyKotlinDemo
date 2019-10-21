package com.john.history.mykotlindemo.id

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_id.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T

import android.provider.Settings


class IDActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.john.history.mykotlindemo.R.layout.activity_id)
        buttonid.setOnClickListener{
            val ANDROID_ID = Settings.System.getString(contentResolver, Settings.System.ANDROID_ID)
            textViewid.text=ANDROID_ID
        }
    }
}
