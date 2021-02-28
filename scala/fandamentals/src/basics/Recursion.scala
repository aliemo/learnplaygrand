package basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - factorial of " + (n-1) + " is needed.")
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      result
    }
  }
//  println(factorial(5))
//  println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x:Int, acc: BigInt): BigInt =
      if (x <= 1) acc
      else factorialHelper(x-1, x * acc) // TAIL RECURSION

    factorialHelper(n, 1)
  }
//  println(anotherFactorial(5))
//  println(anotherFactorial(5000))

  /** concatenate n times string*/
  def concatStringMultipleTimes(astr: String, n: Int): String ={
    @tailrec
    def concatHelper(str: String, sentence: String, t: Int): String =
      if (t == 0) sentence
      else concatHelper(str, str + sentence, t-1)
    concatHelper(astr,"", n)
  }
  println(concatStringMultipleTimes("Hi", 5))

  /** isPrime Tail Recursive*/
  def isPrime(n: Int): Boolean = {

    @tailrec
    def isPrimeHelper(t: Int, logic: Boolean) : Boolean = {
      if(!logic) false
      else if (t <=1) true
      else isPrimeHelper(t-1, n % t != 0 && logic)
    }
    isPrimeHelper(n/2,logic = true)
  }
  println(isPrime(5))
  println(isPrime(50))

  /** fibonacci tail recursive*/
  def fibonacci(n: Int): Int = {
    def fibonacciTR(i: Int, last: Int, nextLast: Int): Int =
      if (i >= n) last
      else fibonacciTR(i+1, last + nextLast, last)

    if(n <= 2) 1
    else fibonacciTR(2, 1, 1)
  }
  println(fibonacci(8))
}
