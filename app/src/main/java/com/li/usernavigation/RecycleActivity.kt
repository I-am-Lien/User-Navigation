package com.li.usernavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class RecycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)
        actionBar?.setDisplayHomeAsUpEnabled(true)


    }
}