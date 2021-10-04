package generic.contravariant

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravirantString: Contravariant<String> = contravariantAny
    contravirantString.sayHello("Alian")
}