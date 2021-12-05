package com.example.hi5.ui.referFriend

import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.base.BaseAdadpter
import com.example.hi5.databinding.ActivityReferFriendBinding
import com.example.hi5.models.AppModel

/**
 * @author Pardeep Singh
 */
class ReferFriendActivity : BaseActivity() {

    private val binding by lazy { ActivityReferFriendBinding.inflate(layoutInflater) }
    private lateinit var adapter: BaseAdadpter<AppModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initAdapter()
        binding.imgBack.setOnClickListener { onBackPressed() }
    }

    private fun initAdapter() {
        val list = ArrayList<AppModel>()
        list.add(AppModel("", ""))
        list.add(AppModel("", ""))
        list.add(AppModel("", ""))
        list.add(AppModel("", ""))
        list.add(AppModel("", ""))
        list.add(AppModel("", ""))
        list.add(AppModel("", ""))
        list.add(AppModel("", ""))
        list.add(AppModel("", ""))
        adapter = object : BaseAdadpter<AppModel>(list, R.layout.item_refer_friend) {
            override fun onBindData(holder: RecyclerView.ViewHolder, position: AppModel) {

            }
        }
        binding.rv.adapter = adapter
    }
}