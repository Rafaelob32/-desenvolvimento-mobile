package com.example.zooapp.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.zooapp.models.Movie
import com.example.zooapp.models.movieList
import com.example.zooapp.ui.theme.components.MovieListItem

@Composable
fun HomeScreen(onMovieSelected: (Movie) -> Unit) {
    var searchQuery by remember { mutableStateOf("") }
    val filteredMovies = remember(searchQuery) {
        movieList.filter { it.title.contains(searchQuery, ignoreCase = true) }
    }
    Column {
        TextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Pesquisar") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            items(filteredMovies) { movie ->
                MovieListItem(movie, onMovieSelected)
            }
        }
    }
}
