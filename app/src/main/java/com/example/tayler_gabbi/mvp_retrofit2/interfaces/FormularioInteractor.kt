package com.example.tayler_gabbi.mvp_retrofit2.interfaces

interface FormularioInteractor {

    fun guardarProducto(nombre : String, precio : Double , lote : Int ,stock : Int , descripcion : String , listener : OnFormularioFinishListener)

    fun actualizarProducto(nombre : String, precio : Double , lote : Int ,stock : Int , descripcion : String,listener : OnFormularioFinishListener)
}