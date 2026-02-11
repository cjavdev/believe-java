// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.characters.Character
import com.believe.api.models.characters.CharacterCreateParams
import com.believe.api.models.characters.CharacterDeleteParams
import com.believe.api.models.characters.CharacterGetQuotesParams
import com.believe.api.models.characters.CharacterListPage
import com.believe.api.models.characters.CharacterListParams
import com.believe.api.models.characters.CharacterRetrieveParams
import com.believe.api.models.characters.CharacterUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface CharacterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CharacterService

    /** Add a new character to the Ted Lasso universe. */
    fun create(params: CharacterCreateParams): Character = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CharacterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Character

    /** Retrieve detailed information about a specific character. */
    fun retrieve(characterId: String): Character =
        retrieve(characterId, CharacterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        characterId: String,
        params: CharacterRetrieveParams = CharacterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Character = retrieve(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        characterId: String,
        params: CharacterRetrieveParams = CharacterRetrieveParams.none(),
    ): Character = retrieve(characterId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CharacterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Character

    /** @see retrieve */
    fun retrieve(params: CharacterRetrieveParams): Character =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(characterId: String, requestOptions: RequestOptions): Character =
        retrieve(characterId, CharacterRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing character. */
    fun update(characterId: String): Character = update(characterId, CharacterUpdateParams.none())

    /** @see update */
    fun update(
        characterId: String,
        params: CharacterUpdateParams = CharacterUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Character = update(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see update */
    fun update(
        characterId: String,
        params: CharacterUpdateParams = CharacterUpdateParams.none(),
    ): Character = update(characterId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CharacterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Character

    /** @see update */
    fun update(params: CharacterUpdateParams): Character = update(params, RequestOptions.none())

    /** @see update */
    fun update(characterId: String, requestOptions: RequestOptions): Character =
        update(characterId, CharacterUpdateParams.none(), requestOptions)

    /** Get a paginated list of Ted Lasso characters. */
    fun list(): CharacterListPage = list(CharacterListParams.none())

    /** @see list */
    fun list(
        params: CharacterListParams = CharacterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CharacterListPage

    /** @see list */
    fun list(params: CharacterListParams = CharacterListParams.none()): CharacterListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CharacterListPage =
        list(CharacterListParams.none(), requestOptions)

    /** Remove a character from the database. */
    fun delete(characterId: String) = delete(characterId, CharacterDeleteParams.none())

    /** @see delete */
    fun delete(
        characterId: String,
        params: CharacterDeleteParams = CharacterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see delete */
    fun delete(characterId: String, params: CharacterDeleteParams = CharacterDeleteParams.none()) =
        delete(characterId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CharacterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: CharacterDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(characterId: String, requestOptions: RequestOptions) =
        delete(characterId, CharacterDeleteParams.none(), requestOptions)

    /** Get all signature quotes from a specific character. */
    fun getQuotes(characterId: String): List<String> =
        getQuotes(characterId, CharacterGetQuotesParams.none())

    /** @see getQuotes */
    fun getQuotes(
        characterId: String,
        params: CharacterGetQuotesParams = CharacterGetQuotesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String> = getQuotes(params.toBuilder().characterId(characterId).build(), requestOptions)

    /** @see getQuotes */
    fun getQuotes(
        characterId: String,
        params: CharacterGetQuotesParams = CharacterGetQuotesParams.none(),
    ): List<String> = getQuotes(characterId, params, RequestOptions.none())

    /** @see getQuotes */
    fun getQuotes(
        params: CharacterGetQuotesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see getQuotes */
    fun getQuotes(params: CharacterGetQuotesParams): List<String> =
        getQuotes(params, RequestOptions.none())

    /** @see getQuotes */
    fun getQuotes(characterId: String, requestOptions: RequestOptions): List<String> =
        getQuotes(characterId, CharacterGetQuotesParams.none(), requestOptions)

    /** A view of [CharacterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CharacterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /characters`, but is otherwise the same as
         * [CharacterService.create].
         */
        @MustBeClosed
        fun create(params: CharacterCreateParams): HttpResponseFor<Character> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CharacterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Character>

        /**
         * Returns a raw HTTP response for `get /characters/{character_id}`, but is otherwise the
         * same as [CharacterService.retrieve].
         */
        @MustBeClosed
        fun retrieve(characterId: String): HttpResponseFor<Character> =
            retrieve(characterId, CharacterRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            characterId: String,
            params: CharacterRetrieveParams = CharacterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Character> =
            retrieve(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            characterId: String,
            params: CharacterRetrieveParams = CharacterRetrieveParams.none(),
        ): HttpResponseFor<Character> = retrieve(characterId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CharacterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Character>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CharacterRetrieveParams): HttpResponseFor<Character> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            characterId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Character> =
            retrieve(characterId, CharacterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /characters/{character_id}`, but is otherwise the
         * same as [CharacterService.update].
         */
        @MustBeClosed
        fun update(characterId: String): HttpResponseFor<Character> =
            update(characterId, CharacterUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            characterId: String,
            params: CharacterUpdateParams = CharacterUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Character> =
            update(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            characterId: String,
            params: CharacterUpdateParams = CharacterUpdateParams.none(),
        ): HttpResponseFor<Character> = update(characterId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CharacterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Character>

        /** @see update */
        @MustBeClosed
        fun update(params: CharacterUpdateParams): HttpResponseFor<Character> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            characterId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Character> =
            update(characterId, CharacterUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /characters`, but is otherwise the same as
         * [CharacterService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CharacterListPage> = list(CharacterListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CharacterListParams = CharacterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CharacterListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CharacterListParams = CharacterListParams.none()
        ): HttpResponseFor<CharacterListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CharacterListPage> =
            list(CharacterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /characters/{character_id}`, but is otherwise the
         * same as [CharacterService.delete].
         */
        @MustBeClosed
        fun delete(characterId: String): HttpResponse =
            delete(characterId, CharacterDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            characterId: String,
            params: CharacterDeleteParams = CharacterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            characterId: String,
            params: CharacterDeleteParams = CharacterDeleteParams.none(),
        ): HttpResponse = delete(characterId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CharacterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CharacterDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(characterId: String, requestOptions: RequestOptions): HttpResponse =
            delete(characterId, CharacterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /characters/{character_id}/quotes`, but is otherwise
         * the same as [CharacterService.getQuotes].
         */
        @MustBeClosed
        fun getQuotes(characterId: String): HttpResponseFor<List<String>> =
            getQuotes(characterId, CharacterGetQuotesParams.none())

        /** @see getQuotes */
        @MustBeClosed
        fun getQuotes(
            characterId: String,
            params: CharacterGetQuotesParams = CharacterGetQuotesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>> =
            getQuotes(params.toBuilder().characterId(characterId).build(), requestOptions)

        /** @see getQuotes */
        @MustBeClosed
        fun getQuotes(
            characterId: String,
            params: CharacterGetQuotesParams = CharacterGetQuotesParams.none(),
        ): HttpResponseFor<List<String>> = getQuotes(characterId, params, RequestOptions.none())

        /** @see getQuotes */
        @MustBeClosed
        fun getQuotes(
            params: CharacterGetQuotesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see getQuotes */
        @MustBeClosed
        fun getQuotes(params: CharacterGetQuotesParams): HttpResponseFor<List<String>> =
            getQuotes(params, RequestOptions.none())

        /** @see getQuotes */
        @MustBeClosed
        fun getQuotes(
            characterId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<String>> =
            getQuotes(characterId, CharacterGetQuotesParams.none(), requestOptions)
    }
}
