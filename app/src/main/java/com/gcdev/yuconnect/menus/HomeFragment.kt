package com.gcdev.yuconnect.menus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.ParentAdapter
import com.gcdev.yuconnect.model.ChildDataClass
import com.gcdev.yuconnect.model.ParentDataClass


class HomeFragment : Fragment(R.layout.fragment_home) {

    val parentItemsList = ArrayList<ParentDataClass>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireParentFragment()

        val rvParent = requireView().findViewById<RecyclerView>(R.id.rv_parent)
        rvParent.setHasFixedSize(true)
        rvParent.layoutManager = LinearLayoutManager(this.context)

        val adapter = ParentAdapter(parentItemsList)

        setData()

        rvParent.adapter = adapter
    }

    private fun setData() {
        val childItemsList = ArrayList<ChildDataClass>()
        val childItemsList2 = ArrayList<ChildDataClass>()
        val childItemsList3 = ArrayList<ChildDataClass>()

        childItemsList.add(ChildDataClass(R.drawable.ic_menu_hospedaje, "Hospedaje"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_restaurantes, "Restaurante"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_turismo, "Turismo"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_gasolineras, "Gasolinera"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_particulares, "Particulares"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_abarrotes, "Abarrotes"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_salud, "Salud"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_publicos, "Públicos"))

        parentItemsList.add(ParentDataClass("Servicios", childItemsList))

        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_hospedaje, "Hospedaje"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_restaurantes, "Restaurante"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_turismo, "Turismo"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_gasolineras, "Gasolinera"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_hospedaje, "Hospedaje"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_restaurantes, "Restaurante"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_turismo, "Turismo"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_gasolineras, "Gasolinera"))

        parentItemsList.add(ParentDataClass("Servicios2", childItemsList2))

        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_particulares, "Particulares"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_abarrotes, "Abarrotes"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_salud, "Salud"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_publicos, "Públicos"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_particulares, "Particulares"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_abarrotes, "Abarrotes"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_salud, "Salud"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_publicos, "Públicos"))

        parentItemsList.add(ParentDataClass("Servicios3", childItemsList3))

        childItemsList.add(ChildDataClass(R.drawable.ic_menu_hospedaje, "Hospedaje"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_restaurantes, "Restaurante"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_turismo, "Turismo"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_gasolineras, "Gasolinera"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_particulares, "Particulares"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_abarrotes, "Abarrotes"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_salud, "Salud"))
        childItemsList.add(ChildDataClass(R.drawable.ic_menu_publicos, "Públicos"))

        parentItemsList.add(ParentDataClass("Servicios", childItemsList))

        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_hospedaje, "Hospedaje"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_restaurantes, "Restaurante"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_turismo, "Turismo"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_gasolineras, "Gasolinera"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_hospedaje, "Hospedaje"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_restaurantes, "Restaurante"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_turismo, "Turismo"))
        childItemsList2.add(ChildDataClass(R.drawable.ic_menu_gasolineras, "Gasolinera"))

        parentItemsList.add(ParentDataClass("Servicios2", childItemsList2))

        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_particulares, "Particulares"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_abarrotes, "Abarrotes"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_salud, "Salud"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_publicos, "Públicos"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_particulares, "Particulares"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_abarrotes, "Abarrotes"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_salud, "Salud"))
        childItemsList3.add(ChildDataClass(R.drawable.ic_menu_publicos, "Públicos"))

        parentItemsList.add(ParentDataClass("Servicios3", childItemsList3))
    }

}