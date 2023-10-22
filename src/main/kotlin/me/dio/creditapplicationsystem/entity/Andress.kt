package me.dio.creditapplicationsystem.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
data class Andress(
    @Column(nullable = false) var zipCode: String = "",
    @Column(nullable = false) var street: String = ""
)

