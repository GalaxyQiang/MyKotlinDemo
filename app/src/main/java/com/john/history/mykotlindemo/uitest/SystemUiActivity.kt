package com.john.history.mykotlindemo.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_system_ui.*

class SystemUiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_system_ui)
        buttonfullscream.setOnClickListener{
            buttonfullscream.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE

        }
        buttonhideNav.setOnClickListener {
            buttonhideNav.systemUiVisibility=View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }
    }
}
