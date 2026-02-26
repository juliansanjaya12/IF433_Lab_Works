package opp_00000120768_juliansanjaya.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}