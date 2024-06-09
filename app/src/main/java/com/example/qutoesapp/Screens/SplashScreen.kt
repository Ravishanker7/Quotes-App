package com.example.qutoesapp.Screens

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.qutoesapp.R
import com.example.qutoesapp.ui.theme.NavControllerRouteitem
import com.example.qutoesapp.ui.theme.primaryColor
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navHostController: NavHostController) {
    var hasTimeout by remember {
        mutableStateOf(false)
    }


    LaunchedEffect(key1 = true) {
        delay(10000)
        hasTimeout=true
    }
    if(!hasTimeout){
        Surface {
            Box (modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor)){
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription =null )
                }
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter){
                    //CircularProgressIndicator(modifier = Modifier.size(50.dp))
                }
            }
        }
    }else{
        navHostController.navigate(NavControllerRouteitem.QuoteList.Route)
    }


}