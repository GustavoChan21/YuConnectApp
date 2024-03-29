package com.gcdev.yuconnect.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.gcdev.yuconnect.CollaboratorInfoFragment
import com.gcdev.yuconnect.UserInfoFragment
import com.gcdev.yuconnect.menus.PostFragment
import com.gcdev.yuconnect.menus.PromotionsFragment
import com.gcdev.yuconnect.menus.RecommendedFragment

class FragmentTabPageAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            PostFragment()
        else if (position == 1)
            RecommendedFragment()
        else
            PromotionsFragment()
    }

}