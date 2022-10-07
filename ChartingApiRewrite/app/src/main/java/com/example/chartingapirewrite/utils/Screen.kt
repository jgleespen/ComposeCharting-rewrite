package com.example.chartingapirewrite.utils

sealed class Screen (val route:String){
	object Chart : Screen("Chart")
}