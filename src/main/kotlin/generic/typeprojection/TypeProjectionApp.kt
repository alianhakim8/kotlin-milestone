package generic.typeprojection

class Container<T>(var data: T)

fun copy(from: Container<out Any>, to: Container<in Any>) {
    to.data = from.data
}

fun main() {
    val data1 = Container("data1")
    val data2: Container<Any> = Container("hakim")
    copy(data1, data2)
}