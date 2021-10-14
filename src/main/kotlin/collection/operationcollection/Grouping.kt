package collection.operationcollection

fun main() {
    val list = listOf("a", "a", "b", "b", "c", "c", "aa", "aaa", "ab", "abc")
    val map: Map<String, List<String>> = list.groupBy { value -> value }
    println(map)
//    {a=[a, a], b=[b, b], c=[c, c]}

    val map2: Map<Int, List<String>> = list.groupBy { value -> value.length }
    println(map2)
//    {1=[a, a, b, b, c, c], 2=[aa, ab], 3=[aaa, abc]}

    val grouping: Grouping<String, String> = list.groupingBy { value -> value }
    println(grouping)
}