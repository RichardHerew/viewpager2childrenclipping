package com.mobile.viewpager2

import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder

class PagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 1

    override fun createFragment(position: Int): Fragment {
        return PageFragment().apply {
            arguments = Bundle()
        }
    }

    // Setting the automatically-generated ViewPager2's FrameLayout's clipChildren to false
    // Uncomment this block
//    override fun onBindViewHolder(
//        holder: FragmentViewHolder,
//        position: Int,
//        payloads: MutableList<Any>
//    ) {
//        (holder.itemView as ViewGroup).clipChildren = false
//        super.onBindViewHolder(holder, position, payloads)
//    }
}