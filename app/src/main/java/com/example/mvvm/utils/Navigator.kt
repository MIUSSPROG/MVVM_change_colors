package com.example.mvvm.utils

import com.example.mvvm.view.base.BaseScreen

interface Navigator {

    fun launch(screen: BaseScreen)

    fun goBack(result: Any? = null)
}