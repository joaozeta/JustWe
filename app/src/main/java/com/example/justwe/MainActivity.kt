package com.example.justwe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.justwe.ui.theme.JustWeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JustWeTheme() {
                AppGaleriaDeArte()
            }
        }
    }
}

@Preview
@Composable
fun AppGaleriaDeArte() {
    var idImagem by remember { mutableStateOf(1) }
    var idTítulo by remember { mutableStateOf(1) }
    var idDescrição by remember { mutableStateOf(1) }
    var tela by remember { mutableStateOf(1) }

    when(tela){
        1->{
            idImagem = R.drawable.abracados
            idTítulo = R.string.título_imagem1
            idDescrição = R.string.descrição_imagem1
        }
        2->{
            idImagem = R.drawable.beijo
            idTítulo = R.string.título_imagem2
            idDescrição = R.string.descrição_imagem2
        }
        3->{
            idImagem = R.drawable.cheirin
            idTítulo = R.string.título_imagem3
            idDescrição = R.string.descrição_imagem3
        }
        4->{
            idImagem = R.drawable.dormindo
            idTítulo = R.string.título_imagem4
            idDescrição = R.string.descrição_imagem4
        }
        5->{
            idImagem = R.drawable.horto
            idTítulo = R.string.título_imagem5
            idDescrição = R.string.descrição_imagem5
        }
        6->{
            idImagem = R.drawable.kiwi
            idTítulo = R.string.título_imagem6
            idDescrição = R.string.descrição_imagem6
        }
        7->{
            idImagem = R.drawable.triste
            idTítulo = R.string.título_imagem7
            idDescrição = R.string.descrição_imagem7
        }
    }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(modifier = Modifier.padding(top = 60.dp)) {
                Image(
                    painter = painterResource(id = idImagem),
                    contentDescription = null,
                    contentScale = ContentScale.Inside,
                    modifier = Modifier.padding(20.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(5.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Column() {
                    Text(
                        text = stringResource(id = idTítulo),
                        fontSize = 28.sp
                    )
                    Text(
                        text = stringResource(id = idDescrição),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                BotaoNavegacao(texto = "Anterior", onClick = {if(tela>1)tela--})
                BotaoNavegacao(texto = "Próximo", onClick = {if(tela<7)tela++})
            }
        }
    }
}
@Composable
fun BotaoNavegacao(
    texto:String,
    onClick:()->Unit
){
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(Color.Black),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.White),
        elevation = ButtonDefaults.buttonElevation(4.dp)
    )
    {
        Text(
            text = texto
        )
    }
}