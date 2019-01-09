package com.example.tayler_gabbi.mvp_retrofit2.intteractores

import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnSplashFinishListener
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.SplashInteractor

class SplashInteractorImpl: SplashInteractor {
    override fun actionSplash(listener: OnSplashFinishListener) {

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep((3*1000).toLong())
                    listener.splashSucces()
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }
        background.start()
    }
}