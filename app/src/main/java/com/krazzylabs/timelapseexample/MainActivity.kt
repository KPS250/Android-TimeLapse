package com.krazzylabs.timelapseexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.krazzylabs.timelapse.TimeHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_timeDisplay.text = TimeHelper.timeElasped(1545482022176)
    }
}
