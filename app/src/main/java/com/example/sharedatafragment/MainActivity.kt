package com.example.sharedatafragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val shareDataViewModel by lazy {
        ViewModelProvider(this).get(ShareDataViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shareDataViewModel.getText().observe(this) {
            edt_activity.setText(it)
        }

        shareData()

    }

    private fun shareData() {
        btn_share_data.setOnClickListener {
            shareDataViewModel.setText(edt_activity.text.toString().trim())
        }
    }

}