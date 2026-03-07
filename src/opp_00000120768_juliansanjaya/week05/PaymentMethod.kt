package opp_00000120768_juliansanjaya.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}