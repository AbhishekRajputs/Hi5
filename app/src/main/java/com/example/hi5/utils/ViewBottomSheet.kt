package com.example.hi5.utils

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.hi5.R
import com.example.hi5.databinding.ViewBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ViewBottomSheet(var listener: BottomSheetClickListener) : BottomSheetDialogFragment() {

    companion object {
        fun getInstance(listener: BottomSheetClickListener): ViewBottomSheet {
            return ViewBottomSheet(listener)
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = BottomSheetDialog(requireContext(), theme)
        dialog.setOnShowListener {
            val bottomSheetDialog = it as BottomSheetDialog
            val parentLayout =
                bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
            parentLayout?.let { it ->
                val behaviour = BottomSheetBehavior.from(it)
                behaviour.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }
        dialog.window?.attributes?.windowAnimations = R.style.DialogAnimation

        return dialog
    }


    private lateinit var binding: ViewBottomSheetBinding


    override fun setupDialog(dialog: Dialog, style: Int) {
        binding = ViewBottomSheetBinding.inflate(LayoutInflater.from(context))
        dialog.setContentView(binding.root)

        binding.btnProceed.setOnClickListener{
            dismiss()
         //   listener.onButtonClick()
            dismiss()
        }

        binding.imgClose.setOnClickListener{
            dismiss()
        }
    }

    interface BottomSheetClickListener {
        fun onButtonClick()
    }
}
