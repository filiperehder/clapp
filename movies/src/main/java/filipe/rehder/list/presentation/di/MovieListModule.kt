package filipe.rehder.list.presentation.di

import dagger.Module
import dagger.Provides
import filipe.rehder.list.domain.MovieListContract
import filipe.rehder.list.presentation.MovieListActivity
import filipe.rehder.list.presentation.MovieListPresenter

/**
 * Created by Filipe on 12/12/2017.
 */
@Module
class MovieListModule {

    @Provides
    fun providePresenter(presenter: MovieListPresenter) : MovieListContract.IPresenter = presenter

    @Provides
    fun provideView(view: MovieListActivity) : MovieListContract.IView = view
}