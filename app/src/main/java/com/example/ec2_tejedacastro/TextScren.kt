package com.example.ec2_tejedacastro


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class Test(
    val title: String,
    val description: String,
    val date: String
)

// Lista de pruebas ficticia para previsualización
val testList = listOf(
    Test("Test 1", "Trastornos de la alimentación", "01/01/2023"),
    Test("Test 2", "Trastornos de la personalidad", "02/02/2023"),
    Test("Test 3", "Trastorno de pánico", "03/03/2023"),
    Test("Test 4", "Trastorno afectivo bipolar", "04/04/2023"),
    Test("Test 5", "Esquizofrenia", "05/05/2023"),
    Test("Test 6", "Trastornos del espectro autista", "06/06/2023"),
    Test("Test 7", "ataques súbitos de miedo intenso ", "07/07/2023"),
    Test("Test 8", "trastorno obsesivo compulsivo,", "08/08/2023"),
    Test("Test 9", "estado emocional de malestar muy alto acompañado", "09/09/2023"),
    Test("Test 10", "Trastorno afectivo bipola", "10/10/2023")
)

@Composable
fun TestCard(test: Test) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = test.title, style = MaterialTheme.typography.h6)
            Text(text = test.description, style = MaterialTheme.typography.body1)
            Text(text = test.date, style = MaterialTheme.typography.caption)
        }
    }
}

@Composable
fun TestList() {
    LazyColumn {
        items(testList) { test ->
            TestCard(test = test)
        }
    }
}

