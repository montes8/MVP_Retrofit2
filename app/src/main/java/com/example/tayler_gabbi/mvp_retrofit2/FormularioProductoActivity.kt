package com.example.tayler_gabbi.mvp_retrofit2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tayler_gabbi.mvp_retrofit2.api.model.Producto

class FormularioProductoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_producto)


        val prodcutoActualisar=intent.getParcelableExtra<Producto>(DetalleProductoActivity.PRODCUTO_ACTULIZAR)
    }
}
