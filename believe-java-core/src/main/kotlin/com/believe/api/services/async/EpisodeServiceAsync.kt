// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.episodes.Episode
import com.believe.api.models.episodes.EpisodeCreateParams
import com.believe.api.models.episodes.EpisodeDeleteParams
import com.believe.api.models.episodes.EpisodeGetWisdomParams
import com.believe.api.models.episodes.EpisodeGetWisdomResponse
import com.believe.api.models.episodes.EpisodeListBySeasonPageAsync
import com.believe.api.models.episodes.EpisodeListBySeasonParams
import com.believe.api.models.episodes.EpisodeListPageAsync
import com.believe.api.models.episodes.EpisodeListParams
import com.believe.api.models.episodes.EpisodeRetrieveParams
import com.believe.api.models.episodes.EpisodeUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EpisodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EpisodeServiceAsync

    /** Add a new episode to the series. */
    fun create(params: EpisodeCreateParams): CompletableFuture<Episode> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EpisodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Episode>

    /** Retrieve detailed information about a specific episode. */
    fun retrieve(episodeId: String): CompletableFuture<Episode> =
        retrieve(episodeId, EpisodeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        episodeId: String,
        params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Episode> =
        retrieve(params.toBuilder().episodeId(episodeId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        episodeId: String,
        params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
    ): CompletableFuture<Episode> = retrieve(episodeId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EpisodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Episode>

    /** @see retrieve */
    fun retrieve(params: EpisodeRetrieveParams): CompletableFuture<Episode> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(episodeId: String, requestOptions: RequestOptions): CompletableFuture<Episode> =
        retrieve(episodeId, EpisodeRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing episode. */
    fun update(episodeId: String): CompletableFuture<Episode> =
        update(episodeId, EpisodeUpdateParams.none())

    /** @see update */
    fun update(
        episodeId: String,
        params: EpisodeUpdateParams = EpisodeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Episode> =
        update(params.toBuilder().episodeId(episodeId).build(), requestOptions)

    /** @see update */
    fun update(
        episodeId: String,
        params: EpisodeUpdateParams = EpisodeUpdateParams.none(),
    ): CompletableFuture<Episode> = update(episodeId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EpisodeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Episode>

    /** @see update */
    fun update(params: EpisodeUpdateParams): CompletableFuture<Episode> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(episodeId: String, requestOptions: RequestOptions): CompletableFuture<Episode> =
        update(episodeId, EpisodeUpdateParams.none(), requestOptions)

    /** Get a paginated list of all Ted Lasso episodes with optional filtering by season. */
    fun list(): CompletableFuture<EpisodeListPageAsync> = list(EpisodeListParams.none())

    /** @see list */
    fun list(
        params: EpisodeListParams = EpisodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeListPageAsync>

    /** @see list */
    fun list(
        params: EpisodeListParams = EpisodeListParams.none()
    ): CompletableFuture<EpisodeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EpisodeListPageAsync> =
        list(EpisodeListParams.none(), requestOptions)

    /** Remove an episode from the database. */
    fun delete(episodeId: String): CompletableFuture<Void?> =
        delete(episodeId, EpisodeDeleteParams.none())

    /** @see delete */
    fun delete(
        episodeId: String,
        params: EpisodeDeleteParams = EpisodeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().episodeId(episodeId).build(), requestOptions)

    /** @see delete */
    fun delete(
        episodeId: String,
        params: EpisodeDeleteParams = EpisodeDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(episodeId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EpisodeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EpisodeDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(episodeId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(episodeId, EpisodeDeleteParams.none(), requestOptions)

    /** Get Ted's wisdom and memorable moments from a specific episode. */
    fun getWisdom(episodeId: String): CompletableFuture<EpisodeGetWisdomResponse> =
        getWisdom(episodeId, EpisodeGetWisdomParams.none())

    /** @see getWisdom */
    fun getWisdom(
        episodeId: String,
        params: EpisodeGetWisdomParams = EpisodeGetWisdomParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeGetWisdomResponse> =
        getWisdom(params.toBuilder().episodeId(episodeId).build(), requestOptions)

    /** @see getWisdom */
    fun getWisdom(
        episodeId: String,
        params: EpisodeGetWisdomParams = EpisodeGetWisdomParams.none(),
    ): CompletableFuture<EpisodeGetWisdomResponse> =
        getWisdom(episodeId, params, RequestOptions.none())

    /** @see getWisdom */
    fun getWisdom(
        params: EpisodeGetWisdomParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeGetWisdomResponse>

    /** @see getWisdom */
    fun getWisdom(params: EpisodeGetWisdomParams): CompletableFuture<EpisodeGetWisdomResponse> =
        getWisdom(params, RequestOptions.none())

    /** @see getWisdom */
    fun getWisdom(
        episodeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EpisodeGetWisdomResponse> =
        getWisdom(episodeId, EpisodeGetWisdomParams.none(), requestOptions)

    /** Get a paginated list of episodes from a specific season. */
    fun listBySeason(seasonNumber: Long): CompletableFuture<EpisodeListBySeasonPageAsync> =
        listBySeason(seasonNumber, EpisodeListBySeasonParams.none())

    /** @see listBySeason */
    fun listBySeason(
        seasonNumber: Long,
        params: EpisodeListBySeasonParams = EpisodeListBySeasonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeListBySeasonPageAsync> =
        listBySeason(params.toBuilder().seasonNumber(seasonNumber).build(), requestOptions)

    /** @see listBySeason */
    fun listBySeason(
        seasonNumber: Long,
        params: EpisodeListBySeasonParams = EpisodeListBySeasonParams.none(),
    ): CompletableFuture<EpisodeListBySeasonPageAsync> =
        listBySeason(seasonNumber, params, RequestOptions.none())

    /** @see listBySeason */
    fun listBySeason(
        params: EpisodeListBySeasonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeListBySeasonPageAsync>

    /** @see listBySeason */
    fun listBySeason(
        params: EpisodeListBySeasonParams
    ): CompletableFuture<EpisodeListBySeasonPageAsync> = listBySeason(params, RequestOptions.none())

    /** @see listBySeason */
    fun listBySeason(
        seasonNumber: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<EpisodeListBySeasonPageAsync> =
        listBySeason(seasonNumber, EpisodeListBySeasonParams.none(), requestOptions)

    /**
     * A view of [EpisodeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EpisodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.create].
         */
        fun create(params: EpisodeCreateParams): CompletableFuture<HttpResponseFor<Episode>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EpisodeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Episode>>

        /**
         * Returns a raw HTTP response for `get /episodes/{episode_id}`, but is otherwise the same
         * as [EpisodeServiceAsync.retrieve].
         */
        fun retrieve(episodeId: String): CompletableFuture<HttpResponseFor<Episode>> =
            retrieve(episodeId, EpisodeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            episodeId: String,
            params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Episode>> =
            retrieve(params.toBuilder().episodeId(episodeId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            episodeId: String,
            params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Episode>> =
            retrieve(episodeId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EpisodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Episode>>

        /** @see retrieve */
        fun retrieve(params: EpisodeRetrieveParams): CompletableFuture<HttpResponseFor<Episode>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            episodeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Episode>> =
            retrieve(episodeId, EpisodeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /episodes/{episode_id}`, but is otherwise the same
         * as [EpisodeServiceAsync.update].
         */
        fun update(episodeId: String): CompletableFuture<HttpResponseFor<Episode>> =
            update(episodeId, EpisodeUpdateParams.none())

        /** @see update */
        fun update(
            episodeId: String,
            params: EpisodeUpdateParams = EpisodeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Episode>> =
            update(params.toBuilder().episodeId(episodeId).build(), requestOptions)

        /** @see update */
        fun update(
            episodeId: String,
            params: EpisodeUpdateParams = EpisodeUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Episode>> =
            update(episodeId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EpisodeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Episode>>

        /** @see update */
        fun update(params: EpisodeUpdateParams): CompletableFuture<HttpResponseFor<Episode>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            episodeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Episode>> =
            update(episodeId, EpisodeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> =
            list(EpisodeListParams.none())

        /** @see list */
        fun list(
            params: EpisodeListParams = EpisodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>>

        /** @see list */
        fun list(
            params: EpisodeListParams = EpisodeListParams.none()
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> =
            list(EpisodeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /episodes/{episode_id}`, but is otherwise the
         * same as [EpisodeServiceAsync.delete].
         */
        fun delete(episodeId: String): CompletableFuture<HttpResponse> =
            delete(episodeId, EpisodeDeleteParams.none())

        /** @see delete */
        fun delete(
            episodeId: String,
            params: EpisodeDeleteParams = EpisodeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().episodeId(episodeId).build(), requestOptions)

        /** @see delete */
        fun delete(
            episodeId: String,
            params: EpisodeDeleteParams = EpisodeDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(episodeId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EpisodeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EpisodeDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            episodeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(episodeId, EpisodeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /episodes/{episode_id}/wisdom`, but is otherwise the
         * same as [EpisodeServiceAsync.getWisdom].
         */
        fun getWisdom(
            episodeId: String
        ): CompletableFuture<HttpResponseFor<EpisodeGetWisdomResponse>> =
            getWisdom(episodeId, EpisodeGetWisdomParams.none())

        /** @see getWisdom */
        fun getWisdom(
            episodeId: String,
            params: EpisodeGetWisdomParams = EpisodeGetWisdomParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeGetWisdomResponse>> =
            getWisdom(params.toBuilder().episodeId(episodeId).build(), requestOptions)

        /** @see getWisdom */
        fun getWisdom(
            episodeId: String,
            params: EpisodeGetWisdomParams = EpisodeGetWisdomParams.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeGetWisdomResponse>> =
            getWisdom(episodeId, params, RequestOptions.none())

        /** @see getWisdom */
        fun getWisdom(
            params: EpisodeGetWisdomParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeGetWisdomResponse>>

        /** @see getWisdom */
        fun getWisdom(
            params: EpisodeGetWisdomParams
        ): CompletableFuture<HttpResponseFor<EpisodeGetWisdomResponse>> =
            getWisdom(params, RequestOptions.none())

        /** @see getWisdom */
        fun getWisdom(
            episodeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EpisodeGetWisdomResponse>> =
            getWisdom(episodeId, EpisodeGetWisdomParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /episodes/seasons/{season_number}`, but is otherwise
         * the same as [EpisodeServiceAsync.listBySeason].
         */
        fun listBySeason(
            seasonNumber: Long
        ): CompletableFuture<HttpResponseFor<EpisodeListBySeasonPageAsync>> =
            listBySeason(seasonNumber, EpisodeListBySeasonParams.none())

        /** @see listBySeason */
        fun listBySeason(
            seasonNumber: Long,
            params: EpisodeListBySeasonParams = EpisodeListBySeasonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeListBySeasonPageAsync>> =
            listBySeason(params.toBuilder().seasonNumber(seasonNumber).build(), requestOptions)

        /** @see listBySeason */
        fun listBySeason(
            seasonNumber: Long,
            params: EpisodeListBySeasonParams = EpisodeListBySeasonParams.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeListBySeasonPageAsync>> =
            listBySeason(seasonNumber, params, RequestOptions.none())

        /** @see listBySeason */
        fun listBySeason(
            params: EpisodeListBySeasonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeListBySeasonPageAsync>>

        /** @see listBySeason */
        fun listBySeason(
            params: EpisodeListBySeasonParams
        ): CompletableFuture<HttpResponseFor<EpisodeListBySeasonPageAsync>> =
            listBySeason(params, RequestOptions.none())

        /** @see listBySeason */
        fun listBySeason(
            seasonNumber: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EpisodeListBySeasonPageAsync>> =
            listBySeason(seasonNumber, EpisodeListBySeasonParams.none(), requestOptions)
    }
}
