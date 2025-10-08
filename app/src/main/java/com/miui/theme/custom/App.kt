package com.miui.theme.custom

import android.app.Application
import com.miui.theme.custom.di.modules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    modules,
                )
            )
        }
    }
}