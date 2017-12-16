package filipe.rehder.list.domain.model

/**
 * Created by Filipe on 12/12/2017.
 */
data class MovieItemEntity (
        val id: Int,
        val title: String,
        val votes: Double,
        val genres : List<Int>,
        val overview : String,
        val releaseDate : String,
        val imageBackdrop : String?,
        val imagePoster : String?
)

data class MovieItemRequest (
    val language : String,
    val sort_by : String,
    val include_adult : Boolean,
    val page : Int,
    val year : String
)