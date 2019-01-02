package com.example.tayler_gabbi.mvp_retrofit2.presenter

import android.support.v7.widget.RecyclerView
import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter

interface HomePresenter {

    fun cargarProductos(adapter : ListaProductoAdapter,recyclerView: RecyclerView)
}