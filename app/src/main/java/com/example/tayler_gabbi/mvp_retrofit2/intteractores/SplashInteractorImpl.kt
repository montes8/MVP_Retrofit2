package com.example.tayler_gabbi.mvp_retrofit2.intteractores

import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnSplashFinishListener
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.SplashInteractor

class SplashInteractorImpl: SplashInteractor {
    override fun actionSplash(listener: OnSplashFinishListener) {
        listener.splashSucces()
    }
}