package opp_00000120768_juliansanjaya.week07

fun processEvent(event: BattleState) {
    when (event) {

        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiap bertarung!")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Kamu mendapatkan item: $name (Damage: $damage, Rarity: $rarity)")
        }

        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Istirahat dulu, hidupmu sudah cukup sulit.")
        }
    }
}