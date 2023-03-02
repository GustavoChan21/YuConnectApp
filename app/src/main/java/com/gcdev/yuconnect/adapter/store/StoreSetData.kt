package com.gcdev.yuconnect.adapter.store

import com.gcdev.yuconnect.R

object StoreSetData {
    fun setResultAbarrotes(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                R.drawable.ic_menu_abarrotes,
                "Abarrotes",
                "Tienda Los 3 Reyes",
                "Productos de Abarrotes y más.",
                "8am - 6pm",
                "10.00",
                "4.6",
                R.drawable.a1_3reyes,
                R.drawable.ic_menu_abarrotes_kart,
            "Calle 49 entre 78 y 82, Colonia Chobenché, 97970",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ JUEVES \r\n" +
                        "⬜ VIERNES \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_abarrotes,
                "Abarrotes",
                "Oxxo San Diego",
                "Oxxo",
                "24 Horas",
                "100.00",
                "4.6",
                R.drawable.a2_oxxo,
                R.drawable.oxxo_logo,
                "Visitanos y disfruta de todas nuestras aventuras y recorridos",
                "⬜ Todos los días"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_abarrotes,
                "Abarrotes",
                "Dunosusa Tekax 2",
                "Dunosusa",
                "8:00am hasta 6:00pm",
                "10.00",
                "4.6",
                R.drawable.a3_dunosusa,
                R.drawable.oxxo_logo,
                "Calle 41 entre 44 y 46, Colonia San Francisco, 97970",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ JUEVES \r\n" +
                        "⬜ VIERNES \r\n" +
                        "⬜ SÁBADO "
            )
        )
        menuList.add(
            StoreData(
                4,
                R.drawable.ic_menu_abarrotes,
                "Abarrotes",
                "Tienda Los 3 Reyes",
                "Productos de Abarrotes y más.",
                "8am - 6pm",
                "10.00",
                "4.6",
                R.drawable.a1_3reyes,
                R.drawable.ic_menu_abarrotes_kart,
                "Calle 49 entre 78 y 82, Colonia Chobenché, 97970",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ JUEVES \r\n" +
                        "⬜ VIERNES \r\n"

            )
        )
        menuList.add(
            StoreData(
                5,
                R.drawable.ic_menu_abarrotes,
                "Abarrotes",
                "Oxxo San Diego",
                "Oxxo",
                "24 Horas",
                "100.00",
                "4.6",
                R.drawable.a2_oxxo,
                R.drawable.oxxo_logo,
                "Visitanos y disfruta de todas nuestras aventuras y recorridos",
                "⬜ Todos los días"

            )
        )
        menuList.add(
            StoreData(
                6,
                R.drawable.ic_menu_abarrotes,
                "Abarrotes",
                "Dunosusa Tekax 2",
                "Dunosusa",
                "8:00am hasta 6:00pm",
                "10.00",
                "4.6",
                R.drawable.a3_dunosusa,
                R.drawable.oxxo_logo,
                "Calle 41 entre 44 y 46, Colonia San Francisco, 97970",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ JUEVES \r\n" +
                        "⬜ VIERNES \r\n" +
                        "⬜ SÁBADO "
            )
        )
        return menuList
    }
    fun setResultGas(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Estación Pemex Tekax",
                "Gasolinas y Diesel",
                "24 horas",
                "22.00",
                "4.6",
                R.drawable.g1_pemex,
                R.drawable.ic_menu_gasolineras,
                "Calle 55 #172, Colonia Padre Eterno, 97970 \r\n" +
                        "Contacto: 997 974 00 53",
                "⬜ Todos los días"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gasolinera Megasur",
                "Gasolinas y Diesel",
                "24 horas",
                "21.80",
                "4.6",
                R.drawable.g2_megasur,
                R.drawable.ic_menu_gasolineras,
                "C. 76 LB, Colonia Chobenché, 97970 \r\n" +
                        "Contacto: 997 974 20 44",
                "⬜ Todos los días"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gas Tomza",
                "6:00am a 10:00pm",
                "24 horas",
                "12.00 o $22.00",
                "4.6",
                R.drawable.g3_tomza,
                R.drawable.ic_menu_gasolineras,
                "C. 70 #165, Colonia San Francisco \r\n" +
                        "Contacto: 997 972 10 10",
                "⬜ Todos los días"

            )
        )
        return menuList
    }
    fun setResultHospedaje(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                R.drawable.ic_menu_hospedaje,
                "Hospedaje",
                "TecnoHotel Express",
                "Hotel",
                "24 horas",
                "600.00 MXN",
                "4.1",
                R.drawable.h1_tecno_hotel,
                R.drawable.ic_menu_hospedaje,
                "C.51 x 102 y 104, Chobenché, 97970 \r\n" +
                        "Contacto: 997 979 00 10 \r\n"+
                        "Ubicación: Tekax, Yucatán",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_hospedaje,
                "Hospedaje",
                "El Sultán de la Sierra",
                "Hotel",
                "24 horas",
                "300.00 MXN",
                "3.9",
                R.drawable.h2_sultan_sierra,
                R.drawable.ic_menu_hospedaje,
                "Calle 50a #211 x 55 y 57, Colonia Centro \r\n" +
                        "Contacto: 997 974 21 69 \r\n" +
                        "Ubicación: Tekax, Yucatán",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_hospedaje,
                "Hospedaje",
                "Posada del Carmen",
                "Posada",
                "24 horas",
                "250.00 MXN en adelante",
                "3.8",
                R.drawable.h3_posada_carmen,
                R.drawable.ic_menu_hospedaje,
                "C.52 x 53 y 55 Colonia Centro \r\n" +
                        "Contacto: 997 974 03 12 \r\n"+
                        "Ubicación: Tekax, Yucatán ",
                "⬜ Todos los días \r\n"

            )
        )
        return menuList
    }
    fun setResultParticulares(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Estación de Servicio Pemex Tekax",
                "Gasolinas y Diesel",
                "24 horas",
                "22.00",
                "4.6",
                R.drawable.g1_pemex,
                R.drawable.ic_menu_gasolineras,
                "Calle 55 #172, Colonia Padre Eterno, 97970 \r\n" +
                        "Contacto: 997 974 00 53 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gasolinera Megasur",
                "Gasolinas y Diesel",
                "24 horas",
                "21.80",
                "4.6",
                R.drawable.g2_megasur,
                R.drawable.ic_menu_gasolineras,
                "Calle 76 LB, Colonia Chobenché, 97970 \r\n" +
                        "Contacto: 997 974 20 44 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gas Tomza",
                "6:00am a 10:00pm",
                "24 horas",
                "12.00 o $22.00",
                "4.6",
                R.drawable.g3_tomza,
                R.drawable.ic_menu_gasolineras,
                "Calle 70 #165, Colonia San Francisco \r\n" +
                        "Contacto: 997 972 10 10 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        return menuList
    }
    fun setResultPublicos(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Estación de Servicio Pemex Tekax",
                "Gasolinas y Diesel",
                "24 horas",
                "22.00",
                "4.6",
                R.drawable.g1_pemex,
                R.drawable.ic_menu_gasolineras,
                "Calle 55 #172, Colonia Padre Eterno, 97970 \r\n" +
                        "Contacto: 997 974 00 53 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gasolinera Megasur",
                "Gasolinas y Diesel",
                "24 horas",
                "21.80",
                "4.6",
                R.drawable.g2_megasur,
                R.drawable.ic_menu_gasolineras,
                "Calle 76 LB, Colonia Chobenché, 97970 \r\n" +
                        "Contacto: 997 974 20 44 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gas Tomza",
                "6:00am a 10:00pm",
                "24 horas",
                "12.00 o $22.00",
                "4.6",
                R.drawable.g3_tomza,
                R.drawable.ic_menu_gasolineras,
                "Calle 70 #165, Colonia San Francisco \r\n" +
                        "Contacto: 997 972 10 10 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        return menuList
    }
    fun setResultRestaurantes(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Estación de Servicio Pemex Tekax",
                "Gasolinas y Diesel",
                "24 horas",
                "22.00",
                "4.6",
                R.drawable.g1_pemex,
                R.drawable.ic_menu_gasolineras,
                "Calle 55 #172, Colonia Padre Eterno, 97970 \r\n" +
                        "Contacto: 997 974 00 53 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gasolinera Megasur",
                "Gasolinas y Diesel",
                "24 horas",
                "21.80",
                "4.6",
                R.drawable.g2_megasur,
                R.drawable.ic_menu_gasolineras,
                "Calle 76 LB, Colonia Chobenché, 97970 \r\n" +
                        "Contacto: 997 974 20 44 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gas Tomza",
                "6:00am a 10:00pm",
                "24 horas",
                "12.00 o $22.00",
                "4.6",
                R.drawable.g3_tomza,
                R.drawable.ic_menu_gasolineras,
                "Calle 70 #165, Colonia San Francisco \r\n" +
                        "Contacto: 997 972 10 10 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        return menuList
    }
    fun setResultSalud(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Estación de Servicio Pemex Tekax",
                "Gasolinas y Diesel",
                "24 horas",
                "22.00",
                "4.6",
                R.drawable.g1_pemex,
                R.drawable.ic_menu_gasolineras,
                "Calle 55 #172, Colonia Padre Eterno, 97970 \r\n" +
                        "Contacto: 997 974 00 53 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gasolinera Megasur",
                "Gasolinas y Diesel",
                "24 horas",
                "21.80",
                "4.6",
                R.drawable.g2_megasur,
                R.drawable.ic_menu_gasolineras,
                "Calle 76 LB, Colonia Chobenché, 97970 \r\n" +
                        "Contacto: 997 974 20 44 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gas Tomza",
                "6:00am a 10:00pm",
                "24 horas",
                "12.00 o $22.00",
                "4.6",
                R.drawable.g3_tomza,
                R.drawable.ic_menu_gasolineras,
                "Calle 70 #165, Colonia San Francisco \r\n" +
                        "Contacto: 997 972 10 10 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        return menuList
    }
    fun setResultTurismo(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        menuList.add(
            StoreData(
                1,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Estación de Servicio Pemex Tekax",
                "Gasolinas y Diesel",
                "24 horas",
                "22.00",
                "4.6",
                R.drawable.g1_pemex,
                R.drawable.ic_menu_gasolineras,
                "Calle 55 #172, Colonia Padre Eterno, 97970 \r\n" +
                        "Contacto: 997 974 00 53 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gasolinera Megasur",
                "Gasolinas y Diesel",
                "24 horas",
                "21.80",
                "4.6",
                R.drawable.g2_megasur,
                R.drawable.ic_menu_gasolineras,
                "Calle 76 LB, Colonia Chobenché, 97970 \r\n" +
                        "Contacto: 997 974 20 44 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_gasolineras,
                "Gasolinera",
                "Gas Tomza",
                "6:00am a 10:00pm",
                "24 horas",
                "12.00 o $22.00",
                "4.6",
                R.drawable.g3_tomza,
                R.drawable.ic_menu_gasolineras,
                "Calle 70 #165, Colonia San Francisco \r\n" +
                        "Contacto: 997 972 10 10 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        return menuList
    }
}