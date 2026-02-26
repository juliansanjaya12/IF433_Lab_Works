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

    println("=== TEST WEAPON ===")
    val w = Weapon("Excalibur", 100)

    println("Damage awal: ${w.damage}")
    println("Tier awal: ${w.tier}")

    w.damage = -50
    println("Damage setelah set -50: ${w.damage}")

    w.damage = 9999
    println("Damage setelah set 9999: ${w.damage}")
    println("Tier senjata: ${w.tier}")

    println()
    println("=== TEST PLAYER ===")

    val player = Player("Budi")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}