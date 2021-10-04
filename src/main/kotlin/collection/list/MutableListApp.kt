package collection.list

fun main() {
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Alinda")
    mutableList.add("Fayola")
    println(mutableList)
    mutableList.remove("Alinda")
    println(mutableList)
}