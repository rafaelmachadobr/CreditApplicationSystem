package me.dio.creditapplicationsystem.service

import me.dio.creditapplicationsystem.entity.Credit

interface ICreditService {
    fun save(credit: Credit): Credit
    fun findById(creditId: Long): Credit
    fun delete(creditId: Long)
}