package com.gcdev.yuconnect.adapter.ads

import java.io.Serializable

data class AdsData (
    //Main Variables related with the recycler items
    var id:Int,
    var logoAdd: Int,
    var tituloAdd:String,
    var iconStatus: Int,
    var location:String,
    var discountDescription:String,
    var ranking: String,
    var typeRanking: Int,

    //Detail Layout Variables
//    var imgBackgroundAdd: Int,
//    var descriptionAdd:String,
//    var workDaysAdd:String

): Serializable