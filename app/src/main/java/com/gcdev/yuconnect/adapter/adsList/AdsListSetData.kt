package com.gcdev.yuconnect.adapter.adsList

import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.adsList.AdsListData

object AdsListSetData {
    fun setResultAdsPromociones(): List<AdsListData> {
        var adList = mutableListOf<AdsListData>()
        adList.add(
            AdsListData(
                1,
                R.drawable.ic_menu_turismo,
                "Turismo",
                "Grutas Chocantes",
                "MERIDA",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.oxxo,
                R.drawable.grutas_chocantes,
                "Visitanos en Tekax, Yucatán y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n"

            )
        )
        adList.add(
            AdsListData(
                1,
                R.drawable.ic_menu_turismo,
                "Turismo",
                "grutas",
                "Tirolesa y Recorridos Extremos",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.grutas_chocantes_logo,
                R.drawable.grutas_chocantes,
                "Visitanos y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n"

            )
        )
        return adList
    }
    fun setResultAdsRecomendados(): List<AdsListData> {
        var adList = mutableListOf<AdsListData>()
        adList.add(
            AdsListData(
                1,
                R.drawable.ic_menu_abarrotes,
                "abarrotes",
                "Chac",
                "MERIDA",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.oxxo,
                R.drawable.grutas_chocantes,
                "Visitanos en Tekax, Yucatán y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n"

            )
        )
        adList.add(
            AdsListData(
                1,
                R.drawable.ic_menu_abarrotes,
                "abarrotes",
                "Chacmultun",
                "Tirolesa y Recorridos Extremos",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.oxxo,
                R.drawable.chacmultun,
                "Visitanos y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n"

            )
        )
        return adList
    }

}