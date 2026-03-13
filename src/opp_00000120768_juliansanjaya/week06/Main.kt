package opp_00000120768_juliansanjaya.week06

/*fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai Checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}*/

fun main() {

    println("=== SMART HOME SYSTEM ===")

    val lamp = SmartLamp("L001", "Lampu Ruang Tamu")
    val speaker = SmartSpeaker("S001", "Google Nest Dapur")
    val cctv = SmartCCTV("C001", "Ezviz Garasi")

    val hub = SmartHomeHub()

    println("\nMenambahkan perangkat ke Smart Home Hub...")
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n=== Menghidupkan semua perangkat ===")
    lamp.turnOn()
    speaker.turnOn()
    cctv.turnOn()

    println("\n=== Mengaktifkan Mode Keamanan ===")
    hub.activateSecurityMode()

    println("\n=== Mematikan Semua Perangkat Switchable ===")
    hub.turnOffAllSwitches()

}