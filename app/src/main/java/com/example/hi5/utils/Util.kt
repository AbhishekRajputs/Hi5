package com.example.hi5.utils

import android.content.Intent
import android.view.View
import android.widget.Toast
import com.example.hi5.base.BaseActivity


fun BaseActivity.openActivity(otherActivityClass: Class<*>?) {
    val intent = Intent(this, otherActivityClass)
    startActivity(intent)
}


fun BaseActivity.showToast(message: Any) {
    Toast.makeText(this, message.toString(), Toast.LENGTH_SHORT).show()
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}