package com.gcdev.yuconnect.adapter.store

import com.gcdev.yuconnect.R

object StoreSetData {
    fun setResultAbarrotes(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                "Turismo",
                "Grutas Chocantes",
                "Abarrotes",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.grutas_chocantes_logo,
                R.drawable.grutas_chocantes,
            "Visitanos en Tekax, Yucatán y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n"

            )
        )
        menuList.add(
            StoreData(
                1,
                "Turismo",
                "Chacmultun",
                "Tirolesa y Recorridos Extremos",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.grutas_chocantes_logo,
                R.drawable.chacmultun,
                "Visitanos y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n"

            )
        )
        return menuList
    }
    fun setResultGas(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                "Turismo",
                "Grutas Chocantes",
                "Abarrotes",
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
        menuList.add(
            StoreData(
                1,
                "Turismo",
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
        return menuList
    }
}