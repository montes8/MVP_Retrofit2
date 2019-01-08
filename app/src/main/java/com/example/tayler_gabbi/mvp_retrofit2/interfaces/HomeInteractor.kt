package com.example.tayler_gabbi.mvp_retrofit2.interfaces

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto

interface HomeInteractor {

    fun cargarLista(adapter: ListaProductoAdapter,listener : OnHomeFinishListener )

    fun pasarActivity(adapter: ListaProductoAdapter, listener : OnHomeFinishListener)
}