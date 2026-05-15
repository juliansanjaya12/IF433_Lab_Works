package opp_00000120768_juliansanjaya.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)