package com.example.prueba4lab4

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Peluchito (var nombre: String, var id: String, var cantidad: String, var precio: String) : Parcelable{}