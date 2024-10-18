package com.example.githubrepoexplorer.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.githubrepoexplorer.model.Repo


@Composable
fun RepoDetailsScreen(repo: Repo?) {
    Column(modifier = Modifier.padding(16.dp)) {
        if (repo != null) {
            Text(text = repo.name, style = MaterialTheme.typography.headlineMedium)
            Text(text = repo.description ?: "No description", style = MaterialTheme.typography.bodyLarge)
            Button(onClick = { /* Open WebView for repo link */ }) {
                Text("Open in GitHub")
            }
        } else {
            Text("Repository details not found.", style = MaterialTheme.typography.bodyLarge)
        }
    }
}
