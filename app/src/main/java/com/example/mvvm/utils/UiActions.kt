package com.example.mvvm.utils

interface UiActions {

    fun toast(message: String)

    fun getString(messageRes: Int, vararg args: Any): String
}