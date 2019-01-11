package com.example.tayler_gabbi.mvp_retrofit2.presenter

interface FormularioPresenter {

    fun validarGuardarProducto(nombre : String, precio : Double , lote : Int ,stock : Int , descripcion : String)

    fun validarActulizarproducto(id : Int,nombre : String, precio : Double , lote : Int ,stock : Int , descripcion : String)
}