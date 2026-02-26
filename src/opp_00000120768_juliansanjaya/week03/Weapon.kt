package opp_00000120768_juliansanjaya.week03

class Weapon(val name: String, damage: Int) {

    var damage: Int = damage
        set(value) {
            when {
                value < 0 -> {
                    println("Warning: Damage tidak boleh negatif! Nilai tidak diubah.")
                    // field tidak diubah
                }
                value > 1000 -> {
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}