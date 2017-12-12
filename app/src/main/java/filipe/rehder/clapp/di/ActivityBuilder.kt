package filipe.rehder.clapp.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import filipe.rehder.clapp.presentation.MainActivity
import filipe.rehder.clapp.presentation.di.MainModule
import filipe.rehder.detail.di.DetailModule
import filipe.rehder.detail.presentation.DetailActivity
import filipe.rehder.list.di.ListModule
import filipe.rehder.list.presentation.ListActivity


/**
 * Created by Filipe on 11/12/2017.
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(MainModule::class)])
    internal abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [(DetailModule::class)])
    internal abstract fun bindDetailActivity(): DetailActivity

    @ContributesAndroidInjector(modules = [(ListModule::class)])
    internal abstract fun bindListActivity(): ListActivity

}