package com.example.tayler_gabbi.mvp_retrofit2.intteractores

import com.example.tayler_gabbi.mvp_retrofit2.api.ProductoService
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.FormularioInteractor
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnFormularioFinishListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FormularioInteractorImpl : FormularioInteractor {

    override fun guardarProducto(nombre: String, precio: Double, lote: Int, stock: Int, descripcion: String, listener: OnFormularioFinishListener) {
        val producto = Producto(0, nombre, precio, lote, stock, descripcion)
        val guardarProducto = ProductoService.create().registrar(producto)

        guardarProducto.enqueue(object : Callback<Void> {

            override fun onResponse(call: Call<Void>, response: Response<Void>) {
              listener.productoGuardado()
            }
            override fun onFailure(call: Call<Void>, t: Throwable) {
                listener.productoGuardadoError()
            }
        })
    }

    override fun actualizarProducto(idactulisar: Int ,nombreactulizar: String, precioactulaizar: Double, loteactulizar: Int, stockactulizar: Int, descripcionactulizar: String, listener: OnFormularioFinishListener) {

        val productoactulizado = Producto(0, nombreactulizar, precioactulaizar, loteactulizar, stockactulizar, descripcionactulizar)
        val actulizarproducto = ProductoService.create().actualizar(idactulisar!!,productoactulizado)
        actulizarproducto.enqueue(object :Callback<Void>{
            override fun onResponse(call: Call<Void>?, response: Response<Void>?) {
                listener.productoActualizado()
            }
            override fun onFailure(call: Call<Void>?, t: Throwable?) {
                listener.productoActualizadoError()
            }
        })
    }
}