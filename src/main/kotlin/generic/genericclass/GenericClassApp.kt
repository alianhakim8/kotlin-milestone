package generic.genericclass

fun main() {
    val myData: MyData<String, Int> = MyData("Alian", 100)
    val myDataInt: MyData<Int, String> = MyData(20, "Ilyas")

    myDataInt.printData()
    myData.printData()
    println(myData.getSecond())
}