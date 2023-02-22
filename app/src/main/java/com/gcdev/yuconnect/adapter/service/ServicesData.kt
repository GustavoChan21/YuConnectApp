package com.gcdev.yuconnect.adapter.service

import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.adapter.store.StoreSetData
import java.io.Serializable

data class ServicesData(
    var id : Int,
    var iconService:Int,
    var categoryService:String,
    var itemStores:List<StoreData>
) : Serializable