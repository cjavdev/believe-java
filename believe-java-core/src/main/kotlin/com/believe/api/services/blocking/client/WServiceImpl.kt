// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.client

import com.believe.api.core.ClientOptions
import java.util.function.Consumer

class WServiceImpl internal constructor(private val clientOptions: ClientOptions) : WService {

    private val withRawResponse: WService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WService =
        WServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WService.WithRawResponse =
            WServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
