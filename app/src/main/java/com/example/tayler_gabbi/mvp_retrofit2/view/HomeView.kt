package com.example.tayler_gabbi.mvp_retrofit2.view

import android.content.Intent
import com.example.tayler_gabbi.mvp_retrofit2.MainActivity
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto

interface HomeView {

    fun cargarProductos()

    fun listaError()

    fun CargarError()

    fun pasarDetalle(producto: Producto)

}