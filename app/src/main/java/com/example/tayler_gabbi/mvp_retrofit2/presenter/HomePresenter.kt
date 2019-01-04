package com.example.tayler_gabbi.mvp_retrofit2.presenter


import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto

interface HomePresenter {

    fun cargarProductos(adapter : ListaProductoAdapter)

    fun pasarActivityDetalle(adapter : ListaProductoAdapter)
}