package com.android.lab3task4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.android.lab3task4.databinding.FragmentMainBinding

class MainFragment: Fragment() {
    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(this.layoutInflater)
        return binding.root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        binding.bnToSecond.setOnClickListener {
            it.findNavController().navigate(R.id.action_1to2)
        }
        super.onActivityCreated(savedInstanceState)
    }
}