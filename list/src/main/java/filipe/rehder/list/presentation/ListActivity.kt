package filipe.rehder.list.presentation

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import filipe.rehder.list.R
import kotlinx.android.synthetic.main.list_activity.*
import javax.inject.Inject

/**
 * Created by Filipe on 12/12/2017.
 */
class ListActivity : DaggerAppCompatActivity() {

    @Inject lateinit var presenter : ListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)

        textView.text = presenter.helloWorld()
    }
}