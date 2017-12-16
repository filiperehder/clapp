package filipe.rehder.list.domain.model

/**
 * Created by Filipe on 12/12/2017.
 */
data class MovieItemEntity(
        val id: Int,
        val title: String,
        val votes: Double,
        val genres : List<Int>,
        val overview : String,
        val releaseDate : String,
        val imageBackdrop : String,
        val imagePoster : String
)

/*
data class DiscoverMovieResponse (
        val results: Results,
        val movieItemResponse: MovieItemResponse
)

data class Results (
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
 */