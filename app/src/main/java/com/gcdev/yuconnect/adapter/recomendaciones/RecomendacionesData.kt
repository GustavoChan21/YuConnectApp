package com.gcdev.yuconnect.adapter.recomendaciones

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class RecomendacionesData (
    //Main Variables related with the recycler items
    @SerializedName("id")
    var id: Int,

    @SerializedName("nombre")
    var tituloAd:String,

    @SerializedName("img")
    var logoAd: String,

    @SerializedName("descripcion")
    var discountDescription:String,

    @SerializedName("locacion")
    var location:String,

    @SerializedName("icono")
    var iconStatus: String,

    @SerializedName("vistas")
    var ranking: String,

    //var typeRanking: Int,

    //var itemAds:List<AdsListData>

): Serializable