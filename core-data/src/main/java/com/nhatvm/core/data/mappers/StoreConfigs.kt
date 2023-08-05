package com.nhatvm.core.data.mappers

import com.nhatvm.core.model.StoreConfig
import com.nhatvm.core.network.entities.StoreConfigRemote

fun StoreConfigRemote.toModel(): StoreConfig {
    return StoreConfig(
        baseMediaUrl = baseMediaUrl,
        secureBaseMediaUrl = secureBaseMediaUrl,
        baseUrl = baseUrl,
        secureBaseUrl = secureBaseUrl,
        code = code
    )
}