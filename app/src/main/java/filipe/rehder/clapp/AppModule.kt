package filipe.rehder.clapp

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Filipe on 11/12/2017.
 */
@Module
class AppModule(val application: Application) {

    @Singleton
    @Provides
    fun provideApplication() = application

    @Singleton
    @Provides
    fun provideApplicationContext() = application.applicationContext

    @Singleton
    @Provides
    @Named("IOScheduler")
    fun provideIOScheduler() = Schedulers.io()

    @Singleton
    @Provides
    @Named("MainScheduler")
    fun provideAndroidScheduler() = AndroidSchedulers.mainThread()

}