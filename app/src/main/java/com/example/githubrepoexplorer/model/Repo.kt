package com.example.githubrepoexplorer.model

data class Repo(
    val id: Int,
    val name: String,
    val description: String?,
    val htmlUrl: String
)
