package com.example.tayler_gabbi.mvp_retrofit2.intteractores

import com.example.tayler_gabbi.mvp_retrofit2.api.ProductoService
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.DetalleInteractor
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnDetalleFinishListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetalleInteractorImpl : DetalleInteractor {
    override fun eliminarProducto(producto: Producto,listener : OnDetalleFinishListener) {
        val eliminarproductoCallback = ProductoService.create().eliminar(producto.id!!.toInt())
        eliminarproductoCallback.enqueue(object : Callback<Producto> {
            override fun onResponse(call: Call<Producto>?, response: Response<Producto>?) {

            }

            override fun onFailure(call: Call<Producto>?, t: Throwable?) {

            }
        })

        listener.productoEliminado()
    }

    override fun actualizarproducto(producto: Producto, listener: OnDetalleFinishListener) {
        listener.actulizaProducto(producto)
    }
}