package com.nhatvm.core.network.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrencyRemote(
    @Json(name = "available_currency_codes")
    val availableCurrencyCodes: List<String?>? = null,
    @Json(name = "base_currency_code")
    val baseCurrencyCode: String? = null,
    @Json(name = "base_currency_symbol")
    val baseCurrencySymbol: String? = null,
    @Json(name = "default_display_currency_code")
    val defaultDisplayCurrencyCode: String? = null,
    @Json(name = "default_display_currency_symbol")
    val defaultDisplayCurrencySymbol: String? = null,
    @Json(name = "exchange_rates")
    val exchangeRates: List<ExchangeRateRemote?>? = null
)

@JsonClass(generateAdapter = true)
data class ExchangeRateRemote(
    @Json(name = "currency_to")
    val currencyTo: String? = null,
    @Json(name = "rate")
    val rate: Int? = null
)