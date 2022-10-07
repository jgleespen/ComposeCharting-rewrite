package com.example.chartingapirewrite.presentation.architecture

import kotlinx.coroutines.flow.StateFlow

interface ViewState

interface ViewStateSender<TypeOfViewState : ViewState> {
	val viewState: StateFlow<TypeOfViewState?>
}