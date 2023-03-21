package com.gcdev.yuconnect.adapter.store

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class StoreData(
    //var id:Int,

    @SerializedName("categoria_id")
    var categoryId: Int,

    @SerializedName("icono_categoria")
    var iconCategory:String,

    @SerializedName("nombre")
    var storeName:String,

    @SerializedName("categoria")
    var category:String,

    @SerializedName("precio")
    var price:String,

    @SerializedName("horario")
    var time:String,

    @SerializedName("ranking")
    var ranking: String,

    @SerializedName("img_logo")
    var logo: String,

    @SerializedName("img_banner")
    var imgBackground: String,

    @SerializedName("descripcion")
    var description:String,

    @SerializedName("maps")
    var maps:String,

    @SerializedName("dias_laborales")
    var workDays:String

): Serializable