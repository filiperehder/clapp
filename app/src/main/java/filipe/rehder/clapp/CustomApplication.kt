package filipe.rehder.clapp

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import filipe.rehder.clapp.di.DaggerAppComponent

/**
 * Created by Filipe on 11/12/2017.
 */
    class CustomApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }
}