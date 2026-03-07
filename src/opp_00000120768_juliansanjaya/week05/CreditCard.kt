package opp_00000120768_juliansanjaya.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sebesar $amount berhasil menggunakan Credit Card.")
            println("Total penggunaan kartu: $usedAmount dari limit $limit")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu.")
        }

    }
}