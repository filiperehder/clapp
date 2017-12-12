package filipe.rehder.detail.presentation

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import filipe.rehder.detail.R
import javax.inject.Inject
import javax.inject.Named

class DetailActivity : DaggerAppCompatActivity() {

    @Inject lateinit var presenter : DetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        presenter.helloWorld()
    }
}
