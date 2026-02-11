// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.services.async.coaching.PrincipleServiceAsync
import com.believe.api.services.async.coaching.PrincipleServiceAsyncImpl
import java.util.function.Consumer

class CoachingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CoachingServiceAsync {

    private val withRawResponse: CoachingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val principles: PrincipleServiceAsync by lazy {
        PrincipleServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CoachingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CoachingServiceAsync =
        CoachingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun principles(): PrincipleServiceAsync = principles

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CoachingServiceAsync.WithRawResponse {

        private val principles: PrincipleServiceAsync.WithRawResponse by lazy {
            PrincipleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CoachingServiceAsync.WithRawResponse =
            CoachingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun principles(): PrincipleServiceAsync.WithRawResponse = principles
    }
}
