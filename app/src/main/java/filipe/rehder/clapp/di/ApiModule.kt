package filipe.rehder.clapp.di

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import filipe.rehder.clapp.BuildConfig
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Filipe on 15/12/2017.
 */

@Module
class ApiModule {

    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("https://api.themoviedb.org/3/")
                .client(okHttpClient)
                .build()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        val level = getInterceptorLevel()
        httpLoggingInterceptor.level = level

        return OkHttpClient.Builder()
                //.cache(cache)
                .addInterceptor(httpLoggingInterceptor)
                .build()
    }

    private fun getInterceptorLevel(): HttpLoggingInterceptor.Level {
        return if (BuildConfig.DEBUG)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
    }

//    @Provides
//    @Singleton
//    fun provideOkHttpCache(context: Context): Cache {
//        val cacheSize = 10 * 1024 * 1024 // 10 MB
//        return Cache(context.cacheDir, cacheSize.toLong())
//    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }
}