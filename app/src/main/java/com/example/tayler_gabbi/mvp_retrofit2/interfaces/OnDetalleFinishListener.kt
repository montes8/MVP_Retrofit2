package com.example.tayler_gabbi.mvp_retrofit2.interfaces

import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto

interface OnDetalleFinishListener {

    fun productoEliminado()

    fun eliminarErrorProducto()

    fun eliminarError()

    fun actulizaProducto(producto: Producto)
}