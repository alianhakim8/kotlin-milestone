package collection.map

fun main() {
    val map: Map<String, String> = mapOf(
        // key to value
        "a" to "Ali",
        "h" to "Hakim",
        "i" to "Ilyas"
    )

    for ((key, value) in map) {
        println("$key to $value")
    }
}