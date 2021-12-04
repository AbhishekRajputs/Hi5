package com.example.hi5.ui.onBoarding

import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityOnBoardingBinding
import com.example.hi5.ui.login.LoginActivity
import com.example.hi5.ui.signUp.SignUpActivity
import com.example.hi5.utils.openActivity

/**
 * @author Pardeep Singh
 */
class OnBoardingActivity : BaseActivity(), View.OnClickListener {

    private val binding by lazy { ActivityOnBoardingBinding.inflate(layoutInflater) }
    private val list: ArrayList<Int> = ArrayList()
    private var currentPosition = 0
    private val adapter: OnBoardingAdapter by lazy {
        OnBoardingAdapter(arrayListOf(), this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        listeners()
        setGuideScreenAdapter()
        onScrollViewPager()
    }

    private fun listeners() {
        binding.imgSignUp.setOnClickListener(this)
        binding.tvLogin.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.img_sign_up -> {
                openActivity(SignUpActivity::class.java)
                finishAffinity()
            }
            R.id.tv_login -> {
                openActivity(LoginActivity::class.java)
                finishAffinity()
            }
        }
    }

    /**
     * Set Up Pager Adapter for Guide screen View Pager.
     */
    private fun setGuideScreenAdapter() {
        binding.vpOnBoarding.adapter = adapter
        binding.tabOnBoarding.setupWithViewPager(binding.vpOnBoarding)
        list.add(R.drawable.ic_on_boarding)
        list.add(R.drawable.ic_on_boarding)
        list.add(R.drawable.ic_on_boarding)
        list.add(R.drawable.ic_on_boarding)
        adapter.updateAdadpter(list)
    }

    private fun onScrollViewPager() {
        binding.vpOnBoarding.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int, positionOffset: Float, positionOffsetPixels: Int
            ) {
                currentPosition = position
            }

            override fun onPageSelected(position: Int) {
            }
        })
    }
}