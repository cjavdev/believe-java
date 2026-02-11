// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.core.ClientOptions
import com.believe.api.core.RequestOptions
import com.believe.api.core.http.HttpResponse
import com.believe.api.core.http.HttpResponseFor
import com.believe.api.models.episodes.Episode
import com.believe.api.models.episodes.EpisodeCreateParams
import com.believe.api.models.episodes.EpisodeDeleteParams
import com.believe.api.models.episodes.EpisodeGetWisdomParams
import com.believe.api.models.episodes.EpisodeGetWisdomResponse
import com.believe.api.models.episodes.EpisodeListBySeasonPage
import com.believe.api.models.episodes.EpisodeListBySeasonParams
import com.believe.api.models.episodes.EpisodeListPage
import com.believe.api.models.episodes.EpisodeListParams
import com.believe.api.models.episodes.EpisodeRetrieveParams
import com.believe.api.models.episodes.EpisodeUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface EpisodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EpisodeService

    /** Add a new episode to the series. */
    fun create(params: EpisodeCreateParams): Episode = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EpisodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Episode

    /** Retrieve detailed information about a specific episode. */
    fun retrieve(episodeId: String): Episode = retrieve(episodeId, EpisodeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        episodeId: String,
        params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Episode = retrieve(params.toBuilder().episodeId(episodeId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        episodeId: String,
        params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
    ): Episode = retrieve(episodeId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EpisodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Episode

    /** @see retrieve */
    fun retrieve(params: EpisodeRetrieveParams): Episode = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(episodeId: String, requestOptions: RequestOptions): Episode =
        retrieve(episodeId, EpisodeRetrieveParams.none(), requestOptions)

    /** Update specific fields of an existing episode. */
    fun update(episodeId: String): Episode = update(episodeId, EpisodeUpdateParams.none())

    /** @see update */
    fun update(
        episodeId: String,
        params: EpisodeUpdateParams = EpisodeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Episode = update(params.toBuilder().episodeId(episodeId).build(), requestOptions)

    /** @see update */
    fun update(
        episodeId: String,
        params: EpisodeUpdateParams = EpisodeUpdateParams.none(),
    ): Episode = update(episodeId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EpisodeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Episode

    /** @see update */
    fun update(params: EpisodeUpdateParams): Episode = update(params, RequestOptions.none())

    /** @see update */
    fun update(episodeId: String, requestOptions: RequestOptions): Episode =
        update(episodeId, EpisodeUpdateParams.none(), requestOptions)

    /** Get a paginated list of all Ted Lasso episodes with optional filtering by season. */
    fun list(): EpisodeListPage = list(EpisodeListParams.none())

    /** @see list */
    fun list(
        params: EpisodeListParams = EpisodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeListPage

    /** @see list */
    fun list(params: EpisodeListParams = EpisodeListParams.none()): EpisodeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EpisodeListPage =
        list(EpisodeListParams.none(), requestOptions)

    /** Remove an episode from the database. */
    fun delete(episodeId: String) = delete(episodeId, EpisodeDeleteParams.none())

    /** @see delete */
    fun delete(
        episodeId: String,
        params: EpisodeDeleteParams = EpisodeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().episodeId(episodeId).build(), requestOptions)

    /** @see delete */
    fun delete(episodeId: String, params: EpisodeDeleteParams = EpisodeDeleteParams.none()) =
        delete(episodeId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: EpisodeDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: EpisodeDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(episodeId: String, requestOptions: RequestOptions) =
        delete(episodeId, EpisodeDeleteParams.none(), requestOptions)

    /** Get Ted's wisdom and memorable moments from a specific episode. */
    fun getWisdom(episodeId: String): EpisodeGetWisdomResponse =
        getWisdom(episodeId, EpisodeGetWisdomParams.none())

    /** @see getWisdom */
    fun getWisdom(
        episodeId: String,
        params: EpisodeGetWisdomParams = EpisodeGetWisdomParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeGetWisdomResponse =
        getWisdom(params.toBuilder().episodeId(episodeId).build(), requestOptions)

    /** @see getWisdom */
    fun getWisdom(
        episodeId: String,
        params: EpisodeGetWisdomParams = EpisodeGetWisdomParams.none(),
    ): EpisodeGetWisdomResponse = getWisdom(episodeId, params, RequestOptions.none())

    /** @see getWisdom */
    fun getWisdom(
        params: EpisodeGetWisdomParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeGetWisdomResponse

    /** @see getWisdom */
    fun getWisdom(params: EpisodeGetWisdomParams): EpisodeGetWisdomResponse =
        getWisdom(params, RequestOptions.none())

    /** @see getWisdom */
    fun getWisdom(episodeId: String, requestOptions: RequestOptions): EpisodeGetWisdomResponse =
        getWisdom(episodeId, EpisodeGetWisdomParams.none(), requestOptions)

    /** Get a paginated list of episodes from a specific season. */
    fun listBySeason(seasonNumber: Long): EpisodeListBySeasonPage =
        listBySeason(seasonNumber, EpisodeListBySeasonParams.none())

    /** @see listBySeason */
    fun listBySeason(
        seasonNumber: Long,
        params: EpisodeListBySeasonParams = EpisodeListBySeasonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeListBySeasonPage =
        listBySeason(params.toBuilder().seasonNumber(seasonNumber).build(), requestOptions)

    /** @see listBySeason */
    fun listBySeason(
        seasonNumber: Long,
        params: EpisodeListBySeasonParams = EpisodeListBySeasonParams.none(),
    ): EpisodeListBySeasonPage = listBySeason(seasonNumber, params, RequestOptions.none())

    /** @see listBySeason */
    fun listBySeason(
        params: EpisodeListBySeasonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeListBySeasonPage

    /** @see listBySeason */
    fun listBySeason(params: EpisodeListBySeasonParams): EpisodeListBySeasonPage =
        listBySeason(params, RequestOptions.none())

    /** @see listBySeason */
    fun listBySeason(seasonNumber: Long, requestOptions: RequestOptions): EpisodeListBySeasonPage =
        listBySeason(seasonNumber, EpisodeListBySeasonParams.none(), requestOptions)

    /** A view of [EpisodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EpisodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /episodes`, but is otherwise the same as
         * [EpisodeService.create].
         */
        @MustBeClosed
        fun create(params: EpisodeCreateParams): HttpResponseFor<Episode> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EpisodeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Episode>

        /**
         * Returns a raw HTTP response for `get /episodes/{episode_id}`, but is otherwise the same
         * as [EpisodeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(episodeId: String): HttpResponseFor<Episode> =
            retrieve(episodeId, EpisodeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            episodeId: String,
            params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Episode> =
            retrieve(params.toBuilder().episodeId(episodeId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            episodeId: String,
            params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
        ): HttpResponseFor<Episode> = retrieve(episodeId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EpisodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Episode>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EpisodeRetrieveParams): HttpResponseFor<Episode> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(episodeId: String, requestOptions: RequestOptions): HttpResponseFor<Episode> =
            retrieve(episodeId, EpisodeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /episodes/{episode_id}`, but is otherwise the same
         * as [EpisodeService.update].
         */
        @MustBeClosed
        fun update(episodeId: String): HttpResponseFor<Episode> =
            update(episodeId, EpisodeUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            episodeId: String,
            params: EpisodeUpdateParams = EpisodeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Episode> =
            update(params.toBuilder().episodeId(episodeId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            episodeId: String,
            params: EpisodeUpdateParams = EpisodeUpdateParams.none(),
        ): HttpResponseFor<Episode> = update(episodeId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EpisodeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Episode>

        /** @see update */
        @MustBeClosed
        fun update(params: EpisodeUpdateParams): HttpResponseFor<Episode> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(episodeId: String, requestOptions: RequestOptions): HttpResponseFor<Episode> =
            update(episodeId, EpisodeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /episodes`, but is otherwise the same as
         * [EpisodeService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EpisodeListPage> = list(EpisodeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EpisodeListParams = EpisodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EpisodeListParams = EpisodeListParams.none()
        ): HttpResponseFor<EpisodeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EpisodeListPage> =
            list(EpisodeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /episodes/{episode_id}`, but is otherwise the
         * same as [EpisodeService.delete].
         */
        @MustBeClosed
        fun delete(episodeId: String): HttpResponse = delete(episodeId, EpisodeDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            episodeId: String,
            params: EpisodeDeleteParams = EpisodeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().episodeId(episodeId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            episodeId: String,
            params: EpisodeDeleteParams = EpisodeDeleteParams.none(),
        ): HttpResponse = delete(episodeId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EpisodeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EpisodeDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(episodeId: String, requestOptions: RequestOptions): HttpResponse =
            delete(episodeId, EpisodeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /episodes/{episode_id}/wisdom`, but is otherwise the
         * same as [EpisodeService.getWisdom].
         */
        @MustBeClosed
        fun getWisdom(episodeId: String): HttpResponseFor<EpisodeGetWisdomResponse> =
            getWisdom(episodeId, EpisodeGetWisdomParams.none())

        /** @see getWisdom */
        @MustBeClosed
        fun getWisdom(
            episodeId: String,
            params: EpisodeGetWisdomParams = EpisodeGetWisdomParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeGetWisdomResponse> =
            getWisdom(params.toBuilder().episodeId(episodeId).build(), requestOptions)

        /** @see getWisdom */
        @MustBeClosed
        fun getWisdom(
            episodeId: String,
            params: EpisodeGetWisdomParams = EpisodeGetWisdomParams.none(),
        ): HttpResponseFor<EpisodeGetWisdomResponse> =
            getWisdom(episodeId, params, RequestOptions.none())

        /** @see getWisdom */
        @MustBeClosed
        fun getWisdom(
            params: EpisodeGetWisdomParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeGetWisdomResponse>

        /** @see getWisdom */
        @MustBeClosed
        fun getWisdom(params: EpisodeGetWisdomParams): HttpResponseFor<EpisodeGetWisdomResponse> =
            getWisdom(params, RequestOptions.none())

        /** @see getWisdom */
        @MustBeClosed
        fun getWisdom(
            episodeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EpisodeGetWisdomResponse> =
            getWisdom(episodeId, EpisodeGetWisdomParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /episodes/seasons/{season_number}`, but is otherwise
         * the same as [EpisodeService.listBySeason].
         */
        @MustBeClosed
        fun listBySeason(seasonNumber: Long): HttpResponseFor<EpisodeListBySeasonPage> =
            listBySeason(seasonNumber, EpisodeListBySeasonParams.none())

        /** @see listBySeason */
        @MustBeClosed
        fun listBySeason(
            seasonNumber: Long,
            params: EpisodeListBySeasonParams = EpisodeListBySeasonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeListBySeasonPage> =
            listBySeason(params.toBuilder().seasonNumber(seasonNumber).build(), requestOptions)

        /** @see listBySeason */
        @MustBeClosed
        fun listBySeason(
            seasonNumber: Long,
            params: EpisodeListBySeasonParams = EpisodeListBySeasonParams.none(),
        ): HttpResponseFor<EpisodeListBySeasonPage> =
            listBySeason(seasonNumber, params, RequestOptions.none())

        /** @see listBySeason */
        @MustBeClosed
        fun listBySeason(
            params: EpisodeListBySeasonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeListBySeasonPage>

        /** @see listBySeason */
        @MustBeClosed
        fun listBySeason(
            params: EpisodeListBySeasonParams
        ): HttpResponseFor<EpisodeListBySeasonPage> = listBySeason(params, RequestOptions.none())

        /** @see listBySeason */
        @MustBeClosed
        fun listBySeason(
            seasonNumber: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EpisodeListBySeasonPage> =
            listBySeason(seasonNumber, EpisodeListBySeasonParams.none(), requestOptions)
    }
}
