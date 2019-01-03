package com.example.tayler_gabbi.mvp_retrofit2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.tayler_gabbi.mvp_retrofit2.adapter.ListaProductoAdapter
import com.example.tayler_gabbi.mvp_retrofit2.model.HomePresenterImpl
import com.example.tayler_gabbi.mvp_retrofit2.presenter.HomePresenter
import com.example.tayler_gabbi.mvp_retrofit2.view.HomeView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),HomeView {


    var productoAdapter : ListaProductoAdapter? = null
    var homePresenter : HomePresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productoAdapter = ListaProductoAdapter()
        homePresenter = HomePresenterImpl(this)
        my_recyclerview.layoutManager = LinearLayoutManager(this)
        my_recyclerview.adapter = productoAdapter
        homePresenter!!.cargarProductos(productoAdapter!!,my_recyclerview)

    }
    override fun pasarDetalle() {
        val intent = Intent(this@MainActivity,DetalleProductoActivity::class.java)
        startActivity(intent)
    }


    override fun cargarProductos() {
        Toast.makeText(this@MainActivity, "lista cargada", Toast.LENGTH_SHORT).show()
    }

    override fun listaError() {
        Toast.makeText(this@MainActivity, "Ocurrio un error al cargar lista", Toast.LENGTH_SHORT).show()
    }

    override fun CargarError() {
        Toast.makeText(this@MainActivity, "Ocurrio un error", Toast.LENGTH_SHORT).show()
    }
}
