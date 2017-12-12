package filipe.rehder.list.di

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Filipe on 12/12/2017.
 */
@Module
class ListModule {

    @Provides
    @Named("helloWorldList")
    fun provideStringOfTest() = "Hello World in ListModule"
}