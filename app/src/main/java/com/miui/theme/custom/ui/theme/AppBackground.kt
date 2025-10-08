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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.miui.theme.custom.R

/**
 * 应用背景主题配置数据类
 * @param color 背景颜色，默认未指定（使用系统默认背景色）
 * @param tonalElevation 材质Elevation效果，默认未指定
 */
@Immutable
data class AppBackground(
    val color: Color = Color.Unspecified,
    val tonalElevation: Dp = Dp.Unspecified,
) {
    companion object {
        /**
         * 创建默认背景配置
         * @param darkTheme 是否使用暗色主题
         * @return 根据主题定制的背景配置对象
         */
        @Composable
        fun defaultBackground(darkTheme: Boolean): AppBackground =
            if (darkTheme) {
                AppBackground(
                    color = colorResource(id = R.color.background_dark),
                    tonalElevation = 0.dp,
                )
            } else {
                AppBackground(
                    color = colorResource(id = R.color.background),
                    tonalElevation = 0.dp,
                )
            }
    }
}
