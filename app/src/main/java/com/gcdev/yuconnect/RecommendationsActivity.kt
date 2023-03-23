package com.gcdev.yuconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.adsList.AdsListAdapter
import com.gcdev.yuconnect.adapter.adsList.AdsListData
import com.gcdev.yuconnect.adapter.recomendaciones.RecomendacionesData
import com.gcdev.yuconnect.adapter.recomendados.RecommendedAdapter
import com.gcdev.yuconnect.adapter.recomendados.RecommendedData
import com.gcdev.yuconnect.adapter.store.StoreAdapter
import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.databinding.ActivityAdsListResultBinding
import com.gcdev.yuconnect.databinding.ActivityCategoryResultBinding
import com.gcdev.yuconnect.databinding.ActivityRecommendationsBinding
import com.gcdev.yuconnect.network.ApiServicesInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecommendationsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecommendationsBinding
    lateinit var request: ApiServicesInterface
    var collection: ArrayList<RecommendedData>? = null
    var adapter: RecommendedAdapter? = null
    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecommendationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        request = ApiClient.buildService(ApiServicesInterface::class.java)

        val recom: Int = intent.getSerializableExtra("id_recomendations") as Int
        val nombre: String = intent.getSerializableExtra("tituloRec") as String

        recyclerView = findViewById<RecyclerView>(R.id.recyclerRecomendationsResults)
        //recyclerView.adapter = AdsListAdapter(menu3.itemAds)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        getListRec(recom)

        val returnHome = supportActionBar
        returnHome?.title = nombre
        returnHome?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home ->{
                finish()
                true
            }
            else ->super.onOptionsItemSelected(item)
        }
    }

    private fun getListRec(id_recommended: Int){
        collection = ArrayList<RecommendedData>()
        val call = request.getRecommended(id_recommended)
        call.enqueue(object : Callback<ArrayList<RecommendedData>> {
            override fun onResponse(call: Call<ArrayList<RecommendedData>>, response: Response<ArrayList<RecommendedData>>) {
                Log.e("validar request", call.request().toString())
                if (response.isSuccessful){
                    if (response.body()?.size != 0){

                        for (item in response.body()!!) {
                            collection!!.add(item)
                        }
                    } else {
                        //toast(activity!!, App.ERROR_TABLA_VACIA)
                    }
                    adapter = RecommendedAdapter(collection!!)
                    recyclerView?.adapter = adapter

                    Log.d("Comsumir Data", response.body().toString());

                } else {
                    //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
                }
            }
            override fun onFailure(call: Call<ArrayList<RecommendedData>>, t: Throwable) {
                //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
            }
        })
    }
}