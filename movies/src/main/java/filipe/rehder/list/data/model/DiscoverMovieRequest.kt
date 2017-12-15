package filipe.rehder.list.data.model

/**
 * Created by Filipe on 15/12/2017.
 */
data class DiscoverMovieRequest(
        val language : String = "pt-Br",
        val sort_by : String = "popularity.desc",
        val include_adult : Boolean = false,
        val page : Int = 1,
        val year : String = "2017"
)