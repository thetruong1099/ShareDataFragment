package com.example.sharedatafragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank2.*
import kotlinx.android.synthetic.main.fragment_blank2.btn_share_data


class BlankFragment2 : Fragment() {

    private val shareDataViewModel by lazy {
        ViewModelProvider(requireActivity()).get(ShareDataViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shareDataViewModel.getText().observe(viewLifecycleOwner) {
            edt_blank2.setText(it)
        }

        shareData()
    }

    private fun shareData() {
        btn_share_data.setOnClickListener {
            shareDataViewModel.setText(edt_blank2.text.toString().trim())
        }
    }
}