package filipe.rehder.clapp.presentation

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import filipe.rehder.clapp.R
import filipe.rehder.clapp.domain.MainContract
import javax.inject.Inject

/**
 * Created by Filipe on 11/12/2017.
 */
class MainActivity : DaggerAppCompatActivity(), MainContract.IView {

    @Inject lateinit var mainPresenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        mainPresenter.loadMain()
    }

    override fun onMainLoaded() {
        Log.i("onMainLoaded", "Hello World")
    }
}