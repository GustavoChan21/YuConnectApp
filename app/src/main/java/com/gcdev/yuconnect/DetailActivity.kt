package com.gcdev.yuconnect

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.adapter.service.ServicesAdapter
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.databinding.ActivityDetailBinding
import com.gcdev.yuconnect.network.ApiServicesInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    lateinit var request: ApiServicesInterface
    var collection: ArrayList<ServicesData>? = null
    var adapter: ServicesAdapter? = null
    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //RecyclerView Others Services Test
        request = ApiClient.buildService(ApiServicesInterface::class.java)

        recyclerView = findViewById<RecyclerView>(R.id.rv_parent)
        //recyclerView.adapter = ServicesAdapter(ServiceSetData.setService())
        getCollection()
        recyclerView!!.layoutManager = GridLayoutManager(this, 1, RecyclerView.HORIZONTAL, false)

        val menu2: StoreData = intent.getSerializableExtra("details") as StoreData

        //binding.titleStoreDetail.setText(menu2.storeName)
        //binding.categoryDetail.setText(menu2.category)
        //binding.priceDetail.setText(menu2.price)
        //binding.descriptionDetail.setText(menu2.description)
        //binding.horarioDetail.setText(menu2.workDays)
        //binding.imgLogoDetail.setImageResource(menu2.imgBackground)
        //binding.imageBackgroundPgDetail.setImageResource(menu2.logo)

        //favorite icon actions and toast
        val checkFavorites = findViewById<CheckBox>(R.id.checkFavorites)
        checkFavorites.setOnCheckedChangeListener{checkBox, isChecked ->
            if (isChecked){
                showToast("Item agregado a Favoritos")

            } else{
                showToast("Item eliminado de Favoritos")
            }
        }


        //go to the maps view "test1"
        binding.test.setOnClickListener(View.OnClickListener {
            val intentUri = Uri.parse("geo:20.932697,-89.019152?z=16&q=20.932697,-89.019152(Izamal,+Yucatán,+México)")
            val intent = Intent(Intent.ACTION_VIEW, intentUri)
            startActivity(intent)
        })

        binding.phoneAction.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:1234567890")
            startActivity(intent)
        })


        //back to list of stores per category
        val returnHome = supportActionBar
        returnHome?.title = menu2.storeName
        returnHome?.setDisplayHomeAsUpEnabled(true)

    }

    private fun showToast(str: String){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
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

    //Get Data of API OtherServices TestExample
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


}