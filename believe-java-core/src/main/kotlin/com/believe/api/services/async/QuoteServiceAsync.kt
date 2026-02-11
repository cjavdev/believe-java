// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.quotes.Quote
import com.believe.api.models.quotes.QuoteCreateParams
import com.believe.api.models.quotes.QuoteDeleteParams
import com.believe.api.models.quotes.QuoteGetRandomParams
import com.believe.api.models.quotes.QuoteListByCharacterPageAsync
import com.believe.api.models.quotes.QuoteListByCharacterParams
import com.believe.api.models.quotes.QuoteListByThemePageAsync
import com.believe.api.models.quotes.QuoteListByThemeParams
import com.believe.api.models.quotes.QuoteListPageAsync
import com.believe.api.models.quotes.QuoteListParams
import com.believe.api.models.quotes.QuoteRetrieveParams
import com.believe.api.models.quotes.QuoteTheme
import com.believe.api.models.quotes.QuoteUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QuoteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuoteServiceAsync

    /** Add a new memorable quote to the collection. */
    fun create(params: QuoteCreateParams): CompletableFuture<Quote> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Quote>

    /** Retrieve a specific quote by its ID. */
    fun retrieve(quoteId: String): CompletableFuture<Quote> =
        retrieve(quoteId, QuoteRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        quoteId: String,
        params: QuoteRetrieveParams = QuoteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Quote> =
        retrieve(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        quoteId: String,
        params: QuoteRetrieveParams = QuoteRetrieveParams.none(),
    ): CompletableFuture<Quote> = retrieve(quoteId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: QuoteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Quote>

    /** @see retrieve */
    fun retrieve(params: QuoteRetrieveParams): CompletableFuture<Quote> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(quoteId: String, requestOptions: RequestOptions): CompletableFuture<Quote> =
        retrieve(quoteId, QuoteRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing quote. */
    fun update(quoteId: String): CompletableFuture<Quote> =
        update(quoteId, QuoteUpdateParams.none())

    /** @see update */
    fun update(
        quoteId: String,
        params: QuoteUpdateParams = QuoteUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Quote> =
        update(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see update */
    fun update(
        quoteId: String,
        params: QuoteUpdateParams = QuoteUpdateParams.none(),
    ): CompletableFuture<Quote> = update(quoteId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: QuoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Quote>

    /** @see update */
    fun update(params: QuoteUpdateParams): CompletableFuture<Quote> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(quoteId: String, requestOptions: RequestOptions): CompletableFuture<Quote> =
        update(quoteId, QuoteUpdateParams.none(), requestOptions)

    /** Get a paginated list of all memorable Ted Lasso quotes with optional filtering. */
    fun list(): CompletableFuture<QuoteListPageAsync> = list(QuoteListParams.none())

    /** @see list */
    fun list(
        params: QuoteListParams = QuoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QuoteListPageAsync>

    /** @see list */
    fun list(
        params: QuoteListParams = QuoteListParams.none()
    ): CompletableFuture<QuoteListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<QuoteListPageAsync> =
        list(QuoteListParams.none(), requestOptions)

    /** Remove a quote from the collection. */
    fun delete(quoteId: String): CompletableFuture<Void?> =
        delete(quoteId, QuoteDeleteParams.none())

    /** @see delete */
    fun delete(
        quoteId: String,
        params: QuoteDeleteParams = QuoteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see delete */
    fun delete(
        quoteId: String,
        params: QuoteDeleteParams = QuoteDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(quoteId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: QuoteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: QuoteDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(quoteId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(quoteId, QuoteDeleteParams.none(), requestOptions)

    /** Get a random Ted Lasso quote, optionally filtered. */
    fun getRandom(): CompletableFuture<Quote> = getRandom(QuoteGetRandomParams.none())

    /** @see getRandom */
    fun getRandom(
        params: QuoteGetRandomParams = QuoteGetRandomParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Quote>

    /** @see getRandom */
    fun getRandom(
        params: QuoteGetRandomParams = QuoteGetRandomParams.none()
    ): CompletableFuture<Quote> = getRandom(params, RequestOptions.none())

    /** @see getRandom */
    fun getRandom(requestOptions: RequestOptions): CompletableFuture<Quote> =
        getRandom(QuoteGetRandomParams.none(), requestOptions)

    /** Get a paginated list of quotes from a specific character. */
    fun listByCharacter(characterId: String): CompletableFuture<QuoteListByCharacterPageAsync> =
        listByCharacter(characterId, QuoteListByCharacterParams.none())

    /** @see listByCharacter */
    fun listByCharacter(
        characterId: String,
        params: QuoteListByCharacterParams = QuoteListByCharacterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QuoteListByCharacterPageAsync> =
        listByCharacter(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see listByCharacter */
    fun listByCharacter(
        characterId: String,
        params: QuoteListByCharacterParams = QuoteListByCharacterParams.none(),
    ): CompletableFuture<QuoteListByCharacterPageAsync> =
        listByCharacter(characterId, params, RequestOptions.none())

    /** @see listByCharacter */
    fun listByCharacter(
        params: QuoteListByCharacterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QuoteListByCharacterPageAsync>

    /** @see listByCharacter */
    fun listByCharacter(
        params: QuoteListByCharacterParams
    ): CompletableFuture<QuoteListByCharacterPageAsync> =
        listByCharacter(params, RequestOptions.none())

    /** @see listByCharacter */
    fun listByCharacter(
        characterId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<QuoteListByCharacterPageAsync> =
        listByCharacter(characterId, QuoteListByCharacterParams.none(), requestOptions)

    /** Get a paginated list of quotes related to a specific theme. */
    fun listByTheme(theme: QuoteTheme): CompletableFuture<QuoteListByThemePageAsync> =
        listByTheme(theme, QuoteListByThemeParams.none())

    /** @see listByTheme */
    fun listByTheme(
        theme: QuoteTheme,
        params: QuoteListByThemeParams = QuoteListByThemeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QuoteListByThemePageAsync> =
        listByTheme(params.toBuilder().theme(theme).build(), requestOptions)

    /** @see listByTheme */
    fun listByTheme(
        theme: QuoteTheme,
        params: QuoteListByThemeParams = QuoteListByThemeParams.none(),
    ): CompletableFuture<QuoteListByThemePageAsync> =
        listByTheme(theme, params, RequestOptions.none())

    /** @see listByTheme */
    fun listByTheme(
        params: QuoteListByThemeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QuoteListByThemePageAsync>

    /** @see listByTheme */
    fun listByTheme(params: QuoteListByThemeParams): CompletableFuture<QuoteListByThemePageAsync> =
        listByTheme(params, RequestOptions.none())

    /** @see listByTheme */
    fun listByTheme(
        theme: QuoteTheme,
        requestOptions: RequestOptions,
    ): CompletableFuture<QuoteListByThemePageAsync> =
        listByTheme(theme, QuoteListByThemeParams.none(), requestOptions)

    /** A view of [QuoteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QuoteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /quotes`, but is otherwise the same as
         * [QuoteServiceAsync.create].
         */
        fun create(params: QuoteCreateParams): CompletableFuture<HttpResponseFor<Quote>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: QuoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Quote>>

        /**
         * Returns a raw HTTP response for `get /quotes/{quote_id}`, but is otherwise the same as
         * [QuoteServiceAsync.retrieve].
         */
        fun retrieve(quoteId: String): CompletableFuture<HttpResponseFor<Quote>> =
            retrieve(quoteId, QuoteRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            quoteId: String,
            params: QuoteRetrieveParams = QuoteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Quote>> =
            retrieve(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            quoteId: String,
            params: QuoteRetrieveParams = QuoteRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Quote>> =
            retrieve(quoteId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: QuoteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Quote>>

        /** @see retrieve */
        fun retrieve(params: QuoteRetrieveParams): CompletableFuture<HttpResponseFor<Quote>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            quoteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Quote>> =
            retrieve(quoteId, QuoteRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /quotes/{quote_id}`, but is otherwise the same as
         * [QuoteServiceAsync.update].
         */
        fun update(quoteId: String): CompletableFuture<HttpResponseFor<Quote>> =
            update(quoteId, QuoteUpdateParams.none())

        /** @see update */
        fun update(
            quoteId: String,
            params: QuoteUpdateParams = QuoteUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Quote>> =
            update(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see update */
        fun update(
            quoteId: String,
            params: QuoteUpdateParams = QuoteUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Quote>> =
            update(quoteId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: QuoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Quote>>

        /** @see update */
        fun update(params: QuoteUpdateParams): CompletableFuture<HttpResponseFor<Quote>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            quoteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Quote>> =
            update(quoteId, QuoteUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /quotes`, but is otherwise the same as
         * [QuoteServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<QuoteListPageAsync>> =
            list(QuoteListParams.none())

        /** @see list */
        fun list(
            params: QuoteListParams = QuoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QuoteListPageAsync>>

        /** @see list */
        fun list(
            params: QuoteListParams = QuoteListParams.none()
        ): CompletableFuture<HttpResponseFor<QuoteListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<QuoteListPageAsync>> =
            list(QuoteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /quotes/{quote_id}`, but is otherwise the same as
         * [QuoteServiceAsync.delete].
         */
        fun delete(quoteId: String): CompletableFuture<HttpResponse> =
            delete(quoteId, QuoteDeleteParams.none())

        /** @see delete */
        fun delete(
            quoteId: String,
            params: QuoteDeleteParams = QuoteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see delete */
        fun delete(
            quoteId: String,
            params: QuoteDeleteParams = QuoteDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(quoteId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: QuoteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: QuoteDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            quoteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(quoteId, QuoteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /quotes/random`, but is otherwise the same as
         * [QuoteServiceAsync.getRandom].
         */
        fun getRandom(): CompletableFuture<HttpResponseFor<Quote>> =
            getRandom(QuoteGetRandomParams.none())

        /** @see getRandom */
        fun getRandom(
            params: QuoteGetRandomParams = QuoteGetRandomParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Quote>>

        /** @see getRandom */
        fun getRandom(
            params: QuoteGetRandomParams = QuoteGetRandomParams.none()
        ): CompletableFuture<HttpResponseFor<Quote>> = getRandom(params, RequestOptions.none())

        /** @see getRandom */
        fun getRandom(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Quote>> =
            getRandom(QuoteGetRandomParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /quotes/characters/{character_id}`, but is otherwise
         * the same as [QuoteServiceAsync.listByCharacter].
         */
        fun listByCharacter(
            characterId: String
        ): CompletableFuture<HttpResponseFor<QuoteListByCharacterPageAsync>> =
            listByCharacter(characterId, QuoteListByCharacterParams.none())

        /** @see listByCharacter */
        fun listByCharacter(
            characterId: String,
            params: QuoteListByCharacterParams = QuoteListByCharacterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QuoteListByCharacterPageAsync>> =
            listByCharacter(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see listByCharacter */
        fun listByCharacter(
            characterId: String,
            params: QuoteListByCharacterParams = QuoteListByCharacterParams.none(),
        ): CompletableFuture<HttpResponseFor<QuoteListByCharacterPageAsync>> =
            listByCharacter(characterId, params, RequestOptions.none())

        /** @see listByCharacter */
        fun listByCharacter(
            params: QuoteListByCharacterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QuoteListByCharacterPageAsync>>

        /** @see listByCharacter */
        fun listByCharacter(
            params: QuoteListByCharacterParams
        ): CompletableFuture<HttpResponseFor<QuoteListByCharacterPageAsync>> =
            listByCharacter(params, RequestOptions.none())

        /** @see listByCharacter */
        fun listByCharacter(
            characterId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QuoteListByCharacterPageAsync>> =
            listByCharacter(characterId, QuoteListByCharacterParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /quotes/themes/{theme}`, but is otherwise the same
         * as [QuoteServiceAsync.listByTheme].
         */
        fun listByTheme(
            theme: QuoteTheme
        ): CompletableFuture<HttpResponseFor<QuoteListByThemePageAsync>> =
            listByTheme(theme, QuoteListByThemeParams.none())

        /** @see listByTheme */
        fun listByTheme(
            theme: QuoteTheme,
            params: QuoteListByThemeParams = QuoteListByThemeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QuoteListByThemePageAsync>> =
            listByTheme(params.toBuilder().theme(theme).build(), requestOptions)

        /** @see listByTheme */
        fun listByTheme(
            theme: QuoteTheme,
            params: QuoteListByThemeParams = QuoteListByThemeParams.none(),
        ): CompletableFuture<HttpResponseFor<QuoteListByThemePageAsync>> =
            listByTheme(theme, params, RequestOptions.none())

        /** @see listByTheme */
        fun listByTheme(
            params: QuoteListByThemeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QuoteListByThemePageAsync>>

        /** @see listByTheme */
        fun listByTheme(
            params: QuoteListByThemeParams
        ): CompletableFuture<HttpResponseFor<QuoteListByThemePageAsync>> =
            listByTheme(params, RequestOptions.none())

        /** @see listByTheme */
        fun listByTheme(
            theme: QuoteTheme,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QuoteListByThemePageAsync>> =
            listByTheme(theme, QuoteListByThemeParams.none(), requestOptions)
    }
}
