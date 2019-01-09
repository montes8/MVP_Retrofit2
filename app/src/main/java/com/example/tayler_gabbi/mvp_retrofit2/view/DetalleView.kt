package com.example.tayler_gabbi.mvp_retrofit2.view

import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto

interface DetalleView {


    fun productoEliminadoListo()

    fun eliminarErrorListo()

    fun actulizaProductoListo(producto: Producto)
}