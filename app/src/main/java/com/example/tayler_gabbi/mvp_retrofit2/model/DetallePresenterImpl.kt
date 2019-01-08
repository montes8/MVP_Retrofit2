package com.example.tayler_gabbi.mvp_retrofit2.model

import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.DetalleInteractor
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnDetalleFinishListener
import com.example.tayler_gabbi.mvp_retrofit2.intteractores.DetalleInteractorImpl
import com.example.tayler_gabbi.mvp_retrofit2.presenter.DetallePresenter
import com.example.tayler_gabbi.mvp_retrofit2.view.DetalleView

class DetallePresenterImpl(private val detalleView : DetalleView): DetallePresenter , OnDetalleFinishListener{
  

    var detalleInteractor : DetalleInteractor = DetalleInteractorImpl()

    override fun eliminarProductoPresenter(producto: Producto) {
        if (detalleView != null){

        }
        detalleInteractor.eliminarProducto(producto,this)
    }

    override fun actualizarproductopresenter(producto: Producto) {
        detalleInteractor.actualizarproducto(producto,this)
    }



}