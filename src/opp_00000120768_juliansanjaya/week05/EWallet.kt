package opp_00000120768_juliansanjaya.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar $amount berhasil menggunakan E-Wallet.")
            println("Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }

    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }

}