package com.example.githubrepoexplorer.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/githubrepoexplorer/data/repository/RepoRepository;", "", "githubApi", "Lcom/example/githubrepoexplorer/data/network/GitHubApi;", "repoDao", "Lcom/example/githubrepoexplorer/data/database/RepoDao;", "(Lcom/example/githubrepoexplorer/data/network/GitHubApi;Lcom/example/githubrepoexplorer/data/database/RepoDao;)V", "getCachedRepos", "", "Lcom/example/githubrepoexplorer/model/Repo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRepos", "", "repos", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchRepos", "Lcom/example/githubrepoexplorer/model/RepoSearchResponse;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RepoRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.githubrepoexplorer.data.network.GitHubApi githubApi = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.githubrepoexplorer.data.database.RepoDao repoDao = null;
    
    @javax.inject.Inject
    public RepoRepository(@org.jetbrains.annotations.NotNull
    com.example.githubrepoexplorer.data.network.GitHubApi githubApi, @org.jetbrains.annotations.NotNull
    com.example.githubrepoexplorer.data.database.RepoDao repoDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertRepos(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.githubrepoexplorer.model.Repo> repos, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCachedRepos(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.githubrepoexplorer.model.Repo>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchRepos(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.githubrepoexplorer.model.RepoSearchResponse> $completion) {
        return null;
    }
}