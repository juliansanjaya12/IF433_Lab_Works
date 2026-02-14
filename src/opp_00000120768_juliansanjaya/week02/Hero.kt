package opp_00000120768_juliansanjaya.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    print("Masukkan Nama Hero: ")
    val heroName = readLine() ?: "HeroTanpaNama"

    print("Masukkan Damage Hero: ")
    val heroDamage = readLine()?.toIntOrNull() ?: 10

    val hero = Hero(heroName, heroDamage)
    var enemyHp = 100

    println("\nPertarungan dimulai! HP Musuh = $enemyHp\n")

    while (hero.isAlive() && enemyHp > 0) {
        println("=== OPSI ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        when (readLine()) {
            "1" -> {
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Musuh sekarang: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh membalas sebesar $enemyDamage damage!")
                    hero.takeDamage(enemyDamage)
                    println("HP $heroName sekarang: ${hero.hp}")
                }
            }

            "2" -> {
                println("$heroName Balik Ke Base.")
                break
            }

            else -> println("Input tidak valid. Musuh: HAHAHAHAAA (Tertawa dengan nada vilain).")
        }

        println()
    }

    println("=== HASIL ===")
    if (hero.isAlive() && enemyHp == 0) {
        println("$heroName menang.")
    } else if (!hero.isAlive() && enemyHp > 0) {
        println("Musuh menang.")
    } else {
        println("Pertarungan Berakhir.")
    }
}