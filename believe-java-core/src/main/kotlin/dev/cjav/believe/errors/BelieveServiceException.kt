// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.errors

import dev.cjav.believe.core.JsonValue
import dev.cjav.believe.core.http.Headers

abstract class BelieveServiceException
protected constructor(message: String, cause: Throwable? = null) :
    BelieveException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
