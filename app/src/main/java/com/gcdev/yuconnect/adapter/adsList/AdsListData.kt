package com.gcdev.yuconnect.adapter.adsList

import com.gcdev.yuconnect.adapter.store.StoreData
import java.io.Serializable

data class AdsListData (
    var id:Int,
    var iconCategory:Int,
    var titulo:String,
    var storeName:String,
    var location:String,
    var time:String,
    var price:String,
    var ranking: String,
    var logo: Int,

    var imgBackground: Int,
    var description:String,
    var workDays:String
    ): Serializable