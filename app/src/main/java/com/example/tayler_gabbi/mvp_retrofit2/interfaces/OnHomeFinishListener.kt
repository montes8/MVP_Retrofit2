package com.example.tayler_gabbi.mvp_retrofit2.interfaces

import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto


interface OnHomeFinishListener {

    fun cargarProductosListener()

    fun listaErrorListener()

    fun CargarErrorListener()

    fun pasarOtroActivity(producto: Producto)

}