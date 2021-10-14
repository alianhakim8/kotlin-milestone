package collection.operationcollection

// membentuk collection baru

fun main() {
    val list1 = listOf("Alian", "Hakim")
    val list2 = list1 + "Permana"
    println(list2)
    val list3 = list1 + listOf("Ilyas", "Yasin")
    println(list3)
    val list4 = list1 - "Alian"
    println(list4)
    val list5 = list1 - listOf("Ilyas", "Yasin")
    println(list5)
    val list6 = list3.plus("Alinda")
    println(list6)
    val list7 = list1.plus(listOf("Fayola", "Hayra"))
    println(list7)
    val list8 = list3.minus("Ilyas")
    println(list8)
    val list9 = list3.minus(listOf("Budi"))
    println(list9)

    val map1 = mapOf("a" to "Alian")
    val map2 = map1 + ("i" to "Ilyas")
    println(map2)

}