package com.cruellsdev.bank.dataSource

import com.cruellsdev.bank.model.BankDto

interface BankDataSource {
    fun retrieveBanks(): Collection<BankDto>
}

