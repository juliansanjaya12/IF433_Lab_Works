package opp_00000120768_juliansanjaya.week07

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {

    companion object {

        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem(
                name = "Pedang Kayu Bapuk",
                damage = 5,
                rarity = ItemRarity.COMMON
            )
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem(
                name = "Pedang Naga Inferno",
                damage = 100,
                rarity = ItemRarity.EPIC
            )
            return Weapon(epicItem, 200)
        }
    }
}