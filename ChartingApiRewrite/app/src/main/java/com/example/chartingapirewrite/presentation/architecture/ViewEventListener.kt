package com.example.chartingapirewrite.presentation.architecture

import java.lang.reflect.Type

interface ViewEvent

interface ViewEventListener<TypeOfViewEvent: ViewEvent> {
	fun onEvent(event : TypeOfViewEvent)
	fun onEventDebounced(event : TypeOfViewEvent)
	fun TypeOfViewEvent.push()
}