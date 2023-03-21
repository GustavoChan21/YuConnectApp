package com.gcdev.yuconnect.adapter.searchview

import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.adsList.AdsListData
import com.gcdev.yuconnect.adapter.store.StoreData

object Helper {
    fun setResultSearch(): ArrayList<resultList>  {
        var menuList = ArrayList<resultList>()
        menuList.add(
            resultList(
                R.drawable.ic_menu_abarrotes,
                "Tienda Los 3 Reyes",

            )
        )
        menuList.add(
            resultList(

                R.drawable.ic_menu_abarrotes,
                "Oxxo San Diego",

            )
        )
        menuList.add(
            resultList(

                R.drawable.ic_menu_abarrotes,
                "Dunosusa Tekax 2"
            )
        )
        menuList.add(
            resultList(
                R.drawable.ic_menu_hospedaje,
                "TecnoHotel Express",

            )
        )
        menuList.add(
            resultList(

                R.drawable.ic_menu_hospedaje,
                "El Sultán de la Sierra",


            )
        )
        menuList.add(
            resultList(

                R.drawable.ic_menu_hospedaje,
                "Posada del Carmen",
            )
        )
        menuList.add(
            resultList(
                R.drawable.ic_menu_gasolineras,
                "Gasolinera Megasur"

                )
        )
        menuList.add(
            resultList(

                R.drawable.ic_menu_gasolineras,
                "Gas Tomza",


                )
        )
        menuList.add(
            resultList(

                R.drawable.ic_menu_turismo,
                "Grutas Chocantes",
            )
        )
        return menuList
    }
}