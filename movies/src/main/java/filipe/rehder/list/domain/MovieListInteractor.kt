package filipe.rehder.list.domain

import filipe.rehder.list.domain.mapper.toDiscoverMovieRequest
import filipe.rehder.list.domain.mapper.toMovieListEntity
import filipe.rehder.list.domain.model.MovieItemEntity
import filipe.rehder.list.domain.model.MovieItemRequest
import io.reactivex.Observable
import javax.inject.Inject

class MovieListInteractor @Inject constructor(val repository: MovieListContract.IRepository): MovieListContract.IInteractor {
    override fun discoverMovies(request: MovieItemRequest): Observable<List<MovieItemEntity>> {
        return repository.discoverMovies(request.toDiscoverMovieRequest()).map {
            it.toMovieListEntity()
        }
    }
}