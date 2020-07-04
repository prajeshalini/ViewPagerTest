package com.example.bottomappbartest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        custom.setFragmentManager(supportFragmentManager)
        custom2.setFragmentManager(supportFragmentManager)
        custom3.setFragmentManager(supportFragmentManager)


    }
}