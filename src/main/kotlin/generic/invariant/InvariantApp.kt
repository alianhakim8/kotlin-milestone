package generic.invariant

// invariant tidak boleh di substitusi oleh parent atau childnya
// kenapa gak boleh ? karena bahaya
fun main() {

    val invariantString = Invariant("string")
//    val invariantAny: Invariant<Any> = invariantString // error
}