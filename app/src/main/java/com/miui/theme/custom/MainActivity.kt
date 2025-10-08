package com.miui.theme.custom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.rememberNavController
import com.miui.theme.custom.navigation.IHubComposeNavigator
import com.miui.theme.custom.navigation.LocalComposeNavigator
import com.miui.theme.custom.ui.theme.AppTheme
import org.koin.java.KoinJavaComponent.inject
import kotlin.getValue

class MainActivity : ComponentActivity() {

    val composeNavigator: IHubComposeNavigator by inject(
        clazz = IHubComposeNavigator::class.java,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompositionLocalProvider(
                LocalComposeNavigator provides composeNavigator,
            ) {
                AppTheme {
                    val navHostController = rememberNavController()

                    LaunchedEffect(Unit) {
                        composeNavigator.handleNavigationCommands(navHostController)
                    }

                    AppNavHost(navHostController = navHostController)
                }
            }
        }
    }
}