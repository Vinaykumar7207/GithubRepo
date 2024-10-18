package com.example.githubrepoexplorer.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RepoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(repos: List<RepoEntity>)

    @Query("SELECT * FROM repos")
    suspend fun getAll(): List<RepoEntity>
}
