/*
 * Copyright © 2025. 贵州君城网络科技有限公司 版权所有
 * 保留所有权利。
 *
 * 本软件（包括但不限于代码、文档、资源文件等）受《中华人民共和国著作权法》及相关法律法规保护。
 * 未经本公司书面授权，任何单位或个人不得：
 * 1. 以任何形式复制、传播、修改、分发本软件的全部或部分内容；
 * 2. 将本软件用于商业目的或未经授权的第三方项目；
 * 3. 删除或篡改本软件中的版权声明、商标标识及技术标识。
 *
 * 违反上述条款者，本公司将依法追究其民事及刑事责任，并有权要求赔偿因此造成的全部经济损失。
 *
 * 授权许可请联系：贵州君城网络科技有限公司法律事务部
 * 邮箱：1755858138@qq.com
 * 电话：+86-175-85074415
 */

@file:OptIn(ExperimentalComposeUiApi::class)

package com.miui.theme.custom.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId


/**
 * 用于将各种属性连接到我们的组件以进行样式设置的本地提供者。
 */
private val LocalColors =
    compositionLocalOf<AppColors> {
        // 如果未提供颜色，抛出错误提示，确保所有 App 组件的使用都被包裹在 AppTheme 中
        error("No colors provided! Make sure to wrap all usages of App components in AppTheme.")
    }

/**
 * 应用背景主题的CompositionLocal提供者
 * 默认使用[AppBackground]的默认参数值
 */
private val LocalBackgroundTheme: ProvidableCompositionLocal<AppBackground> =
    staticCompositionLocalOf { AppBackground() }

/**
 * 应用字体主题的CompositionLocal提供者
 * 默认使用[AppTypography]的默认参数值
 */
private val LocalTypography =
    staticCompositionLocalOf<AppTypography> {
        error("No typography provided!")
    }

/**
 * 应用主题的组合函数，用于设置应用的整体主题样式。
 *
 * @param darkTheme 是否使用深色主题，默认为系统的深色主题设置。
 * @param colors 应用的颜色配置，根据深色主题设置选择默认的深色或浅色颜色。
 * @param background 应用的背景配置，根据深色主题设置选择默认的背景。
 * @param baseScreenWidth 基础屏幕宽度，用于自定义密度设置。
 * @param content 主题内的内容组合函数。
 */
@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    colors: AppColors =
        if (darkTheme) {
            AppColors.defaultDarkColors()
        } else {
            AppColors.defaultLightColors()
        },
    typography: AppTypography = AppTypography.defaultTypography(),
    background: AppBackground = AppBackground.defaultBackground(darkTheme),
    baseScreenWidth: Int = 375,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalBackgroundTheme provides background,
        LocalTypography provides typography,
    ) {
        CustomDensityProvider(
            baseScreenWidth = baseScreenWidth,
        ) {
            Box(
                modifier =
                    Modifier
                        .background(background.color)
                        .semantics { testTagsAsResourceId = true },
            ) {
                content()
            }
        }
    }
}

/**
 * 包含用于样式化和自定义应用外观和感觉的不同属性的便捷访问器。
 */
object AppTheme {
    /**
     * 获取调用点所在层次结构中的当前 [AppColors]。
     */
    val colors: AppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    /**
     * 获取调用点所在层次结构中的当前 [AppBackground]。
     */
    val background: AppBackground
        @Composable
        @ReadOnlyComposable
        get() = LocalBackgroundTheme.current

    /**
     * 定义应用的标准字体样式
     * @param displayLarge 用于显示大标题的文本样式：
     * 字体大小为 32sp，字体粗细为 Bold，行高为 32 * 1.25sp。
     * @param titleLarge 用于显示大标题的文本样式：
     * 字体大小为 24sp，字体粗细为 Bold，行高为 24 * 1.25sp。
     * @param titleMedium 用于显示中等标题的文本样式：
     * 字体大小为 20sp，字体粗细为 SemiBold，行高为 20 * 1.25sp。
     * @param titleSmall 用于显示小标题的文本样式：
     * 字体大小为 18sp，字体粗细为 SemiBold，行高为 18 * 1.25sp。
     * @param bodyLarge 用于显示大正文的文本样式：
     * 字体大小为 16sp，字体粗细为 Normal，行高为 16 * 1.25sp。
     * @param bodyMedium 用于显示中等正文的文本样式：
     * 字体大小为 14sp，字体粗细为 Normal，行高为 14 * 1.25sp。
     * @param bodySmall 用于显示小正文的文本样式：
     * 字体大小为 12sp，字体粗细为 Normal，行高为 12 * 1.25sp。
     * @param labelLarge 用于显示大标签的文本样式：
     * 字体大小为 12sp，字体粗细为 Medium，行高为 12 * 1.25sp。
     * @param labelMedium 用于显示中等标签的文本样式：
     * 字体大小为 10sp，字体粗细为 Medium，行高为 10 * 1.25sp。
     * @param labelSmall 用于显示小标签的文本样式：
     * 字体大小为 10sp，字体粗细为 Medium，行高为 14sp。
     */
    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}
