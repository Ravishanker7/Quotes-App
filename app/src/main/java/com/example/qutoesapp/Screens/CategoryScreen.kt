package com.example.qutoesapp.Screens

import android.content.pm.ModuleInfo
import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qutoesapp.R
import com.example.qutoesapp.getList
import com.example.qutoesapp.ui.theme.primaryColor
import com.example.qutoesapp.ui.theme.primaryLight

@Preview
@Composable
fun CategoryScreen() {
    Surface {
        Box (modifier = Modifier
            .fillMaxSize()
            .background(color = primaryColor)){
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .size(50.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = primaryLight
                        ),
                        shape = RoundedCornerShape(80.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1),
                                contentDescription = null
                            )
                        }
                    }
                    Text(
                        text = "Category ", color = Color.White,
                        fontStyle = FontStyle.Normal, fontWeight = FontWeight.SemiBold,
                        fontSize = 25.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                }
                LazyColumn (modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)){
                    items(getList()) {
                        categorylist(it.title.toString())
                    }
                }
            }
        }
    }
}

@Composable
fun categorylist(title : String){

        Card(modifier = Modifier
            .height(50.dp)
            .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = primaryLight
            )) {
            Box (modifier = Modifier.fillMaxWidth()
                .padding(10.dp), contentAlignment = Alignment.Center){
                Text(text = "$title", color = Color.White,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp)
            }
        }

    Spacer(modifier = Modifier.height(20.dp))
}