package com.example.hi5.ui.profile

import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.base.BaseAdadpter
import com.example.hi5.databinding.ActivityProfileBinding
import com.example.hi5.models.Profile
import com.example.hi5.ui.changePassword.ChangePasswordActivity
import com.example.hi5.ui.editprofile.EditProfileActivity
import com.example.hi5.ui.login.LoginActivity
import com.example.hi5.utils.openActivity

/**
 * @author Pardeep Singh
 */
class ProfileActivity : BaseActivity() {

    private lateinit var adapter: BaseAdadpter<Profile>
    private val binding by lazy { ActivityProfileBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.tvLogout.setOnClickListener {
            openActivity(LoginActivity::class.java)
            finishAffinity()
        }
        setAdapter()
    }

    private fun setAdapter() {
        adapter = object : BaseAdadpter<Profile>(arrayListOf(), R.layout.item_profile) {
            override fun onBindData(holder: RecyclerView.ViewHolder, position: Profile) {
                val tv = holder.itemView.findViewById<AppCompatTextView>(R.id.tv_client_list)
                tv.text = position.itemName
                tv.setCompoundDrawablesWithIntrinsicBounds(
                    AppCompatResources.getDrawable(
                        applicationContext, position.leftDrawable
                    ), null,
                    AppCompatResources.getDrawable(
                        applicationContext,
                        R.drawable.ic_expand_right
                    ), null
                )
                val bundle = Bundle()
                holder.itemView.setOnClickListener {
                    when (position.itemName) {
                        getString(R.string.favourite) -> {

                        }
                        getString(R.string.edit_profile) -> {
                            openActivity(EditProfileActivity::class.java)
                        }
                        getString(R.string.refer_earn) -> {

                        }
                        getString(R.string.redeem_history) -> {

                        }
                        getString(R.string.change_password) -> {
                            openActivity(ChangePasswordActivity::class.java)
                        }
                        getString(R.string.about_us) -> {

                        }
                        getString(R.string.help) -> {

                        }
                        getString(R.string.terms_of_service) -> {

                        }
                        /*getString(R.string.logout) -> {
                            val dialog = AlertDialog.Builder(context)
                            dialog.setTitle(getString(R.string.logout))
                                .setMessage(getString(R.string.logout_msg))
                                .setNegativeButton(getString(R.string.dialog_btn_cancel)) { dialogInterface, i -> }
                                .setPositiveButton(
                                    getString(R.string.ok)
                                ) { dialoginterface, i ->
                                    viewModel.logout()
                                }.show()
                        }*/
                    }
                }
            }
        }
        binding.rvProfile.adapter = adapter
        adapter.updateAdapter(Profile().getIconList())
    }
}