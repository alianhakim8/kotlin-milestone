package generic.genericclass

class MyData<T, U>(val firstData: T, val secondData: U) {
    fun printData() {
        println("data is $firstData")
    }

    fun getData(): T = firstData

    fun getSecond(): U = secondData
}