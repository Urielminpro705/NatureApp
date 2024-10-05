package com.example.natureapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.natureapp.models.Lugar
import com.example.natureapp.ui.components.LugarCard
import com.example.natureapp.ui.theme.NatureAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NatureAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface (
                        modifier = Modifier
                            .fillMaxSize(),
                        color = MaterialTheme.colorScheme.primary
                    ){
                        ListaLugaresUWU(innerPadding)
                    }
                }
            }
        }
    }
}

@Composable
fun ListaLugaresUWU(paddingValues: PaddingValues){
    Column (
        modifier = Modifier
            .padding(paddingValues)
            .padding(horizontal = 15.dp)
            .fillMaxSize()
    ){
        Text(
            modifier = Modifier
                .padding(top = 20.dp),
            text = "Lugares para visitar en México",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        LazyColumn (
            modifier = Modifier
                .padding(top = 15.dp)
                .padding(bottom = 30.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ){
            items(Lugar.lugares){ lugar ->
                LugarCard(lugar = lugar)
            }
        }
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MainPreview() {
    NatureAppTheme {
        Surface (
            modifier = Modifier
                .fillMaxSize(),
            color = MaterialTheme.colorScheme.primary
        ){
            ListaLugaresUWU(paddingValues = PaddingValues(12.dp))
        }
    }
}