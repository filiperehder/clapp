package filipe.rehder.clapp.di

import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by Filipe on 11/12/2017.
 */
@Module
class AndroidModule {

    @Singleton
    @Provides
    @Named("IOScheduler")
    fun provideIOScheduler() = Schedulers.io()

    @Singleton
    @Provides
    @Named("MainScheduler")
    fun provideAndroidScheduler() = AndroidSchedulers.mainThread()
}