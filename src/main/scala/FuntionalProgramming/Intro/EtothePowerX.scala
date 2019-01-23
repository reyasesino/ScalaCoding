package FuntionalProgramming.Intro

object EtothePowerX extends App{


  def factorial(number : Int) :Int ={
    if(number <=1 ) 1 else number * factorial(number-1)
  }

  def exponential(input : Double) ={
    var sum : Float =0
    Range(0, 10).foreach(i=>{
      println(scala.math.pow(input,i), "----------------", factorial(i).toDouble)
      println(scala.math.pow(input,i)/factorial(i))
      sum + (scala.math.pow(input,i)/factorial(i))
    })
    sum
  }

  Console print exponential(5.0)
}
