package filipe.rehder.list.presentation

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import dagger.android.support.DaggerAppCompatActivity
import filipe.rehder.detail.presentation.list.adapter.MovieListAdapter
import filipe.rehder.movies.R
import filipe.rehder.list.domain.MovieListContract
import filipe.rehder.list.domain.model.MovieItem
import kotlinx.android.synthetic.main.list_activity.*
import javax.inject.Inject

/**
 * Created by Filipe on 12/12/2017.
 */
class MovieListActivity : DaggerAppCompatActivity(), MovieListContract.IView {

    @Inject lateinit var presenter: MovieListContract.IPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)

        initView()
    }

    private fun initView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        presenter.onViewReady()
    }

    override fun addListMovies(listMovies: MutableList <MovieItem>) {
        recyclerView.adapter = MovieListAdapter(listMovies)
    }

    override fun showSucess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}