package com.example.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class VerifyDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val args : VerifyDetailsFragmentArgs by navArgs()

        val name = args.name
        val mobileNumber = args.mobile

        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)

        val tvName = rootView.findViewById<TextView>(R.id.tv_name)
        val tvMobileNumber =rootView.findViewById<TextView>(R.id.tv_mobile_number)

        tvName.text = name
        tvMobileNumber.text = mobileNumber.toString()

        return rootView
    }
}