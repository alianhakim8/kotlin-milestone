package generic.covariant

fun main() {
    val covariantString = Covariant("string")
    val covariantAny: Covariant<Any> = covariantString
    println(covariantString.data())
    println(covariantAny.data())
}