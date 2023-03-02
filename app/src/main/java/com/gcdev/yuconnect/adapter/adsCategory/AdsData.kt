package com.gcdev.yuconnect.adapter.adsCategory

import com.gcdev.yuconnect.adapter.adsList.AdsListData
import com.gcdev.yuconnect.adapter.store.StoreData
import java.io.Serializable

data class AdsData (
    //Main Variables related with the recycler items
    var id:Int,
    var logoAd: Int,
    var tituloAd:String,
    var iconStatus: Int,
    var location:String,
    var discountDescription:String,
    var ranking: String,
    var typeRanking: Int,
    var priceAd: String,

    //Detail Layout Variables
    var imgBackgroundAd: Int,
    var descriptionAd:String,
    var workDaysAd:String,
    var itemAds:List<AdsListData>

): Serializable