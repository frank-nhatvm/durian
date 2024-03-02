package com.nhatvm.core.network.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StoreConfigRemote(
    @Json(name = "base_currency_code")
    val baseCurrencyCode: String? = null,
    @Json(name = "base_link_url")
    val baseLinkUrl: String? = null,
    @Json(name = "base_media_url")
    val baseMediaUrl: String? = null,
    @Json(name = "base_static_url")
    val baseStaticUrl: String? = null,
    @Json(name = "base_url")
    val baseUrl: String? = null,
    @Json(name = "code")
    val code: String? = null,
    @Json(name = "default_display_currency_code")
    val defaultDisplayCurrencyCode: String? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "locale")
    val locale: String? = null,
    @Json(name = "secure_base_link_url")
    val secureBaseLinkUrl: String? = null,
    @Json(name = "secure_base_media_url")
    val secureBaseMediaUrl: String? = null,
    @Json(name = "secure_base_static_url")
    val secureBaseStaticUrl: String? = null,
    @Json(name = "secure_base_url")
    val secureBaseUrl: String? = null,
    @Json(name = "timezone")
    val timezone: String? = null,
    @Json(name = "website_id")
    val websiteId: Int? = null,
    @Json(name = "weight_unit")
    val weightUnit: String? = null
)