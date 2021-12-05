package com.example.hi5.models

import com.example.hi5.R
import com.example.hi5.base.BaseApp

/**
 * @author Pardeep Singh
 */
data class Profile(var itemName: String = "", var leftDrawable: Int = 0) {
    val list = ArrayList<Profile>()
    fun getIconList(): ArrayList<Profile> {
        val context = BaseApp.getContext()
        val more1 = Profile(context.getString(R.string.favourite), R.drawable.ic_favorite)
            val more2 = Profile(context.getString(R.string.edit_profile), R.drawable.ic_edit)
        val more3 =
            Profile(context.getString(R.string.refer_earn), R.drawable.ic_user_add)
        val more4 = Profile(context.getString(R.string.redeem_history), R.drawable.ic_gift)
        val more5 = Profile(context.getString(R.string.change_password), R.drawable.ic_lock)
        val more6 = Profile(context.getString(R.string.about_us), R.drawable.ic_mobile)
        val more7 = Profile(context.getString(R.string.help), R.drawable.ic_question)
        val more8 = Profile(context.getString(R.string.terms_of_service), R.drawable.ic_file_dock)
        val list = setMoreList(more1, more2, more3, more4, more5, more6, more7, more8)
        return list
    }

    fun setMoreList(vararg profile: Profile): ArrayList<Profile> {
        for (i in 0 until profile.size) {
            list.add(profile[i])
        }
        return list
    }
}