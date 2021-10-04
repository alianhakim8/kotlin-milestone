package generic.startprojection

// tidak terlalu mementingkan / mengambil isi data

fun displayLength(array: Array<*>) {
    println(array.size)
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    val arrayString: Array<String> = arrayOf("alian", "ilyas", "alinda")
    displayLength(arrayInt)
    displayLength(arrayString)
}