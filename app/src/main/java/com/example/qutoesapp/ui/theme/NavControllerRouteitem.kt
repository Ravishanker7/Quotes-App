package com.example.qutoesapp.ui.theme

sealed class NavControllerRouteitem (val Route : String){

    object splashScreen : NavControllerRouteitem("Splash_Screen")
    object QuoteList : NavControllerRouteitem("Quote_List")
    object QuoteListDetailsScreen : NavControllerRouteitem("QuoteList_Details_Screen")
}