package filipe.rehder.list.domain.mapper

import filipe.rehder.list.data.model.DiscoverMovieRequest
import filipe.rehder.list.data.model.DiscoverMovieResponse
import filipe.rehder.list.data.model.MovieItemResponse
import filipe.rehder.list.domain.model.MovieItemEntity
import filipe.rehder.list.domain.model.MovieItemRequest

/**
 * Created by Filipe on 15/12/2017.
 */
fun MovieItemResponse.toMovieItemEntity() = MovieItemEntity(id, title, vote_average, genre_ids,
        overview, release_date, backdrop_path, poster_path)

fun MovieItemEntity.toMovieItemResponse() = MovieItemResponse(id, votes, title, genres, imageBackdrop,
        overview, releaseDate, imagePoster)

fun DiscoverMovieResponse.toMovieListEntity() : List<MovieItemEntity> =
    results.map {
        it.toMovieItemEntity()
    }

fun DiscoverMovieRequest.toMovieItemRequest() : MovieItemRequest = MovieItemRequest(language, sort_by, include_adult, page, year)

fun MovieItemRequest.toDiscoverMovieRequest() : DiscoverMovieRequest = DiscoverMovieRequest(language, sort_by, include_adult, page, year)


