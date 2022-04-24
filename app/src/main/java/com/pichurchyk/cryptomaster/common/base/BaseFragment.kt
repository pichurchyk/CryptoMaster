package com.pichurchyk.cryptomaster.common.base

import android.view.View
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.pichurchyk.cryptomaster.util.view.hideKeyboard
import com.pichurchyk.cryptomaster.util.view.showKeyboard
import com.pichurchyk.cryptomaster.util.view.snackbar

abstract class BaseFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {

    fun snackbar(view: View, @StringRes messageStringRes: Int) = requireContext().snackbar(view, messageStringRes)

    fun showKeyboard(view: View) = requireContext().showKeyboard(view)
    fun hideKeyboard(view: View) = requireContext().hideKeyboard(view)

}