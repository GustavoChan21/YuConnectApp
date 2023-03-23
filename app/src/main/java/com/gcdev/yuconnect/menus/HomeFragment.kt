package com.gcdev.yuconnect.menus

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.adsCategory.AdSetData
import com.gcdev.yuconnect.adapter.adsCategory.AdsAdapter
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.recomendaciones.RecomendacionesAdapter
import com.gcdev.yuconnect.adapter.recomendaciones.RecomendacionesData
import com.gcdev.yuconnect.adapter.searchview.Helper
import com.gcdev.yuconnect.adapter.searchview.resultAdapter
import com.gcdev.yuconnect.adapter.service.ServiceSetData
import com.gcdev.yuconnect.adapter.service.ServicesAdapter
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.adapter.store.StoreAdapter
import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.network.ApiServicesInterface
import com.google.android.gms.tasks.Tasks.call
import com.google.firebase.database.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var request: ApiServicesInterface
    var collection: ArrayList<ServicesData>? = null
    var adapter: ServicesAdapter? = null
    var recyclerView: RecyclerView? = null

    var collectionAgence: ArrayList<AdsData>? = null
    var adapterAgence: AdsAdapter? = null
    var recyclerViewAgence: RecyclerView? = null

    var collectionRec: ArrayList<RecomendacionesData>? = null
    var adapterRec: RecomendacionesAdapter? = null
    var recyclerViewRec: RecyclerView? = null

    private lateinit var dbRef: DatabaseReference
    private lateinit var usuario: TextView
    private lateinit var avatar: ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //avatar TEST TO Some LAYOUTS
        avatar = requireView().findViewById(R.id.avatar)
        avatar.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_detailActivity)
        }
        //tv_username_data
        usuario = requireView().findViewById(R.id.tv_username_data)
        dbRef = FirebaseDatabase.getInstance().getReference("Usernames")
        var getdata = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                var sb = StringBuilder()
                for (i in snapshot.children){
                    var username = i.child("userName").getValue()
                    sb.append("$username")

                    if (username == null){
                        sb.append("Acceso Invitado")
                        usuario.setText(sb)
                    }
                }
                usuario.setText(sb)
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w(TAG, "Error al leer el valor.", error.toException())
            }
        }
        dbRef.addValueEventListener(getdata)
        dbRef.addListenerForSingleValueEvent(getdata)

        request = ApiClient.buildService(ApiServicesInterface::class.java)

        recyclerView = requireView().findViewById<RecyclerView>(R.id.rv_parent)
        //recyclerView.adapter = ServicesAdapter(ServiceSetData.setService())
        getCollection()
        recyclerView!!.layoutManager = GridLayoutManager(context, 1, RecyclerView.HORIZONTAL, false)

        recyclerViewAgence = requireView().findViewById<RecyclerView>(R.id.rv_ads)
        //recyclerViewAgence!!.adapter = AdsAdapter(AdSetData.setAds())
        getAgences()
        recyclerViewAgence!!.layoutManager = GridLayoutManager(context, 1, RecyclerView.HORIZONTAL, false)


        recyclerViewRec = requireView().findViewById<RecyclerView>(R.id.rv_ads2)
        //recyclerViewRec!!.adapter = resultAdapter(Helper.setResultSearch())
        getRecomendaciones()
        recyclerViewRec!!.layoutManager = GridLayoutManager(context, 1, RecyclerView.HORIZONTAL, false)


    }

    //get categories of services menu
    private fun getCollection(){
        collection = ArrayList<ServicesData>()
        val call = request.getCategorias()
        call.enqueue(object : Callback<ArrayList<ServicesData>> {
            override fun onResponse(call: Call<ArrayList<ServicesData>>, response: Response<ArrayList<ServicesData>>) {

                if (response.isSuccessful){
                    if (response.body()?.size != 0){

                        for (item in response.body()!!) {
                            collection!!.add(item)
                        }
                    } else {
                        //toast(activity!!, App.ERROR_TABLA_VACIA)
                    }
                    adapter = ServicesAdapter(collection!!)
                    recyclerView?.adapter = adapter

                    Log.d("Comsumir Data", response.body().toString());

                } else {
                    //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
                }
            }
            override fun onFailure(call: Call<ArrayList<ServicesData>>, t: Throwable) {
                //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
            }
        })
    }

    //get categories of promotions
    private fun getAgences(){
        collectionAgence = ArrayList<AdsData>()
        val call = request.getPromotions()
        call.enqueue(object : Callback<ArrayList<AdsData>> {
            override fun onResponse(call: Call<ArrayList<AdsData>>, response: Response<ArrayList<AdsData>>) {

                if (response.isSuccessful){
                    if (response.body()?.size != 0){

                        for (item in response.body()!!) {
                            collectionAgence!!.add(item)
                        }
                    } else {
                        //toast(activity!!, App.ERROR_TABLA_VACIA)
                    }
                    adapterAgence = AdsAdapter(collectionAgence!!)
                    recyclerViewAgence?.adapter = adapterAgence

                    Log.d("Comsumir Data", response.body().toString());

                } else {
                    //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
                }
            }
            override fun onFailure(call: Call<ArrayList<AdsData>>, t: Throwable) {
                //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
            }
        })
    }

    //get categories of recommendations
    private fun getRecomendaciones(){
        collectionRec = ArrayList<RecomendacionesData>()
        val call = request.getRecommendations()
        call.enqueue(object : Callback<ArrayList<RecomendacionesData>> {
            override fun onResponse(call: Call<ArrayList<RecomendacionesData>>, response: Response<ArrayList<RecomendacionesData>>) {

                if (response.isSuccessful){
                    if (response.body()?.size != 0){

                        for (item in response.body()!!) {
                            collectionRec!!.add(item)
                        }
                    } else {
                        //toast(activity!!, App.ERROR_TABLA_VACIA)
                    }
                    adapterRec = RecomendacionesAdapter(collectionRec!!)
                    recyclerViewRec?.adapter = adapterRec

                    Log.d("Comsumir Data", response.body().toString());

                } else {
                    //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
                }
            }
            override fun onFailure(call: Call<ArrayList<RecomendacionesData>>, t: Throwable) {
                //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
            }
        })
    }


}