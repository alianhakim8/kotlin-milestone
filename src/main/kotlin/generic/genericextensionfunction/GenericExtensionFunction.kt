package generic.genericextensionfunction

class Data<T>(val data: T)

fun Data<String>.print() {
    val data: String = this.data
    println(data)
}

fun Data<Int>.printInt() {
    val data: Int = this.data
    println(data)
}

fun main() {
    val data1 = Data<Int>(12)
    val data2 = Data<String>("Alian")

    // data1.print() // tidak ada / error
    data1.printInt()
    data2.print()
}