// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.services.blocking.coaching.PrincipleService
import com.believe.api.services.blocking.coaching.PrincipleServiceImpl
import java.util.function.Consumer

class CoachingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CoachingService {

    private val withRawResponse: CoachingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val principles: PrincipleService by lazy { PrincipleServiceImpl(clientOptions) }

    override fun withRawResponse(): CoachingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CoachingService =
        CoachingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun principles(): PrincipleService = principles

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CoachingService.WithRawResponse {

        private val principles: PrincipleService.WithRawResponse by lazy {
            PrincipleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CoachingService.WithRawResponse =
            CoachingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun principles(): PrincipleService.WithRawResponse = principles
    }
}
