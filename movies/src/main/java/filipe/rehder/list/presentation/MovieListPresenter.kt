package filipe.rehder.list.presentation

import android.util.Log
import filipe.rehder.list.domain.MovieListContract
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


        disposable = interactor.discoverMovies()
                .subscribeOn(ioScheduler)
                .observeOn(mainScheduler)
                .subscribe({
                    Log.i("Here iam", "rocks like a hurricane")
                }, {
                    Log.i("Here iam", "crashing like a hurricane")
                })
    }

    override fun onViewGone() {
        disposable.dispose()
    }

}