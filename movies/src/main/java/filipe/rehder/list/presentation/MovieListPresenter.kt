package filipe.rehder.list.presentation

import android.util.Log
import filipe.rehder.list.domain.MovieListContract
import filipe.rehder.list.domain.model.MovieItem
import javax.inject.Inject

/**
 * Created by Filipe on 12/12/2017.
 */
class MovieListPresenter  @Inject constructor(val view: MovieListContract.IView) : MovieListContract.IPresenter {

    private lateinit var listOfMovies : MutableList<MovieItem>

    override fun onViewReady() {

        listOfMovies = mutableListOf()

        listOfMovies.add(MovieItem("Filipe"))
        listOfMovies.add(MovieItem("Vinicius"))
        listOfMovies.add(MovieItem("Douglas"))

        view.addListMovies(listOfMovies)
    }

    override fun onViewGone() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}