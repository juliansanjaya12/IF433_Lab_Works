package opp_00000120768_juliansanjaya.week01

fun main() {
    val gameTitle = "Nenek Ku Seorang Gamer - Simulator"
    val price = 650_000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price * 20 / 100
    else price * 10 / 100