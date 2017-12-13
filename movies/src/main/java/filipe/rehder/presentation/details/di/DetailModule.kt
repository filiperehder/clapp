package filipe.rehder.presentation.details.di

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Filipe on 11/12/2017.
 */
@Module
class DetailModule {

    @Provides
    @Named("stringOfTest")
    fun provideStringOfTest() = "Hello World in DetailModule"
}