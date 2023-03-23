package com.gcdev.yuconnect.network
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.adsList.AdsListData
import com.gcdev.yuconnect.adapter.recomendaciones.RecomendacionesData
import com.gcdev.yuconnect.adapter.recomendados.RecommendedData
import com.gcdev.yuconnect.adapter.searchview.resultList
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.adapter.store.StoreData
import retrofit2.Call

import retrofit2.http.*
interface ApiServicesInterface {

    //menu services
    @GET("categorias")
    fun getCategorias():Call<ArrayList<ServicesData>>

    //stores per category or menu service item
    @GET("tiendas/{id}")
    fun getStoreList(
        @Path("id") id_services: Int
    ): Call<ArrayList<StoreData>>

    //ads get data api or promotions recyclerview
    @GET("agencias")
    fun getPromotions():Call<ArrayList<AdsData>>

    //ads items per promotions
    @GET("ads/{id}")
    fun getAds(
        @Path("id") id_promotions: Int
    ): Call<ArrayList<AdsListData>>

    //recommendations categories
    @GET("recomendaciones")
    fun getRecommendations():Call<ArrayList<RecomendacionesData>>

    //recommended items per recommendations category
    @GET("recomendados/{id}")
    fun getRecommended(
        @Path("id") id_recommended: Int
    ): Call<ArrayList<RecommendedData>>

}