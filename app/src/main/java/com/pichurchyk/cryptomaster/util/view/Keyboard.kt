package com.pichurchyk.cryptomaster.util.view

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

private fun Context.getInputMethodManager(): InputMethodManager {
    return getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
}

fun Context.hideKeyboard(view: View) {
    getInputMethodManager().hideSoftInputFromWindow(view.windowToken, 0)
}

fun Context.showKeyboard(view: View) {
    if (view.requestFocus()) getInputMethodManager().showSoftInput(view, InputMethodManager.SHOW_FORCED)
}