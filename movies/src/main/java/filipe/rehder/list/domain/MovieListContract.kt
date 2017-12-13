package filipe.rehder.list.domain

import filipe.rehder.list.domain.model.MovieItem

/**
 * Created by Filipe on 13/12/2017.
 */
interface MovieListContract {
    interface IView {
        fun showSucess()
        fun showError()
        fun addListMovies(listMovies: MutableList <MovieItem>)
    }

    interface IPresenter {
        fun onViewReady()
        fun onViewGone()
    }
}