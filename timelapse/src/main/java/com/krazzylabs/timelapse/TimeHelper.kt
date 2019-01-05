package com.krazzylabs.timelapse

import java.util.*

class TimeHelper{

    companion object {

        private const val millisInMinute = 60000
        private const val millisInHour = 3600000
        private const val millisInDay = 86400000
        private const val millisInMonth = 2592000000
        private const val millisInYear = 31104000000

        fun timeElasped(timeInMillis : Long, minimalTime:Boolean=true):String{

            var timeDifference = timeDiff(timeInMillis)
            return when {
                timeDifference in 0..(millisInMinute-1) -> Constants.JUST_NOW
                timeDifference in millisInMinute..(millisInHour-1) -> computeMinutes(timeDifference, minimalTime)
                timeDifference in millisInHour..(millisInDay-1) -> computeHours(timeDifference, minimalTime)
                timeDifference in millisInDay..(millisInMonth-1) -> if(minimalTime)  minimalTime(timeInMillis) else computeDays(timeDifference)
                timeDifference in millisInMonth..(millisInYear-1) -> if(minimalTime) minimalTime(timeInMillis) else computeMonths(timeDifference)
                timeDifference>millisInYear -> if(minimalTime) minimalTime(timeInMillis,false) else computeYears(timeDifference)
                else -> Constants.LONG_AGO
            }
        }

        private fun currentTimeInMillis(): Long{
            return  Calendar.getInstance().timeInMillis
        }

        private fun timeDiff(timeInMillis: Long): Long{
            return (currentTimeInMillis()-timeInMillis)
        }

        private fun computeMinutes(timeDifference : Long, minimalTime:Boolean=true): String{
            var ratio : Int = (timeDifference/millisInMinute).toInt()
            return if(ratio==1)
                "$ratio ${Constants.MIN_AGO}"
            else
                "$ratio ${Constants.MINS_AGO}"
        }

        private fun computeHours(timeDifference : Long, minimalTime:Boolean=true): String{
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
                return if (ratio == 1)
                    "$ratio ${Constants.YR_AGO}"
                else
                    "$ratio ${Constants.YRS_AGO}"
        }

        private fun minimalTime(timeInMillis : Long,minimalTime:Boolean=true) : String{
            var dateString: String
            var c = Calendar.getInstance()
            c.timeInMillis = timeInMillis

            if(minimalTime)
                dateString = "${c.get(Calendar.DATE)} ${c.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault())}"
            else
                dateString = "${c.get(Calendar.DATE)} ${c.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault())} ${c.get(Calendar.YEAR)}"
            return dateString
        }
    }

}