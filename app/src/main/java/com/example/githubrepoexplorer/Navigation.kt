package com.example.githubrepoexplorer

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.githubrepoexplorer.uis.HomeScreen
import com.example.githubrepoexplorer.ui.RepoDetailsScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    // Get the ViewModel once for Navigation composable
    val viewModel: RepoViewModel = hiltViewModel()

    NavHost(navController, startDestination = "home") {
        composable("home") {
            HomeScreen(viewModel = viewModel, navController = navController) // Pass the ViewModel and NavController
        }
        composable("details/{repoId}") { backStackEntry ->
            val repoId = backStackEntry.arguments?.getString("repoId")?.toIntOrNull() // Get repoId as Int

            // Fetch the Repo object using the ViewModel
            val repo = repoId?.let { viewModel.getRepoById(it) } // Get Repo, handle null safely

            // Pass the Repo object to RepoDetailsScreen
            RepoDetailsScreen(repo) // Pass the Repo object
        }
    }
}
