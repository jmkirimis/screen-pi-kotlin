package com.example.screenpi.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screenpi.model.Integrante

@Preview(showBackground = true)
@Composable
fun EquipeSection(modifier: Modifier = Modifier) {
    val integrantesList = listOf(
        Integrante(
            fotoUrl = "https://jmkirimis.github.io/site-learny/img/joao.jpg",
            nome = "João Marcos",
            funcao= "Desenvolvedor Mobile"
        ),
        Integrante(
            fotoUrl = "https://jmkirimis.github.io/site-learny/img/jorge.JPG",
            nome = "Jorge",
            funcao= "UI/UX Designer"
        ),
        Integrante(
            fotoUrl = "https://jmkirimis.github.io/site-learny/img/guilherme.jpeg",
            nome = "Guilherme",
            funcao= "Desenvolvedor Mobile"
        ),
        Integrante(
            fotoUrl = "https://jmkirimis.github.io/site-learny/img/gabriel.jpeg",
            nome = "Gabriel",
            funcao= "Desenvolvedor Web"
        ),
    )


    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(320.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Equipe",
                color = Color.Black,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(24.dp))

            LazyRow {
                items(integrantesList) { integrante ->
                    EquipeCard(
                        foto = integrante.fotoUrl,
                        nomeIntegrante = integrante.nome,
                        funcao = integrante.funcao
                    )
                }
            }

        }
    }
}
