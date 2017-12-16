package filipe.rehder.list.domain

import filipe.rehder.list.data.model.DiscoverMovieRequest
import filipe.rehder.list.data.model.DiscoverMovieResponse
import filipe.rehder.list.domain.model.MovieItemEntity
import filipe.rehder.list.domain.model.MovieItemRequest
import io.reactivex.Observable

/**
 * Created by Filipe on 13/12/2017.
 */
interface MovieListContract {
    interface IView {
        fun showSucess()
        fun showError()
        fun addListMovies(listMovieEntities: List<MovieItemEntity>)
    }

    interface IPresenter {
        fun onViewReady()
        fun onViewGone()
    }

    interface IInteractor {
        fun discoverMovies(request: MovieItemRequest) :  Observable<List<MovieItemEntity>>
    }

    interface IRepository {
        fun discoverMovies(request: DiscoverMovieRequest) : Observable<DiscoverMovieResponse>
    }
}