package com.example.tayler_gabbi.mvp_retrofit2.presenter

import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto

interface DetallePresenter {

    fun eliminarProductoPresenter(producto: Producto)

    fun actualizarproductopresenter(producto: Producto)
}