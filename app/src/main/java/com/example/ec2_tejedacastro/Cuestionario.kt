package com.example.ec2_tejedacastro

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Question() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "CUESTIONARIO", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "1. Marque sus platos favoritos.")
        CheckboxOption("Arroz con pollo")
        CheckboxOption("Lomo Saltado")
        CheckboxOption("Ají de gallina")
        CheckboxOption("Tallarines")
        CheckboxOption("Arroz Chaufa")
        CheckboxOption("Otro")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "2. ¿Visitaste algún país de Europa, Asia o África?")
        RadioButtonGroup(
            options = listOf("Sí", "No")
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "3. ¿Hablas Inglés?")
        RadioButtonGroup(
            options = listOf("Sí", "No")
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "4. ¿Te gusta la tecnología?")
        RadioButtonGroup(
            options = listOf("Sí", "No")
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "5. ¿Realizas trabajo remoto?")
        RadioButtonGroup(
            options = listOf("Sí", "No")
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { /* Acción al resolver el cuestionario */ }) {
            Text(text = "Resolver")
        }
    }
}

@Composable
fun CheckboxOption(text: String) {
    var isChecked by remember { mutableStateOf(false) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = { isChecked = it }
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text)
    }
}

@Composable
fun RadioButtonGroup(options: List<String>) {
    var selectedOption by remember { mutableStateOf("") }
    Column {
        options.forEach { text ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOption == text,
                    onClick = { selectedOption = text }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = text)
            }
        }
    }
}
