package collection.iterator

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display next")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }
    println("display previous")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}

fun main() {
    displayListIterator(listOf("Alian", "Hakim", "Ilyas").listIterator())
}