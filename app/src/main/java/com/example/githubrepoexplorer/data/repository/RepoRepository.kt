package com.example.githubrepoexplorer.data.repository

import com.example.githubrepoexplorer.data.database.RepoDao
import com.example.githubrepoexplorer.data.database.RepoEntity
import com.example.githubrepoexplorer.data.network.GitHubApi
import com.example.githubrepoexplorer.model.Repo
import com.example.githubrepoexplorer.model.RepoSearchResponse
import javax.inject.Inject

class RepoRepository @Inject constructor(
    private val githubApi: GitHubApi,
    private val repoDao: RepoDao
) {
    suspend fun insertRepos(repos: List<Repo>) {
        repoDao.insert(repos.map { RepoEntity(it.id, it.name, it.description, it.htmlUrl) })
    }

    suspend fun getCachedRepos(): List<Repo> {
        return repoDao.getAll().map { Repo(it.id, it.name, it.description, it.htmlUrl) }
    }
    suspend fun searchRepos(query: String): RepoSearchResponse {
        return githubApi.searchRepos(query) // Ensure this returns RepoSearchResponse
    }

}
