package collection.collection

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayMutableCollection(mutableListOf("Alian", "Hakim"))
    displayMutableCollection(mutableSetOf("Alian", "Hakim"))
    displayMutableCollection(mutableMapOf("a" to "alian").entries)
}