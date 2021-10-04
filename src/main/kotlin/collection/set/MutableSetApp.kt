package collection.set

// DATA BISA BERUBAH
fun main() {

    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Alinda"))
    mutableSet.add(Person("Alinda"))
    mutableSet.add(Person("Iyas"))
    for (person in mutableSet) {
        println(person)
    }
    mutableSet.remove(Person("Alinda"))
    mutableSet.remove(Person("Iyas"))

    println(mutableSet)
}