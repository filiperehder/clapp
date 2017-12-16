package filipe.rehder.list.domain

import filipe.rehder.list.data.MovieListRepository
import filipe.rehder.list.data.MovieListService
import filipe.rehder.list.data.model.DiscoverMovieResponse
import filipe.rehder.list.domain.model.MovieItemEntity
import io.reactivex.Observable

/**
 * Created by Filipe on 13/12/2017.
 */
interface MovieListContract {
    interface IView {
        fun showSucess()
        fun showError()
        fun addListMovies(listMovieEntities: MutableList <MovieItemEntity>)
    }

    interface IPresenter {
        fun onViewReady()
        fun onViewGone()
    }

    interface IInteractor {
        fun discoverMovies() : Observable<MovieItemEntity>
    }

    interface IRepository {
        fun discoverMovies() : Observable<DiscoverMovieResponse>
    }
}