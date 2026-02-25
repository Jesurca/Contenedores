package com.jesusurbinez.contenedores

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jesusurbinez.contenedores.ui.theme.ContenedoresTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ContenScreen() {
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .padding(all = 18.dp),


    ) {
        Row(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .padding(all = 18.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Cabeza",
                fontSize = 25.sp,
                modifier = Modifier
                    .background(Color.Red)

            )
            Text(
                text = "Cuerpo",
                fontSize = 25.sp,
                modifier = Modifier
                    .background(Color.Red)

            )
            Text(
                text = "pie",
                fontSize = 25.sp,
                modifier = Modifier
                    .background(Color.Red)

            )


        }
        Text(
            text = "Inicio",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Perfil",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Configuracion", fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Green)
                .padding(8.dp)
        )
    }
}

