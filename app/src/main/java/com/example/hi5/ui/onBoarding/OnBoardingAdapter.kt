package com.example.hi5.ui.onBoarding

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresApi
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.appcompat.widget.AppCompatImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.hi5.R


/**
 * @author Pardeep Singh
 */
class OnBoardingAdapter(private val list: ArrayList<Int>, private val context: Context) :
    PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return `object` == view
    }

    @SuppressLint("InflateParams")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view: View = LayoutInflater.from(container.context)
            .inflate(R.layout.item_on_boarding, null)
        val img: AppCompatImageView = view.findViewById(R.id.img_icon)
        val img1: AppCompatImageView = view.findViewById(R.id.img_icon)
        val img2: AppCompatImageView = view.findViewById(R.id.img_icon)

        val sdk = Build.VERSION.SDK_INT
        val drawable =
            getDrawable(context.applicationContext, list[position])
        when (position) {
            0 -> {

            }
            1 -> {

            }
            2 -> {

            }
            3 -> {

            }
        }
        setDrawable(sdk, img, drawable)
        container.addView(view)
        return view
    }

    private fun getDrawable(@DrawableRes ic: Int): Drawable? {
        val drawableOne =
            getDrawable(context.applicationContext, ic)
        return drawableOne
    }

    private fun setDrawable(
        sdk: Int,
        img: AppCompatImageView,
        drawable: Drawable?
    ) {
        if (sdk < Build.VERSION_CODES.JELLY_BEAN) {
            setBackgroundDrawable(img, drawable!!)
        } else {
            setBackground(img, drawable!!)
        }
    }

    private fun setBackground(background: AppCompatImageView, drawable: Drawable?) {
        background.setBackgroundDrawable(drawable)
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    private fun setBackgroundDrawable(background: AppCompatImageView, drawable: Drawable?) {
        background.background = drawable
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    fun updateAdadpter(list: ArrayList<Int>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }
}