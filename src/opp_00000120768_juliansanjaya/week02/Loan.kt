package opp_00000120768_juliansanjaya.week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Durasi minus terdeteksi. Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)
    val fine = loan.calculateFine()

    println("\n=== Detail Peminjaman ===")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Durasi       : ${loan.loanDuration} hari")
    println("Total Denda  : Rp $fine")
}