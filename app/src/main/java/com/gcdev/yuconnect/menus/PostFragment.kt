package com.gcdev.yuconnect.menus

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.adsCategory.AdsAdapter
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.recomendaciones.RecomendacionesAdapter
import com.gcdev.yuconnect.adapter.recomendaciones.RecomendacionesData
import com.gcdev.yuconnect.adapter.service.ServicesAdapter
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.network.ApiServicesInterface
import com.google.firebase.database.DatabaseReference
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PostFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PostFragment : Fragment(R.layout.fragment_post) {

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //avatar TEST TO Some LAYOUTS

        //tv_username_data
//        usuario = requireView().findViewById(R.id.tv_username_data)
//        dbRef = FirebaseDatabase.getInstance().getReference("Usernames")
//        var getdata = object : ValueEventListener{
//            override fun onDataChange(snapshot: DataSnapshot) {
//                var sb = StringBuilder()
//                for (i in snapshot.children){
//                    var username = i.child("userName").getValue()
//                    sb.append("$username")
//
//                    if (username == null){
//                        sb.append("Acceso Invitado")
//                        usuario.setText(sb)
//                    }
//                }
//                usuario.setText(sb)
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                Log.w(TAG, "Error al leer el valor.", error.toException())
//            }
//        }
//        dbRef.addValueEventListener(getdata)
//        dbRef.addListenerForSingleValueEvent(getdata)
//
        request = ApiClient.buildService(ApiServicesInterface::class.java)

//        recyclerView = requireView().findViewById<RecyclerView>(R.id.rv_parent)
//        //recyclerView.adapter = ServicesAdapter(ServiceSetData.setService())
//        getAgences()
//        recyclerView!!.layoutManager = GridLayoutManager(context, 1, RecyclerView.VERTICAL, false)

        recyclerViewAgence = requireView().findViewById<RecyclerView>(R.id.rv_parent)
        //recyclerViewAgence!!.adapter = AdsAdapter(AdSetData.setAds())
        getAgences()
        recyclerViewAgence!!.layoutManager = GridLayoutManager(context, 1, RecyclerView.VERTICAL, false)
//
//
//        recyclerViewRec = requireView().findViewById<RecyclerView>(R.id.rv_ads2)
//        //recyclerViewRec!!.adapter = resultAdapter(Helper.setResultSearch())
//        getRecomendaciones()
//        recyclerViewRec!!.layoutManager = GridLayoutManager(context, 1, RecyclerView.HORIZONTAL, false)


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