@file:JvmName("EmptyHandler")

package com.believe.api.core.handlers

import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
