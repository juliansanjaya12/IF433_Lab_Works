package opp_00000120768_juliansanjaya.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(source = System. `in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    }else{
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai")
    }
}

constructor(name: String, nim: String) : this(name, nim, major="Non-Matriculated"){
    println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
}