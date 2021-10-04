package collection.iterable

fun <T> displayMutableIterable(mutableIterable: MutableIterable<T>) {
    val mutableIterator = mutableIterable.iterator()
    while (mutableIterator.hasNext()) {
        println(mutableIterator.next())
        mutableIterator.remove()
    }
}

fun <T> removeMutableIterable(mutableIterable: MutableIterable<T>) {
    val mutableIterator = mutableIterable.iterator()
    while (mutableIterator.hasNext()) {
        mutableIterator.remove()
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Alian", "Hakim"))
//    removeMutableIterable(mutableListOf("Ilyas", "Alinda"))
}