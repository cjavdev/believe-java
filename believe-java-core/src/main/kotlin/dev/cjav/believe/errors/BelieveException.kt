package dev.cjav.believe.errors

open class BelieveException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
