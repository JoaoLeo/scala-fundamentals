package io.joaoleo.playground.basics

object Recursion {

  // sum(3) = 1 + 2 + 3
  def sum(n: Int):Int =
    if(n <= 0) 0
    else  n + sum(n-1)

  def printN(str: String, n:Int) : Unit =
    if (n <= 0) ()
    else
      println(str)
      printN(str, n - 1)


  def isPrime(n: Int): Boolean = {
    def testDivisor(d: Int):Boolean =
      if(d > n / 2) true
      else if (n % d == 0) false
      else testDivisor(d + 1)

    if(n <= 1) false
    else testDivisor(2)
  }

  /**
   * Exercises
   * 1. concatenate a string a set number of times
   * concatenateN("Scala", 3) = "ScalaScalaScala"
   * 2 - Fibonaccci Numbers
   *  1, 2, 3, 5, 8, 13, 21, ...
   */

  def concatenateN(string: String, n:Int): String =
    if (n <= 0) ""
    else string + concatenateN(string, n - 1)

  def fibonacci(n: Int): Int =
    if(n <= 1) 1
    else if (n == 2) 2
    else fibonacci(n - 1) + fibonacci(n - 2)

  def main(args: Array[String]): Unit = {
    println(concatenateN("Scala", 3)) // ScalaScalaScala
    println(fibonacci(6)) // 13
  }
}
