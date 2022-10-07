package com.example.chartingapirewrite.presentation

import com.example.chartingapirewrite.presentation.architecture.Destination

sealed class MainDestination : Destination {
	data class NavigateExample (
		val name : String
			) : MainDestination()
	object NavigateAllNames : MainDestination()

}