package com.liuxi.skin.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jaeger.library.StatusBarUtil

/**
 *
 * @Author liuxi
 *
 * @Email xiaoxixizhizhi@gmail.com
 *
 */
open abstract class BaseActivity : AppCompatActivity() {

    abstract fun getLayoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutRes())
        StatusBarUtil.setTranslucent(this)//需要在setContentView()之后调用
//        StatusBarUtil.setDarkMode(this)
//        StatusBarUtil.setLightMode(this)
//        StatusBarUtil.setTransparent(this)
    }


}