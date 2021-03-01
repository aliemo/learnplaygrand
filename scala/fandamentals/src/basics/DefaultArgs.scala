package basics

import scala.annotation.tailrec

object DefaultArgs extends App{

  @tailrec
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) 1
    else trFact(n-1, n * acc)

  val fact10: Int = trFact(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int=1080): Unit =
    println("saving picture (img-"+  + format + ")")

  savePicture("bmp", width = 600)


}
