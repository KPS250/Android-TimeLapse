package com.krazzylabs.timelapse

import java.util.*

class TimeHelper{

    companion object {

        private val millisInMinute = 60000
        private val millisInHour = 3600000
        private val millisInDay = 86400000
        private val millisInMonth = 2592000000
        private val millisInYear = 31104000000

        fun timeElasped(timeInMillis : Long):String{

            var timeDifference = timeDiff(timeInMillis)
            return when {
                timeDifference in 1..(millisInMinute-1) -> Constants.JUST_NOW
                timeDifference in millisInMinute..(millisInHour-1) -> computeMinutes(timeDifference)
                timeDifference in millisInHour..(millisInDay-1) -> computeHours(timeDifference)
                timeDifference in millisInDay..(millisInMonth-1) -> computeDays(timeDifference)
                timeDifference in millisInMonth..(millisInYear-1) -> computeMonths(timeDifference)
                timeDifference> millisInYear -> computeYears(timeDifference)
                else -> Constants.LONG_AGO
            }
        }

        private fun currentTimeInMillis(): Long{
            return  Calendar.getInstance().timeInMillis
        }

        private fun timeDiff(timeInMillis: Long): Long{
            return (currentTimeInMillis()-timeInMillis)
        }

        private fun computeMinutes(timeDifference : Long): String{

            var ratio : Int = (timeDifference/millisInMinute).toInt()
            return if(ratio==1)
                "$ratio ${Constants.MIN_AGO}"
            else
                "$ratio ${Constants.MINS_AGO}"
        }

        private fun computeHours(timeDifference : Long): String{

            val ratio : Int = (timeDifference/millisInHour).toInt()
            return if(ratio==1)
                "$ratio ${Constants.HR_AGO}"
            else
                "$ratio ${Constants.HRS_AGO}"
        }

        private fun computeDays(timeDifference : Long): String{

            val ratio : Int = (timeDifference/millisInDay).toInt()
            return if(ratio==1)
                "$ratio ${Constants.DAY_AGO}"
            else
                "$ratio ${Constants.DAYS_AGO}"
        }

        private fun computeMonths(timeDifference : Long): String{

            val ratio : Int = (timeDifference/millisInMonth).toInt()
            return if(ratio==1)
                "$ratio ${Constants.MONTH_AGO}"
            else
                "$ratio ${Constants.MONTHS_AGO}"
        }

        private fun computeYears(timeDifference : Long): String{

            val ratio : Int = (timeDifference/millisInYear).toInt()
            return if(ratio==1)
                "$ratio ${Constants.YR_AGO}"
            else
                "$ratio ${Constants.YRS_AGO}"
        }
    }

}