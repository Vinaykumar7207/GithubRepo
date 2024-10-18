package com.example.githubrepoexplorer.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "repos")
data class RepoEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String?,
    val htmlUrl: String
)
