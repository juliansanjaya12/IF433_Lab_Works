package opp_00000120768_juliansanjaya.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value) {
            if(value < 0){
                println("Error: Gaji tidak boleh negatif! Di-set ke0.")
                field = 0
            } else{
                field = value
            }
        }
}