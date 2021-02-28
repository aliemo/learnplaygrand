package basics

object Expressions extends App{
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 4 + 4)
  // + - * / | & ^ << >> >>>
  val negNum = -16
  println(negNum >> 2)
  println(negNum >>> 2)

  println(1 == x)
  // == != <= >= < >

  println(!(1 == x))
  // ! && ||

  var anyVar = 2
  anyVar += 3 // also works -= /= *= , ... side effects
  println(anyVar)


  /** Instruction (Do) vs Expression (Value) */

  val aCondition = true

  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  var i = 0
  val whileValue: Unit = while (i <= 9) {
    println(i)
    i += 1;
  }

  println(whileValue)

  // Unit === void

  // side effects: println(), whiles, reassigning

  /** Code Blocks*/

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "Good Bye"
  }
  //  val anotherVal = z + 1 (z not in this region)


  val aValue = {
    2 < 3
  }
  println(aValue)

  val anotherValue = {
    if (aValue) 123 else 456
    123 + 456
  }
  println(anotherValue)
}
