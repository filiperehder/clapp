package filipe.rehder.clapp.presentation

import filipe.rehder.clapp.domain.MainContract
import javax.inject.Inject

/**
 * Created by Filipe on 11/12/2017.
 */
class MainPresenter @Inject constructor(private val mainView : MainContract.IView) : MainContract.IPresenter {

    override fun loadMain() {
        mainView.onMainLoaded()
    }
}