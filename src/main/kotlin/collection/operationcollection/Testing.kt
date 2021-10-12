package collection.operationcollection

// mengecek isi data dari collection yang hasilnya boolean true jika sesuai dengan kondisi

fun main() {
    val names = listOf("Alian", "Hakim", "Permana")
    println(names.any { it.length > 5 })
    println(names.none { it.length > 5 })
    println(names.all { it.length > 5 })
    println(names.any())
    println(names.none())

    // Output :
//    true
//    false
//    false
//    true
//    false
}