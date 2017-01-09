package main

import kotlin.concurrent.fixedRateTimer

class Count(var hh: Int, var mm: Int, var ss: Int){
    init{
        println("Timer set to ${timeToString()}.")
    }
    val frt = fixedRateTimer("tomato-time", false, 1000.toLong(), 1000){
        if (ss == 0 && mm > 0) {
            ss = 59
            mm--
        }else if(ss == 0 && mm == 0 && hh > 0){
            hh --
            mm = 59
            ss = 59
        }else{
            ss--
        }
        println(timeToString())
        if (timeToString() == "00:00:00") {
            this.cancel()
        }
    }

    private fun timeToString(): String{
        //TODO This method prints the time in a string format.
        return "${formatUnit(hh)}:${formatUnit(mm)}:${formatUnit(ss)}"
    }

    private fun formatUnit(unit: Int): String{
        //TODO This method formats the unit by adding a 0 to Int < 10.
        if (unit < 10){
            return "0" + unit.toString()
        }else{
            return unit.toString()
        }
    }
}

fun main(args: Array<String>){
}