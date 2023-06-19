data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 25)
    val (name, age) = person
    println("Name: $name")
    println("Age: $age")

    val people = listOf(
        Person("Bob", 30),
        Person("Charlie", 35),
        Person("David", 40)
    )

    for ((name, age) in people) {
        println("Name: $name, Age: $age")
    }
}
