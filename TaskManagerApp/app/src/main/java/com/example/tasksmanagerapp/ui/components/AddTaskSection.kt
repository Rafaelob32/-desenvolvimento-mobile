package com.example.tasksmanagerapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tasksmanagerapp.data.TaskCategory
import com.example.tasksmanagerapp.data.TaskPriority

@Composable
fun AddTaskSection(onAddTask: (String, TaskCategory, TaskPriority) -> Unit) {
    var taskName by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf(TaskCategory.CASA) }
    var selectedPriority by remember { mutableStateOf(TaskPriority.MEDIA) }

    Column {
        OutlinedTextField(
            value = taskName,
            onValueChange = { taskName = it },
            label = { Text("Nova tarefa") },
            modifier = Modifier.fillMaxWidth()
        )
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            DropdownMenuBox("Categoria", TaskCategory.values().map { it.name }) {
                selectedCategory = TaskCategory.valueOf(it)
            }
            DropdownMenuBox("Prioridade", TaskPriority.values().map { it.name }) {
                selectedPriority = TaskPriority.valueOf(it)
            }
        }
        Button(
            onClick = {
                if (taskName.isNotBlank()) {
                    onAddTask(taskName, selectedCategory, selectedPriority)
                    taskName = ""
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Text("Adicionar Tarefa")
        }
    }
}