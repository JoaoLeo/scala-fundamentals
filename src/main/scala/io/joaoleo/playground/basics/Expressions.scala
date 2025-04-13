package io.joaoleo.playground.basics

object Expressions {
  // structures thats evalutate to a value
  // everything in scala is an expression=
  // math expression
  val meaningOfLife = 40 + 2
  val mathExpresison = 2 + 3 * 4

  // boolean expressions
  val equalityTest = 1 == 1

  // if expression
  val anIfExprss = if(equalityTest) 45 else 99
  val AnIfExpress2 = if equalityTest then 45 else 99

  // code blocks = expression
  val codeBlock = {
    // local values
    val localValue = 78

    // last value = value of entire block
    localValue + 99
  }

  // indentation syntax for code blocks
  val codeBlock2 =
    // local values
    val localValue = 78

    // last value = value of entire block
    localValue + 99

  // pattern matching - switch on steroids
  val value = 42
  var description: String = value match {
    case 1 => "first"
    case 2 => "second"
    case 42 => "meaning of life"
    case _ => "default"
  }

  def main(args: Array[String]): Unit = {
    println(meaningOfLife)
    println(mathExpresison)
    println(equalityTest)
    println(anIfExprss)
    println(codeBlock)
    println(description)
  }

}
