package filipe.rehder.clapp.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Filipe on 11/12/2017.
 */
@Module
abstract class AppModule {

    @Binds
    internal abstract fun provideApplication(application: Application): Application

}