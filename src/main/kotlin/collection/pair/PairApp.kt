package collection.pair

fun main() {
    val pair1: Pair<String, String> = Pair("Alian", "Hakim")
    val pair2: Pair<String, String> = "Jono" to "Marsani"

    println(pair1.first)
    println(pair1.second)

    println(pair2.first)
    println(pair2.second)
}