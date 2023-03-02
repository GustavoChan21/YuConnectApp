package com.gcdev.yuconnect.network
import com.gcdev.yuconnect.adapter.store.StoreData
import retrofit2.Call

import retrofit2.http.*
interface ApiStoresInterface {
    @GET("stores")
    fun getStoresList():Call<ArrayList<StoreData>>
}