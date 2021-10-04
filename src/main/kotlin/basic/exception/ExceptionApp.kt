package basic.exception

fun main() {
    try {
        validateAndSayHello("")
    } catch (error: ValidationException) {
        println("Error with message : ${error.message}")
    } finally {
        println("Finally will always be executed")
    }
}

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("name is blank")
    } else {
        println("Hello $name")
    }
}