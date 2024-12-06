package com.example.planetapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.planetapp.navigation.NavGraph
import com.example.planetapp.ui.theme.PlanetAppTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var showSettingsDialog by remember { mutableStateOf(false) }
            var showHelpDialog by remember { mutableStateOf(false) }

            // Navegação principal
            NavGraph(
                onSettingsClick = {
                    showSettingsDialog = true
                },
                onHelpClick = {
                    showHelpDialog = true
                }
            )

            // Diálogo de Configurações
            if (showSettingsDialog) {
                AlertDialog(
                    onDismissRequest = { showSettingsDialog = false },
                    confirmButton = {
                        TextButton(onClick = { showSettingsDialog = false }) {
                            Text("OK")
                        }
                    },
                    title = {
                        Text("Configurações")
                    },
                    text = {
                        Text("Aqui você pode configurar as preferências do aplicativo.")
                    }
                )
            }

            // Diálogo de Ajuda
            if (showHelpDialog) {
                AlertDialog(
                    onDismissRequest = { showHelpDialog = false },
                    confirmButton = {
                        TextButton(onClick = { showHelpDialog = false }) {
                            Text("OK")
                        }
                    },
                    title = {
                        Text("Ajuda")
                    },
                    text = {
                        Text("Aqui você encontra informações para usar o aplicativo.")
                    }
                )
            }
        }
    }
}
