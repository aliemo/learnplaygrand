package oop

object Basics extends App{


}
// class constructor
class Person(name: String, val age: Int){

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greet(): Unit = println(s"Hi, I am ${this.name}")
  def this(name: String) = this(name,0)
  def this() = this("John Doe")
}
/** Novel and Writer */
class Writer(firstName: String, lastName: String,val year: String) {
  def fullName():String = this.firstName + " " + this.lastName
}
class Novel(name: String, year: Int, author: Writer) {
  def authorAge: Int = year - author.year
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newYear: Int): Novel = new Novel(name,newYear,author)

}