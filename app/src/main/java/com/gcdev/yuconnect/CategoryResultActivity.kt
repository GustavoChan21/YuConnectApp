package com.gcdev.yuconnect

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.DragAndDropPermissionsCompat.request
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.adapter.service.ServicesAdapter
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.adapter.store.StoreAdapter
import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.databinding.ActivityCategoryResultBinding
import com.gcdev.yuconnect.network.ApiServicesInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CategoryResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoryResultBinding
    lateinit var request: ApiServicesInterface
    var collection: ArrayList<StoreData>? = null
    var adapter: StoreAdapter? = null
    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        request = ApiClient.buildService(ApiServicesInterface::class.java)

        val menu: Int = intent.getSerializableExtra("id_services") as Int

        recyclerView = findViewById<RecyclerView>(R.id.recyclerResults)
        //recyclerView.adapter = StoreAdapter(menu.itemStores)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        getListStores( id_services = menu)


        //back to home or menu services
        val returnHome = supportActionBar
        returnHome?.title = menu.toString()
        returnHome?.setDisplayHomeAsUpEnabled(true)
    }

    //creamos_la_función
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home ->{
                finish()
                true
            }
            else ->super.onOptionsItemSelected(item)
        }
    }

    private fun getListStores(id_services: Int){
        collection = ArrayList<StoreData>()
        val call = request.getStoreList(id_services)
        call.enqueue(object : Callback<ArrayList<StoreData>> {
            override fun onResponse(call: Call<ArrayList<StoreData>>, response: Response<ArrayList<StoreData>>) {

                if (response.isSuccessful){
                    if (response.body()?.size != 0){

                        for (item in response.body()!!) {
                            collection!!.add(item)
                        }
                    } else {
                        //toast(activity!!, App.ERROR_TABLA_VACIA)
                    }
                    adapter = StoreAdapter(collection!!)
                    recyclerView?.adapter = adapter

                    Log.d("Comsumir Data", response.body().toString());

                } else {
                    //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
                }
            }
            override fun onFailure(call: Call<ArrayList<StoreData>>, t: Throwable) {
                //toast(activity!!, App.ERROR_MENSAJE_CONEXION)
            }
        })
    }

}
