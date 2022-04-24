package com.pichurchyk.cryptomaster.util.view

import android.content.Context
import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.pichurchyk.cryptomaster.R

fun Context.snackbar(view: View, messageStringRes: Int) {
    if (view.isAttachedToWindow) {
        val color = R.color.colorPrimary
        val actionColor = R.color.colorSecondary
        val snackbar = Snackbar.make(view, getString(messageStringRes), Snackbar.LENGTH_INDEFINITE)
            .setActionTextColor(ContextCompat.getColor(applicationContext, actionColor))
            .setAction(getString(R.string.close)) { }
        snackbar.view.setBackgroundColor(ContextCompat.getColor(applicationContext, color))
        snackbar.show()
    }
}