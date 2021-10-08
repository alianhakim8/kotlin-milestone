package collection.operationcollection

fun main() {
    val list1: List<String> = listOf("Alian", "Alinda", "Ilyas")
    val list2: List<String> = list1.map {
        it.uppercase()
    }
    val names = listOf("Alian", "Ilyas", "Alinda", "Ruri", "Sri")
    val namesGanjil = names.mapIndexedNotNull { index, name ->
        if (index % 2 == 0) null
        else name
    }

    val numbers = (1..100).toList()
    val genap = numbers.mapNotNull {
        if (it % 2 == 0) it
        else null
    }

    // mapping operations untuk map
    val map1: Map<String, String> = mapOf(
        "a" to "Alian",
        "i" to "Ilyas",
        "r" to "Ruri",
        "s" to "Sri"
    )

    val map2 = map1.map {
        it.key.uppercase()
    }

    map2.forEach {
        println(it)
    }
}