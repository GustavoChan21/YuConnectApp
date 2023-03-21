package com.gcdev.yuconnect.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.gcdev.yuconnect.OnBoardingActivity
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.onboardingscreens.FirstScreenFragment
import com.gcdev.yuconnect.onboardingscreens.SecondScreenFragment
import com.gcdev.yuconnect.onboardingscreens.ThirdScreenFragment
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class OnBoardingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_on_boarding, container, false)

        if (onBoardingIsFinished()){
            findNavController().navigate(R.id.action_onBoardingFragment2_to_mainActivity)
        }else{

        }

        val fragmentList = arrayListOf<Fragment>(
            FirstScreenFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment()
        )



        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        val viewPager = view.findViewById<ViewPager2>(R.id.view_pager)

        viewPager.adapter = adapter
        val indicator = view.findViewById<DotsIndicator>(R.id.dots_indicator)

        indicator.attachTo(viewPager)

        return view
    }

    private fun onBoardingIsFinished(): Boolean{

        val sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("finished",false)
    }

}