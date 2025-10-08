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
import com.miui.theme.custom.R

/**
 * 一个不可变的数据类，用于存储应用程序的颜色配置。
 *
 * @property primary 主色调。
 * @property background 背景颜色。
 * @property backgroundLight 浅色背景颜色。
 * @property backgroundDark 深色背景颜色。
 * @property absoluteWhite 绝对白色。
 * @property absoluteBlack 绝对黑色。
 * @property white 白色。
 * @property white12 透明度为12%的白色。
 * @property white56 透明度为56%的白色。
 * @property white70 透明度为70%的白色。
 * @property black 黑色。
 * @property gray21 21%灰度的灰色。
 * @property bug 对应“bug”类型的颜色。
 * @property dark 对应“dark”类型的颜色。
 * @property dragon 对应“dragon”类型的颜色。
 * @property electric 对应“electric”类型的颜色。
 * @property fairy 对应“fairy”类型的颜色。
 * @property fire 对应“fire”类型的颜色。
 * @property fighting 对应“fighting”类型的颜色。
 * @property flying 对应“flying”类型的颜色。
 * @property ghost 对应“ghost”类型的颜色。
 * @property steel 对应“steel”类型的颜色。
 * @property ice 对应“ice”类型的颜色。
 * @property poison 对应“poison”类型的颜色。
 * @property psychic 对应“psychic”类型的颜色。
 * @property rock 对应“rock”类型的颜色。
 * @property water 对应“water”类型的颜色。
 * @property grass 对应“grass”类型的颜色。
 * @property ground 对应“ground”类型的颜色。
 * @property orange 橙色。
 * @property green 绿色。
 * @property blue 蓝色。
 */
@Immutable
data class AppColors(
    val primary: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val textHint: Color,
    val background: Color,
    val backgroundLight: Color,
    val backgroundDark: Color,
    val absoluteWhite: Color,
    val absoluteBlack: Color,
    val white: Color,
    val white12: Color,
    val white56: Color,
    val white70: Color,
    val black: Color,
    val gray21: Color,
    val bug: Color,
    val dark: Color,
    val dragon: Color,
    val electric: Color,
    val fairy: Color,
    val fire: Color,
    val fighting: Color,
    val flying: Color,
    val ghost: Color,
    val steel: Color,
    val ice: Color,
    val poison: Color,
    val psychic: Color,
    val rock: Color,
    val water: Color,
    val grass: Color,
    val ground: Color,
    val orange: Color,
    val green: Color,
    val blue: Color,
) {
    companion object {
        /**
         * Provides the default colors for the light mode of the app.
         *
         * @return A [AppColors] instance holding our color palette.
         */
        @Composable
        fun defaultDarkColors(): AppColors =
            AppColors(
                primary = colorResource(id = R.color.colorPrimary),
                textPrimary = colorResource(id = R.color.text_primary_dark),
                textSecondary = colorResource(id = R.color.text_secondary_dark),
                textHint = colorResource(id = R.color.text_hint_dark),
                background = colorResource(id = R.color.background_dark),
                backgroundLight = colorResource(id = R.color.background800_dark),
                backgroundDark = colorResource(id = R.color.background900_dark),
                absoluteWhite = colorResource(id = R.color.white),
                absoluteBlack = colorResource(id = R.color.black),
                white = colorResource(id = R.color.white_dark),
                white12 = colorResource(id = R.color.white_12_dark),
                white56 = colorResource(id = R.color.white_56_dark),
                white70 = colorResource(id = R.color.white_70_dark),
                black = colorResource(id = R.color.black_dark),
                gray21 = colorResource(id = R.color.gray_21),
                bug = colorResource(id = R.color.bug),
                dark = colorResource(id = R.color.dark),
                dragon = colorResource(id = R.color.dragon),
                electric = colorResource(id = R.color.electric),
                fairy = colorResource(id = R.color.fairy),
                fire = colorResource(id = R.color.fire),
                fighting = colorResource(id = R.color.fighting),
                flying = colorResource(id = R.color.flying),
                ghost = colorResource(id = R.color.ghost),
                steel = colorResource(id = R.color.steel),
                ice = colorResource(id = R.color.ice),
                poison = colorResource(id = R.color.poison),
                psychic = colorResource(id = R.color.psychic),
                rock = colorResource(id = R.color.rock),
                water = colorResource(id = R.color.water),
                grass = colorResource(id = R.color.grass),
                ground = colorResource(id = R.color.ground),
                orange = colorResource(id = R.color.orange),
                green = colorResource(id = R.color.green),
                blue = colorResource(id = R.color.blue),
            )

        /**
         * Provides the default colors for the light mode of the app.
         *
         * @return A [AppColors] instance holding our color palette.
         */
        @Composable
        fun defaultLightColors(): AppColors =
            AppColors(
                primary = colorResource(id = R.color.colorPrimary),
                textPrimary = colorResource(id = R.color.text_primary),
                textSecondary = colorResource(id = R.color.text_secondary),
                textHint = colorResource(id = R.color.text_hint),
                background = colorResource(id = R.color.background),
                backgroundLight = colorResource(id = R.color.background800),
                backgroundDark = colorResource(id = R.color.background900),
                absoluteWhite = colorResource(id = R.color.white),
                absoluteBlack = colorResource(id = R.color.black),
                white = colorResource(id = R.color.white),
                white12 = colorResource(id = R.color.white_12),
                white56 = colorResource(id = R.color.white_56),
                white70 = colorResource(id = R.color.white_70),
                black = colorResource(id = R.color.black),
                gray21 = colorResource(id = R.color.gray_21),
                bug = colorResource(id = R.color.bug),
                dark = colorResource(id = R.color.dark),
                dragon = colorResource(id = R.color.dragon),
                electric = colorResource(id = R.color.electric),
                fairy = colorResource(id = R.color.fairy),
                fire = colorResource(id = R.color.fire),
                fighting = colorResource(id = R.color.fighting),
                flying = colorResource(id = R.color.flying),
                ghost = colorResource(id = R.color.ghost),
                steel = colorResource(id = R.color.steel),
                ice = colorResource(id = R.color.ice),
                poison = colorResource(id = R.color.poison),
                psychic = colorResource(id = R.color.psychic),
                rock = colorResource(id = R.color.rock),
                water = colorResource(id = R.color.water),
                grass = colorResource(id = R.color.grass),
                ground = colorResource(id = R.color.ground),
                orange = colorResource(id = R.color.orange),
                green = colorResource(id = R.color.green),
                blue = colorResource(id = R.color.blue),
            )
    }
}
