package opp_00000120768_juliansanjaya.week03

/*fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")
}*/

fun main() {
    val w = Weapon("Excalibur", 100)

    // harus gagal (tidak berubah)
    w.damage = -50

    // harus dipaksa jadi 1000
    w.damage = 9999

    println("Damage akhir: ${w.damage}")
    println("Tier senjata: ${w.tier}")
}