package collection.operationcollection

// slice adalah operator yang digunakan untuk mengambil sebagian element yang ada di collection yang sesuai dengan range

fun main() {
    val list = (0..10).toList()
//    ini berdasarkan index
    val list2 = list.slice(0..2)
    val list3 = list.slice(0..10 step 2)
    val list4 = list.slice(10 downTo 1 step 2)

    println(list)
    println(list2)
    println(list3)
    println(list4)

//      [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//      [0, 1, 2]
//      [0, 2, 4, 6, 8, 10]
//      [10, 8, 6, 4, 2]
}