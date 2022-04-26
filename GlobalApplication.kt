package com.example.myproject

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        KakaoSdk.init(this, "4b900c4371ca0f6d29dd70c74b64b32d")
    }
}