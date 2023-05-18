package com.example.justwe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.justwe.ui.theme.JustWeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JustWeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    tela()
                }
            }
        }
    }
}

@Preview
@Composable
fun tela(){
    var botao by remember { mutableStateOf(1) }

    Column( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()) {
        Surface() {
            
        }
        Image(
            painter = painterResource(id = R.drawable.abracados),
            contentDescription = null
        )
        Text(
            text = "eu e ela depois do almoço",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            text = "buchin chei",
            fontSize = 15.sp
        )
        Row() {
            Button(onClick = {

            }) {
                
            }
            Button(onClick = {

            }) {
                
            }
        }
    }
}
@Composable
fun ConteudoApp(
    idTexto:Int,
    idImagem:Int,
    onClickImagem:()->Unit