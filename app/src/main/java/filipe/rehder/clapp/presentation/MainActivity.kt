package filipe.rehder.clapp.presentation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import filipe.rehder.clapp.R
import filipe.rehder.clapp.domain.MainContract
import filipe.rehder.list.presentation.MovieListActivity
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

        startDetailActivity()
    }

    override fun onMainLoaded() {
        Log.i("onMainLoaded", "Hello World")
    }

    fun startDetailActivity() {
        startActivity(Intent(this, MovieListActivity::class.java))
    }
}