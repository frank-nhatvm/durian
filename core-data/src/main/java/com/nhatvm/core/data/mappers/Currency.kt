package com.nhatvm.core.data.mappers

import com.nhatvm.core.model.Currency
import com.nhatvm.core.network.entities.CurrencyRemote

fun CurrencyRemote.toModel(): Currency {
    return Currency(
        baseCurrencyCode = baseCurrencyCode,
        baseCurrencySymbol = baseCurrencySymbol
    )
}