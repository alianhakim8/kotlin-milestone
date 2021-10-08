package collection.zipping

// unzipping  = memecah collection

fun main() {
    val list: List<Pair<String, String>> = listOf(
        "a" to "Alian",
        "i" to "Ilyas",
        "r" to "Ruri",
        "s" to "Sri"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    // output : [a,i,r,s]
    println(pair.second)
    // output : [Alian, Ilyas, Ruri, Sri]

    // destructuring
    val (list1, list2) = list.unzip()
    println(list1)
    // output : [a,i,r,s]
    println(list2)
    // output : [Alian, Ilyas, Ruri, Sri]

}