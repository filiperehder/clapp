package filipe.rehder.presentation.list

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import filipe.rehder.detail.R
import javax.inject.Inject

/**
 * Created by Filipe on 12/12/2017.
 */
class ListActivity : DaggerAppCompatActivity() {

    @Inject lateinit var presenter : ListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)

        Log.d("Hi", presenter.helloWorld())
    }
}