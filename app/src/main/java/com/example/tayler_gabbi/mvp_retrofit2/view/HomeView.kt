package com.example.tayler_gabbi.mvp_retrofit2.view

import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter

interface HomeView {

    fun cargarProductos()

    fun listaError()

    fun CargarError()

    fun pasarDetalle()
}