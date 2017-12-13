package filipe.rehder.presentation.list

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import filipe.rehder.detail.R
import filipe.rehder.domain.list.model.MovieList
import filipe.rehder.presentation.list.adapter.ListAdapter
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

        Log.d("Hi", presenter.helloWorld())

        val movieList : List<MovieList> = listOf(MovieList("Filipe"), MovieList("Joao"))

        Log.i(" movieList", movieList.toString())

        recyclerView.adapter = ListAdapter(movieList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}