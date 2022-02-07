package com.android.lab3task4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.android.lab3task4.databinding.FragmentSecondBinding

class SecondFragment() : Fragment() {
    lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        binding.button2to1.setOnClickListener {
            it.findNavController().navigate(R.id.action_2to1)
        }
        binding.button2to3.setOnClickListener {
            it.findNavController().navigate(R.id.action_2to3)
        }
        super.onActivityCreated(savedInstanceState)
    }
}