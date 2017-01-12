package counter
//My second attempt at a timer.

import kotlin.concurrent.fixedRateTimer

class Timer(hours : Int, minutes : Int, seconds : Int){
    var initial : Array<Double> = arrayOf(hours.toDouble(), minutes.toDouble(), seconds.toDouble())
    var holdSet : Array<Int> = arrayOf() //Used when timer is paused.

    private fun setIntial(){
        //Sets intial variable.
    }

    private fun new(){
        //Creates new Timer. Can only be called from start method.
    }

    public fun getTime() : Array<Double>{

        return arrayOf()
    }

    public fun start(){
        //Calls new method to create new timer. Runs automatically.
    }

    public fun pause(){
        //Pauses timer by storing the pause time in currentTime variable and cancelling the timer.
    }

    public fun reset(){
        //Resets setTime to initial setting
    }
}
fun main(args: Array<String>){

}