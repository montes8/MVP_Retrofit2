package com.example.tayler_gabbi.mvp_retrofit2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DetalleProductoActivity : AppCompatActivity() {

    companion object {
        const val PRODUCTO_PARAM = "producto"
        const val PRODCUTO_ACTULIZAR = "productoactulizar"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_producto)
    }
}
