package filipe.rehder.list.presentation.di

import dagger.Module
import dagger.Provides
import filipe.rehder.list.data.MovieListRepository
import filipe.rehder.list.data.MovieListService
import filipe.rehder.list.domain.MovieListContract
import filipe.rehder.list.domain.MovieListInteractor
import filipe.rehder.list.presentation.MovieListActivity
import filipe.rehder.list.presentation.MovieListPresenter
import retrofit2.Retrofit

/**
 * Created by Filipe on 12/12/2017.
 */
@Module
class MovieListModule {

    @Provides
    fun providePresenter(presenter: MovieListPresenter) : MovieListContract.IPresenter = presenter

    @Provides
    fun provideView(view: MovieListActivity) : MovieListContract.IView = view

    @Provides
    fun provideService(retrofit: Retrofit) : MovieListService = retrofit.create(MovieListService::class.java)

    @Provides
    fun provideInteractor(interactor: MovieListInteractor) : MovieListContract.IInteractor = interactor

    @Provides
    fun provideRepository(repository: MovieListRepository) : MovieListContract.IRepository = repository
}