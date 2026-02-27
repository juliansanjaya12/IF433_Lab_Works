package opp_00000120768_juliansanjaya.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Tesla", 4, 85)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()
}