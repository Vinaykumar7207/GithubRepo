package com.example.githubrepoexplorer;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001f\u0010\u0010\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/githubrepoexplorer/RepoViewModel;", "Landroidx/lifecycle/ViewModel;", "repoRepository", "Lcom/example/githubrepoexplorer/data/repository/RepoRepository;", "(Lcom/example/githubrepoexplorer/data/repository/RepoRepository;)V", "_repos", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/githubrepoexplorer/model/Repo;", "repos", "Lkotlinx/coroutines/flow/StateFlow;", "getRepos", "()Lkotlinx/coroutines/flow/StateFlow;", "getRepoById", "repoId", "", "insertRepos", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCachedRepos", "loadMoreRepos", "query", "", "searchRepos", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RepoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.githubrepoexplorer.data.repository.RepoRepository repoRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.githubrepoexplorer.model.Repo>> _repos = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.githubrepoexplorer.model.Repo>> repos = null;
    
    @javax.inject.Inject
    public RepoViewModel(@org.jetbrains.annotations.NotNull
    com.example.githubrepoexplorer.data.repository.RepoRepository repoRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.githubrepoexplorer.model.Repo>> getRepos() {
        return null;
    }
    
    public final void searchRepos(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertRepos(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.githubrepoexplorer.model.Repo> repos, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void loadCachedRepos() {
    }
    
    public final void loadMoreRepos(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.githubrepoexplorer.model.Repo getRepoById(int repoId) {
        return null;
    }
}