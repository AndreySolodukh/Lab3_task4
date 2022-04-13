package com.android.lab3task4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.android.lab3task4.databinding.FragmentThirdBinding

class ThirdFragment() : Fragment() {
    lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        binding.bnToSecond.setOnClickListener {
            it.findNavController().navigate(R.id.action_3to2)
        }
        binding.bnToFirst.setOnClickListener {
            it.findNavController().navigate(R.id.action_3to1)
        }
        super.onActivityCreated(savedInstanceState)
    }
}