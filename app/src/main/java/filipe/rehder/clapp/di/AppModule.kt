package filipe.rehder.clapp.di

import android.app.Application
import dagger.Binds
import dagger.Module

/**
 * Created by Filipe on 11/12/2017.
 */
@Module
abstract class AppModule {

    @Binds
    internal abstract fun provideApplication(application: Application): Application

}