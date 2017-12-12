package filipe.rehder.clapp.domain

/**
 * Created by Filipe on 11/12/2017.
 */
interface MainContract {
    interface IPresenter {
        fun loadMain()
    }

    interface IView {
        fun onMainLoaded()
    }
}