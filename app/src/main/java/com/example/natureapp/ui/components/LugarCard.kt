package com.example.natureapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.natureapp.ListaLugaresUWU
import com.example.natureapp.R
import com.example.natureapp.models.Lugar
import com.example.natureapp.ui.theme.NatureAppTheme
import kotlin.math.round

@Composable
fun LugarCard(lugar : Lugar){
    Box (
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .background(color = Color.White)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ){
//            Image(
//                painter = rememberImagePainter("https://images.adsttc.com/media/images/5d44/14fa/284d/d1fd/3a00/003d/large_jpg/eiffel-tower-in-paris-151-medium.jpg?1564742900"),
//                contentDescription = lugar.descripcionImagen)
            Box (
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.BottomStart
            ){
                Image(
                    painter = rememberImagePainter(lugar.imagen),
                    contentDescription = lugar.descripcionImagen,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop)
                Text(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxWidth(),
                    color = MaterialTheme.colorScheme.secondary,
                    text = lugar.nombre.uppercase(),
                    fontSize = 30.sp,
                    style = TextStyle(
                        lineHeight = 30.sp
                    ),
                    fontWeight = FontWeight.Bold,
                )
            }

            Text(
                text = "Descripción",
                modifier = Modifier
                    .padding(top = 15.dp),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = lugar.descripcion,
                modifier = Modifier
                    .padding(top = 3.dp)
                    .padding(bottom = 20.dp),
                color = MaterialTheme.colorScheme.primary,
                fontSize = 14.sp,
                style = TextStyle(
                    lineHeight = 15.sp
                )
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LugarCardPreview(){
    NatureAppTheme{
        LugarCard(lugar = Lugar.lugares.get(0))
    }
}