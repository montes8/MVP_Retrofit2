package com.example.tayler_gabbi.mvp_retrofit2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto
import kotlinx.android.synthetic.main.activity_detalle_producto.*

class DetalleProductoActivity : AppCompatActivity() {

    companion object {
        const val PRODUCTO_PARAM = "producto"
        const val PRODCUTO_ACTULIZAR = "productoactulizar"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_producto)

        val detallesProducto = intent.getParcelableExtra<Producto>(PRODUCTO_PARAM)
        nombre_producto_detalle.text = detallesProducto.nombre
        precio_producto_detalle.text = "$/ "+detallesProducto.precio.toString()
        stock_detalle_producto.text = detallesProducto.stock.toString()
        lote_producto_detalle.text = detallesProducto.lote.toString()
        detalle_producto_detalle.text = detallesProducto.descripcion
    }
}
