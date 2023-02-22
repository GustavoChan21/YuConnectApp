package com.gcdev.yuconnect.adapter.service

import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.store.StoreSetData

object ServiceSetData {
    fun setService(): List<ServicesData> {
        var serviceList = mutableListOf<ServicesData>()
        serviceList.add(
            ServicesData(
                1,
                R.drawable.ic_menu_abarrotes,
                "Abarrotes",
                StoreSetData.setResultAbarrotes()
            )
        )
        serviceList.add(
            ServicesData(
                2,
                R.drawable.ic_menu_gasolineras,
                "Gasolineras",
                StoreSetData.setResultGas()

            )
        )
        serviceList.add(
            ServicesData(
                3,
                R.drawable.ic_menu_hospedaje,
                "Hospedaje",
                StoreSetData.setResultGas()
            )
        )
        serviceList.add(
            ServicesData(
                4,
                R.drawable.ic_menu_particulares,
                "Particulares",
                StoreSetData.setResultAbarrotes()
            )
        )
        serviceList.add(
            ServicesData(5,
                R.drawable.ic_menu_publicos,
                "Públicos",
                StoreSetData.setResultGas()
            )
        )
        serviceList.add(
            ServicesData(
                6,
                R.drawable.ic_menu_restaurantes,
                "Restaurantes",
                StoreSetData.setResultAbarrotes()
            )
        )
        serviceList.add(
            ServicesData(
                7,
                R.drawable.ic_menu_salud,
                "Salud",
                StoreSetData.setResultGas()
            )
        )
        serviceList.add(
            ServicesData(
                8,
                R.drawable.ic_menu_turismo,
                "Turismo",
                StoreSetData.setResultAbarrotes()
            )
        )
        return serviceList
    }
}