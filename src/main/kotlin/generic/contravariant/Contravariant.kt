package generic.contravariant

class Contravariant<in T> {
    fun sayHello(param: T) {
        println("Hello $param")
    }
}