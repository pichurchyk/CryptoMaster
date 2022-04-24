package com.pichurchyk.cryptomaster.ui.splash

import android.os.Bundle
import android.view.View
import com.pichurchyk.cryptomaster.R
import com.pichurchyk.cryptomaster.common.base.BaseFragment
import com.pichurchyk.cryptomaster.common.delegate.viewBinding
import com.pichurchyk.cryptomaster.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment(R.layout.fragment_splash) {
    private val binding: FragmentSplashBinding by viewBinding<FragmentSplashBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}