package opp_00000120768_juliansanjaya.week04

open class Car(brand: String, val number0fDoors: Int) : Vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $number0fDoors pintu dibuka.")
    }
}