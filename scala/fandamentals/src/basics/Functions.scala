package basics

object Functions extends App{

  def stringConcat(a: String, b: String): String = {
    a + " " + b
  }

  println(stringConcat("Hello", "World"))

  def aParameterlessFunction(): Int = 2
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int) : String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Hi",3))

  def aFunctionWithSideEffect(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }
  println(aBigFunction(5))

  /** Greeting Function*/
  def greetignFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println(greetignFunction("Ali", 25))

  def factorialFunction(n: Int) : Int = {
    if (n == 1) 1
    else n * factorialFunction(n - 1)
  }
  println(factorialFunction(5))

  def fibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else fibonacciFunction(n - 1) + fibonacciFunction(n - 2)
  }
  println(fibonacciFunction(5))
  println(fibonacciFunction(6))
  println(fibonacciFunction(7))
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }
  println(isPrime(31))
  println(isPrime(4))

}
