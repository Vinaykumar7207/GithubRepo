package com.example.githubrepoexplorer.data.network

import com.example.githubrepoexplorer.model.RepoSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubApi {
    @GET("search/repositories")
    suspend fun searchRepos(
        @Query("q") query: String,
        @Query("per_page") perPage: Int = 10,
        @Query("page") page: Int = 1
    ): RepoSearchResponse
}
