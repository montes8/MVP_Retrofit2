package com.example.tayler_gabbi.mvp_retrofit2.model

import com.example.tayler_gabbi.mvp_retrofit2.interfaces.FormularioInteractor
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnFormularioFinishListener
import com.example.tayler_gabbi.mvp_retrofit2.intteractores.FormularioInteractorImpl
import com.example.tayler_gabbi.mvp_retrofit2.presenter.FormularioPresenter

class FormularioPresenterImpl : FormularioPresenter,OnFormularioFinishListener {


    var interactorformulario : FormularioInteractor = FormularioInteractorImpl()

    override fun validarGuardarProducto(nombre: String, precio: Double, lote: Int, stock: Int, descripcion: String) {

        interactorformulario.guardarProducto(nombre,precio,lote,stock,descripcion,this)
    }

    override fun validarActulizarproducto(id: Int, nombre: String, precio: Double, lote: Int, stock: Int, descripcion: String) {
        interactorformulario.actualizarProducto(id,nombre,precio,lote,stock,descripcion,this)
    }


    override fun productoGuardado() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun productoGuardadoError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun productoActualizado() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun productoActualizadoError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}