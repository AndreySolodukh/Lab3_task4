package com.android.lab3task4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.android.lab3task4.databinding.FragmentFourthBinding
import com.android.lab3task4.databinding.FragmentThirdBinding

class FourthFragment : Fragment() {
    lateinit var binding: FragmentFourthBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFourthBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        binding.button4to3.setOnClickListener {
            it.findNavController().navigate(R.id.action_4to3)
        }
        super.onActivityCreated(savedInstanceState)
    }
}