package com.mobatia.bisad.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobatia.bisad.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        super.onBackPressed()
    }

}