package com.liuxi.skin.demo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_setting.*
import skin.support.SkinCompatManager
import skin.support.content.res.SkinCompatUserThemeManager

/**
 *
 * @Author liuxi
 *
 * @Email xiaoxixizhizhi@gmail.com
 *
 */
class SettingActivity : BaseActivity() {

    override fun getLayoutRes(): Int {
        return R.layout.activity_setting
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        normal.setOnClickListener {
            clear()
            SkinCompatManager.getInstance().restoreDefaultTheme()
        }
        night.setOnClickListener {
            clear()
            SkinCompatManager.getInstance().loadSkin("night", SkinCompatManager.SKIN_LOADER_STRATEGY_BUILD_IN)
        }
        red.setOnClickListener {
            clear()
            SkinCompatUserThemeManager.get().addColorState(R.color.colorPrimary, "#ef4b3e")
            SkinCompatUserThemeManager.get().apply()
            SkinCompatManager.getInstance().loadSkin("night", SkinCompatManager.SKIN_LOADER_STRATEGY_BUILD_IN)

        }
    }

    private fun clear() {
        SkinCompatUserThemeManager.get().clearColors()
        SkinCompatUserThemeManager.get().clearDrawables()
    }
}
