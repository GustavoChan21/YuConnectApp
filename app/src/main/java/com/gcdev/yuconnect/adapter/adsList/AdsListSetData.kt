package com.gcdev.yuconnect.adapter.adsList

import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.adsList.AdsListData

object AdsListSetData {
    fun setResultAdsPromociones() {
        /*var adList = mutableListOf<AdsListData>()
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
                R.drawable.grutas_chocantes,
                R.drawable.grutas_chocantes,
                "Visitanos en Tekax, Yucatán y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n",
                "geo:21.604530,-87.992047?z=16&q=21.604530,-87.992047(Las+Coloradas,+Yucatán,+México)"

            )
        )
        adList.add(
            AdsListData(
                2,
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
                        "⬜ VIERNES \r\n",
                "geo:21.604530,-87.992047?z=16&q=21.604530,-87.992047(Las+Coloradas,+Yucatán,+México)"

            )
        )
        adList.add(
            AdsListData(
                3,
                R.drawable.ic_menu_turismo,
                "Turismo",
                "Chichen Itzá",
                "Zona Arqueológica",
                "8am - 6pm",
                "200.00",
                "4.8",
                R.drawable.foto_f1,
                R.drawable.foto_f1,
                "Visitanos y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n",
                "geo:21.604530,-87.992047?z=16&q=21.604530,-87.992047(Las+Coloradas,+Yucatán,+México)"

            )
        )
        adList.add(
            AdsListData(
                4,
                R.drawable.ic_menu_turismo,
                "Turismo",
                "Cobá",
                "Zona Arqueológica y Recorridos",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.foto_f2,
                R.drawable.foto_f2,
                "Visitanos y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n",
                "geo:21.604530,-87.992047?z=16&q=21.604530,-87.992047(Las+Coloradas,+Yucatán,+México)"

            )
        )
        adList.add(
            AdsListData(
                5,
                R.drawable.ic_menu_turismo,
                "Turismo",
                "Tours en cenote Maya",
                "Cenotes y Lagunas",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.foto_f3,
                R.drawable.foto_f3,
                "Visitanos y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n",
                "geo:21.604530,-87.992047?z=16&q=21.604530,-87.992047(Las+Coloradas,+Yucatán,+México)"

            )
        )
        adList.add(
            AdsListData(
                6,
                R.drawable.ic_menu_turismo,
                "Turismo",
                "Ciudad de Izamal",
                "Pueblo Mágico",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.foto_f6,
                R.drawable.foto_f6,
                "Visitanos y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n",
                "geo:20.932697,-89.019152?z=16&q=20.932697,-89.019152(Izamal,+Yucatán,+México)"

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
                "Recomendados",
                "Las Atracciones de Mérida",
                "MERIDA",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.foto_f4,
                R.drawable.foto_f4,
                "Visitanos en Mérida, Yucatán y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n",
                "geo:21.604530,-87.992047?z=16&q=21.604530,-87.992047(Las+Coloradas,+Yucatán,+México)"

            )
        )
        adList.add(
            AdsListData(
                2,
                R.drawable.ic_menu_abarrotes,
                "Recomendados",
                "Observa los flamecos de celestún",
                "Celestún",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.foto_f7,
                R.drawable.foto_f7,
                "Visitanos en Celestún, Yucatán y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n",
                "geo:21.604530,-87.992047?z=16&q=21.604530,-87.992047(Las+Coloradas,+Yucatán,+México)"

            )
        )
        adList.add(
            AdsListData(
                3,
                R.drawable.ic_menu_abarrotes,
                "Recomendados",
                "El lago rosa de las Coloradas",
                "Coloradas",
                "8am - 6pm",
                "100.00",
                "4.6",
                R.drawable.foto_f8,
                R.drawable.foto_f8,
                "Visitanos en Coloradas, Yucatán y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n",
                "geo:21.604530,-87.992047?z=16&q=21.604530,-87.992047(Las+Coloradas,+Yucatán,+México)"

            )
        )
        adList.add(
            AdsListData(
                4,
                R.drawable.ic_menu_abarrotes,
                "Recomendados",
                "Visita la Cuidad de Valladolid",
                "Valladolid",
                "----",
                "----",
                "---",
                R.drawable.foto_f5,
                R.drawable.foto_f5,
                "Visitanos en Valladolid, Yucatán y disfruta de todas nuestras aventuras y recorridos",
                "⬜ LUNES \r\n" +
                        "⬜ MARTES \r\n" +
                        "⬜ MIERCOLES \r\n" +
                        "⬜ VIERNES \r\n",
                "geo:21.604530,-87.992047?z=16&q=21.604530,-87.992047(Las+Coloradas,+Yucatán,+México)"

            )
        )


        return adList

         */
    }

}