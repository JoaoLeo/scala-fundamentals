package io.joaoleo.playground.basics

object Instructions {

  // instructions (are executed) vs expressions (are evaluated)
  // instructions: do this, do that, repeat - imperative programming
  // expressions: 2 + 3, IO effects, map, flatMap,filer - functional programming
  // an instruction is a structure(expression) returning Unit
  // Unit - have no meaning value but do somethig
  val printerInfo: Unit = println("This is an instruction") // side effect
  val unit: Unit = () // the only possible value of type Unit

  val CodeBlock: Unit = {
   val local = 45
    println("side effect")
  }

  // variables
  var mutable = 10
  val reassingment: Unit = mutable = 34
  mutable += 42
  val immutable = 10


  // loops in Scala

  def main(args: Array[String]): Unit = {
    var num = 1
    while (num <= 10) {
      println(num)
      num += 1
    }
    println(printerInfo == unit)
  }

}