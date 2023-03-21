package com.gcdev.yuconnect.adapter.recomendaciones

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class RecomendacionesData (
    //Main Variables related with the recycler items
    //var id:Int,
    @SerializedName("img")
    var logoAd: String,

    @SerializedName("nombre")
    var tituloAd:String,

    @SerializedName("icono")
    var iconStatus: String,

    @SerializedName("locacion")
    var location:String,

    @SerializedName("descripcion")
    var discountDescription:String,

    @SerializedName("vistas")
    var ranking: String,

    //var typeRanking: Int,

    //var itemAds:List<AdsListData>

): Serializable