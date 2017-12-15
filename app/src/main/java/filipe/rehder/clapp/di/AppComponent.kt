package filipe.rehder.clapp.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import filipe.rehder.clapp.CustomApplication
import javax.inject.Singleton

/**
 * Created by Filipe on 11/12/2017.
 */
@Singleton
@Component(modules = ([AndroidSupportInjectionModule::class,
                       AppModule::class,
                       ActivityBuilder::class,
                       ApiModule::class,
                       AndroidModule::class]))

interface AppComponent : AndroidInjector<DaggerApplication> {
    fun inject(application: CustomApplication)

    override fun inject(instance: DaggerApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}