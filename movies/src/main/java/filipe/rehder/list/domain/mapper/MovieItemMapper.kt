package filipe.rehder.list.domain.mapper

import filipe.rehder.list.data.model.DiscoverMovieResponse
import filipe.rehder.list.data.model.MovieItemResponse
import filipe.rehder.list.domain.model.MovieItemEntity
import filipe.rehder.list.domain.model.MovieListEntity

/**
 * Created by Filipe on 15/12/2017.
 */
open class MovieItemMapper : Mapper<MovieItemEntity, MovieItemResponse> {

    override fun mapFromEntity(item: MovieItemEntity): MovieItemResponse =
            MovieItemResponse(item.id, item.votes, item.title, item.genres, item.imageBackdrop,
                    item.overview, item.releaseDate, item.imagePoster)

    override fun mapToEntity(response: MovieItemResponse): MovieItemEntity =
            MovieItemEntity(response.id, response.title, response.vote_average, response.genre_ids,
                    response.overview, response.release_date, response.backdrop_path, response.poster_path)

    fun MovieItemResponse.toMovieItemEntity() = MovieItemEntity(id, title, vote_average, genre_ids,
            overview, release_date, backdrop_path, poster_path)

    fun MovieItemEntity.toMovieItemResponse() = MovieItemResponse(id, votes, title, genres, imageBackdrop,
            overview, releaseDate, imagePoster)


}