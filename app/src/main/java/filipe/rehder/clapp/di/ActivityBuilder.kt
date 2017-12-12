package filipe.rehder.clapp.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import filipe.rehder.clapp.presentation.MainActivity
import filipe.rehder.clapp.presentation.di.MainModule


/**
 * Created by Filipe on 11/12/2017.
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(MainModule::class)])
    internal abstract fun bindMainActivity(): MainActivity

}