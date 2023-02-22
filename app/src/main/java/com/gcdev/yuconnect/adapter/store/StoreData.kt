package com.gcdev.yuconnect.adapter.store

import java.io.Serializable

data class StoreData(
    var id:Int,
    var titulo:String,
    var storeName:String,
    var category:String,
    var time:String,
    var price:String,
    var ranking: String,
    var logo: Int,

    var imgBackground: Int,
    var description:String,
    var workDays:String

): Serializable