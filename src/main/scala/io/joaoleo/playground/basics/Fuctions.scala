package io.joaoleo.playground.basics

object Fuctions {

  // function - reusable piece of code that can be parameterize

  // always a single instruction
  // return is optional
  def function1(a: String, b:Int): String =  b + ". hello world to " + a

  val invocation = function1("jl", 1)

  // functions returning Unit
  // Unit == "void"
  def void(a: String): Unit =
    println(a)

  def functionWithSideEffect(a: String): String = {
    println(a)
    // return is optional - last expression gets returned
    a
  }

  def funcs(n: Int): Int = {
    def smallFunc(a: Int): Int = n + a
    smallFunc(n)
  }

  def main(args: Array[String]): Unit = {
      println(funcs(3))
  }
}
