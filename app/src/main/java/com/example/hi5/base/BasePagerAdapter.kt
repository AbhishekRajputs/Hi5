package com.example.hi5.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.hi5.models.FragmentList


class BasePagerAdapter(fm: FragmentManager) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private var fragments = arrayListOf<FragmentList>()

    override fun getItem(position: Int) = fragments[position].fragment

    override fun getCount() = fragments.size

    override fun getPageTitle(position: Int) = fragments[position].title

    fun addFragment(fragment: Fragment, title: String) {
        val fragmentList = FragmentList()
        fragmentList.fragment = fragment
        fragmentList.title = title
        fragments.add(fragmentList)
    }
}