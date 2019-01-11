package com.example.tayler_gabbi.mvp_retrofit2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.tayler_gabbi.mvp_retrofit2.model.SplashPresenterImpl
import com.example.tayler_gabbi.mvp_retrofit2.presenter.SplashPresenter
import com.example.tayler_gabbi.mvp_retrofit2.view.SplashView
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(),SplashView {

    var splashPresenter: SplashPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val anima : Animation
        val anima2 : Animation

        anima = AnimationUtils.loadAnimation(this, R.anim.ani_arriba)
        anima2 = AnimationUtils.loadAnimation(this, R.anim.ani_abajo)
        once.animation=anima
        doce.animation=anima2
        splashPresenter = SplashPresenterImpl(this)
        splashPresenter!!.splashExist()
    }

    override fun SplashSuccesView() {
        val i = Intent(baseContext, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}
