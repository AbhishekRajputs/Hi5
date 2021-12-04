package com.example.hi5.utils

import android.content.Intent
import com.example.hi5.base.BaseActivity


fun BaseActivity.openActivity(otherActivityClass: Class<*>?) {
    val intent = Intent(this, otherActivityClass)
    startActivity(intent)
}