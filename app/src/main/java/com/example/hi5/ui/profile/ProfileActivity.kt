package com.example.hi5.ui.profile

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.base.BaseAdadpter
import com.example.hi5.databinding.ActivityProfileBinding
import com.example.hi5.models.Profile
import com.example.hi5.ui.changePassword.ChangePasswordActivity
import com.example.hi5.ui.editprofile.EditProfileActivity
import com.example.hi5.ui.favourite.FavouriteActivity
import com.example.hi5.ui.login.LoginActivity
import com.example.hi5.ui.redeem_history.RedeemHistoryActivity
import com.example.hi5.ui.referFriend.ReferFriendActivity
import com.example.hi5.ui.scanner.ScannerActivity
import com.example.hi5.utils.openActivity
import com.example.hi5.utils.showToast

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
        binding.imgScan.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.CAMERA
                )
                == PackageManager.PERMISSION_DENIED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.CAMERA),
                    114
                )
            } else {
                openActivity(ScannerActivity::class.java)
            }
        }
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
                            openActivity(FavouriteActivity::class.java)
                        }
                        getString(R.string.edit_profile) -> {
                            openActivity(EditProfileActivity::class.java)
                        }
                        getString(R.string.refer_earn) -> {
                            openActivity(ReferFriendActivity::class.java)
                        }
                        getString(R.string.redeem_history) -> {
                            openActivity(RedeemHistoryActivity::class.java)
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

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 114) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openActivity(ScannerActivity::class.java)
            } else {
                showToast("camera permission denied")
            }
        }
    }
}