package collection.map

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()

    mutableMap.put("a", "Alian")
    mutableMap.put("h", "Hakim")
    mutableMap.put("i", "Ilyas")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }

    mutableMap.remove("a")
    mutableMap.remove("h")
    for ((key, value) in mutableMap) {
        println("$key to $value after using remove method")
    }

}