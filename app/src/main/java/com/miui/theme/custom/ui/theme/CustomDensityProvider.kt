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

package com.miui.theme.custom.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density

/**
 * 提供自定义的屏幕密度和字体缩放比例的 Composable 函数
 *
 * 此函数用于提供自定义的屏幕密度和字体缩放比例，以便在不同的设备上实现一致的 UI 布局和字体大小
 * 它使用 CompositionLocalProvider 来提供 Density，
 * 以便在 Composable 函数树中任何地方都可以访问此自定义的 Density
 *
 * @param baseScreenWidth  基准屏幕宽度（单位：像素）用于计算自定义密度的参考宽度
 * @param content  需要使用自定义密度的 Composable 内容
 *
 * @author:袁培根
 * @date:  2025/3/10 15:00
 */
@Composable
fun CustomDensityProvider(
    baseScreenWidth: Int = 400,
    content: @Composable () -> Unit,
) {
    // 获取当前上下文的 DisplayMetrics
    val displayMetrics = LocalContext.current.resources.displayMetrics
    // 获取当前的字体缩放比例
    val currentFontScale: Float = LocalDensity.current.fontScale
    // 获取屏幕的实际宽度像素
    val actualScreenWidth: Int = displayMetrics.widthPixels

    // 使用 CompositionLocalProvider 提供自定义的密度
    CompositionLocalProvider(
        // 提供自定义的密度
        LocalDensity provides
                Density(
                    // 根据实际屏幕宽度和基准屏幕宽度计算自定义密度
                    density = actualScreenWidth / baseScreenWidth.toFloat(),
                    // 使用当前的字体缩放比例
                    fontScale = currentFontScale,
                ),
    ) {
        // 渲染传入的 Composable 内容
        content()
    }
}
