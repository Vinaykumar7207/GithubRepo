package com.example.githubrepoexplorer.uis

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.githubrepoexplorer.RepoViewModel
import com.example.githubrepoexplorer.uis.RepoItem

@OptIn(ExperimentalMaterial3Api::class) // Optional: Opt-in to Material3 Experimental APIs
@Composable
fun HomeScreen(viewModel: RepoViewModel, navController: NavController) {
    var query by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        viewModel.loadCachedRepos() // Load cached repos on launch
    }

    Column(modifier = Modifier.fillMaxSize()) {
        TextField(
            value = query,
            onValueChange = { query = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Search GitHub Repositories") }
        )

        Button(onClick = { viewModel.searchRepos(query) }) {
            Text("Search")
        }

        val repos by viewModel.repos.collectAsState()

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(repos) { repo ->
                RepoItem(repo) {
                    navController.navigate("details/${repo.id}")
                }
            }
        }

        Button(onClick = { viewModel.loadMoreRepos(query) }) {
            Text("Load More")
        }
    }
}
