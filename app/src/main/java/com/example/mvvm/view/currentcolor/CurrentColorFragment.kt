package com.example.mvvm.view.currentcolor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvvm.databinding.FragmentCurrentColorBinding
import com.example.mvvm.view.base.BaseFragment
import com.example.mvvm.view.base.BaseScreen
import com.example.mvvm.view.base.BaseViewModel
import com.example.mvvm.view.base.screenViewModel

class CurrentColorFragment : BaseFragment() {

    class Screen : BaseScreen

    override val viewModel by screenViewModel<CurrentColorViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCurrentColorBinding.inflate(inflater, container, false)

        viewModel.currentColor.observe(viewLifecycleOwner) {
            binding.colorView.setBackgroundColor(it.value)
        }

        binding.changeColorButton.setOnClickListener {
            viewModel.changeColor()
        }

        return binding.root
    }
}