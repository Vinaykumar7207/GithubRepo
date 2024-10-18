package com.example.githubrepoexplorer.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000fH\u0007J\b\u0010\u0015\u001a\u00020\rH\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/example/githubrepoexplorer/di/AppModule;", "", "()V", "provideContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideDatabase", "Lcom/example/githubrepoexplorer/data/database/AppDatabase;", "context", "provideGitHubApi", "Lcom/example/githubrepoexplorer/data/network/GitHubApi;", "retrofit", "Lretrofit2/Retrofit;", "provideRepoDao", "Lcom/example/githubrepoexplorer/data/database/RepoDao;", "database", "provideRepoRepository", "Lcom/example/githubrepoexplorer/data/repository/RepoRepository;", "gitHubApi", "repoDao", "provideRetrofit", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.githubrepoexplorer.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.githubrepoexplorer.data.network.GitHubApi provideGitHubApi(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.githubrepoexplorer.data.database.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.githubrepoexplorer.data.database.RepoDao provideRepoDao(@org.jetbrains.annotations.NotNull
    com.example.githubrepoexplorer.data.database.AppDatabase database) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.githubrepoexplorer.data.repository.RepoRepository provideRepoRepository(@org.jetbrains.annotations.NotNull
    com.example.githubrepoexplorer.data.network.GitHubApi gitHubApi, @org.jetbrains.annotations.NotNull
    com.example.githubrepoexplorer.data.database.RepoDao repoDao) {
        return null;
    }
}