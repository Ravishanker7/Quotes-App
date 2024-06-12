package com.example.qutoesapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.qutoesapp.Screens.CategoryScreen
import com.example.qutoesapp.Screens.Quote
import com.example.qutoesapp.Screens.QuoteDetails_Screen
import com.example.qutoesapp.Screens.SplashScreen
import com.example.qutoesapp.ui.theme.NavControllerRouteitem

@Composable
fun NavContoller(navHostController: NavHostController){

    NavHost(navController = navHostController, startDestination = NavControllerRouteitem.splashScreen.Route ) {
        composable(NavControllerRouteitem.splashScreen.Route){
            SplashScreen(navHostController)
        }
        composable(NavControllerRouteitem.QuoteList.Route){
            CategoryScreen(navHostController)
        }
        composable(NavControllerRouteitem.QuoteListDetailsScreen.Route){
            QuoteDetails_Screen(navHostController)
        }

    }
}