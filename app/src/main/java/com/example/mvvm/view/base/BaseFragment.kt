package com.example.mvvm.view.base

import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {

    abstract val viewModel: BaseViewModel
}