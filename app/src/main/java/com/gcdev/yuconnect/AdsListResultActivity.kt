package com.gcdev.yuconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.adapter.adsCategory.AdsAdapter
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.adsList.AdsListAdapter
import com.gcdev.yuconnect.adapter.adsList.AdsListData
import com.gcdev.yuconnect.adapter.store.StoreAdapter
import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.databinding.ActivityAdsListResultBinding
import com.gcdev.yuconnect.network.ApiServicesInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AdsListResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdsListResultBinding
    lateinit var request: ApiServicesInterface
    var collection: ArrayList<AdsListData>? = null
    var adapter: AdsListAdapter? = null
    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdsListResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        request = ApiClient.buildService(ApiServicesInterface::class.java)

        val promos: Int = intent.getSerializableExtra("id_promotions") as Int
        val nombre: String = intent.getSerializableExtra("tituloAd") as String

        recyclerView = findViewById<RecyclerView>(R.id.recyclerAdsResults)
        //recyclerView.adapter = AdsListAdapter(menu3.itemAds)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        getListAds(promos)

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

    private fun getListAds(id_promotions: Int){
        collection = ArrayList<AdsListData>()
        val call = request.getAds(id_promotions)
        call.enqueue(object : Callback<ArrayList<AdsListData>> {
            override fun onResponse(call: Call<ArrayList<AdsListData>>, response: Response<ArrayList<AdsListData>>) {
                Log.e("validar request", call.request().toString())
                if (response.isSuccessful){
                    if (response.body()?.size != 0){

                        for (item in response.body()!!) {
                            collection!!.add(item)
                        }
                    } else {
                        //toast(activity!!, App.ERROR_TABLA_VACIA)
                    }
                    adapter = AdsListAdapter(collection!!)
                    recyclerView?.adapter = adapter

                    Log.d("Comsumir Data", response.body().toString());

                } else {
                    //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
                }
            }
            override fun onFailure(call: Call<ArrayList<AdsListData>>, t: Throwable) {
                //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
            }
        })
    }
}