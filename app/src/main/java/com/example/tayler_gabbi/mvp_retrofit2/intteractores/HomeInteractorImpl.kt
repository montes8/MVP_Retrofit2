package com.example.tayler_gabbi.mvp_retrofit2.intteractores


import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import com.example.tayler_gabbi.mvp_retrofit2.DetalleProductoActivity
import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter
import com.example.tayler_gabbi.mvp_retrofit2.api.ProductoService
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.HomeInteractor
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnHomeFinishListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeInteractorImpl : HomeInteractor {


    override fun pasarActivity(adapter: ListaProductoAdapter, listener : OnHomeFinishListener) {

        adapter.onDetalleProductoClick = {
            listener.pasarOtroActivity(it)

        }

    }

    override fun cargarLista(adapter: ListaProductoAdapter, listener : OnHomeFinishListener) {


      val listaCallback = ProductoService.create().obtenerListaProductos()
     listaCallback.enqueue(object : Callback<ArrayList<Producto>> {
         override fun onResponse(call: Call<ArrayList<Producto>>?, response: Response<ArrayList<Producto>>?) {
             if (response?.code() == 200) {

                 val listaproducto = response?.body()
                 if (listaproducto != null) {
                     adapter!!.addList(listaproducto)
                     listener.cargarProductosListener()
                 }
             }else{
                  listener.listaErrorListener()
                // Toast.makeText(this@MainActivity, "Ocurrio un error al obtener la lista (${response?.code()})", Toast.LENGTH_SHORT).show()
             }
         }

         override fun onFailure(call: Call<ArrayList<Producto>>?, t: Throwable?) {
              listener.cargarProductosListener()
             //Toast.makeText(this@MainActivity, "Ocurrio un error", Toast.LENGTH_SHORT).show()
         }
     })
    }

}