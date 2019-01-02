package com.example.tayler_gabbi.mvp_retrofit2.intteractores

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter
import com.example.tayler_gabbi.mvp_retrofit2.api.ProductoService
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.HomeInteractor
import com.example.tayler_gabbi.mvp_retrofit2.interfaces.OnHomeFinishListener
import com.example.tayler_gabbi.mvp_retrofit2.presenter.HomePresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeInteractorImpl : HomeInteractor {

    override fun cargarLista(adapter: ListaProductoAdapter, recyclerView: RecyclerView,listener : OnHomeFinishListener) {


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