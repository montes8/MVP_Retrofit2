package com.example.tayler_gabbi.mvp_retrofit2.interfaces

import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto

interface DetalleInteractor {

    fun eliminarProducto(producto: Producto,listener : OnDetalleFinishListener )

    fun actualizarproducto(producto: Producto, listener : OnDetalleFinishListener)
}