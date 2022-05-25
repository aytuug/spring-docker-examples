package com.aytugakin.account.dto

import com.aytugakin.account.model.TransactionType
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransactionDto(
        val id : String?,
        val transactionType: TransactionType? = TransactionType.INITIAL,
        val amount : BigDecimal?,
        val transactionDate : LocalDateTime?,
)
