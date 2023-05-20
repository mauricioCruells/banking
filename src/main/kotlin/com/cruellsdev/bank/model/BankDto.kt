package com.cruellsdev.bank.model

data class BankDto(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)
