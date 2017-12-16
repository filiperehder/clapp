package filipe.rehder.list.domain

import filipe.rehder.list.data.MovieListRepository
import filipe.rehder.list.domain.mapper.MovieItemMapper
import filipe.rehder.list.domain.model.MovieItemEntity
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by Filipe on 15/12/2017.
 */
class MovieListInteractor @Inject constructor(val repository: MovieListContract.IRepository): MovieListContract.IInteractor {
    override fun discoverMovies(): Observable<MovieItemEntity> {
        return repository.discoverMovies().map {
            MovieItemMapper().mapToEntity(it)
        }
    }
}