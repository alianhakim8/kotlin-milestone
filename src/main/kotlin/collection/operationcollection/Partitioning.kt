package collection.operationcollection

// membagi collection menjadi dua
// collection pertama masuk filtering yang kedua yang tidak masuk filtering

fun main() {
    val list = listOf("Alian", "Hakim", "Permana")
    // val pair : Pair<List<String>, List<String>> = list.partition { it.length > 5}
    // atau :
    val (listMatch, listNotMatch) = list.partition { it.length > 5 }

    println(list)
    println(listMatch)
    println(listNotMatch)

    // output
//    [Alian, Hakim, Permana]
//    [Permana]
//    [Alian, Hakim]
}