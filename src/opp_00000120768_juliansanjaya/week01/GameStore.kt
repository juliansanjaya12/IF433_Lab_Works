package opp_00000120768_juliansanjaya.week01

fun main() {
    val gameTitle = "Nenek Ku Seorang Gamer - Simulator"
    val price = 650_000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price * 20 / 100
    else price * 10 / 100

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("=== STRUK PEMBELIAN ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : ${userNote ?: "Tidak ada catatan"}")
}