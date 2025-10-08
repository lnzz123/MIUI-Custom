package com.miui.theme.custom.di

import com.miui.theme.custom.navigation.AppComposeNavigator
import com.miui.theme.custom.navigation.AppScreen
import com.miui.theme.custom.navigation.IHubComposeNavigator
import org.koin.dsl.module

val modules =
    module {
        single { IHubComposeNavigator() }
        single<AppComposeNavigator<AppScreen>> { get() }
    }