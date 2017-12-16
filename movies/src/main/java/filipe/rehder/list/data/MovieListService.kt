package filipe.rehder.list.data

import filipe.rehder.list.data.model.DiscoverMovieRequest
import filipe.rehder.list.data.model.DiscoverMovieResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Filipe on 15/12/2017.
 */
interface MovieListService {

    @GET("discover/movie")
    fun discoverMovie(@Query("api_key") apiKey: String,
                      @Query("page") page: Int) : Observable<DiscoverMovieResponse>
}