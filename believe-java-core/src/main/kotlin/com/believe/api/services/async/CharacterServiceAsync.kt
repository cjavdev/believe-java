// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.characters.Character
import com.believe.api.models.characters.CharacterCreateParams
import com.believe.api.models.characters.CharacterDeleteParams
import com.believe.api.models.characters.CharacterGetQuotesParams
import com.believe.api.models.characters.CharacterListPageAsync
import com.believe.api.models.characters.CharacterListParams
import com.believe.api.models.characters.CharacterRetrieveParams
import com.believe.api.models.characters.CharacterUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CharacterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CharacterServiceAsync

    /** Add a new character to the Ted Lasso universe. */
    fun create(params: CharacterCreateParams): CompletableFuture<Character> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CharacterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Character>

    /** Retrieve detailed information about a specific character. */
    fun retrieve(characterId: String): CompletableFuture<Character> =
        retrieve(characterId, CharacterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        characterId: String,
        params: CharacterRetrieveParams = CharacterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Character> =
        retrieve(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        characterId: String,
        params: CharacterRetrieveParams = CharacterRetrieveParams.none(),
    ): CompletableFuture<Character> = retrieve(characterId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CharacterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Character>

    /** @see retrieve */
    fun retrieve(params: CharacterRetrieveParams): CompletableFuture<Character> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        characterId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Character> =
        retrieve(characterId, CharacterRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing character. */
    fun update(characterId: String): CompletableFuture<Character> =
        update(characterId, CharacterUpdateParams.none())

    /** @see update */
    fun update(
        characterId: String,
        params: CharacterUpdateParams = CharacterUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Character> =
        update(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see update */
    fun update(
        characterId: String,
        params: CharacterUpdateParams = CharacterUpdateParams.none(),
    ): CompletableFuture<Character> = update(characterId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CharacterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Character>

    /** @see update */
    fun update(params: CharacterUpdateParams): CompletableFuture<Character> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(characterId: String, requestOptions: RequestOptions): CompletableFuture<Character> =
        update(characterId, CharacterUpdateParams.none(), requestOptions)

    /** Get a paginated list of Ted Lasso characters. */
    fun list(): CompletableFuture<CharacterListPageAsync> = list(CharacterListParams.none())

    /** @see list */
    fun list(
        params: CharacterListParams = CharacterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CharacterListPageAsync>

    /** @see list */
    fun list(
        params: CharacterListParams = CharacterListParams.none()
    ): CompletableFuture<CharacterListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CharacterListPageAsync> =
        list(CharacterListParams.none(), requestOptions)

    /** Remove a character from the database. */
    fun delete(characterId: String): CompletableFuture<Void?> =
        delete(characterId, CharacterDeleteParams.none())

    /** @see delete */
    fun delete(
        characterId: String,
        params: CharacterDeleteParams = CharacterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see delete */
    fun delete(
        characterId: String,
        params: CharacterDeleteParams = CharacterDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(characterId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CharacterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CharacterDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(characterId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(characterId, CharacterDeleteParams.none(), requestOptions)

    /** Get all signature quotes from a specific character. */
    fun getQuotes(characterId: String): CompletableFuture<List<String>> =
        getQuotes(characterId, CharacterGetQuotesParams.none())

    /** @see getQuotes */
    fun getQuotes(
        characterId: String,
        params: CharacterGetQuotesParams = CharacterGetQuotesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>> =
        getQuotes(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see getQuotes */
    fun getQuotes(
        characterId: String,
        params: CharacterGetQuotesParams = CharacterGetQuotesParams.none(),
    ): CompletableFuture<List<String>> = getQuotes(characterId, params, RequestOptions.none())

    /** @see getQuotes */
    fun getQuotes(
        params: CharacterGetQuotesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see getQuotes */
    fun getQuotes(params: CharacterGetQuotesParams): CompletableFuture<List<String>> =
        getQuotes(params, RequestOptions.none())

    /** @see getQuotes */
    fun getQuotes(
        characterId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<String>> =
        getQuotes(characterId, CharacterGetQuotesParams.none(), requestOptions)

    /**
     * A view of [CharacterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CharacterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /characters`, but is otherwise the same as
         * [CharacterServiceAsync.create].
         */
        fun create(params: CharacterCreateParams): CompletableFuture<HttpResponseFor<Character>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CharacterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Character>>

        /**
         * Returns a raw HTTP response for `get /characters/{character_id}`, but is otherwise the
         * same as [CharacterServiceAsync.retrieve].
         */
        fun retrieve(characterId: String): CompletableFuture<HttpResponseFor<Character>> =
            retrieve(characterId, CharacterRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            characterId: String,
            params: CharacterRetrieveParams = CharacterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Character>> =
            retrieve(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            characterId: String,
            params: CharacterRetrieveParams = CharacterRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Character>> =
            retrieve(characterId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CharacterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Character>>

        /** @see retrieve */
        fun retrieve(
            params: CharacterRetrieveParams
        ): CompletableFuture<HttpResponseFor<Character>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            characterId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Character>> =
            retrieve(characterId, CharacterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /characters/{character_id}`, but is otherwise the
         * same as [CharacterServiceAsync.update].
         */
        fun update(characterId: String): CompletableFuture<HttpResponseFor<Character>> =
            update(characterId, CharacterUpdateParams.none())

        /** @see update */
        fun update(
            characterId: String,
            params: CharacterUpdateParams = CharacterUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Character>> =
            update(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see update */
        fun update(
            characterId: String,
            params: CharacterUpdateParams = CharacterUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Character>> =
            update(characterId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CharacterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Character>>

        /** @see update */
        fun update(params: CharacterUpdateParams): CompletableFuture<HttpResponseFor<Character>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            characterId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Character>> =
            update(characterId, CharacterUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /characters`, but is otherwise the same as
         * [CharacterServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CharacterListPageAsync>> =
            list(CharacterListParams.none())

        /** @see list */
        fun list(
            params: CharacterListParams = CharacterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CharacterListPageAsync>>

        /** @see list */
        fun list(
            params: CharacterListParams = CharacterListParams.none()
        ): CompletableFuture<HttpResponseFor<CharacterListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CharacterListPageAsync>> =
            list(CharacterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /characters/{character_id}`, but is otherwise the
         * same as [CharacterServiceAsync.delete].
         */
        fun delete(characterId: String): CompletableFuture<HttpResponse> =
            delete(characterId, CharacterDeleteParams.none())

        /** @see delete */
        fun delete(
            characterId: String,
            params: CharacterDeleteParams = CharacterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see delete */
        fun delete(
            characterId: String,
            params: CharacterDeleteParams = CharacterDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(characterId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CharacterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CharacterDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            characterId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(characterId, CharacterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /characters/{character_id}/quotes`, but is otherwise
         * the same as [CharacterServiceAsync.getQuotes].
         */
        fun getQuotes(characterId: String): CompletableFuture<HttpResponseFor<List<String>>> =
            getQuotes(characterId, CharacterGetQuotesParams.none())

        /** @see getQuotes */
        fun getQuotes(
            characterId: String,
            params: CharacterGetQuotesParams = CharacterGetQuotesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getQuotes(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see getQuotes */
        fun getQuotes(
            characterId: String,
            params: CharacterGetQuotesParams = CharacterGetQuotesParams.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getQuotes(characterId, params, RequestOptions.none())

        /** @see getQuotes */
        fun getQuotes(
            params: CharacterGetQuotesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see getQuotes */
        fun getQuotes(
            params: CharacterGetQuotesParams
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getQuotes(params, RequestOptions.none())

        /** @see getQuotes */
        fun getQuotes(
            characterId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getQuotes(characterId, CharacterGetQuotesParams.none(), requestOptions)
    }
}
