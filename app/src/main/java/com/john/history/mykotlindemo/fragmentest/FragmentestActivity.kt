package com.john.history.mykotlindemo.fragmentest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_fragmentest.*

class FragmentestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragmentest)

        button.setOnClickListener {
            val transation =supportFragmentManager.beginTransaction()
            val fragmentA=FragmentA.Companion.newInstance("a1","a2")

            transation.replace(R.id.fragment,fragmentA)
            transation.addToBackStack("fragmentA")
            transation.commit()

        }

        button2.setOnClickListener {
            val transation =supportFragmentManager.beginTransaction()
            val fragmentB=FragmentB.newInstance("b1","b2")

            transation.replace(R.id.fragment,fragmentB)
            transation.addToBackStack("fragmentB")
            transation.commit()
        }

    }
}
