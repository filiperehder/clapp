package filipe.rehder.detail.di

import dagger.Subcomponent

/**
 * Created by Filipe on 11/12/2017.
 */
@DetailScope
@Subcomponent(modules = ([DetailModule::class]))
class DetailComponent {
    @Subcomponent.Builder
    internal interface Builder {
        fun couponModule(module: DetailModule): Builder
        fun build(): DetailComponent
    }
}