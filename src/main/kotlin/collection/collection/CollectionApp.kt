package collection.collection

fun <T> displayCollection(collection: Collection<T>) {
    for (elemen in collection) println(elemen)
}

fun main() {
    displayCollection(listOf("alian", "hakim"))
    displayCollection(setOf("Alian", "Hakim"))
    displayCollection(mapOf("a" to "alian").entries)
//    displayCollection(mapOf("Alian" to "ali")) // error , Map bukan turunan collection
}