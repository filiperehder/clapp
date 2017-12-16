package filipe.rehder.list.domain.mapper

import filipe.rehder.list.data.model.DiscoverMovieResponse
import filipe.rehder.list.domain.model.MovieItemEntity

/**
 * Created by Filipe on 15/12/2017.
 */
open class MovieItemMapper : Mapper<MovieItemEntity, DiscoverMovieResponse> {

    // Need to be fixed after changing Model of data
    override fun mapFromEntity(item: MovieItemEntity): DiscoverMovieResponse =
            DiscoverMovieResponse(item.id, item.votes, item.title, item.genres, item.imageBackdrop,
                    item.overview, item.releaseDate, item.imagePoster)

    override fun mapToEntity(response: DiscoverMovieResponse): MovieItemEntity =
            MovieItemEntity(response.id, response.title, response.vote_average, response.genre_ids,
                    response.overview, response.release_date, response.backdrop_path, response.poster_path)

}