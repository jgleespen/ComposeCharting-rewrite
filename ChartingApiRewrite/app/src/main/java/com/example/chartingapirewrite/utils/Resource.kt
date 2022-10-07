package com.example.chartingapirewrite.utils

sealed class Resource<TypeOfData>(open val data : TypeOfData?) {
	data class Success<TypeOfData>(override val data:TypeOfData) : Resource<TypeOfData>(data)
	data class Error<TypeOfData> (override val data : TypeOfData? = null) : Resource<TypeOfData>(data)


}