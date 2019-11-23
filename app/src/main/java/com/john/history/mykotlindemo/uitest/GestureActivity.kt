package com.john.history.mykotlindemo.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_gesture.*

class GestureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gesture)
        gesture.systemUiVisibility=View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION

    }
}
