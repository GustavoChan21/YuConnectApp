package com.gcdev.yuconnect.adapter.service

import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.adapter.store.StoreSetData
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ServicesData(
    @SerializedName("id")
    var id : Int,

    @SerializedName("img")
    var iconService:String,

    @SerializedName("nombre")
    var categoryService:String,
    //var itemStores:List<StoreData>
) : Serializable
