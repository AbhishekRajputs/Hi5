package com.example.hi5.ui.deals

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityDealsDetailsBinding
import android.R
import android.animation.Animator
import android.animation.ValueAnimator
import android.animation.ValueAnimator.AnimatorUpdateListener
import android.os.Handler
import android.os.Looper

import com.airbnb.lottie.LottieAnimationView
import com.example.hi5.utils.hide
import com.example.hi5.utils.show


class DealsDetailsActivity : BaseActivity() {

    private val binding by lazy { ActivityDealsDetailsBinding.inflate(layoutInflater) }
    private val dealsDetailsAdapter by lazy {
        DealsDetailsAdapter(arrayListOf("", "", "", "", "", ""))
    }
    private val commentsAdapter by lazy { CommentsAdapter(arrayListOf("", "", "")) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvDeals.adapter = dealsDetailsAdapter
        binding.rvComments.adapter = commentsAdapter
        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.imgSend.setOnClickListener {

            binding.imgSend.hide()
            binding.animationView.show()
            binding.animationView.playAnimation()
            Handler(Looper.getMainLooper()).postDelayed({
                binding.animationView.cancelAnimation()
                binding.imgSend.show()
                binding.animationView.hide()
            }, 3000)
        }


    }
}