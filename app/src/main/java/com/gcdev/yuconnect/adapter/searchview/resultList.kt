package com.gcdev.yuconnect.adapter.searchview

import com.google.gson.annotations.SerializedName

data class resultList (

    @SerializedName("icono_categoria")
    var img: Int,

    @SerializedName("nombre")
    var nombre: String

)