package collection.zipping

// zip = menggabungkan
fun main() {
    val list1: List<String> = listOf("Alian", "Hakim")
    val list2: List<String> = listOf("Ilyas", "Yasin")

    val list3: List<Pair<String, String>> = list1.zip(list2)
    println(list3)
    // output : [(Alian, Ilyas), (Hakim, Yasin)]

    val list4: List<String> = list1.zip(list2) { value1, value2 ->
        // value1 = list1
        // value2 = list2
        "$value1 $value2"
    }
    println(list4)
    // output : [Alian Ilyas, Hakim Yasin]
}