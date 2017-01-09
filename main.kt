package main

import kotlin.concurrent.fixedRateTimer

class count(hh: Int, mm: Int, ss: Int){
    val frt = fixedRateTimer('tomato-time', false, 1000, 1000){
        (if ss == 59){
            ss = 0
            if(hh == 59){
                
            }
        }
    }
}

fun main(args: Array<String>){

}