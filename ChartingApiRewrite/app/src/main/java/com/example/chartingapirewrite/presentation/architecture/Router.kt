package com.example.chartingapirewrite.presentation.architecture

interface Destination

interface Router<TypeOfDestination : Destination> {
	fun routeTo(destination : TypeOfDestination)
}