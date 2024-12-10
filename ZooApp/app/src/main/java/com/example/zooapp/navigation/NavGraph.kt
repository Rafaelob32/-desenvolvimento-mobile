package com.example.zooapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.zooapp.models.movieList
import com.example.zooapp.ui.theme.screens.MovieScreen
import com.example.zooapp.ui.theme.screens.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onMovieSelected = { movie ->
                // Navega para a tela do filme, codificando o título para evitar problemas com caracteres especiais
                navController.navigate("movie/${movie.title}")
            })
        }
        composable("movie/{movieTitle}") { backStackEntry ->
            val movieTitle = backStackEntry.arguments?.getString("movieTitle")
            val selectedMovie = movieList.firstOrNull { it.title == movieTitle }

            // Verifica se o filme foi encontrado antes de renderizar a tela
            if (selectedMovie != null) {
                MovieScreen(selectedMovie)
            } else {
                // Exibe uma mensagem de erro ou redireciona para outra tela, se necessário
                // Exemplo:
                Text(text = "Filme não encontrado!")
            }
        }
    }
}
