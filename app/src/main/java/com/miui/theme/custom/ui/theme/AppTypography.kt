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
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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
@Immutable
data class AppTypography(
    val displayLarge: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val bodyLarge: TextStyle,
    val bodyMedium: TextStyle,
    val bodySmall: TextStyle,
    val labelLarge: TextStyle,
    val labelMedium: TextStyle,
    val labelSmall: TextStyle,
) {
    companion object {
        @Composable
        fun defaultTypography(): AppTypography {
            val defaultFontFamily = FontFamily.Default
            val lineHeightMultiplier = 1.25f

            fun textStyle(
                fontSize: Int,
                fontWeight: FontWeight,
                lineHeightFactor: Float = lineHeightMultiplier,
            ) = TextStyle(
                fontFamily = defaultFontFamily,
                fontWeight = fontWeight,
                fontSize = fontSize.sp,
                lineHeight = (fontSize * lineHeightFactor).sp,
            )
            return AppTypography(
                displayLarge = textStyle(32, FontWeight.Bold),
                titleLarge = textStyle(24, FontWeight.Bold),
                titleMedium = textStyle(20, FontWeight.SemiBold),
                titleSmall = textStyle(18, FontWeight.SemiBold),
                bodyLarge = textStyle(16, FontWeight.Normal),
                bodyMedium = textStyle(14, FontWeight.Normal),
                bodySmall = textStyle(12, FontWeight.Normal),
                labelLarge = textStyle(12, FontWeight.Medium),
                labelMedium = textStyle(10, FontWeight.Medium),
                labelSmall = textStyle(10, FontWeight.Medium).copy(lineHeight = 14.sp),
            )
        }
    }
}
