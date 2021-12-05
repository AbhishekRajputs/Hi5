package com.example.hi5.base

import android.app.Application

/**
 * @author Pardeep Singh
 */
class BaseApp : Application() {
    companion object {
        private lateinit var INSTANCE: BaseApp
        fun getContext(): BaseApp {
            return this.INSTANCE!!
        }
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}