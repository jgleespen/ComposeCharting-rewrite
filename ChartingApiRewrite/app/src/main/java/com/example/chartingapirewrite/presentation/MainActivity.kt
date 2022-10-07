package com.example.chartingapirewrite.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chartingapirewrite.presentation.architecture.Router
import com.example.chartingapirewrite.presentation.theme.ChartingApiRewriteTheme
import com.example.chartingapirewrite.utils.Screen
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalAnimationApi
@AndroidEntryPoint
class MainActivity : ComponentActivity(), Router<MainDestination> {

	lateinit var navController : NavHostController

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ChartingApiRewriteTheme {
				// A surface container using the 'background' color from the theme
				navController = rememberNavController()

				NavHost(
					navController = navController,
					startDestination = Screen.Chart.route
				) {
					composable(
						route = Screen.Chart.route
					){

					}
				}
			}
		}
	}

	override fun routeTo(destination: MainDestination) {
		TODO("Not yet implemented")
	}
}
