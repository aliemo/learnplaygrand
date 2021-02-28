package basics

object ValVarTypes extends App {

  // Value Types are immutable
  val anInt: Int = 4
  val aBoolean: Boolean = false
  val aString: String = "Hello, World!"
  val aChar: Char = 'a'
  val aShort: Short = 1234
  val aLong: Long = 1234567890L
  val aFloat: Float = 2.0f
  val aDoable: Double = 3.14


  // variables are mutable
  var aVariable: Int = 4

  println(aVariable + anInt + aLong)

}
