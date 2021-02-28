package basics

object CallTypes extends App{
  def calledByValue(x: Long): Unit = {
    println("called by value " + x)
    println("called by value " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("called by value " + x)
    println("called by value " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int): Unit = println(x)
//  println(infinite(), 34)
  printFirst(x = 34, y = infinite())
}
