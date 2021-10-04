package generic.genericfunction

class Function(val name: String) {
    fun <T> sayHello(param: T) {
        println("Hello $param my is $name")
    }
}