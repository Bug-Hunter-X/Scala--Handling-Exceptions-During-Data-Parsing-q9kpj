```scala
import scala.util.Try

case class Person(name: String, age: Int)

object Main extends App {
  val people = List("Alice,25", "Bob,30", "Charlie,22", "David", "Eve,35,extra")

  val parsedPeople = people.flatMap { personString =>
    personString.split(",", 2) match {
      case Array(name, age) => 
        Try(Person(name, age.toInt)).toOption
      case Array(name) =>
        println(s"Warning: Invalid format for '$personString', skipping.")
        None
      case _ => 
        println(s"Warning: Invalid format for '$personString', skipping.")
        None
    }
  }

  println(parsedPeople)
}
```