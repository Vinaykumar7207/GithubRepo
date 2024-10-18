package com.example.githubrepoexplorer.di

import android.app.Application
import android.content.Context
import com.example.githubrepoexplorer.data.database.AppDatabase
import com.example.githubrepoexplorer.data.database.RepoDao
import com.example.githubrepoexplorer.data.network.GitHubApi
import com.example.githubrepoexplorer.data.repository.RepoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideGitHubApi(retrofit: Retrofit): GitHubApi {
        return retrofit.create(GitHubApi::class.java)
    }

    @Provides
    fun provideDatabase(context: Context): AppDatabase {
        return AppDatabase.getDatabase(context)
    }

    @Provides
    fun provideRepoDao(database: AppDatabase): RepoDao {
        return database.repoDao() // This line provides the RepoDao instance
    }

    @Provides
    fun provideRepoRepository(gitHubApi: GitHubApi, repoDao: RepoDao): RepoRepository {
        return RepoRepository(gitHubApi, repoDao)
    }
}
