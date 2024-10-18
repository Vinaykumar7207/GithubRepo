// Generated by Dagger (https://dagger.dev).
package com.example.githubrepoexplorer.di;

import com.example.githubrepoexplorer.data.database.AppDatabase;
import com.example.githubrepoexplorer.data.database.RepoDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AppModule_ProvideRepoDaoFactory implements Factory<RepoDao> {
  private final Provider<AppDatabase> databaseProvider;

  public AppModule_ProvideRepoDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public RepoDao get() {
    return provideRepoDao(databaseProvider.get());
  }

  public static AppModule_ProvideRepoDaoFactory create(Provider<AppDatabase> databaseProvider) {
    return new AppModule_ProvideRepoDaoFactory(databaseProvider);
  }

  public static RepoDao provideRepoDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRepoDao(database));
  }
}
