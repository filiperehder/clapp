package filipe.rehder.list.presentation

import android.util.Log
import filipe.rehder.list.domain.MovieListContract
import filipe.rehder.list.domain.model.MovieItemRequest
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.disposables.Disposable
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Filipe on 12/12/2017.
 */
class MovieListPresenter  @Inject constructor(val view: MovieListContract.IView,
                                              val interactor: MovieListContract.IInteractor,
                                              @Named("IOScheduler") val ioScheduler: Scheduler,
                                              @Named("MainScheduler") val mainScheduler: Scheduler) : MovieListContract.IPresenter {

    private lateinit var disposable : Disposable

    override fun onViewReady() {
        disposable = interactor.discoverMovies(requestParamaters(12))
                .subscribeOn(ioScheduler)
                .observeOn(mainScheduler)
                .subscribe({
                    view.addListMovies(it)
                }, {
                    Log.i("Crash", it.message)
                    view.showError()
                })
    }

    fun requestParamaters(page: Int) : MovieItemRequest =
            MovieItemRequest(language = "pt-Br",
                    sort_by = "popularity.desc",
                    include_adult = false,
                    page  = page,
                    year = "2017")

    override fun onViewGone() {
        disposable.dispose()
    }


}