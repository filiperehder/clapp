package filipe.rehder.clapp.presentation.di

import dagger.Module
import dagger.Binds
import filipe.rehder.clapp.presentation.MainActivity
import filipe.rehder.clapp.domain.MainContract


/**
 * Created by Filipe on 11/12/2017.
 */
@Module
abstract class MainModule {
    @Binds
    abstract internal fun provideMainView(mainActivity: MainActivity): MainContract.IView
}