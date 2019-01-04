package com.krazzylabs.timelapse

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

class ElaspedTimeTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : TextView(context, attrs, defStyleAttr) {

    fun setElaspedTime(time: Long){
        text = TimeHelper.timeElasped(time)
    }

}