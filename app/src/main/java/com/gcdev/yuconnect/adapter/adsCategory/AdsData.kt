package com.gcdev.yuconnect.adapter.adsCategory

import com.gcdev.yuconnect.adapter.adsList.AdsListData
import com.gcdev.yuconnect.adapter.store.StoreData
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AdsData (
    //Main Variables related with the recycler items
    @SerializedName("id")
    var id: Int,

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