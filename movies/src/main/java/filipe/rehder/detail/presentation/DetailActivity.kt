package filipe.rehder.detail.presentation

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import filipe.rehder.movies.R

class DetailActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}
