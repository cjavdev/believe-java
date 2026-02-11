// File generated from our OpenAPI spec by Stainless.

package com.believe.api.errors

import com.believe.api.core.JsonValue
import com.believe.api.core.http.Headers

abstract class BelieveServiceException
protected constructor(message: String, cause: Throwable? = null) :
    BelieveException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
