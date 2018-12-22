package com.krazzylabs.timelapse

import java.util.*

class TimeHelper{

    companion object {

        fun timeElasped(timeInMillis : Long):String{

            var timeDifference = timeDiff(timeInMillis)
            if(timeDifference<1)
                return "just now"
            if(timeDifference in 1..30000000000000)
                return  ""+timeDifference/600+" min ago"
            else  return "not yet decided"
        }

        fun currentTimeInMillis(): Long{
            return  Calendar.getInstance().timeInMillis
        }

        fun timeDiff(timeInMillis: Long): Long{
            return (currentTimeInMillis()-timeInMillis)
        }
    }

}