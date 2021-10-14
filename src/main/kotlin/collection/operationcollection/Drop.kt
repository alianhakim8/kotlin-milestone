package collection.operationcollection

// drop untuk menghapus data element

fun main() {

    val chars = ('a'..'z').toList()

    println(chars.drop(3))
    println(chars.dropLast(23))
    println(chars.dropWhile { it < 'f' })
    println(chars.takeLastWhile { it > 'w' })

    // output
    //[d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
    //[a, b, c]
    //[f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
    //[x, y, z]

}