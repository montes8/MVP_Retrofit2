package com.example.tayler_gabbi.mvp_retrofit2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto
import com.example.tayler_gabbi.mvp_retrofit2.model.FormularioPresenterImpl
import com.example.tayler_gabbi.mvp_retrofit2.presenter.FormularioPresenter
import com.example.tayler_gabbi.mvp_retrofit2.view.FormularioView
import kotlinx.android.synthetic.main.activity_formulario_producto.*

class FormularioProductoActivity : AppCompatActivity(),FormularioView {

    var formularioPresenter : FormularioPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_producto)

        formularioPresenter = FormularioPresenterImpl(this)

        val prodcutoActualisar=intent.getParcelableExtra<Producto>(DetalleProductoActivity.PRODCUTO_ACTULIZAR)
        if (prodcutoActualisar == null){

            button_guardar_producto.setOnClickListener {

                val nombre = edit_text_nombre.text.toString()
                val precio = edit_text_precio.text.toString().toDouble()
                val lote = edit_lote.text.toString().toInt()
                val stock = edit_stock.text.toString().toInt()
                val descripcion = edit_text_descripcion.text.toString()

                formularioPresenter!!.validarGuardarProducto(nombre,precio,lote,stock,descripcion)
            }

        }else{

            edit_text_nombre.setText(prodcutoActualisar.nombre)
            edit_text_precio.setText(prodcutoActualisar.precio.toString())
            edit_lote.setText(prodcutoActualisar.lote.toString())
            edit_stock.setText(prodcutoActualisar.stock.toString())
            edit_text_descripcion.setText(prodcutoActualisar.descripcion)
            val idactulisar  = prodcutoActualisar.id
             button_guardar_producto.setOnClickListener {

                 val nombreactulizar = edit_text_nombre.text.toString()
                 val precioactulaizar = edit_text_precio.text.toString().toDouble()
                 val loteactulizar = edit_lote.text.toString().toInt()
                 val stockactulizar = edit_stock.text.toString().toInt()
                 val descripcionactulizar = edit_text_descripcion.text.toString()

                 formularioPresenter!!.validarActulizarproducto(idactulisar!!,nombreactulizar,precioactulaizar,loteactulizar,stockactulizar,descripcionactulizar)
             }
        }
    }


    override fun productoGuardadoError() {
        Toast.makeText(this@FormularioProductoActivity,"error al guardar",Toast.LENGTH_LONG).show()
    }

    override fun productoGuardado() {

        Toast.makeText(this@FormularioProductoActivity,"producto guardado",Toast.LENGTH_LONG).show()
    }

    override fun productoActualizado() {

        Toast.makeText(this@FormularioProductoActivity,"producto actulizado",Toast.LENGTH_LONG).show()
    }

    override fun productoActualizadoError() {

        Toast.makeText(this@FormularioProductoActivity,"error al actulizar producto",Toast.LENGTH_LONG).show()
    }
}
