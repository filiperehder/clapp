package filipe.rehder.list.data

import filipe.rehder.list.domain.MovieListContract
import filipe.rehder.list.data.model.DiscoverMovieResponse
import filipe.rehder.movies.BuildConfig
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by Filipe on 15/12/2017.
 */
class MovieListRepository @Inject constructor(private val service: MovieListService) : MovieListContract.IRepository {
    override fun discoverMovies(): Observable<DiscoverMovieResponse> {
            return service.discoverMovie(BuildConfig.TMDB_API_KEY)
        }
    }