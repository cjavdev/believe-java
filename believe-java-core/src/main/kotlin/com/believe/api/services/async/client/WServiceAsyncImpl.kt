// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async.client

import com.believe.api.core.ClientOptions
import java.util.function.Consumer

class WServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WServiceAsync {

    private val withRawResponse: WServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WServiceAsync =
        WServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WServiceAsync.WithRawResponse =
            WServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
