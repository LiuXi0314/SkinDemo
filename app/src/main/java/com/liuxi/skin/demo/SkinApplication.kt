package com.liuxi.skin.demo

import android.app.Application
import skin.support.SkinCompatManager
import skin.support.app.SkinAppCompatViewInflater
import skin.support.design.app.SkinMaterialViewInflater

/**
 *
 * @Author liuxi
 *
 * @Email xiaoxixizhizhi@gmail.com
 *
 */
class SkinApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SkinCompatManager.withoutActivity(this)
            .addInflater(SkinAppCompatViewInflater())
            .addInflater(SkinMaterialViewInflater())
            .loadSkin()
    }
}