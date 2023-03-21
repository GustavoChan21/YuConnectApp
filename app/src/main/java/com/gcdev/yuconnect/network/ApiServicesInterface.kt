package com.gcdev.yuconnect.network
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.recomendaciones.RecomendacionesData
import com.gcdev.yuconnect.adapter.searchview.resultList
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.adapter.store.StoreData
import retrofit2.Call

import retrofit2.http.*
interface ApiServicesInterface {
    @GET("categorias")
    fun getCategorias():Call<ArrayList<ServicesData>>

    @GET("tiendas/?id_services")
    fun getStoreList(
        @Query("id_services") id_services: Int
    ): Call<ArrayList<StoreData>>

    //ads get data api
    @GET("agencias")
    fun getAgencias():Call<ArrayList<AdsData>>

    //recomendaciones get data api
    @GET("recomendaciones")
    fun getRecomendacionesCat():Call<ArrayList<RecomendacionesData>>

    //adsList get data api
    @GET("agencias/{id_services}")
    fun getAnuncios():Call<ArrayList<AdsData>>

    //search view data api
    @GET("tiendas")
    fun getSearchList():Call<ArrayList<resultList>>

}