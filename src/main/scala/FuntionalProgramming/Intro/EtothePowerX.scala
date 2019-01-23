package FuntionalProgramming.Intro

object EtothePowerX extends App{


  def factorial(number : Int) :Int ={
    if(number <=1 ) 1 else number * factorial(number-1)
  }

  def exponential(input : Float) ={
    var sum : Float =0
    Range(0, 10).foreach(i=>{
      println(scala.math.pow(input,i).toFloat, "----------------", factorial(i).toFloat)
      println(scala.math.pow(input,i)/factorial(i))
      sum +=(scala.math.pow(input,i).toFloat/factorial(i).toFloat)
    })
    (sum*1000).round
  }

  Console print exponential(5.0.toFloat)
}
