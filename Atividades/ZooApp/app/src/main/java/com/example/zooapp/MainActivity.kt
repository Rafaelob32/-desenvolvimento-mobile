package com.example.zooapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.zooapp.navigation.NavGraph
import com.example.zooapp.ui.theme.ZooAppTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Ativa suporte para edge-to-edge
        setContent {
            ZooAppTheme {
                NavGraph() // Inicializa a navegação
            }
        }
    }
}
