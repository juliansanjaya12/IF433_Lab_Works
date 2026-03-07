package opp_00000120768_juliansanjaya.week05

/*fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for(pegawai in daftarPegawai){
        pegawai.bekerja()

        when(pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------")
    }
}*/

/*fun main(){

    val mathHelper = MathHelper()

    // Luas Persegi
    val luasPersegi = mathHelper.hitungLuas(4)
    println("Luas Persegi (sisi = 4): $luasPersegi")

    // Luas Persegi Panjang
    val luasPersegiPanjang = mathHelper.hitungLuas(6, 3)
    println("Luas Persegi Panjang (6 x 3): $luasPersegiPanjang")

    // Luas Lingkaran
    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran (r = 7.0): $luasLingkaran")

}*/

fun main() {

    val ewallet = EWallet("Julian", 50000.0)
    val creditCard = CreditCard("Julian", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(
        ewallet,
        creditCard
    )

    println("=== PROSES PEMBAYARAN ===")
    for (payment in paymentMethods) {

        println("Metode pembayaran: ${payment.accountName}")

        payment.processPayment(75000.0)

        if (payment is EWallet) {
            println("Top up otomatis untuk EWallet...")

            payment.topUp(50000.0)

            println("Mencoba pembayaran lagi...")
            payment.processPayment(75000.0)
        }
        println("----------------------")
    }
}