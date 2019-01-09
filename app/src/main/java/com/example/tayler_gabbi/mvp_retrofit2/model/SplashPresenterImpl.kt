package com.example.tayler_gabbi.mvp_retrofit2.model

import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnSplashFinishListener
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.SplashInteractor
import com.example.tayler_gabbi.mvp_retrofit2.intteractores.SplashInteractorImpl
import com.example.tayler_gabbi.mvp_retrofit2.presenter.SplashPresenter
import com.example.tayler_gabbi.mvp_retrofit2.view.SplashView

class SplashPresenterImpl(var splashView: SplashView) : SplashPresenter,OnSplashFinishListener {

    var interactorSplash : SplashInteractor = SplashInteractorImpl()
    override fun SplashExist() {
        interactorSplash.actionSplash(this)
    }


    override fun splashSucces() {
        splashView.SplashSuccesView()
    }

}