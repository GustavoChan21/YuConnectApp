package com.gcdev.yuconnect.menus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.FragmentTabPageAdapter
import com.google.android.material.tabs.TabLayout


class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: FragmentTabPageAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabLayout = requireView().findViewById(R.id.tabLayout)
        viewPager2 = requireView().findViewById(R.id.viewPager2)

        adapter = FragmentTabPageAdapter(requireActivity().supportFragmentManager, lifecycle)

        tabLayout.addTab(tabLayout.newTab().setText("Información"))
        tabLayout.addTab(tabLayout.newTab().setText("Ubicación"))
        //tabLayout.addTab(tabLayout.newTab().setText("Menu"))
        //tabLayout.addTab(tabLayout.newTab().setText("Comentarios"))
        tabLayout.addTab(tabLayout.newTab().setText("Configuración"))

        viewPager2.adapter = adapter

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if(tab != null){
                    viewPager2.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })
    }

}