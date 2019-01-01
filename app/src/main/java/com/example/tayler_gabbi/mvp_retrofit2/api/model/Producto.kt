package com.example.tayler_gabbi.mvp_retrofit2.api.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Producto (val id: Int? = null,
                val nombre: String,
                val precio: Double,
                val lote: Int,
                val stock: Int,
                val descripcion: String
):Parcelable