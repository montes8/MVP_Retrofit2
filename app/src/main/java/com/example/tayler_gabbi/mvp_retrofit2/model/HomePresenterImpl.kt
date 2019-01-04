package com.example.tayler_gabbi.mvp_retrofit2.model

import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.HomeInteractor
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnHomeFinishListener
import com.example.tayler_gabbi.mvp_retrofit2.intteractores.HomeInteractorImpl
import com.example.tayler_gabbi.mvp_retrofit2.presenter.HomePresenter
import com.example.tayler_gabbi.mvp_retrofit2.view.HomeView

class HomePresenterImpl (private val  homeView: HomeView): HomePresenter,OnHomeFinishListener {



    var homeInteractor : HomeInteractor = HomeInteractorImpl()

    override fun cargarProductos(adapter: ListaProductoAdapter) {

        if (homeView != null){

        }
        homeInteractor.cargarLista(adapter,this)
    }

    override fun pasarActivityDetalle(adapter: ListaProductoAdapter) {
        homeInteractor.pasarActivity(adapter,this)
    }


    override fun pasarOtroActivity(producto: Producto) {
        if (homeView != null){
            homeView.pasarDetalle(producto)
        }
    }

    override fun cargarProductosListener() {
        if (homeView != null){
            homeView.cargarProductos()
        }
    }

    override fun listaErrorListener() {
        if (homeView != null){
            homeView.listaError()
        }
    }

    override fun CargarErrorListener() {
        if (homeView != null){
            homeView.CargarError()
        }
    }
}