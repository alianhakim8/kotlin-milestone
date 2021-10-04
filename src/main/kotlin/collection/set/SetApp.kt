package collection.set

fun main() {
    val set: Set<Person> = setOf(Person("Alian"), Person("Hakim"), Person("Alian"))
    println(set.size)
    println(set.contains(Person("Alian")))

    for (person in set) {
        println(person)
    }
}