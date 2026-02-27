package com.example.tarea

import android.R.attr.fontWeight
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarea.ui.theme.TareaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TareaTheme {
                ProductCard()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ProductCard() {

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()

    ) {

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {

            }

            Image(
                painter = painterResource(id = R.drawable.pc),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(bottom = 8.dp)
            )

            Text(
                text = "PC gamer",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                text = "$99.99",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4CAF50)
            )

            Text(
                text = "Descripción del producto: detalles importantes, características y beneficios(blabla).",
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Button(
                    onClick = { },
                ) {
                    Text(
                        text = "Editar",
                        modifier = Modifier.padding(horizontal = 30.dp)
                    )
                }


                Button(
                    onClick = { },

                ) {
                    Text(
                        text = "Eliminar",
                        modifier = Modifier.padding(horizontal = 30.dp)
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TutorialScreen() {

    Column {
        Image(
            painter = painterResource(id = R.drawable.compu),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Text(
            text = "Jetpack Compose tutorial",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            modifier = Modifier.padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest.",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun PantallaPerfil() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .padding(top = 16.dp)
        )

        Text(
            text = "Julia Pérez",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("150 Posts", textAlign = TextAlign.Center)
            Text("2.3K Seguidores", textAlign = TextAlign.Center)
            Text("980 Likes", textAlign = TextAlign.Center)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Button(onClick = { }) {
                Text("Seguir")
            }

            OutlinedButton(onClick = { }) {
                Text("Mensaje")
            }
        }

        Text(
            text = "Intereses",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Ciclismo",
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(8.dp)
            )

            Text(
                text = "Programación",
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(8.dp)
            )

            Text(
                text = "UI/UX",
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(8.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Música",
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(8.dp)
            )

            Text(
                text = "Viajes",
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(8.dp)
            )

            Text(
                text = "Gaming",
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(8.dp)
            )
        }

        Text(
            text = "Proyectos Recientes",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )

            Column(
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Text(
                    text = "App de Ciclismo",
                    fontWeight = FontWeight.Bold
                )
                Text("Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.")
                Button(
                    onClick = {},
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Text("Ver más")
                }
            }
        }
    }
}