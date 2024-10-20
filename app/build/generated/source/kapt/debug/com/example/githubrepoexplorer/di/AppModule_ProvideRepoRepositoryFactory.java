// Generated by Dagger (https://dagger.dev).
package com.example.githubrepoexplorer.di;

import com.example.githubrepoexplorer.data.database.RepoDao;
import com.example.githubrepoexplorer.data.network.GitHubApi;
import com.example.githubrepoexplorer.data.repository.RepoRepository;
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
public final class AppModule_ProvideRepoRepositoryFactory implements Factory<RepoRepository> {
  private final Provider<GitHubApi> gitHubApiProvider;

  private final Provider<RepoDao> repoDaoProvider;

  public AppModule_ProvideRepoRepositoryFactory(Provider<GitHubApi> gitHubApiProvider,
      Provider<RepoDao> repoDaoProvider) {
    this.gitHubApiProvider = gitHubApiProvider;
    this.repoDaoProvider = repoDaoProvider;
  }

  @Override
  public RepoRepository get() {
    return provideRepoRepository(gitHubApiProvider.get(), repoDaoProvider.get());
  }

  public static AppModule_ProvideRepoRepositoryFactory create(Provider<GitHubApi> gitHubApiProvider,
      Provider<RepoDao> repoDaoProvider) {
    return new AppModule_ProvideRepoRepositoryFactory(gitHubApiProvider, repoDaoProvider);
  }

  public static RepoRepository provideRepoRepository(GitHubApi gitHubApi, RepoDao repoDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRepoRepository(gitHubApi, repoDao));
  }
}
