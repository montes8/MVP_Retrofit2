package com.example.tayler_gabbi.mvp_retrofit2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto
import com.example.tayler_gabbi.mvp_retrofit2.model.DetallePresenterImpl
import com.example.tayler_gabbi.mvp_retrofit2.presenter.DetallePresenter
import com.example.tayler_gabbi.mvp_retrofit2.view.DetalleView
import kotlinx.android.synthetic.main.activity_detalle_producto.*

class DetalleProductoActivity : AppCompatActivity(),DetalleView {

    var detallePresenter : DetallePresenter? = null


    companion object {
        const val PRODUCTO_PARAM = "producto"
        const val PRODCUTO_ACTULIZAR = "productoactulizar"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_producto)

        val detallesProducto = intent.getParcelableExtra<Producto>(PRODUCTO_PARAM)
        detallePresenter = DetallePresenterImpl(this)

        nombre_producto_detalle.text = detallesProducto.nombre
        precio_producto_detalle.text = "$/ "+detallesProducto.precio.toString()
        stock_detalle_producto.text = detallesProducto.stock.toString()
        lote_producto_detalle.text = detallesProducto.lote.toString()
        detalle_producto_detalle.text = detallesProducto.descripcion

        button_eliminar.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(this@DetalleProductoActivity)
            dialogBuilder.setTitle("Eliminar")
            dialogBuilder.setPositiveButton("SI") { dialog, which ->
                detallePresenter!!.eliminarProductoPresenter(detallesProducto)

            }

            dialogBuilder.setNegativeButton("NO") { dialog, which ->

            }

            dialogBuilder.show()
        }

        button_actualizar.setOnClickListener {
            detallePresenter!!.actualizarproductopresenter(detallesProducto)
        }


    }

    override fun productoEliminadoListo() {
        Toast.makeText(this@DetalleProductoActivity,"producto Eliminado",Toast.LENGTH_LONG).show()
        finish()
    }

    override fun eliminarErrorProductoListo() {

        Toast.makeText(this@DetalleProductoActivity,"Error al Eliminar producto",Toast.LENGTH_LONG).show()
    }

    override fun eliminarErrorListo() {

        Toast.makeText(this@DetalleProductoActivity,"Error al Eliminar",Toast.LENGTH_LONG).show()
    }

    override fun actulizaProductoListo(producto: Producto) {
        val intent = Intent(this@DetalleProductoActivity,FormularioProductoActivity::class.java)
        intent.putExtra(PRODCUTO_ACTULIZAR,producto)
        startActivity(intent)
    }
}
