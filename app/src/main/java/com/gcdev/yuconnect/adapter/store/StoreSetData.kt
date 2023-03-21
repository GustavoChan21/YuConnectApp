package com.gcdev.yuconnect.adapter.store

import com.gcdev.yuconnect.R

object StoreSetData {
    fun setResultAbarrotes(): List<StoreData>  {
        var menuList = mutableListOf<StoreData>()
        /*menuList.add(
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
                R.drawable.ic_menu_particulares,
                "Ferretería",
                "Ferretería y Multiservicios \r\n Los 3 Hermanos",
                "Servicio Particular",
                "9:00am hasta 7:00pm",
                "+50.00 MXN",
                "4.1",
                R.drawable.s_par_1, //fondo
                R.drawable.ic_menu_particulares, //logo
                "C.50 x 43 y 45, 97970 \r\n" +
                        "Contacto: 997 129 14 76 \r\n"+
                        "Ubicación: Tekax, Yucatán",
                "⬜ LUNES \r\n"+
                        "⬜ MARTES \r\n"+
                        "⬜ MIERCOLES \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_gasolineras,
                "Taller",
                "Taller de Motos Ángel",
                "Servicio Particular",
                "9:00am hasta 9:00pm",
                "+200.00 MXN",
                "4.3",
                R.drawable.s_par_2,
                R.drawable.ic_menu_particulares,
                "C. 53 x 32 y 34, 97970 \r\n" +
                        "Contacto: 997 156 19 48 \r\n",
                "⬜ LUNES A SÁBADO \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_particulares,
                "Mecánico",
                "Taller Automotríz Henri Jr",
                "Servicios Particulares",
                "8:00am a 6:00pm",
                "+100/00 MXN",
                "4.4",
                R.drawable.s_par_3,
                R.drawable.ic_menu_particulares,
                "C.49 #241 x 60 y 62, San Francisco, 97970 \r\n" +
                        "Contacto: 997 141 12 31 \r\n",
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
                "CFE",
                "CFE Tekax",
                "Servicios Públicos",
                "8:00am hasta 3:00pm",
                "Según tu recibo o trámite",
                "4.6",
                R.drawable.sp1_cfe,
                R.drawable.ic_menu_publicos,
                "C.57 #x 24 y 26, Yocchenkax, 97970 \r\n" +
                        "Contacto: 997 972 11 52 \r\n",
                "⬜ Lunes a Viernes \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_gasolineras,
                "Policia",
                "Policia Municipal Tekax",
                "Servicios Públicos",
                "24 horas",
                "Gratuito",
                "4.6",
                R.drawable.sp2_policia,
                R.drawable.ic_menu_publicos,
                "C.50 x 39 y 41 Colonia Lazaro Cardenas \r\n" +
                        "Contacto: 997 974 06 89 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_gasolineras,
                "Bomberos",
                "Bomberos Tekax",
                "Emergencias",
                "24 horas",
                "Gratuito",
                "4.6",
                R.drawable.sp3_bomberos,
                R.drawable.ic_menu_publicos,
                "C.57 #70, Jardines de Sta María, 97970 \r\n" +
                        "Contacto: 997 974 06 89 \r\n",
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
                R.drawable.ic_menu_restaurantes,
                "Restaurante",
                "El Huinic",
                "Cocina Económica",
                "8:00am hasta 3:00pm",
                "+50.00 MXN",
                "4.2",
                R.drawable.r1_huinic,
                R.drawable.ic_menu_restaurantes,
                "C.54 x 47 y 49, 97970 \r\n" +
                        "Contacto: 997 974 03 12 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_restaurantes,
                "Restaurante",
                "Muldzinick",
                "Cocina Económica",
                "11:00am hasta 6:30pm",
                "+80.00 MXN",
                "4.1",
                R.drawable.r2_muldzinick,
                R.drawable.ic_menu_restaurantes,
                "C.51 X 102 y 104, Chobenché, 97970 \r\n" +
                        "Contacto: 997 979 00 10 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_restaurantes,
                "Restaurante",
                "El Bistró",
                "Restaurante",
                "4:00pm a 10:00pm",
                "+100.00 MXN",
                "4.4",
                R.drawable.r3_bistro,
                R.drawable.ic_menu_restaurantes,
                "C.50 X 45 y 47, 97970 \r\n" +
                        "Contacto: 997 979 36 21 \r\n",
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
                R.drawable.ic_menu_salud,
                "IMSS",
                "UMF #55 IMSS Tekax",
                "Salud - Hospitales",
                "7:00am hasta 8:00pm",
                "Según el servicio/seguro médico",
                "4.6",
                R.drawable.s1_imss,
                R.drawable.ic_menu_salud,
                "C.43 x 56 y 58, San Francisco, 97970 \r\n" +
                        "Contacto: 997 117 12 28 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_salud,
                "Hospital",
                "Hospital General Tekax",
                "Salud - Hospitales",
                "24 horas",
                "21.80",
                "4.6",
                R.drawable.s2_hos_gen,
                R.drawable.ic_menu_salud,
                "C.59 X 56 y 60, 97970 \r\n" +
                        "Contacto: --- --- -- -- \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_salud,
                "Farmacias",
                "Farmacia YZA Tekax",
                "Farmacia - Consultorio",
                "24 horas",
                "+10.00 MXN",
                "4.6",
                R.drawable.s3_yza,
                R.drawable.ic_menu_salud,
                "C.51 X 48 y 50, 97970 \r\n" +
                        "Contacto: 997 974 08 27 \r\n",
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
                R.drawable.ic_menu_turismo,
                "Parque Ecoturistico",
                "Parque Ecoturistico Kaalmankal",
                "Turismo / Tours",
                "9:00am a 4:00pm",
                "+100.00 MXN",
                "4.6",
                R.drawable.t1_parque,
                R.drawable.ic_menu_turismo,
                "C.70 Carretera Tekax-Kancab Km1 \r\n" +
                        "Contacto: 997 134 23 26 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                2,
                R.drawable.ic_menu_turismo,
                "Grutas",
                "Grutas Chocantes",
                "Turismo - Extremo",
                "9:00am a 3:00pm",
                "+200.00 MXN",
                "4.8",
                R.drawable.t2_chocantes,
                R.drawable.grutas_chocantes,
                "C.51 X 102 y 104, Chobenché, 97970 \r\n" +
                        "Contacto: 997 979 00 10 \r\n",
                "⬜ Todos los días \r\n"

            )
        )
        menuList.add(
            StoreData(
                3,
                R.drawable.ic_menu_turismo,
                "Ermitas",
                "Ermita de Tekax",
                "Turismo - Senderismo",
                "8:00am a 9:00pm",
                "Acceso Gratuito",
                "4.9",
                R.drawable.t3_ermita,
                R.drawable.ic_menu_turismo,
                "La Ermita, 97970 \r\n" +
                        "Contacto: --- --- -- -- \r\n",
                "⬜ Todos los días \r\n"

            )
        )

         */
        return menuList
    }
}