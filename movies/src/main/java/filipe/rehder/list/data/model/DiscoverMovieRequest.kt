package filipe.rehder.list.data.model

/**
 * Created by Filipe on 15/12/2017.
 */
data class DiscoverMovieRequest(
        val language : String,
        val sort_by : String,
        val include_adult : Boolean,
        val page : Int,
        val year : String
)