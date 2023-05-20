package com.cruellsdev.bank.dataSource.mock

import com.cruellsdev.bank.dataSource.BankDataSource
import com.cruellsdev.bank.model.BankDto
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf<BankDto>(
        BankDto("1234", 1.0, 3),
        BankDto("1234", 1.2, 6),
        BankDto("1234", 1.4, 2)
    )

    override fun retrieveBanks(): Collection<BankDto> = banks
}