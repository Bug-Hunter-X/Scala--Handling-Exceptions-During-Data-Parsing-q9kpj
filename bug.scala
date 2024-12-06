```scala
import scala.util.Try

case class Person(name: String, age: Int)

object Main extends App {
  val people = List("Alice,25", "Bob,30", "Charlie,22", "David, ")

  val parsedPeople = people.map(personString => {
    val parts = personString.split(",")
    Try(Person(parts(0), parts(1).toInt)).toOption 
  }).flatten

  println(parsedPeople) //List(Person(Alice,25), Person(Bob,30), Person(Charlie,22))
}
```