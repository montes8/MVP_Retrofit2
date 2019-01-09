package com.example.tayler_gabbi.mvp_retrofit2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tayler_gabbi.mvp_retrofit2.model.SplashPresenterImpl
import com.example.tayler_gabbi.mvp_retrofit2.presenter.SplashPresenter
import com.example.tayler_gabbi.mvp_retrofit2.view.SplashView

class SplashActivity : AppCompatActivity(),SplashView {

    var splashPresenter: SplashPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashPresenter = SplashPresenterImpl(this)
        splashPresenter!!.splashExist()
    }

    override fun SplashSuccesView() {
        val i = Intent(baseContext, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}
