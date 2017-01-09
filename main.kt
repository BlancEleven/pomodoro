package main

import kotlin.concurrent.fixedRateTimer

class count(hh: Int, mm: Int, ss: Int){
    val frt = fixedRateTimer('tomato-time', false, 1000, 1000){
        (if ss == 59){
            ss = 0
            if(mm < 59){
                mm++
            }else{
                mm = 0
                hh++
            }
        }
    }

    private fun printTime(){
        //TODO This method prints the time in a string format.
    }

    private fun formatUnit(unit: Int): String{
        //TODO This method formats the unit by adding a 0 to Int < 10.
    }
}

fun main(args: Array<String>){

}