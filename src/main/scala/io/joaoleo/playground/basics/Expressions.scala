package io.joaoleo.playground.basics

object Expressions {
  // structures thats evalutate to a value

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

  def main(args: Array[String]): Unit = {
    println(meaningOfLife)
    println(mathExpresison)
    println(equalityTest)
    println(anIfExprss)
    println(codeBlock)
  }

}
