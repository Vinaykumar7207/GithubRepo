package com.example.githubrepoexplorer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubrepoexplorer.data.repository.RepoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.example.githubrepoexplorer.model.Repo
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class RepoViewModel @Inject constructor(
    private val repoRepository: RepoRepository // Inject the repository
) : ViewModel() {

    private val _repos = MutableStateFlow(emptyList<Repo>())
    val repos: StateFlow<List<Repo>> = _repos

    init {
        loadCachedRepos() // Load cached repos on init
    }

    // Function to search for repositories
    fun searchRepos(query: String) {
        viewModelScope.launch {
            val response = repoRepository.searchRepos(query) // Call your API
            _repos.value = response.items // Update the state with new repos
            insertRepos(response.items) // Save to Room
        }
    }

    // Function to insert repositories into the database
    suspend fun insertRepos(repos: List<Repo>) {
        repoRepository.insertRepos(repos)
    }

    // Function to load cached repositories
    fun loadCachedRepos() {
        viewModelScope.launch {
            _repos.value = repoRepository.getCachedRepos()
        }
    }

    // Function to load more repositories (implement pagination logic here)
    fun loadMoreRepos(query: String) {
        // Implement pagination logic here
    }

    // Function to get a repository by its ID
    fun getRepoById(repoId: Int): Repo? {
        return _repos.value.find { it.id == repoId } // Find the repo in the cached list
    }
}
