package generic.typeerasure

// tipe erasure = proses pengecekan generic pada saat compile dan menghiraukan pengecekan pada saat runtime

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data = TypeErasure("Alian")
    val name = data.getData()

    val number = data as TypeErasure<Int>
    val result = number.getData()
    println(result) // error class cast exception
}