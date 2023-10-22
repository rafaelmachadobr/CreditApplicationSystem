package me.dio.creditapplicationsystem.entity

data class Customer(
    var firstName: String = "",
    var lastName: String = "",
    val cpf: String = "",
    var email: String = "",
    var password: String = "",
    var address: Andress = Andress(),
    var credits: List<Credit> = mutableListOf(),
    val id: Long? = null
)
