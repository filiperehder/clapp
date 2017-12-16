package filipe.rehder.list.data.model

/**
 * Created by Filipe on 15/12/2017.
 */
data class DiscoverMovieResponse (
        val result: List<MovieItemResponse>,
        val page: Int
)

data class MovieItemResponse(
        val id: Int,
        val vote_average: Double,
        val title : String,
        val genre_ids : List<Int>,
        val backdrop_path : String,
        val overview : String,
        val release_date : String,
        val poster_path : String
)

