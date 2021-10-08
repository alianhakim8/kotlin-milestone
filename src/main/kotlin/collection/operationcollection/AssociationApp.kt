package collection.operationcollection

// merubah dari satu collection menjadi sebuah map
fun main() {
    val list: List<String> = listOf("Alian", "Hakim", "Permana")
    val map: Map<String, Int> = list.associate { Pair(it, it.length) }
    println(map)
    // membentuk value
    val map2: Map<String, Int> = list.associateWith { it.length }
    println(map2)
    // membentuk key
    val map3: Map<Int, String> = list.associateBy { it.length }
    println(map3)
}