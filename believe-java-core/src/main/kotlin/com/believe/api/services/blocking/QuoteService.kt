// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.quotes.Quote
import com.believe.api.models.quotes.QuoteCreateParams
import com.believe.api.models.quotes.QuoteDeleteParams
import com.believe.api.models.quotes.QuoteGetRandomParams
import com.believe.api.models.quotes.QuoteListByCharacterPage
import com.believe.api.models.quotes.QuoteListByCharacterParams
import com.believe.api.models.quotes.QuoteListByThemePage
import com.believe.api.models.quotes.QuoteListByThemeParams
import com.believe.api.models.quotes.QuoteListPage
import com.believe.api.models.quotes.QuoteListParams
import com.believe.api.models.quotes.QuoteRetrieveParams
import com.believe.api.models.quotes.QuoteTheme
import com.believe.api.models.quotes.QuoteUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface QuoteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuoteService

    /** Add a new memorable quote to the collection. */
    fun create(params: QuoteCreateParams): Quote = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Quote

    /** Retrieve a specific quote by its ID. */
    fun retrieve(quoteId: String): Quote = retrieve(quoteId, QuoteRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        quoteId: String,
        params: QuoteRetrieveParams = QuoteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Quote = retrieve(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(quoteId: String, params: QuoteRetrieveParams = QuoteRetrieveParams.none()): Quote =
        retrieve(quoteId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: QuoteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Quote

    /** @see retrieve */
    fun retrieve(params: QuoteRetrieveParams): Quote = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(quoteId: String, requestOptions: RequestOptions): Quote =
        retrieve(quoteId, QuoteRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing quote. */
    fun update(quoteId: String): Quote = update(quoteId, QuoteUpdateParams.none())

    /** @see update */
    fun update(
        quoteId: String,
        params: QuoteUpdateParams = QuoteUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Quote = update(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see update */
    fun update(quoteId: String, params: QuoteUpdateParams = QuoteUpdateParams.none()): Quote =
        update(quoteId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: QuoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Quote

    /** @see update */
    fun update(params: QuoteUpdateParams): Quote = update(params, RequestOptions.none())

    /** @see update */
    fun update(quoteId: String, requestOptions: RequestOptions): Quote =
        update(quoteId, QuoteUpdateParams.none(), requestOptions)

    /** Get a paginated list of all memorable Ted Lasso quotes with optional filtering. */
    fun list(): QuoteListPage = list(QuoteListParams.none())

    /** @see list */
    fun list(
        params: QuoteListParams = QuoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuoteListPage

    /** @see list */
    fun list(params: QuoteListParams = QuoteListParams.none()): QuoteListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): QuoteListPage =
        list(QuoteListParams.none(), requestOptions)

    /** Remove a quote from the collection. */
    fun delete(quoteId: String) = delete(quoteId, QuoteDeleteParams.none())

    /** @see delete */
    fun delete(
        quoteId: String,
        params: QuoteDeleteParams = QuoteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see delete */
    fun delete(quoteId: String, params: QuoteDeleteParams = QuoteDeleteParams.none()) =
        delete(quoteId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: QuoteDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: QuoteDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(quoteId: String, requestOptions: RequestOptions) =
        delete(quoteId, QuoteDeleteParams.none(), requestOptions)

    /** Get a random Ted Lasso quote, optionally filtered. */
    fun getRandom(): Quote = getRandom(QuoteGetRandomParams.none())

    /** @see getRandom */
    fun getRandom(
        params: QuoteGetRandomParams = QuoteGetRandomParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Quote

    /** @see getRandom */
    fun getRandom(params: QuoteGetRandomParams = QuoteGetRandomParams.none()): Quote =
        getRandom(params, RequestOptions.none())

    /** @see getRandom */
    fun getRandom(requestOptions: RequestOptions): Quote =
        getRandom(QuoteGetRandomParams.none(), requestOptions)

    /** Get a paginated list of quotes from a specific character. */
    fun listByCharacter(characterId: String): QuoteListByCharacterPage =
        listByCharacter(characterId, QuoteListByCharacterParams.none())

    /** @see listByCharacter */
    fun listByCharacter(
        characterId: String,
        params: QuoteListByCharacterParams = QuoteListByCharacterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuoteListByCharacterPage =
        listByCharacter(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see listByCharacter */
    fun listByCharacter(
        characterId: String,
        params: QuoteListByCharacterParams = QuoteListByCharacterParams.none(),
    ): QuoteListByCharacterPage = listByCharacter(characterId, params, RequestOptions.none())

    /** @see listByCharacter */
    fun listByCharacter(
        params: QuoteListByCharacterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuoteListByCharacterPage

    /** @see listByCharacter */
    fun listByCharacter(params: QuoteListByCharacterParams): QuoteListByCharacterPage =
        listByCharacter(params, RequestOptions.none())

    /** @see listByCharacter */
    fun listByCharacter(
        characterId: String,
        requestOptions: RequestOptions,
    ): QuoteListByCharacterPage =
        listByCharacter(characterId, QuoteListByCharacterParams.none(), requestOptions)

    /** Get a paginated list of quotes related to a specific theme. */
    fun listByTheme(theme: QuoteTheme): QuoteListByThemePage =
        listByTheme(theme, QuoteListByThemeParams.none())

    /** @see listByTheme */
    fun listByTheme(
        theme: QuoteTheme,
        params: QuoteListByThemeParams = QuoteListByThemeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuoteListByThemePage = listByTheme(params.toBuilder().theme(theme).build(), requestOptions)

    /** @see listByTheme */
    fun listByTheme(
        theme: QuoteTheme,
        params: QuoteListByThemeParams = QuoteListByThemeParams.none(),
    ): QuoteListByThemePage = listByTheme(theme, params, RequestOptions.none())

    /** @see listByTheme */
    fun listByTheme(
        params: QuoteListByThemeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuoteListByThemePage

    /** @see listByTheme */
    fun listByTheme(params: QuoteListByThemeParams): QuoteListByThemePage =
        listByTheme(params, RequestOptions.none())

    /** @see listByTheme */
    fun listByTheme(theme: QuoteTheme, requestOptions: RequestOptions): QuoteListByThemePage =
        listByTheme(theme, QuoteListByThemeParams.none(), requestOptions)

    /** A view of [QuoteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuoteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /quotes`, but is otherwise the same as
         * [QuoteService.create].
         */
        @MustBeClosed
        fun create(params: QuoteCreateParams): HttpResponseFor<Quote> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: QuoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Quote>

        /**
         * Returns a raw HTTP response for `get /quotes/{quote_id}`, but is otherwise the same as
         * [QuoteService.retrieve].
         */
        @MustBeClosed
        fun retrieve(quoteId: String): HttpResponseFor<Quote> =
            retrieve(quoteId, QuoteRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            quoteId: String,
            params: QuoteRetrieveParams = QuoteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Quote> =
            retrieve(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            quoteId: String,
            params: QuoteRetrieveParams = QuoteRetrieveParams.none(),
        ): HttpResponseFor<Quote> = retrieve(quoteId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: QuoteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Quote>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: QuoteRetrieveParams): HttpResponseFor<Quote> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(quoteId: String, requestOptions: RequestOptions): HttpResponseFor<Quote> =
            retrieve(quoteId, QuoteRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /quotes/{quote_id}`, but is otherwise the same as
         * [QuoteService.update].
         */
        @MustBeClosed
        fun update(quoteId: String): HttpResponseFor<Quote> =
            update(quoteId, QuoteUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            quoteId: String,
            params: QuoteUpdateParams = QuoteUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Quote> =
            update(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            quoteId: String,
            params: QuoteUpdateParams = QuoteUpdateParams.none(),
        ): HttpResponseFor<Quote> = update(quoteId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: QuoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Quote>

        /** @see update */
        @MustBeClosed
        fun update(params: QuoteUpdateParams): HttpResponseFor<Quote> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(quoteId: String, requestOptions: RequestOptions): HttpResponseFor<Quote> =
            update(quoteId, QuoteUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /quotes`, but is otherwise the same as
         * [QuoteService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<QuoteListPage> = list(QuoteListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: QuoteListParams = QuoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuoteListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: QuoteListParams = QuoteListParams.none()): HttpResponseFor<QuoteListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<QuoteListPage> =
            list(QuoteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /quotes/{quote_id}`, but is otherwise the same as
         * [QuoteService.delete].
         */
        @MustBeClosed
        fun delete(quoteId: String): HttpResponse = delete(quoteId, QuoteDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            quoteId: String,
            params: QuoteDeleteParams = QuoteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            quoteId: String,
            params: QuoteDeleteParams = QuoteDeleteParams.none(),
        ): HttpResponse = delete(quoteId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: QuoteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: QuoteDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(quoteId: String, requestOptions: RequestOptions): HttpResponse =
            delete(quoteId, QuoteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /quotes/random`, but is otherwise the same as
         * [QuoteService.getRandom].
         */
        @MustBeClosed
        fun getRandom(): HttpResponseFor<Quote> = getRandom(QuoteGetRandomParams.none())

        /** @see getRandom */
        @MustBeClosed
        fun getRandom(
            params: QuoteGetRandomParams = QuoteGetRandomParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Quote>

        /** @see getRandom */
        @MustBeClosed
        fun getRandom(
            params: QuoteGetRandomParams = QuoteGetRandomParams.none()
        ): HttpResponseFor<Quote> = getRandom(params, RequestOptions.none())

        /** @see getRandom */
        @MustBeClosed
        fun getRandom(requestOptions: RequestOptions): HttpResponseFor<Quote> =
            getRandom(QuoteGetRandomParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /quotes/characters/{character_id}`, but is otherwise
         * the same as [QuoteService.listByCharacter].
         */
        @MustBeClosed
        fun listByCharacter(characterId: String): HttpResponseFor<QuoteListByCharacterPage> =
            listByCharacter(characterId, QuoteListByCharacterParams.none())

        /** @see listByCharacter */
        @MustBeClosed
        fun listByCharacter(
            characterId: String,
            params: QuoteListByCharacterParams = QuoteListByCharacterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuoteListByCharacterPage> =
            listByCharacter(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see listByCharacter */
        @MustBeClosed
        fun listByCharacter(
            characterId: String,
            params: QuoteListByCharacterParams = QuoteListByCharacterParams.none(),
        ): HttpResponseFor<QuoteListByCharacterPage> =
            listByCharacter(characterId, params, RequestOptions.none())

        /** @see listByCharacter */
        @MustBeClosed
        fun listByCharacter(
            params: QuoteListByCharacterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuoteListByCharacterPage>

        /** @see listByCharacter */
        @MustBeClosed
        fun listByCharacter(
            params: QuoteListByCharacterParams
        ): HttpResponseFor<QuoteListByCharacterPage> =
            listByCharacter(params, RequestOptions.none())

        /** @see listByCharacter */
        @MustBeClosed
        fun listByCharacter(
            characterId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QuoteListByCharacterPage> =
            listByCharacter(characterId, QuoteListByCharacterParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /quotes/themes/{theme}`, but is otherwise the same
         * as [QuoteService.listByTheme].
         */
        @MustBeClosed
        fun listByTheme(theme: QuoteTheme): HttpResponseFor<QuoteListByThemePage> =
            listByTheme(theme, QuoteListByThemeParams.none())

        /** @see listByTheme */
        @MustBeClosed
        fun listByTheme(
            theme: QuoteTheme,
            params: QuoteListByThemeParams = QuoteListByThemeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuoteListByThemePage> =
            listByTheme(params.toBuilder().theme(theme).build(), requestOptions)

        /** @see listByTheme */
        @MustBeClosed
        fun listByTheme(
            theme: QuoteTheme,
            params: QuoteListByThemeParams = QuoteListByThemeParams.none(),
        ): HttpResponseFor<QuoteListByThemePage> = listByTheme(theme, params, RequestOptions.none())

        /** @see listByTheme */
        @MustBeClosed
        fun listByTheme(
            params: QuoteListByThemeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuoteListByThemePage>

        /** @see listByTheme */
        @MustBeClosed
        fun listByTheme(params: QuoteListByThemeParams): HttpResponseFor<QuoteListByThemePage> =
            listByTheme(params, RequestOptions.none())

        /** @see listByTheme */
        @MustBeClosed
        fun listByTheme(
            theme: QuoteTheme,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QuoteListByThemePage> =
            listByTheme(theme, QuoteListByThemeParams.none(), requestOptions)
    }
}
