package filipe.rehder.detail.presentation

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import filipe.rehder.movies.R
import javax.inject.Inject

class DetailActivity : DaggerAppCompatActivity() {

    @Inject lateinit var presenter : DetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        presenter.helloWorld()
    }
}
