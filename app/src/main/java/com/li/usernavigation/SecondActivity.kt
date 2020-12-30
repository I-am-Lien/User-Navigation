package com.li.usernavigation

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //access navigation
        actionBar?.setDisplayHomeAsUpEnabled(true)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.framelayout, OneFragment()).commit()
        }
        tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout, OneFragment()).commit()
                    1 -> supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout, SecondFragment()).commit()
                    2 -> supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout, ThirdFragment()).commit()
                }
            }

        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                val parentActivityIntent = Intent(this, MainActivity::class.java)
                startActivity(parentActivityIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}