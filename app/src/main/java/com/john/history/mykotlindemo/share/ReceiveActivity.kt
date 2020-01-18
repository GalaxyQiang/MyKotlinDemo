package com.john.history.mykotlindemo.share

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_receive.*

class ReceiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive)
        tvShowMessage.text=intent.getStringExtra(Intent.EXTRA_TEXT)
    }
}
