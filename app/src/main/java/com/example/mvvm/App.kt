package com.example.mvvm

import android.app.Application
import com.example.mvvm.colors.InMemoryColorsRepository

class App: Application() {

    val models = listOf<Any>(
        InMemoryColorsRepository()
    )

}