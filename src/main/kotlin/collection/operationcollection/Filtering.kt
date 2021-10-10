package collection.operationcollection

// filtering : digunakan untuk memfilter data di collection
// filter menghasilkan collection baru

fun main() {
    val list = listOf("keyboard", "mouse", "monitor", "komputer")
    val list2 = list.filter { it.length > 4 }
    val list3 = list.filterIndexed { index, _ -> index % 2 == 0 }

    val list4: List<Any?> = listOf(null, 1, "ali", true)
    val listString = list4.filterIsInstance<String>()
    val listInt = list4.filterIsInstance<Int>()
    val listNotNull = list4.filterNotNull()

    println(list)
    println(list2)
    println(list3)
    println(listString)
    println(listInt)
    println(listNotNull)

    /*
    *
    * output :
        [keyboard, mouse, monitor, komputer]
        [keyboard, mouse, monitor, komputer]
        [keyboard, monitor]
        [ali]
        [1]
        [1, ali, true]
    *
    * */
}